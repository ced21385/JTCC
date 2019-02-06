package chapter11;

import java.util.Date;
import java.lang.Object;
import java.lang.String;

public class Shape extends Object {                // java.lang.Object

    private final  Date dateCreated = new Date();  // instance variable
    private static int  numberOfObjects = 0;       // static variable

    public Shape() {
        super();
        Shape.numberOfObjects++;
    }  // no-arg constructor

    //    public void setDateCreated(Date date) {this.dateCreated = date;}  // final data field
    public Date getDateCreated() {return this.dateCreated;}

    //    public void setNumberOfObjects(int n) {Shape.numberOfObjects = n;}    // immutable
    public static int getNumberOfObjects() {return Shape.numberOfObjects;}  // static method, cannot be over-ridden

    @Override  // java.lang.Object.toString()
    public String toString() {return this.getClass().getName() + " [dateCreated = " + this.getDateCreated() + "]";}

    public static void displayObject(Shape s) {System.out.println("Created on " + s.getDateCreated());}

}  // class Shape