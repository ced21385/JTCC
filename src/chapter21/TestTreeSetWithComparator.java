package chapter21;

import java.util.Set;
import java.util.TreeSet;
import java.lang.System;
import java.lang.String;
import chapter21.GeometricObject;
import chapter21.Circle;
import chapter21.Rectangle;
import chapter21.GeometricObjectComparator;

public class TestTreeSetWithComparator {

    public static void main(String[] args) {

        Set<GeometricObject> set = new TreeSet<>(new GeometricObjectComparator());

        set.add(new Rectangle(4, 5));
        set.add(new Circle(4));
        set.add(new Circle(4));
        set.add(new Rectangle(4, 1));

        System.out.println("A sorted set of geometric objects");
        for (GeometricObject element: set) System.out.println("area = " + Math.round(element.getArea() * 100.0) / 100.0);
        System.out.println();

    }  // main()

}  // class TestTreeSetWithComparator