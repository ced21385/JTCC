package profAnswers202;
//chapter08
import java.lang.System;
import java.lang.String;
import java.lang.Math;

public class FindNearestPoints3D {
    public static void main(String[] args) {

        double[][] points = {{-1, 0, 3}, {-1, -1, -1}, {4, 1, 1}, {2, 0.5, 9}, {3.5, 2, -1}, {3, 1.5, 3}, {-1.5, 4, 2}, {5.5, 4, -0.5}};

        int p1 = 0, p2 = 1;  // initial two points
        double shortestDistance = FindNearestPoints3D.distance(points[p1][0], points[p1][1], points[p1][2], points[p2][0], points[p2][1], points[p2][2]);

        double distance;
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                if (!(i == 0 && j == 1)) {
                    distance = FindNearestPoints3D.distance(points[i][0], points[i][1], points[i][2], points[j][0], points[j][1], points[j][2]);
                    if (shortestDistance > distance) {
                        p1 = i; p2 = j;
                        shortestDistance = distance; // update shortestDistances
                    }  // if
                }  // if
            }  // for
        }  // for

        System.out.println("The closest two points are " + "(" + points[p1][0] + ", " + points[p1][1] + ", " + points[p1][2] + ") and (" + points[p2][0] + ", " + points[p2][1] + ", " + points[p2][2] + ")");

    }  // main()

    public static double distance(double x1, double y1, double z1, double x2, double y2, double z2) {return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2) + Math.pow((z2 - z1), 2));}

}  // class FindNearestPoints3D
