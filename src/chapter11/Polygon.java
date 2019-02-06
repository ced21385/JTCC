
package chapter11;

import chapter11.Shape;

public class Polygon extends Shape {

    private int        numberOfSides   = 3;  // instance variable
    private static int numberOfObjects = 0;  // static variable

    public Polygon() {
        super();
        Polygon.numberOfObjects++;
    }  // no-arg constructor

    public Polygon(int numberOfSides) {
        super();
        this.setNumberOfSides(numberOfSides);
        Polygon.numberOfObjects++;
    }  // Polygon()

    public void setNumberOfSides(int numberOfSides) {this.numberOfSides = numberOfSides;}
    public int  getNumberOfSides()           {return this.numberOfSides;}

    public static int getNumberOfObjects() {return Polygon.numberOfObjects;}   // static method, cannot be over-ridden

}  // class Polygon