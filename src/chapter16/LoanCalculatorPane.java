package chapter16;

import chapter15.Loan;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.geometry.Insets;

public class LoanCalculatorPane {

        private TextField tfAnnualInterestRate = new TextField();  // global variable
        private TextField tfNumberOfYears      = new TextField();
        private TextField tfLoanAmount         = new TextField();
        private TextField tfMonthlyPayment     = new TextField();
        private TextField tfTotalPayment       = new TextField();
        private Pane      LoanCalculatorPane;

        LoanCalculatorPane() { }

        {

            GridPane gridPane = new GridPane();

            gridPane.setAlignment(Pos.TOP_LEFT);
            gridPane.setPadding(new Insets(10));
            gridPane.setVgap(5);
            gridPane.setHgap(5);

            gridPane.add(new Label("Annual Interest Rate:"), 0, 0); gridPane.add(tfAnnualInterestRate, 1, 0);
            gridPane.add(new Label("Number of Years:"     ), 0, 1); gridPane.add(tfNumberOfYears,      1, 1);
            gridPane.add(new Label("Loan Amount:"         ), 0, 2); gridPane.add(tfLoanAmount,         1, 2);
            gridPane.add(new Label("Monthly Payment:"     ), 0, 3); gridPane.add(tfMonthlyPayment,     1, 3);
            gridPane.add(new Label("Total Payment:"       ), 0, 4); gridPane.add(tfTotalPayment,       1, 4);
            LoanCalculatorPane = gridPane;

            tfMonthlyPayment.setEditable(false);
            tfTotalPayment  .setEditable(false);

            tfAnnualInterestRate.setAlignment(Pos.BOTTOM_RIGHT);
            tfTotalPayment.setAlignment(Pos.BOTTOM_RIGHT);
            tfNumberOfYears.setAlignment(Pos.BOTTOM_RIGHT);
            tfMonthlyPayment.setAlignment(Pos.BOTTOM_RIGHT);
            tfLoanAmount.setAlignment(Pos.BOTTOM_RIGHT);

            Button btCalculate = new Button("Calculate");
            btCalculate.setOnAction(e -> calculateLoanPayment());


            Button btClear = new Button("Clear");
            btClear.setOnAction(e -> tfAnnualInterestRate.setText(""));
            btClear.setOnMouseReleased(e -> tfLoanAmount.setText(""));
            btClear.setOnMouseClicked(e -> tfMonthlyPayment.setText(""));
            btClear.setOnMousePressed(e -> tfNumberOfYears.setText(""));

            gridPane.add(btCalculate, 1, 5);
            GridPane.setHalignment(btCalculate, HPos.RIGHT);
            gridPane.add(btClear, 0,5);
            GridPane.setHalignment(btClear, HPos.LEFT);


        }  // start()

        private void calculateLoanPayment() {

            double interest   = Double .parseDouble(tfAnnualInterestRate.getText());
            int    year       = Integer.parseInt   (tfNumberOfYears     .getText());
            double loanAmount = Double .parseDouble(tfLoanAmount        .getText());

            Loan loan = new Loan(interest, year, loanAmount);

            tfMonthlyPayment.setText(String.format("$%.2f", loan.getMonthlyPayment()));
            tfTotalPayment  .setText(String.format("$%.2f", loan.getTotalPayment  ()));

        }  // calculateLoanPayment()
         public Pane getLoanCalculatorPane() {
            return LoanCalculatorPane;
      }
        public void setLoanCalculatorPane(Pane loanCalculatorPane) {
         LoanCalculatorPane = loanCalculatorPane;
    }

    }  // class LoanCalculator

