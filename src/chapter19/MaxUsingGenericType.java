package chapter19;

import java.util.Date;
import java.lang.Integer;
import java.lang.Comparable;
import java.lang.String;
import java.lang.System;

public class MaxUsingGenericType {

    public static void main(String[] args) {

        Comparable<Integer> i = new Integer(1);
        Comparable<Date>    d = new Date();

  //      System.out.println("Max: " + MaxUsingGenericType.max(i, d));  // compiler error

    } // mian()

    public static <E extends Comparable<E>> E max(E o1, E o2)
    {return (o1.compareTo(o2) > 0)? o1 : o2;}  // max()

}  // class MaxUsingGenericType