
package chapter16;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class InvestmentValueCalculator extends Application{

    private TextField amount = new TextField();
    private TextField years = new TextField();
    private TextField rate   = new TextField();
    private TextField future = new TextField();
    private Button btCalc = new Button("Calculate");
    private Insets padding = new Insets(50);

    @Override
    public void start(Stage primaryStage) {

        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.BOTTOM_RIGHT);
        gridPane.add(btCalc, 0,1);

        GridPane pane = new GridPane();
        pane.setAlignment(Pos.BOTTOM_RIGHT);
        pane.setPadding(padding);

        pane.add(amount, 1, 0);
        pane.add(years, 1, 1);
        pane.add(rate, 1, 2);
        pane.add(future, 1, 3);
        pane.add(new Label("Investment Amount:"), 0, 0);
        pane.add(new Label("Number of Years:"), 0, 1);
        pane.add(new Label("Annual Interest Rate:"), 0, 2);
        pane.add(new Label("Future Value:"), 0, 3);
        pane.add(gridPane, 1, 4);

        Scene scene = new Scene(pane);
        primaryStage.setTitle("InvestmentValueCalculator");
        primaryStage.setScene(scene);
        primaryStage.show();

        btCalc.setOnAction((ActionEvent e) -> {
            future.clear();
            calcFuture();
        });

    }

    private void calcFuture() {

        try {
            double interest = (Double.parseDouble(rate.getText())) / 1200;
            double amountText = Double.parseDouble(amount.getText());
            double time = 12 * Double.parseDouble(years.getText());
            double total = amountText * (Math.pow((1 + interest), time));
            future.setText(String.format("$%.2f", total));
        } catch(Exception e){
            future.setText("Error");
        }
    }
}