package chapter19;

import java.lang.Comparable;
import java.lang.String;
import java.lang.System;
import java.lang.Integer;
import java.util.Date;

public class Max {

    public static void main(String[] args) {

        Comparable c1 = new Integer(1);
        Comparable c2 = new Date();

        System.out.println("Max: " + Max.max(c1, c2));

    }  // main()

    public static Comparable max(Comparable o1, Comparable o2) {
        return (o1.compareTo(o2) > 0)? o1 : o2;  // runtime error: ClassCastException
    }  // max()

}  // class Max