package profAnswers202;
//chapter09
import java.lang.String;

public class Rectangle {

    private final static int    NUMBER_OF_SIDES = 4;
    private final static double ANGLE = 90.0;

    private double width ;                  // instance variable
    private double height;                  // instance variable

    private static int numberOfObjects = 0; // static variable (class variable)

    public Rectangle() {this(1.0, 1.0);}    // no-arg constructor

    public Rectangle(double width, double height) {
        this.setWidth(width); this.setHeight(height);
        Rectangle.numberOfObjects++;
    }  // Rectangle()

    public final void setWidth(double width) {this.width = width >= 0.0 ? width : 0.0;}
    public double     getWidth() {return this.width;}

    public final void setHeight(double height) {this.height = height >= 0.0 ? height : 0.0;}
    public double     getHeight() {return this.height;}

    public static int getNumberOfObjects() {return Rectangle.numberOfObjects;}

    public double getArea()      {return this.getWidth() * this.getHeight();}
    public double getPerimeter() {return 2 * (this.getWidth() + this.getHeight());}

    @Override
    public String toString() {return "width: " + this.getWidth() + "; height: " + this.getHeight();}

}  // class Rectangle
