package chapter20;

import java.util.Arrays;
import java.util.Comparator;
import java.lang.System;
import java.lang.String;
import chapter20.Loan;

public class SortLoanByAmountInterestRateYears {

    public static void main(String[] args) {

        Loan[] list = {new Loan(5.5, 10, 1000), new Loan(5, 10, 1000), new Loan(5, 20, 1000), new Loan(5.5, 10, 100)};

        Arrays.sort(list, Comparator.comparing(Loan::getLoanAmount).thenComparing(Loan::getAnnualInterestRate).thenComparing(Loan::getNumberOfYears));

        for (Loan l : list) {System.out.println(l.getLoanAmount() + " " + l.getAnnualInterestRate() + " " + l.getNumberOfYears());}
        System.out.println();

    }  // main()

}  // class SortLoanByAmountInterestRateYears