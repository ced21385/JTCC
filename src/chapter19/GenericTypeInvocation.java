package chapter19;

import java.lang.String;
import java.lang.System;
import java.util.ArrayList;
import java.lang.Comparable;
import java.util.Date;

public class GenericTypeInvocation {

    public static void main(String[] args) {

        String s = "hi";

        Comparable<Date> c1;                        // p-738: generic type invocation
        c1 = new Date();
    //    System.out.println(c1.compareTo(s));        // incompatible types

        Comparable c2;                              // p-750: generic type erasure
        c2 = new Date();
      //  System.out.println(c2.compareTo((Date)s));  // incompatible types

    }  // main()

}  // class TestArrayList