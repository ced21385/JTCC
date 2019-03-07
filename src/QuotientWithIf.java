package chapter12;

import java.util.Scanner;
import java.lang.System;
import java.lang.String;
import java.lang.Integer;
import java.lang.Character;

public class QuotientWithIf {

    public static void main(String[] args) {

        System.out.print("Enter two integers: ");
        Scanner input = new Scanner(System.in);
        String s1 = input.next();
        String s2 = input.next();

        if (QuotientWithIf.isInt(s1)){
            if (QuotientWithIf.isInt(s2)) {
                int n1 = Integer.parseInt(s1);
                int n2 = Integer.parseInt(s2);
                if (n2 != 0) System.out.println(n1 + " / " + n2 + " is " + (n1 / n2));
                else         System.out.println("Divisor cannot be zero ");
            }  // if
            else System.out.println("Not an integer: " + s2);
        }  // if
        else     System.out.println("Not an integer: " + s1);

    }  // main()

    public static boolean isInt(String s) {
        boolean isInt = true;

        char[] chars = s.toCharArray();
        for (char ch: chars) {
            if (!Character.isDigit(ch)) {
                isInt = false;
                break;
            }  // if
        }  // for

        return isInt;
    }  // isInt()

}  // QuotientWithIf
