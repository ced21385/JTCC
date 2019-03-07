package chapter13;

import java.lang.System;
import java.lang.String;
import java.lang.Math;
import chapter13.Triangle;

public class TestTriangle {

    public static void main(String[] args) {

        Triangle triangle1 = new Triangle();
        System.out.println(triangle1);
        System.out.println("Area: "       + Math.round(triangle1.getArea() * 100.0) / 100.0);
        System.out.println("Perimeter: "  + triangle1.getPerimeter());
        System.out.println();

        Triangle triangle2 = new Triangle(3.0, 4.0, 5.0);
        System.out.println(triangle2);
        System.out.println("Area: "       + Math.round(triangle2.getArea() * 100.0) / 100.0);
        System.out.println("Perimeter: "  + triangle2.getPerimeter());

    }  // main()

}  // class TestTriangle
