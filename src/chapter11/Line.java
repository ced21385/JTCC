package chapter11;

import java.lang.Object;
import java.lang.String;
import chapter11.Shape;

public final class Line extends Shape {      // final class

    private double length;                   // instance variable
    private static int numberOfObjects = 0;  // static variable

    public Line() {this(1.0);}               // no-arg constructor

    public Line(double length) {
        super();
        this.setLength(length);
        Line.numberOfObjects++;
    }  // Line()

    public void   setLength(double length) {this.length = length;}
    public double getLength()       {return this.length;}

    public static int getNumberOfObjects() {return Line.numberOfObjects;}  // static method

    public double getArea()      {return 0.0;}
    public double getPerimeter() {return this.getLength();}

    @Override  // Shape.toString()
    public String toString() {return super.toString() + " [length = " + this.getLength() + "]";}

    @Override  // java.lang.Object.equals()
    public boolean equals(Object o) {
        if (o instanceof Line) return this.getLength() == ((Line)o).getLength();
        else return this == o;
    }  // equals()

}  // class Line