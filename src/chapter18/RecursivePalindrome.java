package chapter18;

import java.lang.System;
import java.lang.String;

public class RecursivePalindrome {

    public static void main(String[] args) {

        System.out.println("Is moon a palindrome?\t" + RecursivePalindrome.isPalindrome("moon"));
        System.out.println("Is noon a palindrome?\t" + RecursivePalindrome.isPalindrome("noon"));
        System.out.println("Is a a palindrome?\t"    + RecursivePalindrome.isPalindrome("a"   ));
        System.out.println("Is aba a palindrome?\t"  + RecursivePalindrome.isPalindrome("aba" ));
        System.out.println("Is ab a palindrome?\t"   + RecursivePalindrome.isPalindrome("ab"  ));
    }  // main()

    public static boolean isPalindrome(String s) {return RecursivePalindrome.isPalindrome(s, 0, s.length() - 1);}

    public static boolean isPalindrome(String s, int low, int high) {
        if (high <= low) return true;
        else if (s.charAt(low) != s.charAt(high)) return false;
        else return RecursivePalindrome.isPalindrome(s, low + 1, high - 1);
    }  // isPalindrome()

}  // class RecursivePalindrome