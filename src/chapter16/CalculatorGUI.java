package chapter16;

import java.lang.String;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.collections.ListChangeListener;
import chapter16.InvestmentValueCalculatorPane;
import chapter16.LoanCalculatorPane;

public class CalculatorGUI extends Application {

    private final String[] titles = { "Loan Calculator","Investment Value Calculator","Close"};
    private final Pane[] displayPanes = { new LoanCalculatorPane().getLoanCalculatorPane()
            , new InvestmentValueCalculatorPane().getInvestmentPane()};

    @Override
    public void start(Stage primaryStage) {

        ListView<String> lv = new ListView<>(FXCollections.observableArrayList(titles));
        lv.setPrefSize(200,250);
        lv.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);


        StackPane stack = new StackPane();
        ScrollPane scroll = new ScrollPane(lv);
        lv.setPadding(new Insets(0,0,0,0));
        HBox pane = new HBox();
        pane.getChildren().addAll(scroll, stack);


        lv.getSelectionModel().getSelectedIndices().addListener(
            (ListChangeListener<? super Integer>) e -> {
                stack.getChildren().removeAll(displayPanes);

                if(lv.getSelectionModel().getSelectedItem().equals("Loan Calculator")){
                    stack.getChildren().add(displayPanes[0]);
                }
                else if(lv.getSelectionModel().getSelectedItem().equals("Investment Value Calculator")){
                    stack.getChildren().add(displayPanes[1]);
                }
                else { System.exit(0); }
            }
        );


        Scene scene = new Scene(pane,600,250);
        primaryStage.setTitle("CalculatorGUI");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

}
