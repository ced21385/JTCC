package chapter08;

import java.lang.System;
import java.lang.String;
import java.lang.Math;
import java.util.Scanner;
import java.util.Arrays;

public class FindNearestPointsMultipleDimensions {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.print("Number of Points: ");
        int numberOfPoints = input.nextInt();
        
        System.out.print("Number of Dimensions: ");
        int numberOfDimensions = input.nextInt();
        
        double[][] points = new double[numberOfPoints][numberOfDimensions];
        
        System.out.print("Enter " + numberOfPoints + " points: ");

        for (double[] coordinates: points)
            for (int i = 0; i < coordinates.length; i++) coordinates[i] = input.nextDouble();
              
        System.out.println(numberOfPoints + " Points: " + Arrays.deepToString(points));
        
        int p1 = 0; int p2 = 1;
        double shortestDistance = FindNearestPointsMultipleDimensions.distance(points[p1], points[p2]);
        
        double distance;
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                
                if (!(i == 0 && j == 1)) {
                    distance = FindNearestPointsMultipleDimensions.distance(points[i], points[j]);
                
                    if (shortestDistance > distance) {
                        p1 = i; p2 = j;
                        shortestDistance = distance;
                    }  // if
                }  // if
                
            }  // for (j)
        }  // for (i)
        
        System.out.println("The closest two points are: " + Arrays.toString(points[p1]) + ", " + Arrays.toString(points[p2]));
        System.out.println("Shortest Distance: " + (Math.round(shortestDistance * 100.0) / 100.0));
        
    }  // main()
    
    public static double distance(double[] p1, double[] p2) {
        
        double x = 0.0;
        
        for (int i = 0; i < p1.length; i++) x += Math.pow((p1[i] - p2[i]), 2.0); 
           
        return Math.sqrt(x);
        
    }  // distance()

}  // class FindNearestPointsMultipleDimensions