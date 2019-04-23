package profAnswers202;
//chapter13
import java.lang.Math;
import java.lang.String;
import chapter13.GeometricObject;

public class Triangle extends GeometricObject {

    private double[] sides  = new double[3];

    public Triangle() {this(1.0, 1.0, 1.0);}

    public Triangle(double side1, double side2, double side3) {
        super();
        this.setSides(side1, side2, side3);
    }  // Triangle()

    public final void setSides(double side1, double side2, double side3) {
        this.sides[0] = side1;
        this.sides[1] = side2;
        this.sides[2] = side3;
    }  // setSides()

    public double[] getSides() {return this.sides;}  // getter

    @Override  // chapter13.GeometricObject
    public double getArea() {
        double s = (this.getSides()[0] + this.getSides()[1] + this.getSides()[2]) / 2;
        return Math.sqrt(s * (s - this.getSides()[0]) * (s - this.getSides()[1]) * (s - this.getSides()[2]));
    }  // getArea()

    @Override
    public double getPerimeter() {return this.getSides()[0] + this.getSides()[1] + this.getSides()[2];}

    @Override  // java.lang.String
    public String toString() {return "Triangle: side1 = " + getSides()[0] + ", side2 = " + getSides()[1] + ", side3 = " + getSides()[2];}

}  // class Triangle
