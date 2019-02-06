package chapter11;

import java.lang.String;
import java.lang.Object;
import chapter11.IrregularPolygon;

public final class Rectangle extends IrregularPolygon {  // final class

    private final static int    NUMBER_OF_SIDES = 4;
    private final static double ANGLE = 90.0;

    private double width;                    // instance variable
    private double height;                   // instance variable

    private static int numberOfObjects = 0;  // static variable

    public Rectangle() {this(1.0, 1.0);}     // no-arg constructor

    public Rectangle(double width, double height) {
        super(Rectangle.NUMBER_OF_SIDES);
        this.setWidth(width);
        this.setHeight(height);
        Rectangle.numberOfObjects++;
    }  // Rectangle()

    public void   setWidth(double width) {this.width = width;}
    public double getWidth()      {return this.width;}

    public void   setHeight(double height) {this.height = height;}
    public double getHeight()       {return this.height;}

    public static int getNumberOfObjects() {return Rectangle.numberOfObjects;}  // static method

    public double getArea() {return (this.getWidth() * this.getHeight());}

    public double getPerimeter() {return (this.getWidth() + this.getHeight()) * 2;}

    @Override  // Shape.toString()
    public String toString() {return super.toString() + " [width = " + this.width + ", height = " + this.height + "]";}

    @Override  // java.lang.Object.equals()
    public boolean equals(Object o) {
        if (o instanceof Rectangle)
            return this.getWidth()  == ((Rectangle)o).getWidth() &&
                    this.getHeight() == ((Rectangle)o).getHeight();
        else
            return this == o;
    }  // equals()

}  // class Rectangle