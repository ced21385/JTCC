package profAnswers202;
//chapter12
import java.util.Scanner;
import java.lang.System;
import java.lang.String;
import java.util.InputMismatchException;

public class InputMismatch {

    public static void main(String[] args) {

        System.out.print("Enter two integers: ");
        Scanner input = new Scanner(System.in);

        boolean done = false;
        int n1;
        int n2;

        while (!done) {
            try {
                n1 = input.nextInt();
                n2 = input.nextInt();
                System.out.println("Sum is " + (n1 + n2));
                done = true;
            }  // try
            catch (InputMismatchException ex) {
                System.out.print("Incorrect input please re-enter two integers: ");
                input.nextLine(); // Discard input
            }  // catch
        }  // while

    }  // main()

}  // class InputMismatch
