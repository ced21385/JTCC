package chapter15;

import java.lang.String;
import java.lang.Double;
import java.lang.Integer;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.geometry.HPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import chapter15.Loan;

public class LoanCalculator extends Application {

    public static void main(String[] args) {Application.launch(args);}

    private TextField tfAnnualInterestRate = new TextField();  // global variable
    private TextField tfNumberOfYears      = new TextField();
    private TextField tfLoanAmount         = new TextField();
    private TextField tfMonthlyPayment     = new TextField();
    private TextField tfTotalPayment       = new TextField();

    @Override  // javafx.application.Application.start()
    public void start(Stage primaryStage) {

        GridPane gridPane = new GridPane();

        gridPane.setHgap(5); gridPane.setVgap(5);
        gridPane.setAlignment(Pos.CENTER);

        gridPane.add(new Label("Annual Interest Rate:"), 0, 0); gridPane.add(tfAnnualInterestRate, 1, 0);
        gridPane.add(new Label("Number of Years:"     ), 0, 1); gridPane.add(tfNumberOfYears,      1, 1);
        gridPane.add(new Label("Loan Amount:"         ), 0, 2); gridPane.add(tfLoanAmount,         1, 2);
        gridPane.add(new Label("Monthly Payment:"     ), 0, 3); gridPane.add(tfMonthlyPayment,     1, 3);
        gridPane.add(new Label("Total Payment:"       ), 0, 4); gridPane.add(tfTotalPayment,       1, 4);

        tfAnnualInterestRate.setAlignment(Pos.BOTTOM_RIGHT);
        tfNumberOfYears     .setAlignment(Pos.BOTTOM_RIGHT);
        tfLoanAmount        .setAlignment(Pos.BOTTOM_RIGHT);
        tfMonthlyPayment    .setAlignment(Pos.BOTTOM_RIGHT);
        tfTotalPayment      .setAlignment(Pos.BOTTOM_RIGHT);

        tfMonthlyPayment.setEditable(false);
        tfTotalPayment  .setEditable(false);

        Button btCalculate = new Button("Calculate");
        btCalculate.setOnAction(e -> calculateLoanPayment());  // lambda expession

        gridPane.add(btCalculate, 1, 5);
        GridPane.setHalignment(btCalculate, HPos.RIGHT);

        Scene scene = new Scene(gridPane, 400, 200);
        primaryStage.setScene(scene);             // Place the scene in the stage
        primaryStage.setTitle("LoanCalculator");  // Set title
        primaryStage.show();                      // Display the stage

    }  // start()

    private void calculateLoanPayment() {

        double interest   = Double .parseDouble(tfAnnualInterestRate.getText());
        int    year       = Integer.parseInt   (tfNumberOfYears     .getText());
        double loanAmount = Double .parseDouble(tfLoanAmount        .getText());

        Loan loan = new Loan(interest, year, loanAmount);

        tfMonthlyPayment.setText(String.format("$%.2f", loan.getMonthlyPayment()));
        tfTotalPayment  .setText(String.format("$%.2f", loan.getTotalPayment  ()));

    }  // calculateLoanPayment()

}  // class LoanCalculator