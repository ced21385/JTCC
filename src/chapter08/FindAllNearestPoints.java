package chapter08;

import java.util.Scanner;
import java.lang.Math;
import java.lang.String;
import java.lang.System;

public class FindAllNearestPoints {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of points: ");
        int numberOfPoints = input.nextInt();

        double[][]points = new double [numberOfPoints][2];

        System.out.print("Enter " + numberOfPoints + " points: ");
        for(int i = 0; i < points.length; i++){
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();
        }

        int p1 = 0, p2 = 1;

        double shortestDistance = FindAllNearestPoints.distance(points[p1][0], points[p1][1],
                points[p2][0], points[p2][1]);

        int[][]indices = new int[points.length][2];
        int k = 0;

        indices[k][0] = p1;
        indices[k][1] = p2;


        for(int i = 0; i < points.length; i++){
            for(int j = i + 1; j < points.length; j++) {
                double distance = FindAllNearestPoints.distance(points[i][0], points[i][1],
                        points[j][0], points[j][1]);
                if (Math.abs(shortestDistance - distance) < 10e-6) {
                    k++;
                    indices[k][0] = i;
                    indices[k][1] = j;
                }
                else if(shortestDistance > distance) {
                    k = 0;
                    indices[k][0] = i;
                    indices[k][1] = j;
                    shortestDistance = distance;
                }
            }
        }

        for(int i = 1; i < k + 1; i++){
            p1 = indices[i][0];
            p2 = indices[i][1];

            System.out.println("The closest two points are (" + points[p1][0] +
                    ", " + points[p1][1] + ") and (" + points[p2][0] +
                    ", " + points[p2][1] + ").");

        }


        System.out.println("Their distance is " + shortestDistance + ".");
    }

    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
    }

}
