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

public class LoanCalculator extends Application {

    private TextField annualInterestRate = new TextField();
    private TextField numberOfYears = new TextField();
    private TextField loanAmount = new TextField();
    private TextField monthlyPayment = new TextField();
    private TextField totalPayment = new TextField();

    private Button btCalc = new Button("Calculate");


    @Override
    public void start(Stage primaryStage) {

        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.BOTTOM_RIGHT);
        gridPane.add(btCalc, 0, 1);

        GridPane pane = new GridPane();
        pane.setAlignment(Pos.BOTTOM_RIGHT);
        pane.setPadding(new Insets(50));

        pane.add(annualInterestRate, 1, 0);
        pane.add(numberOfYears, 1, 1);
        pane.add(loanAmount, 1, 2);
        pane.add(monthlyPayment, 1, 3);
        pane.add(totalPayment, 1, 4);
        pane.add(new Label("Annual Interest Rate:"), 0, 0);
        pane.add(new Label("Number of Years:"), 0, 1);
        pane.add(new Label("Loan Amount:"), 0, 2);
        pane.add(new Label("Monthly Payment:"), 0, 3);
        pane.add(new Label("Total Payment:"), 0, 4);
        pane.add(gridPane, 1, 4);

        Scene scene = new Scene(pane);
        primaryStage.setTitle("Loan Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();


        btCalc.setOnAction((ActionEvent e) -> {
            calculatePayments();
        });
    }


    private void calculatePayments() {

        double rate = (Double.parseDouble(annualInterestRate.getText()));
        double amount = Double.parseDouble(loanAmount.getText());
        double year = Double.parseDouble(numberOfYears.getText());

        Loan loan = new Loan(rate, amount, year);

        monthlyPayment.setText(String.format("$%.2f", loan.getMonthlyPayment()));
        totalPayment.setText(String.format("$%.2f", loan.yearlyPayment()));
    }

    class Loan{
        private double interestRate;
        private double loanAmount;
        private double year;

        Loan(double interestRate, double loanAmount, double year){
            this.interestRate = interestRate / 1200;
            this.loanAmount = loanAmount;
            this.year = year;
        }

        public double getMonthlyPayment(){
            return (loanAmount * interestRate / (1 - (1 / Math.pow(1 + interestRate , year * 12))));
        }

        public double yearlyPayment(){

            return (getMonthlyPayment() * year * 12) ;
        }
    }
}