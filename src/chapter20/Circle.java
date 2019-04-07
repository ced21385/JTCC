package chapter20;

import chapter20.GeometricObject;
import java.lang.Math;

public final class Circle extends GeometricObject {

    private double radius;

    public Circle() {}

    public Circle(double radius) {setRadius(radius);}

    public void   setRadius(double radius) {this.radius = radius;}
    public double getRadius()       {return this.radius;}

    public double getDiameter() {return 2 * this.getRadius();}

    @Override  // chapter20.GeometricObject.getArea()
    public double getArea() {return Math.pow(this.getRadius(), 2.0) * Math.PI;}

    @Override  // chapter20.GeometricObject.getPerimeter
    public double getPerimeter() {return 2 * this.getRadius() * Math.PI;}

    public void printCircle() {System.out.println("The circle is created " + getDateCreated() + " and the radius is " + this.getRadius());}

}  // class Circle