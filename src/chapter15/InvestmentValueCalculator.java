package chapter15;

import java.lang.String;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Math;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.geometry.HPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class InvestmentValueCalculator extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {

        gridPane GridPane = new gridPane();

        primaryStage.setTitle("Future Investment Value");
        primaryStage.setScene(new Scene(GridPane, GridPane.getPrefWidth(), GridPane.getPrefHeight()));
        primaryStage.show();
    }
    public static void main(String[] args){
        Application.launch(args);

    }
    private class gridPane extends GridPane {

        private Label lbInvestmentAmount = new Label("Investment Amount:");
        private TextField tfInvestmentAmount = new TextField();
        private Label lbNumberOfYears = new Label("Number of Years:");
        private TextField tfNumberOfYears = new TextField();
        private Label lbAnnualInterestRate = new Label("Annual Interest Rate:");
        private TextField tfAnnualInterestRate = new TextField();
        private Label lbFutureValue = new Label("Future Value:");
        private TextField tfFutureValue = new TextField();
        private Button btCalculate = new Button("Calculate:");

        private gridPane() {


            setHgap(10);
            setVgap(10);
            add(lbInvestmentAmount,0, 0);
            add(tfInvestmentAmount, 1, 0);
            add(lbNumberOfYears, 0, 1);
            add(tfNumberOfYears, 1, 1);
            add(lbAnnualInterestRate, 0, 2);
            add(tfAnnualInterestRate, 1, 2);
            add(lbFutureValue, 0, 3);
            add(tfFutureValue, 1, 3);

            setAlignment(Pos.CENTER);
            tfInvestmentAmount.setAlignment(Pos.BOTTOM_RIGHT);
            tfNumberOfYears.setAlignment(Pos.BOTTOM_RIGHT);
            tfAnnualInterestRate.setAlignment(Pos.BOTTOM_RIGHT);
            tfFutureValue.setAlignment(Pos.BOTTOM_RIGHT);
            tfFutureValue.setEditable(false);

            HBox buttons = new HBox();
            buttons.getChildren().add(btCalculate);
            buttons.setAlignment(Pos.BOTTOM_RIGHT);
            add(buttons, 1,4);
            btCalculate.setOnAction(e -> calculateFutureValue());

            GridPane.setHalignment(btCalculate, HPos.RIGHT);


            TextField[] textFields = (TextField[]) getArray(
                    tfInvestmentAmount, tfNumberOfYears, tfAnnualInterestRate, tfFutureValue);
            for(TextField tf : textFields){
                tf.setAlignment(Pos.BASELINE_RIGHT);
            }

        }

        private Object[] getArray(Object... objects) {
            Object[] temp = new TextField[objects.length];
            for (int i = 0; i < objects.length; i++) {
                temp[i] = objects[i];
            }
            return temp;
        }

        private void calculateFutureValue() {

            double interestRate = Double.parseDouble(tfAnnualInterestRate.getText()) / 12 / 100;
            int years = Integer.parseInt(tfNumberOfYears.getText());
            double investmentAmount = Double.parseDouble(tfInvestmentAmount.getText());

            double futureValue = investmentAmount * Math.pow(1 + interestRate, years * 12);

            tfFutureValue.setText(String.format("$%.2f", futureValue));

        }
    }


}

