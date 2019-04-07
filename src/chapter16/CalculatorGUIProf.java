package chapter16;

import java.lang.String;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import chapter16.LoanCalculatorPane;
import chapter16.InvestmentValueCalculatorPane;

public class CalculatorGUIProf extends Application {

    public static void main(String[] args) {Application.launch(args);}

    // parallel arrays
    private final String[] titles       = {"Loan Calculator", "Investment Value Calculator", "Close"};
    private final Pane  [] displayPanes = {new LoanCalculatorPaneProf(), new InvestmentValueCalculatorPaneProf()};

    @Override  // javafx.application.Application.start()
    public void start(Stage primaryStage) {

        ObservableList<String> items = FXCollections.observableArrayList(titles);
        ListView<String> listView = new ListView<>(items);

        listView.setPrefSize(200, 400);
        listView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);

        Pane pane = new Pane();
        pane.getChildren().add(displayPanes[0]);
        pane.setPadding(new Insets(5, 5, 5, 5));

        BorderPane borderPane = new BorderPane();
        borderPane.setLeft  (new ScrollPane(listView));
        borderPane.setCenter(pane);

        listView.getSelectionModel().selectedItemProperty().addListener(ov -> {

            for (int i: listView.getSelectionModel().getSelectedIndices()) {
                if (i == displayPanes.length) primaryStage.close();
                else {
                    pane.getChildren().clear();
                    pane.getChildren().add(displayPanes[i]);
                } // else
            }  // for

        });  // addListener()

        Scene scene = new Scene(borderPane, 450, 170);
        primaryStage.setScene(scene);            // Place the scene in the stage
        primaryStage.setTitle("CalculatorGUI");  // Set the stage title
        primaryStage.show();                     // Display the stage

    }  // start()

}  // class CalculatorGUI