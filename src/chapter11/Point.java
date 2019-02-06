package chapter11;

import java.lang.Object;
import chapter11.Shape;

public final class Point extends Shape {     // final class

    private static int numberOfObjects = 0;  // static variable

    public Point() {
        super();
        Point.numberOfObjects++;
    }

    public static int getNumberOfObjects() {return Point.numberOfObjects;}  // static method

    public double getArea()      {return 0.0;}
    public double getPerimeter() {return 0.0;}

    @Override  // java.lang.Object.equals()
    public boolean equals(Object o) {
        if (o instanceof Point) return true;
        else return this == o;
    }  // equals()

}  // class Line