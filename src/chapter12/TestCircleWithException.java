package chapter12;

import java.lang.System;
import java.lang.String;
import chapter12.CircleWithException;

public class TestCircleWithException {

    public static void main(String[] args) {

        try {
            CircleWithException c1 = new CircleWithException( 5);
            CircleWithException c2 = new CircleWithException(-5);
            CircleWithException c3 = new CircleWithException( 0);
        }  // try
        catch (IllegalArgumentException ex) {System.out.println(ex);}
        finally {}

        System.out.println("Number of objects created: " + CircleWithException.getNumberOfObjects());

    }  // main()

}  // TestCircleWithException
