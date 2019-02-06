package chapter09;

import javafx.geometry.Point2D;
import java.util.Scanner;
import java.lang.System;
import java.lang.String;

public class FindNearestPointsPoint2D {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of points: ");
        int numberOfPoints = input.nextInt();

        Point2D[] points = new Point2D[numberOfPoints];


        System.out.print("Enter " + numberOfPoints + " points: ");
        for (int i = 0; i < points.length; i++) {
            points[i] = new Point2D(input.nextDouble(), input.nextDouble());
        }
        int p1 = 0;
        int p2 = 1;
        int matrix[] = new int[numberOfPoints];
        int k = 0;
        matrix[0] = p1;
        matrix[1] = p2;

        double shortestDistance = points[0].distance(points[1]);
        double distance;

        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                if (!(i == 0 && j == 1)) {
                    distance = points[i].distance(points[j]);
                    if (shortestDistance > distance) {
                        //k++;
                        matrix[0] = i;
                        matrix[1]= j;
                        shortestDistance = distance;
                    }
                    else if (distance == shortestDistance){
                        //k = 0;
                        matrix[0] = i;
                        matrix[1] = j;
                        shortestDistance = distance;
                    }
                }

            }
        }
        for (int i = 0; i < k + 1; i++){
            p1 = matrix[0];
            p2 = matrix[1];

            System.out.print("The closest two points are (" + points[p1].getX() + ", " + points[p1].getY()
            + ") and (" + points[p2].getX() + ", " + points[p2].getY() + ").");
        }
    }

}