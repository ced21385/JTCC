package chapter11;

import chapter11.Shape;
import java.lang.Math;
import java.lang.Object;
import java.lang.String;

public final class Circle extends Shape {    // final class (preventing extending)

    private double     radius;               // instance variable
    private static int numberOfObjects = 0;  // static variable

    public Circle() {this(1.0);}             // no-arg constructor

    public Circle(double radius) {
        super();
        this.setRadius(radius);
        Circle.numberOfObjects++;
    }  // Circle()

    public void   setRadius(double radius) {this.radius = radius;}
    public double getRadius()       {return this.radius;}

    public static int getNumberOfObjects() {return Circle.numberOfObjects;}  // static method

    public double getArea()      {return Math.pow(getRadius(), 2.0) * Math.PI;}
    public double getPerimeter() {return 2 * this.getRadius() * Math.PI;}
    public double getDiameter()  {return 2 * this.getRadius();}

    @Override  // Shape.toString()
    public String toString() {return super.toString() + " [radius = " + this.getRadius() + "]";}

    @Override  // java.lang.Object.equals()
    public boolean equals(Object o) {
        if (o instanceof Circle) return this.getRadius() == ((Circle)o).getRadius();
        else return this == o;  // two reference variables point to the same object
    }  // equals()

}  // class Circle