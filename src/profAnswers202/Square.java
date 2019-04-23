package profAnswers202;
//chapter09
import java.lang.String;
import java.lang.Math;

public class Square {

    private final static int    NUMBER_OF_SIDES = 4;
    private final static double ANGLE = 90.0;

    private double side;                     // instance variable
    private static int numberOfObjects = 0;  // static variable

    public Square() {this(1.0);}             // no-arg constructor

    public Square(double side) {
        this.setSide(side);
        Square.numberOfObjects++;
    }  // Square()

    public final void setSide(double side) {this.side = side >= 0.0 ? side : 0.0;}
    public double     getSide() {return this.side;}

    public static int getNumberOfObjects() {return Square.numberOfObjects;}

    public double getArea() {return Math.pow(this.getSide(), 2.0);}

    public double getPerimeter() {return this.getSide() * 4;}

    @Override
    public String toString() {return "side: " + this.getSide();}

}  // class Square
