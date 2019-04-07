package chapter18;

import java.lang.System;
import java.lang.String;
import java.util.Scanner;

public class ComputeFibonacci {

    public static void main(String[] args) {

        System.out.print("Enter an index for a Fibonacci number: ");
        Scanner input = new Scanner(System.in);
        int     index = input.nextInt();

        System.out.println("The Fibonacci number at index " + index + " is " + ComputeFibonacci.fib(index));

    }  // main()

  //  public static long fib(long index) {

     //   System.out.println("index = " + index);

       // if      (index == 0) return 0;  // Base case
        //else if (index == 1) return 1;  // Base case
        //else                 return ComputeFibonacci.fib(index - 1) + ComputeFibonacci.fib(index - 2);  // Reduction and recursive calls

    //}  // fib()

     public static long fib(long index) {

      long f0 = 0, f1 = 1, currentFib;

        if (index == 0) return f0;  // base case
        if (index == 1) return f1;  // base case

        for (int i = 2; i <= index; i++) {

            System.out.println("index = " + i);
            currentFib = f0 + f1;
            f0 = f1;
            f1 = currentFib;

        }  // for
         return f1;

    }  // fib()

}  // class ComputeFibonacci