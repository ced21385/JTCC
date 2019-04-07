package chapter16;

import java.lang.String;
import java.lang.Math;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class InvestmentValueCalculatorPaneProf extends GridPane {

    private TextField tfInvestmentAmount  ;
    private TextField tfNumberOfYears     ;
    private TextField tfAnnualInterestRate;
    private TextField tfFutureValue       ;

    protected InvestmentValueCalculatorPaneProf() {

        this.setTfInvestmentAmount  (new TextField());
        this.setTfNumberOfYears     (new TextField());
        this.setTfAnnualInterestRate(new TextField());
        this.setTfFutureValue       (new TextField());

        this.getTfAnnualInterestRate().setAlignment(Pos.BOTTOM_RIGHT);
        this.getTfNumberOfYears     ().setAlignment(Pos.BOTTOM_RIGHT);
        this.getTfInvestmentAmount  ().setAlignment(Pos.BOTTOM_RIGHT);
        this.getTfFutureValue       ().setAlignment(Pos.BOTTOM_RIGHT);

        this.getTfFutureValue().setEditable(false);

        Button btCalculate = new Button("Calculate");
        Button btClear     = new Button("Clear"    );

        btCalculate.setOnAction (e -> this.calculate());
        btClear    .setOnAction (e -> this.clear    ());

        super.add(new Label("Investment Amount:"   ), 0, 0); super.add(this.getTfInvestmentAmount  (), 1, 0);
        super.add(new Label("Number of Years:"     ), 0, 1); super.add(this.getTfNumberOfYears     (), 1, 1);
        super.add(new Label("Annual Interest Rate:"), 0, 2); super.add(this.getTfAnnualInterestRate(), 1, 2);
        super.add(new Label("Future value:"        ), 0, 3); super.add(this.getTfFutureValue       (), 1, 3);
        super.add(btClear                           , 0, 4); super.add(btCalculate                   , 1, 4);

        super.setHgap(5);
        super.setVgap(5);
        super.setAlignment(Pos.CENTER);
        super.setPadding(new Insets(5, 5, 5, 5));

    }  // InvestmentValueCalculator()

    public final void setTfInvestmentAmount  (TextField tfInvestmentAmount  ) {this.tfInvestmentAmount   = tfInvestmentAmount  ;}
    public final void setTfNumberOfYears     (TextField tfNumberOfYears     ) {this.tfNumberOfYears      = tfNumberOfYears     ;}
    public final void setTfAnnualInterestRate(TextField tfAnnualInterestRate) {this.tfAnnualInterestRate = tfAnnualInterestRate;}
    public final void setTfFutureValue       (TextField tfFutureValue       ) {this.tfFutureValue        = tfFutureValue       ;}

    public final TextField getTfInvestmentAmount  () {return this.tfInvestmentAmount  ;}
    public final TextField getTfNumberOfYears     () {return this.tfNumberOfYears     ;}
    public final TextField getTfAnnualInterestRate() {return this.tfAnnualInterestRate;}
    public final TextField getTfFutureValue       () {return this.tfFutureValue       ;}

    public void calculate() {
        double annualInterestRate  = Double .parseDouble(this.getTfAnnualInterestRate().getText().trim());
        int    numberOfYears       = Integer.parseInt   (this.getTfNumberOfYears     ().getText().trim());
        double investmentAmount    = Double .parseDouble(this.getTfInvestmentAmount  ().getText().trim());
        double monthlyInterestRate = annualInterestRate / 1200;
        double futureValue = investmentAmount * Math.pow(1 + monthlyInterestRate, numberOfYears * 12);
        this.getTfFutureValue().setText(String.format("$%.2f", futureValue));
    }  // calculate()

    public void clear() {
        this.getTfAnnualInterestRate().clear();
        this.getTfNumberOfYears     ().clear();
        this.getTfInvestmentAmount  ().clear();
        this.getTfFutureValue       ().clear();
    }  // clear()

}  // class InvestmentValueCalculator