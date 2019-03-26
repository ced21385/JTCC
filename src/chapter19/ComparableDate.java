package chapter19;

import java.util.Date;
import java.lang.Comparable;
import java.lang.System;
import java.lang.String;

public class ComparableDate {

    public static void main(String[] args) {

        Comparable s;
        s = "Hi";
        System.out.println(s.compareTo(new Date()));  // runtime error: Class.Cast.Exception


        Comparable<Date> d;                     // see p-509, p-738
      //  d = "Hi";                               // compile time: incompatible type
        //System.out.println(d.compareTo("Hi"));  // compile time: incompatible type

    }  // main()

}  // class ComparableDate