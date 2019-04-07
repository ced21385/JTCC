package chapter20;

import java.util.Comparator;
import java.lang.System;
import java.lang.String;
import java.lang.Math;
import chapter20.GeometricObject;
import chapter20.GeometricObjectComparator;
import chapter20.Circle;
import chapter20.Rectangle;

public class TestComparator {

    public static void main(String[] args) {

        GeometricObject g1 = new Rectangle(5, 5);
        GeometricObject g2 = new Circle(5);

//        GeometricObject g = TestComparator.max(g1, g2, new GeometricObjectComparator());
        GeometricObject g = TestComparator.max(g1, g2);

        System.out.println("The area of the larger object is " + Math.round(g.getArea() * 100.0) / 100.0);
        System.out.println();

    }  // main()

//    public static GeometricObject max(GeometricObject g1, GeometricObject g2, Comparator<GeometricObject> c) {
//        return (c.compare(g1, g2) > 0)? g1 : g2;
//    }  // max()

    public static GeometricObject max(GeometricObject g1, GeometricObject g2) {
        GeometricObjectComparator c = new GeometricObjectComparator();
        return (c.compare(g1, g2) > 0)? g1 : g2;
    }  // max()

}  // class TestComparator