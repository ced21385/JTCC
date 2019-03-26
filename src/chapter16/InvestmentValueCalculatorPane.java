package chapter16;

import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

public class InvestmentValueCalculatorPane {

    private TextField amount = new TextField();
    private TextField years = new TextField();
    private TextField rate = new TextField();
    private TextField future = new TextField();
    private Button btCalc = new Button("Calculate");
    private Button clear = new Button("Clear");

    private Pane pane;

    InvestmentValueCalculatorPane() {
    }

    {
        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.TOP_LEFT);
        gridPane.setPadding(new Insets(10));
        gridPane.setHgap(5);
        gridPane.setVgap(5);

        gridPane.add(amount, 1, 0);
        gridPane.add(years, 1, 1);
        gridPane.add(rate, 1, 2);
        gridPane.add(future, 1, 3);
        gridPane.add(btCalc, 1, 4);
        gridPane.add(new Label("Investment Amount:"), 0, 0);
        gridPane.add(new Label("Number of Years:"), 0, 1);
        gridPane.add(new Label("Annual Interest Rate:"), 0, 2);
        gridPane.add(new Label("Future Value:"), 0, 3);
        gridPane.add(clear, 0, 4);

        amount.setAlignment(Pos.BOTTOM_RIGHT);
        years.setAlignment(Pos.BOTTOM_RIGHT);
        rate.setAlignment(Pos.BOTTOM_RIGHT);
        future.setAlignment(Pos.BOTTOM_RIGHT);
        future.setEditable(false);

        pane = gridPane;

        btCalc.setOnAction((ActionEvent e) -> {
            future.clear();
            calculateFutureValue();
        });

        clear.setOnAction((ActionEvent e) -> {
            amount.clear();
            years.clear();
            rate.clear();
            future.clear();
        });
    }

    public Pane getInvestmentPane() {
        return pane;
    }


    private void calculateFutureValue(){
        try {

            double interest = (Double.parseDouble(rate.getText())) / 1200;
            double amountText = Double.parseDouble(amount.getText());
            double time = 12 * Double.parseDouble(years.getText());
            double total = amountText * (Math.pow((1 + interest), time));
            future.setText(String.format("$%.2f", total));

        }catch (Exception e) {
            future.setText("Error");
        }
    }
}