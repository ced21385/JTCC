package chapter19;

import java.lang.System;
import java.lang.String;
import chapter19.Circle;
import chapter19.GeometricObject;
import chapter19.Rectangle;

public class BoundedTypeDemo {

    public static void main(String[] args ) {

        Rectangle rectangle = new Rectangle(2, 2);
        Circle    circle    = new Circle(2);

        System.out.println("Same area? " + BoundedTypeDemo.<GeometricObject>equalArea(rectangle, circle));  // type witness
        System.out.println("Same area? " + BoundedTypeDemo.equalArea(rectangle, circle));                   // type witness omitted

    }  // main()

    public static <E extends GeometricObject> boolean equalArea(E object1, E object2) {
        return object1.getArea() == object2.getArea();
    }  // equalArea()

}  // class BoundedTypeDemo