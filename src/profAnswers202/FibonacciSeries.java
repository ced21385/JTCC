package profAnswers202;
//chapter18
import java.lang.System;
import java.lang.String;
import java.util.Scanner;

public class FibonacciSeries {

    static int count = 0;

    public static void main(String args[]) {

        System.out.print("Enter an index for the Fibonacci number: ");
        Scanner input = new Scanner(System.in);
        int index = input.nextInt();

        System.out.println("Fibonacci number at index " + index + " is " + FibonacciSeries.fib(index));
        System.out.println("Number of times fib is invoked? " + FibonacciSeries.count);
        System.out.println();

    }  // main()

    public static long fib(long index) {

        FibonacciSeries.count++;

        if (index == 0) return 0;  // base case
        else if (index == 1) return 1;  // base case
        else                 return FibonacciSeries.fib(index - 1) + FibonacciSeries.fib(index - 2);

    }  // fib()

}  // class FibonacciSeries
