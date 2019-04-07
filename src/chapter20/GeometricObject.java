package chapter20;

import java.util.Date;
import java.lang.System;
import java.lang.String;

public abstract class GeometricObject {

    private String  color = "white";
    private boolean filled;
    private Date    dateCreated;

    protected GeometricObject() {this.setDateCreated(new Date());}

    protected GeometricObject(String color, boolean filled) {
        this.setDateCreated(new Date());
        this.setColor (color );
        this.setFilled(filled);
    }  // GeometricObject()

    public void   setColor(String color) {this.color = color;}
    public String getColor()      {return this.color;}

    public void   setFilled(boolean filled) {this.filled = filled;}
    public boolean isFilled()        {return this.filled;}

    public void setDateCreated(Date dateCreated) {this.dateCreated = dateCreated;}
    public Date getDateCreated()          {return this.dateCreated;}

    @Override  // java.lang.Object.toString()
    public String toString() {return "created on " + this.getDateCreated() + "color: " + this.getColor() + " and filled: " + this.isFilled();}

    public abstract double getArea();

    public abstract double getPerimeter();

}  // abstract class GeometricObject