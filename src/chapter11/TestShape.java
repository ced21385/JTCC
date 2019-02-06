
package chapter11;

import java.lang.System;
import java.lang.String;
import java.lang.Math;

import chapter11.Shape;
import chapter11.Circle;
import chapter11.Rectangle;
import chapter11.Square;
import chapter11.RegularOctagon;
import chapter11.Line;
import chapter11.Point;

public class TestShape {

    public static void main(String[] args) {

        Circle c1 = new Circle();
        Shape.displayObject(c1);                                 // polymorphism
        Shape.displayObject(c1);
        System.out.println("Class: " + c1.toString());
        System.out.println("Area: "  + TestShape.getArea(c1));   // upcasting
        TestShape.getNumberOfObjects();
        System.out.println();

        Circle c2 = new Circle(2.0);
        Shape.displayObject(c2);                                 // polymorphism
        System.out.println("Class: " + c2.toString());
        System.out.println("Area: "  + TestShape.getArea(c2));   // upcasting
        TestShape.getNumberOfObjects();
        System.out.println();

        Rectangle r1 = new Rectangle();
        Shape.displayObject(r1);                                 // polymorphism
        System.out.println("Class: " + r1.toString());
        System.out.println("Area: "  + TestShape.getArea(r1));   // upcasting
        TestShape.getNumberOfObjects();
        System.out.println();

        Rectangle r2 = new Rectangle(1.0, 2.0);
        Shape.displayObject(r2);                                 // polymorphism
        System.out.println("Class: " + r2.toString());
        System.out.println("Area: "  + TestShape.getArea(r2));   // upcasting
        TestShape.getNumberOfObjects();
        System.out.println();

        Square s1 = new Square();
        Shape.displayObject(s1);                                 // polymorphism
        System.out.println("Class: " + s1.toString());
        System.out.println("Area: "  + TestShape.getArea(s1));   // upcasting
        TestShape.getNumberOfObjects();
        System.out.println();

        Square s2 = new Square(2.0);
        Shape.displayObject(s2);                                 // polymorphism
        System.out.println("Class: " + s2.toString());
        System.out.println("Area: "  + TestShape.getArea(s2));   // upcasting
        TestShape.getNumberOfObjects();
        System.out.println();

        RegularOctagon o1 = new RegularOctagon();
        Shape.displayObject(o1);                                 // polymorphism
        System.out.println("Class: " + o1.toString());
        System.out.println("Area: "  + TestShape.getArea(o1));   // upcasting
        TestShape.getNumberOfObjects();
        System.out.println();

        RegularOctagon o2 = new RegularOctagon(2.0);
        Shape.displayObject(o2);                                 // polymorphism
        System.out.println("Class: " + o2.toString());
        System.out.println("Area: "  + TestShape.getArea(o2));   // upcasting
        TestShape.getNumberOfObjects();
        System.out.println();

        Line l1 = new Line();
        Shape.displayObject(l1);                                 // polymorphism
        System.out.println("Class: " + l1.toString());
        System.out.println("Area: "  + TestShape.getArea(l1));
        TestShape.getNumberOfObjects();
        System.out.println();

        Line l2 = new Line(2.0);
        Shape.displayObject(l2);                                    // polymorphism
        System.out.println("Class: " + l2.toString());
        System.out.println("Area: "  + TestShape.getArea(l2));
        TestShape.getNumberOfObjects();
        System.out.println();

        Shape s = new Square(1.0);
        Shape.displayObject(s);
        System.out.println("Class: " + s.toString());
        System.out.println("Area: "  + TestShape.getArea((Polygon)s));
        TestShape.getNumberOfObjects();
        System.out.println();

    }  // main()

    public static double roundOff(double d) {return Math.round(d * 100.0) / 100.0;}

    public static double getArea(Shape s) {  // generic programming
        if (s instanceof Circle)         return TestShape.roundOff(((Circle)        s).getArea());
        else if (s instanceof Rectangle)      return TestShape.roundOff(((Rectangle)     s).getArea());
        else if (s instanceof Square)         return TestShape.roundOff(((Square)        s).getArea());
        else if (s instanceof RegularOctagon) return TestShape.roundOff(((RegularOctagon)s).getArea());
        else if (s instanceof Line)           return TestShape.roundOff(((Line)          s).getArea());
        else if (s instanceof Point)          return TestShape.roundOff(((Point)         s).getArea());
        return 0.0;
    }  // getArea()

    public static void getNumberOfObjects() {

        System.out.println("Shapes: "             + Shape           .getNumberOfObjects());
        System.out.println("Polygons: "           + Polygon         .getNumberOfObjects());
        System.out.println("Regular Polygons: "   + RegularPolygon  .getNumberOfObjects());
        System.out.println("Irregular Polygons: " + IrregularPolygon.getNumberOfObjects());
        System.out.println("Points: "             + Point           .getNumberOfObjects());
        System.out.println("Lines: "              + Line            .getNumberOfObjects());
        System.out.println("Circles: "            + Circle          .getNumberOfObjects());
        System.out.println("Rectangles: "         + Rectangle       .getNumberOfObjects());
        System.out.println("Regular Octagons: "   + RegularOctagon  .getNumberOfObjects());
        System.out.println("Squares: "            + Square          .getNumberOfObjects());
    }  // getNumberOfObjects()

}  // class TestShape