package chapter13;

import java.lang.System;
import java.lang.String;
import java.lang.Math;
import java.lang.Number;
import java.lang.Integer;
import java.lang.Double;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

public class LargestNumbers {

    public static void main(String[] args) {

        ArrayList<Number> list = new ArrayList<Number>();
        list.add(new Integer(45));     // qdd an integer
        list.add(new Double(3445.53)); // qdd a double
        list.add(new BigInteger("3432323234344343101"));
        list.add(new BigDecimal("2.0909090989091343433344343"));

        System.out.println("The largest number is " + LargestNumbers.getLargestNumber(list));

    }  // main()

    public static Number getLargestNumber(ArrayList<Number> list) {
        if (list == null || list.size() == 0) return null;

        Number number = list.get(0);
        for (int i = 1; i < list.size(); i++) if (number.doubleValue() < list.get(i).doubleValue()) number = list.get(i);

        return number;
    }  // getLargestNumber();

}  // class LargestNumbers
