package chapter08;

import java.lang.System;
import java.lang.String;
import java.lang.Math;
import java.util.Scanner;

public class FindNearestPoints {
    
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of points: ");
        int numberOfPoints = input.nextInt();

        double[][] points = new double[numberOfPoints][2];  // 2 columns: x and y cordinates
        System.out.print("Enter " + numberOfPoints + " points: ");
        for (int i = 0; i < points.length; i++) {points[i][0] = input.nextDouble(); points[i][1] = input.nextDouble();}
        
        int p1 = 0, p2 = 1;  // Initial two points
        double shortestDistance = FindNearestPoints.distance(points[p1][0], points[p1][1], points[p2][0], points[p2][1]);
        
        double distance;
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                
                if (!(i == 0 && j == 1)){
                    distance = FindNearestPoints.distance(points[i][0], points[i][1], points[j][0], points[j][1]);
                
                    if (shortestDistance > distance) {
                        p1 = i; p2 = j;
                        shortestDistance = distance; // Update shortestDistance 
                    }  // if
                }  // if
                
            }  // for
        }  // for

        System.out.println("The closest two points are " + "(" + points[p1][0] + ", " + points[p1][1] + ") and (" + points[p2][0] + ", " + points[p2][1] + ")");
    
    }  // main()

    public static double distance(double x1, double y1, double x2, double y2) {return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));}
    
}  // class FindNearestPoints