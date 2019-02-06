package chapter11;

import java.lang.Math;
import java.lang.String;
import java.lang.Object;
import chapter11.RegularPolygon;

public final class RegularOctagon extends RegularPolygon {

    private final static int    NUMBER_OF_SIDES = 8;
    private final static double ANGLE = 135.0;

    private static int numberOfObjects = 0;  // static variable

    public RegularOctagon() {this(1.0);}     // no-arg constructor

    public RegularOctagon(double side) {
        super(RegularOctagon.NUMBER_OF_SIDES, side, RegularOctagon.ANGLE);
        RegularOctagon.numberOfObjects++;
    }  // RegularOctagon()

    public static int getNumberOfObjects() {return RegularOctagon.numberOfObjects;}

    @Override  // RegularPolygon.getArea()
    public double getArea() {return (2 + 4 / Math.sqrt(2)) * (Math.pow(super.getSide(), 2.0));}

    @Override  // Shape.toString()
    public String toString() {return super.toString() + " [side = " + super.getSide() + "]";}

    @Override  // java.lang.Object.equals()
    public boolean equals(Object o) {
        if (o instanceof RegularOctagon)
            return super.getSide() == ((RegularPolygon)o).getSide();
        else
            return this == o;
    }  // equals()

}  // class RegularOctagon