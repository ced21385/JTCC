package chapter11;

import java.lang.Math;
import chapter11.Polygon;

public class RegularPolygon extends Polygon {  // p-362

    private double side;                       // instance variable
    private double angle;                      // instance variable
    private static int numberOfObjects = 0;    // static variable

    public RegularPolygon() {
        super();
        RegularPolygon.numberOfObjects++;
    }  // no-arg constructor

    public RegularPolygon(int numberOfSides, double side, double angle) {
        super(numberOfSides);
        this.setSide (side );
        this.setAngle(angle);
        RegularPolygon.numberOfObjects++;
    }  // RegularPolygon()

    public final void   setSide(double side) {this.side = side;}      // final method
    public       double getSide()     {return this.side;}

    public final void   setAngle(double angle) {this.angle = angle;}  // final method
    public       double getAngle()      {return this.angle;}

    public static int getNumberOfObjects() {return RegularPolygon.numberOfObjects;}  // static method

    public double getArea() {return (super.getNumberOfSides() * Math.pow(this.getSide(), 2.0)) / (Math.tan(Math.PI / super.getNumberOfSides()) * 4);}

    public double getPerimeter() {return this.getSide() * super.getNumberOfSides();}

}  // class RegularPolygon
