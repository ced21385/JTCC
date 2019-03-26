package chapter18;

import java.lang.System;
import java.lang.String;
import java.util.Scanner;

public class ComputeFactorial {

    public static void main(String[] args) {

        System.out.print("Enter a non-negative integer: ");
        Scanner input = new Scanner(System.in);
        int     n     = input.nextInt();

        System.out.println("Factorial of " + n + " is " + ComputeFactorial.factorial(n));

    }  // main()

//    public static long factorial(int n) {
//        System.out.println("n = " + n);
//        return (n == 0)? 1 : n * ComputeFactorial.factorial(n - 1);
//    }  // factorial()

    public static long factorial(int n) {

        long result = 1;

        for (int i = 1; i <= n; i++) {
            result = result * i;
            System.out.println("i = " + i + ", result = " + result);
        }  // for

        return result;

    }  // factorial()

}  // class ComputeFactorial