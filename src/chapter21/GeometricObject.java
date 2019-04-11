package chapter21;

import java.util.Date;
import java.lang.String;

public abstract class GeometricObject {

    private String  color = "white";
    private boolean filled;
    private Date    dateCreated;

    protected GeometricObject() {this.dateCreated = new Date();}

    protected GeometricObject(String color, boolean filled) {
        this.dateCreated = new Date();
        this.setColor (color);
        this.setFilled(filled);
    }

    public void   setColor(String color) {this.color = color;}
    public String getColor() {return this.color;}

    public void setFilled(boolean filled) {this.filled = filled;}
    public boolean isFilled() {return this.filled;}

    public Date getDateCreated() {return this.dateCreated;}

    @Override  // java.lang.Object.toString()
    public String toString() {return "created on " + this.dateCreated + "color: " + this.color + " and filled: " + this.filled;}

    public abstract double getArea();

    public abstract double getPerimeter();

}  // class GeometricObject