
package chapter12;

import java.lang.Math;
import java.lang.IllegalArgumentException;

public class CircleWithException {

    private double radius;
    private static int numberOfObjects = 0;

    // public CircleWithException() throws IllegalArgumentException {
    public CircleWithException() {  // un-checked exception
        this(1.0);
    }

    /// public CircleWithException(double radius) throws IllegalArgumentException {
    public CircleWithException(double radius) {  // un-checked exception
        this.setRadius(radius);
        CircleWithException.numberOfObjects++;
    }

    // public final void setRadius(double radius) throws IllegalArgumentException {
    public final void setRadius(double radius) {  // un-checked exception
        if (radius >= 0) this.radius =  radius;
        else throw new IllegalArgumentException("Radius cannot be negative");
    }

    public double getRadius() {return this.radius;}

    public static int getNumberOfObjects() {return CircleWithException.numberOfObjects;}

    public double findArea() {return this.radius * this.radius * Math.PI;}

}  // CircleWithException