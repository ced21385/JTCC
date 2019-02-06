package chapter11;

import java.lang.System;
import java.lang.String;
import java.util.ArrayList;
import java.util.Scanner;
import javafx.geometry.Point2D;

public class FindAllNearestPointsPoint2DArrayList {
    
    public static void main(String[] args) {
    
        System.out.print("Enter the number of points: ");
        Scanner input = new Scanner(System.in);
        int numberOfPoints = input.nextInt();

        Point2D[] points = new Point2D[numberOfPoints];  // array

        System.out.print("Enter " + numberOfPoints + " points: ");
        for (int i = 0; i < points.length; i++) {points[i] = new Point2D(input.nextDouble(), input.nextDouble());}
        
        ArrayList<Point2D> list = new ArrayList<>();  // ArrayList
        list.add(points[0]); list.add(points[1]);     // initial two points
        
        double shortestDistance = points[0].distance(points[1]);
        
        double distance;
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                
                if (!(i == 0 && j == 1)){
                    
                    distance = points[i].distance(points[j]);
                                    
                    if (shortestDistance > distance) {
                        list.clear();
                        list.add(points[i]);
                        list.add(points[j]);
                        shortestDistance = distance; // Update shortestDistance 
                    }
                    else if (distance == shortestDistance) {
                        list.add(points[i]);
                        list.add(points[j]);
                    }  // if

                }  // if
                
            }  // for
        }  // for

        for (int i = 0; i < list.size(); i = i + 2) {System.out.println("The closest two points are " + "(" + list.get(i).getX() + ", " + list.get(i).getY() + ") and (" + list.get(i + 1).getX() + ", " + list.get(i + 1).getY() + ")");}

        System.out.println("Their distance is " + shortestDistance);
   
    }  // main()
    
}  // class FindAllNearestPointsPoint2DArrayList