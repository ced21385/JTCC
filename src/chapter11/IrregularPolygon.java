
package chapter11;

import chapter11.Polygon;

public class IrregularPolygon extends Polygon {

    private static int numberOfObjects = 0;        // static variable

    public IrregularPolygon() {
        super();
        IrregularPolygon.numberOfObjects++;
    }  // no-arg constructor

    public IrregularPolygon(int numberOfSides) {
        super(numberOfSides);
        IrregularPolygon.numberOfObjects++;
    }  // IrregularPolygon()

    public static int getNumberOfObjects() {return IrregularPolygon.numberOfObjects;}   // static method, cannot be over-ridden

}  // class IrregularPolygon