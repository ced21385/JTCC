package chapter11;

import java.lang.Math;
import java.lang.String;
import java.lang.Object;
import chapter11.RegularPolygon;

public final class Square extends RegularPolygon {

    private final static int NUMBER_OF_SIDES = 4;
    private final static double ANGLE = 90.0;

    private static int numberOfObjects = 0;  // static variable

    public Square() {
        this(1.0);
    }             // no-arg constructor

    public Square(double side) {
        super(Square.NUMBER_OF_SIDES, side, Square.ANGLE);
        Square.numberOfObjects++;
    }  // square()

    public static int getNumberOfObjects() {
        return Square.numberOfObjects;
    }

    @Override  // RegularPolygon.getArea()
    public double getArea() {
        return Math.pow(super.getSide(), 2.0);
    }

    @Override  // Shape.toString()
    public String toString() {
        return super.toString() + " [side = " + super.getSide() + "]";
    }

    @Override  // java.lang.Object.equals()
    public boolean equals(Object o) {
        if (o instanceof Square)
            return super.getSide() == ((RegularPolygon) o).getSide();
        else
            return this == o;
    }  // equals()

}