package chapter19;

import java.lang.Integer;
import java.lang.String;
import java.lang.System;

public class GenericMethodDemo {

    public static void main(String[] args ) {

        Integer[] integers = {new Integer(1), new Integer(2)};  // array of Integer
        String [] strings  = {"London", "Paris"};               // array of String; "a tale of two cities"

        GenericMethodDemo.<Integer>print(integers);  // type witness: Integer
        GenericMethodDemo.<String> print(strings );  // type witness: String

        GenericMethodDemo.print(integers);           // type witness omitted
        GenericMethodDemo.print(strings );           // type witness omitted

    }  // main()

    public static <E> void print(E[] list) {         // generic method
        for (E element: list) System.out.print(element + " ");
        System.out.println();
    }  // print()

}  // class GenericMethodDemo