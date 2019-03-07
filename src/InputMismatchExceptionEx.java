package chapter12;

import java.util.Scanner;
import java.lang.System;
import java.lang.String;
import java.util.InputMismatchException;

public class InputMismatchExceptionEx {

    public static void main(String[] args) {

        System.out.print("Enter two integers: ");
        Scanner input = new Scanner(System.in);

        boolean done = false;
        int n1 = 0;
        int n2 = 0;

        while (!(done)) {
            try {
                n1 = input.nextInt();
                n2 = input.nextInt();
                done = true;
            }
            catch(InputMismatchException ex) {
                System.out.print("Incorrect input please re-enter two integers: ");
                input.nextLine();
            }
        }
        System.out.println("Sum is " + (n1 + n2));
    }
}