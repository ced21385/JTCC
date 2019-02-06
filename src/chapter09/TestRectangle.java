package chapter09;

import java.lang.System;
import java.lang.String;
import java.lang.Math;
import chapter09.Rectangle;

public class TestRectangle {
    
    public static void main(String[] args) {
        
        Rectangle [] rectangles = new Rectangle[2];
        rectangles[0] = new Rectangle();
        rectangles[1] = new Rectangle(1.0, 2.0);
        
        for (int i = 0; i < rectangles.length; i++) {
        
            System.out.println(rectangles[i].toString());
            System.out.println("Area: " + Math.round(rectangles[i].getArea() * 100.0) / 100.0);
            System.out.println();
        
        }  // for
        
        System.out.println("Number of Objects: " + Rectangle.getNumberOfObjects());
        
    }  // main()

}  // class TestRectangle