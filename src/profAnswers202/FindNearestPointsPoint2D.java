package profAnswers202;
//chapter09
import java.lang.System;
import java.lang.String;
import java.util.Scanner;
import javafx.geometry.Point2D;

public class FindNearestPointsPoint2D {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of points: ");
        int numberOfPoints = input.nextInt();

        Point2D[] points = new Point2D[numberOfPoints];

        System.out.print("Enter " + numberOfPoints + " points: ");
        for (int i = 0; i < points.length; i++) {
            points[i] = new Point2D(input.nextDouble(), input.nextDouble());
        }  // for

        int p1 = 0, p2 = 1;  // Initial two points
        double shortestDistance = points[p1].distance(points[p2]);

        double distance;
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {

                if (!(i == 0 && j == 1)){

                    distance = points[i].distance(points[j]);

                    if (shortestDistance > distance) {
                        p1 = i; p2 = j;
                        shortestDistance = distance; // Update shortestDistance
                    }  // if

                }  // if

            }  // for
        }  // for

        System.out.println("The closest two points are " + "(" + points[p1].getX() + ", " + points[p1].getY() + ") and (" + points[p2].getX() + ", " + points[p2].getY() + ")");

    }  // main()

    public static double distance(double x1, double y1, double x2, double y2) {return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));}

}  // class FindNearestPointsPoint2D