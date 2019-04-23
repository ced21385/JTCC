package profAnswers202;
//chapter15
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
import javafx.stage.Stage;

public class InvestmentValueCalculator extends Application {

    public static void main(String[] args) {Application.launch(args);}

    private TextField tfInvestmentAmount   = new TextField();
    private TextField tfNumberOfYears      = new TextField();
    private TextField tfAnnualInterestRate = new TextField();
    private TextField tfFutureValue        = new TextField();

    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {

        GridPane gridPane = new GridPane();
        gridPane.setHgap(5); gridPane.setVgap(5);
        gridPane.setAlignment(Pos.CENTER);

        Button btCalculate = new Button("Calculate");

        gridPane.add(new Label("Investment Amount:"   ), 0, 0); gridPane.add(tfInvestmentAmount  , 1, 0);
        gridPane.add(new Label("Number of Years:"     ), 0, 1); gridPane.add(tfNumberOfYears     , 1, 1);
        gridPane.add(new Label("Annual Interest Rate:"), 0, 2); gridPane.add(tfAnnualInterestRate, 1, 2);
        gridPane.add(new Label("Future value:"        ), 0, 3); gridPane.add(tfFutureValue       , 1, 3);
        gridPane.add(btCalculate         , 1, 4);

        tfAnnualInterestRate.setAlignment(Pos.BOTTOM_RIGHT);
        tfNumberOfYears.     setAlignment(Pos.BOTTOM_RIGHT);
        tfInvestmentAmount.  setAlignment(Pos.BOTTOM_RIGHT);
        tfFutureValue.       setAlignment(Pos.BOTTOM_RIGHT);

        tfFutureValue.setEditable(false);

        GridPane.setHalignment(btCalculate, HPos.RIGHT);

        btCalculate.setOnAction(e -> calculateLoanPayment());

        Scene scene = new Scene(gridPane, 400, 250);
        primaryStage.setScene(scene);                        // place the scene in the stage
        primaryStage.setTitle("InvestmentValueCalculator");  // set title
        primaryStage.show();                                 // display the stage

    }  // start()

    private void calculateLoanPayment() {

        double annualInterestRate = Double.parseDouble(tfAnnualInterestRate.getText().trim());
        int    numberOfYears      = Integer.parseInt  (tfNumberOfYears.     getText().trim());
        double investmentAmount   = Double.parseDouble(tfInvestmentAmount.  getText().trim());

        double monthlyInterestRate = annualInterestRate / 1200;
        double futureValue = investmentAmount * Math.pow(1 + monthlyInterestRate, numberOfYears * 12);

        tfFutureValue.setText(String.format("$%.2f", futureValue));

    }  // start()

}  // class InvestmentValueCalculator
