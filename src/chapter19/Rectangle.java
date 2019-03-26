package chapter19;

import java.lang.Math;
import chapter19.GeometricObject;

public final class Rectangle extends GeometricObject {

    private double width ;
    private double height;

    public Rectangle() {}  // no-arg constructor

    public Rectangle(double width, double height) {
        this.setWidth (width );
        this.setHeight(height);
    }  // Rectangle()

    public void   setWidth(double width) {this.width = width;}
    public double getWidth()      {return this.width;}

    public void   setHeight(double height) {this.height = height;}
    public double getHeight()       {return this.height;}

    @Override  // chapter19.GeometricObject.getArea()
    public double getArea() {return this.getWidth() * this.getHeight();}

    @Override  // chapter19.GeometricObject.getPerimeter()
    public double getPerimeter() {return 2 * (this.getWidth() + this.getHeight());}

}  // class Rectangle