package chapter12;

import java.lang.System;
import java.lang.String;
import chapter12.CircleWithCustomException;

public class TestCircleWithCustomException {

    public static void main(String[] args) {

        CircleWithCustomException[] array = new CircleWithCustomException[3];

        try {
            array[0] = new CircleWithCustomException( 5);
            array[1] = new CircleWithCustomException(-5);
            array[2] = new CircleWithCustomException( 1);
        }  // try
        catch (InvalidRadiusException ex) {System.out.println(ex);}
        finally {}

        System.out.println("Number of objects created: " + CircleWithCustomException.getNumberOfObjects());

        for (CircleWithCustomException c: array) {
            if (c == null) System.out.println("Null"); else System.out.println(c.toString());
        }  // for

    }  // main()

}  // class TestCircleWithCustomException