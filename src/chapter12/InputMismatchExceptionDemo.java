
package chapter12;

import java.util.Scanner;
import java.lang.System;
import java.lang.String;
import java.util.InputMismatchException;

public class InputMismatchExceptionDemo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean continueInput = true;
        int     number;

        do {
            try {
                System.out.print("Enter an integer: ");
                number = input.nextInt();
                System.out.println("The number entered is " + number);
                continueInput = false;
            }  // try
            catch (InputMismatchException ex) {
                System.out.println("Try again. (" + "Incorrect input: an integer is required)");
                input.nextLine();  // discard input
            }  // catch
            finally {}

        } while (continueInput);

    }  // main()

}  // class InputMismatchExceptionDemo