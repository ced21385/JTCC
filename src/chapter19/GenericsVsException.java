package chapter19;

import java.lang.Number;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.lang.System;
import java.lang.Character;

public class GenericsVsException {

    public static void main(String[] args) {

        Integer i = 1  ;
        Double  d = 2.0;

        System.out.println("total: " + GenericsVsException.total(i, d));  // runtime exception: ClassCastException

        System.out.println("sum: "   + GenericsVsException.sum  (i, d) + "\n");

        String s1 = "Dog";
        String s2 = "Cat";

        System.out.println("total: " + GenericsVsException.total(s1, s2));   // runtime exception: ClassCastException

        //System.out.println("sum: "   + GenericsVsException.sum  (s1, s2));  // compile error: incompatible bounds

    }  // main()

    public static double total(Object o1, Object o2) throws NumberFormatException {
        return (double)o1 + (double)o2;
    }  // total()

    public static <E extends Number> double sum(E o1, E o2) {  // bounded generic type
        return Double.parseDouble(o1.toString()) + Double.parseDouble(o2.toString());
    }  // sum()

}  // class GenericsVsException