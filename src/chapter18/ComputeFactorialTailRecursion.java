package chapter18;

import java.lang.System;
import java.lang.String;
import java.util.Scanner;

public class ComputeFactorialTailRecursion {

    public static void main(String[] args) {

        System.out.print("Enter a non-negative integer: ");
        Scanner input = new Scanner(System.in);
        int     n     = input.nextInt();

        System.out.println("Factorial of " + n + " is " + ComputeFactorialTailRecursion.factorial(n));

    }  // main()

    public static long factorial(int n) {return ComputeFactorialTailRecursion.factorial(n, 1);}

    private static long factorial(int n, int result) {  // auxiliary method
        System.out.println("n = " + n);
        return (n == 0)? result : ComputeFactorialTailRecursion.factorial(n - 1, n * result);
    }  // factorial()

}  // class ComputeFactorialTailRecursion