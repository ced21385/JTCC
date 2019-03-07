package chapter12;

import java.util.Scanner;
import java.lang.System;
import java.lang.String;
import java.lang.ArithmeticException;
import java.util.InputMismatchException;

public class QuotientWithException {

    public static void main(String[] args) {

        try {
            System.out.print("Enter two integers: ");
            Scanner input = new Scanner(System.in);
            int n1 = input.nextInt();  // might throw an InputMismatchException object
            int n2 = input.nextInt();  // might throw an InputMismatchException object
            int result = n1 / n2;      // might throw an ArithmeticException    object
            System.out.println(n1 + " / " + n2 + " is " + result);
        }  // try
        catch (InputMismatchException ex) {System.out.println(ex + ": not an integer" );}
        catch (ArithmeticException    ex) {System.out.println(ex + ": divided by zero");}
        finally {}

        System.out.println("Execution continues ...");

    }  // main()

}  // class QuotientWithException
