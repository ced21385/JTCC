package profAnswers202;
//chapter06
import java.util.Scanner;
import java.lang.System;
import java.lang.String;

public class PalindromeInteger {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a postive integer: ");
        int number = input.nextInt();

        if (PalindromeInteger.isPalindrome(number))
            System.out.println(number + " is palindrome");
        else System.out.println(number + " is not palindrome");
    }  // main()

    public static int reverse(int number) {
        int result = 0;
        while (number != 0) {
            int remainder = number % 10;
            result = result * 10 + remainder;
            number = number / 10;
        }  // while
        return result;
    }  // reverse()

    public static boolean isPalindrome(int number) {
        return number == PalindromeInteger.reverse(number);
    }  // isPalinddrome()

}  // class PalindromeInteger
