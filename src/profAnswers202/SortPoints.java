package profAnswers202;
//chapter20
import java.lang.System;
import java.lang.String;
import java.lang.Math;
import java.util.Arrays;
import java.util.Comparator;
import javafx.geometry.Point2D;

public class SortPoints {

    public static void main(String[] args) {

        Point2D[] points = new Point2D[5];
        for (int i = 0; i < points.length; i++) {points[i] = new Point2D(Math.random() * 100, Math.random() * 100);}

        System.out.println("5 Points (X, Y): ");
        for (Point2D p: points) {System.out.printf("%.2f,\t %.2f\n", p.getX(), p.getY());}
        System.out.println();

        Arrays.sort(points, Comparator.comparing(Point2D::getY).thenComparing(Point2D::getX));
        System.out.println("5 Points sorted by Y and X: ");
        for (Point2D p: points) {System.out.printf("%.2f,\t %.2f\n", p.getX(), p.getY());}
        System.out.println();

    }  // main()

}  // class SortPoints
