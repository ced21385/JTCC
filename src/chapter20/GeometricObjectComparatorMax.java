package chapter20;

import java.lang.System;
import java.lang.String;
import java.util.Comparator;
import chapter20.GeometricObject;
import chapter20.Circle;
import chapter20.Rectangle;
import chapter20.GeometricObject;

public class GeometricObjectComparatorMax {

    public static void main(String[] args) {

        GeometricObject g1 = new Circle(1);
        GeometricObject g2 = new Rectangle(3, 4);

//        GeometricObject g = GeometricObjectComparatorMax.max(g1, g2, (o1, o2) -> {
//                 if (o1.getArea() <  o2.getArea()) return -1;
//            else if (o1.getArea() == o2.getArea()) return  0;
//            else                                   return  1;
//        });

        GeometricObject g = GeometricObjectComparatorMax.max(g1, g2, new GeometricObjectComparator());

        System.out.println("The area of the larger object is " + g.getArea());
        System.out.println();

    }  // mian()

    public static GeometricObject max(GeometricObject g1, GeometricObject g2, Comparator<GeometricObject> c) {
        return c.compare(g1, g2) > 0? g1 : g2;
    }  // max()

}  // class GeometricObjectComparatorMax