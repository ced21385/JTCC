package chapter11;

import java.lang.System;
import java.lang.String;
import java.util.ArrayList;
import chapter11.Shape;
import chapter11.Circle;
import chapter11.Square;
import chapter11.Rectangle;

public class TestArrayList {

    public static void main(String[] args) {
        
        ArrayList<Shape> list = new ArrayList<>();
        
        list.add(new Circle(1.0)        );
        list.add(new Square(1.0)        );
        list.add(new Rectangle(1.0, 2.0));
                
        System.out.println(list.toString());
        System.out.println();
        
        for (Shape s: list) System.out.println(s.toString());  // foreach loop
        System.out.println();
        
        for (int i = list.size() - 1; i >= 0; i--) System.out.println(list.get(i).toString());  // reverse order
        System.out.println();
            
        System.out.println("Area: " + ((Circle)   list.get(0)).getArea());
        System.out.println("Area: " + ((Square)   list.get(1)).getArea());
        System.out.println("Area: " + ((Rectangle)list.get(2)).getArea());
               
    }  // main()
    
}  // class TestArrayList