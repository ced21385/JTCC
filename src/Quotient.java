package chapter12;

import java.util.Scanner;
import java.lang.System;
import java.lang.String;

public class Quotient {

    public static void main(String[] args) {

        System.out.print("Enter two integers: ");
        Scanner input = new Scanner(System.in);
        int n1     = input.nextInt();
        int n2     = input.nextInt();
        int result = n1 / n2;  // 5 / 0; 5 / 0.1

        System.out.println(n1 + " / " + n2 + " is " + result);

    }  // main()

}  // class Quotient
