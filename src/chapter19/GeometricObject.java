package chapter19;

import java.util.Date;
import java.lang.String;

public abstract class GeometricObject {

    private String  color = "white";
    private boolean filled;
    private Date    dateCreated;

    protected GeometricObject() {this.dateCreated = new Date();}

    protected GeometricObject(String color, boolean filled) {
        dateCreated = new Date();
        this.setColor (color);
        this.setFilled(filled);
    }  // GeometricObject()

    public String getColor() {return this.color;}

    public void setColor(String color) {this.color = color;}

    public boolean isFilled() {return this.filled;}

    public void setFilled(boolean filled) {this.filled = filled;}

    public Date getDateCreated() {return this.dateCreated;}

    @Override  // java.lang.Object.toString()
    public String toString() {return "created on " + this.dateCreated + "color: " + this.color + " and filled: " + this.filled;}

    public abstract double getArea();       // abstract method

    public abstract double getPerimeter();  // abstract method

}  // class GeometricObject