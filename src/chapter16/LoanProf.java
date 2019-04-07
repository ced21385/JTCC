package chapter16;

import java.util.Date;

public class LoanProf {

    private double annualInterestRate;
    private int    numberOfYears     ;
    private double loanAmount        ;
    private Date   loanDate          ;

    public LoanProf() {}  // no-arg constructor

    public LoanProf(double annualInterestRate, int numberOfYears, double loanAmount) {
        this.setAnnualInterestRate(annualInterestRate);
        this.setNumberOfYears(numberOfYears);
        this.setLoanAmount(loanAmount);
        this.loanDate = new Date();
    }  // Loan()

    public final void setAnnualInterestRate(double annualInterestRate) {this.annualInterestRate = annualInterestRate;}
    public double     getAnnualInterestRate() {return this.annualInterestRate;}

    public final void setNumberOfYears(int numberOfYears) {this.numberOfYears = numberOfYears;}
    public int        getNumberOfYears() {return this.numberOfYears;}

    private final void  setLoanAmount(double loanAmount) {this.loanAmount = loanAmount;}
    public double       getLoanAmount() {return this.loanAmount;}

    public Date getLoanDate() {return this.loanDate;}

    public double getMonthlyPayment() {return this.getLoanAmount() * (this.getAnnualInterestRate() / 1200) / (1 - (1 / Math.pow(1 + (this.getAnnualInterestRate() / 1200), this.getNumberOfYears() * 12)));}

    public double getTotalPayment() {return this.getMonthlyPayment() * this.getNumberOfYears() * 12;}

}  // class Loan