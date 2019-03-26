package chapter19;

import java.lang.Math;
import chapter19.GeometricObject;

public final class Circle extends GeometricObject {

    private double radius;

    public Circle() {}

    public Circle(double radius) {this.setRadius(radius);}

    public void   setRadius(double radius) {this.radius = radius;}
    public double getRadius() {return this.radius;}

    @Override  // chapter19.GeometricObject.getArea()
    public double getArea() {return Math.pow(this.getRadius(), 2) * Math.PI;}

    public double getDiameter() {return 2 * this.getRadius();}

    @Override  // chapter19.GeometricObject.getPerimeter()
    public double getPerimeter() {return 2 * getRadius() * Math.PI;}

    public void printCircle() {System.out.println("The circle is created " + this.getDateCreated() + " and the radius is " + this.getRadius());}

}  // class Circle