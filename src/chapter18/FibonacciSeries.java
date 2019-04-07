package chapter18;

import java.lang.String;
import java.lang.System;
import java.util.Scanner;

public class FibonacciSeries {

    private static int count = 0;

    public static void main(String[] args) {

        System.out.print("Enter an index for a Fibonacci number: ");
        Scanner input = new Scanner(System.in);
        int     index = input.nextInt();

        System.out.println("The Fibonacci number at index " + index + " is " + fib(index));
        System.out.println("Number of times fib is invoked? " + count);

    }

    public static long fib(Integer index) {

        count++;

        if (index == 0){
            return 0;  // base case
        }
        else if (index == 1) {
            return 1;
        }// base case
        else {
            return fib(index - 1) + fib(index - 2);
        }
    }  // fib()

}  // class Fibonacci Series

