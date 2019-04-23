package profAnswers202;
//chapter06
import java.util.Scanner;
import java.lang.System;
import java.lang.String;

public class SortThreeNumbers {

    public static void main(String[] args) {

        System.out.print("Enter three values: ");
        Scanner input = new Scanner(System.in);
        double  num1  = input.nextDouble();
        double  num2  = input.nextDouble();
        double  num3  = input.nextDouble();

        SortThreeNumbers.displaySortedNumbers(num1, num2, num3);
    }  // main()

    public static void displaySortedNumbers(double num1, double num2, double num3) {
        double temp;

        if (num1 > num2) {temp = num1; num1 = num2; num2 = temp;}
        if (num2 > num3) {temp = num2; num2 = num3; num3 = temp;}
        if (num1 > num2) {temp = num1; num1 = num2; num2 = temp;}

        System.out.println("The sorted numbers are " + num1 + " " + num2 + " " + num3);
    }  // displaySortedNumbers()

}  // class SortThreeNumbers