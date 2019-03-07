package chapter12;

import java.lang.System;
import java.lang.String;
import java.lang.NumberFormatException;
import java.lang.Double;

public class TestIsNumeric {

    public static void main(String[] args) {
        System.out.println(TestIsNumeric.IsNumeric("123"));
        System.out.println(TestIsNumeric.IsNumeric("abc"));
    }

    public static boolean IsNumeric(String token) {
        try {
            Double.parseDouble(token);
            return true;
        }  // try
        catch (NumberFormatException ex) {return false;}
        finally {}
    }

}  // TestIsNumeric
