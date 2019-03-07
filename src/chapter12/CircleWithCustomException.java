package chapter12;

import java.lang.String;
import chapter12.InvalidRadiusException;

public class CircleWithCustomException {

    private double radius;
    private static int numberOfObjects = 0;

    // public CircleWithCustomException()
    public CircleWithCustomException() throws InvalidRadiusException  // checked exception
    {this(1.0);}

    // public CircleWithCustomException(double radius) {
    public CircleWithCustomException(double radius) throws InvalidRadiusException {  // checked exception
        this.setRadius(radius);
        CircleWithCustomException.numberOfObjects++;
    }  // CircleWithCusomException()

    // public final void setRadius(double radius) {
    public final void setRadius(double radius) throws InvalidRadiusException {  // checked exception
        if (radius >= 0) this.radius =  radius;
        else throw new InvalidRadiusException(radius);  // checked exception
    }  // setRadius()

    public double getRadius() {return this.radius;}

    public static int getNumberOfObjects() {return CircleWithCustomException.numberOfObjects;}

    @Override  // java.lang.Object.toString()
    public String toString() {return "radius = " + this.getRadius();}

}  // class CircleWithCustomException
