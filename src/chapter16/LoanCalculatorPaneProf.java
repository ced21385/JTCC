package chapter16;

import java.lang.String;
import javafx.geometry.Pos;
import javafx.geometry.HPos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;
import chapter16.LoanProf;

public class LoanCalculatorPaneProf extends GridPane {

    private TextField tfAnnualInterestRate;
    private TextField tfNumberOfYears     ;
    private TextField tfLoanAmount        ;
    private TextField tfMonthlyPayment    ;
    private TextField tfTotalPayment      ;

    protected LoanCalculatorPaneProf() {

        this.setTfAnnualInterestRate(new TextField());
        this.setTfNumberOfYears     (new TextField());
        this.setTfLoanAmount        (new TextField());
        this.setTfMonthlyPayment    (new TextField());
        this.setTfTotalPayment      (new TextField());

        this.getTfAnnualInterestRate().setAlignment(Pos.BOTTOM_RIGHT);
        this.getTfNumberOfYears     ().setAlignment(Pos.BOTTOM_RIGHT);
        this.getTfLoanAmount        ().setAlignment(Pos.BOTTOM_RIGHT);
        this.getTfMonthlyPayment    ().setAlignment(Pos.BOTTOM_RIGHT);
        this.getTfTotalPayment      ().setAlignment(Pos.BOTTOM_RIGHT);

        this.getTfMonthlyPayment().setEditable(false);
        this.getTfTotalPayment  ().setEditable(false);

        Button btCalculate = new Button("Calculate");
        Button btClear     = new Button("Clear"    );

        btCalculate.setOnAction (e -> this.calculate());
        btClear    .setOnAction (e -> this.clear    ());

        GridPane.setHalignment(btClear    , HPos.LEFT);
        GridPane.setHalignment(btCalculate, HPos.LEFT);

        super.add(new Label("Annual Interest Rate:"), 0, 0); super.add(this.getTfAnnualInterestRate(), 1, 0);
        super.add(new Label("Number of Years:"     ), 0, 1); super.add(this.getTfNumberOfYears     (), 1, 1);
        super.add(new Label("Loan Amount:"         ), 0, 2); super.add(this.getTfLoanAmount        (), 1, 2);
        super.add(new Label("Monthly Payment:"     ), 0, 3); super.add(this.getTfMonthlyPayment    (), 1, 3);
        super.add(new Label("Total Payment:"       ), 0, 4); super.add(this.getTfTotalPayment      (), 1, 4);
        super.add(btClear                           , 0, 5); super.add(btCalculate                   , 1, 5);

        super.setHgap(5);
        super.setVgap(5);
        super.setAlignment(Pos.CENTER);
        super.setPadding(new Insets(5, 5, 5, 5));

    }  // LoanCalculatorPane()

    public final void setTfAnnualInterestRate(TextField tfAnnualInterestRate) {this.tfAnnualInterestRate = tfAnnualInterestRate;}
    public final void setTfNumberOfYears     (TextField tfNumberOfYears     ) {this.tfNumberOfYears      = tfNumberOfYears;     }
    public final void setTfLoanAmount        (TextField tfLoanAmount        ) {this.tfLoanAmount         = tfLoanAmount;        }
    public final void setTfMonthlyPayment    (TextField tfMonthlyPayment    ) {this.tfMonthlyPayment     = tfMonthlyPayment;    }
    public final void setTfTotalPayment      (TextField tfTotalPayment      ) {this.tfTotalPayment       = tfTotalPayment;      }

    public final TextField getTfAnnualInterestRate() {return this.tfAnnualInterestRate;}
    public final TextField getTfNumberOfYears     () {return this.tfNumberOfYears     ;}
    public final TextField getTfLoanAmount        () {return this.tfLoanAmount        ;}
    public final TextField getTfMonthlyPayment    () {return this.tfMonthlyPayment    ;}
    public final TextField getTfTotalPayment      () {return this.tfTotalPayment      ;}

    public void calculate() {
        double interest   = Double .parseDouble(this.getTfAnnualInterestRate().getText().trim());
        int    year       = Integer.parseInt   (this.getTfNumberOfYears     ().getText().trim());
        double loanAmount = Double .parseDouble(this.getTfLoanAmount        ().getText().trim());
        LoanProf loan = new LoanProf(interest, year, loanAmount);
        this.getTfMonthlyPayment().setText(String.format("$%.2f", loan.getMonthlyPayment()));
        this.getTfTotalPayment  ().setText(String.format("$%.2f", loan.getTotalPayment  ()));
    }  // calculate()

    public void clear() {
        this.getTfAnnualInterestRate().clear();
        this.getTfNumberOfYears     ().clear();
        this.getTfLoanAmount        ().clear();
        this.getTfMonthlyPayment    ().clear();
        this.getTfTotalPayment      ().clear();
    }  // clear()

}  // class LoanCalculatorPane