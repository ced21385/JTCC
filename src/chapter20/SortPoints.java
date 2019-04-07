package chapter20;

import java.lang.System;
import java.lang.String;
import java.lang.Math;
import java.util.Arrays;
import java.util.Comparator;
import javafx.geometry.Point2D;


/*Christopher Davis, CSC 202, SortPoints
This program creates 5 random points using Point2D,
then sorts them in increasing Y value, then increasing X value;
Y is primary sort and X is secondary sort
 */


public class SortPoints {

    public static void main(String[] args) {

        //creation of 5 random points
        Point2D[] points = new Point2D[5];
        System.out.println("5 Points (X,Y): ");
        for (int i = 0; i < points.length; i++) {

            points[i] = new Point2D(Math.random() * 10, Math.random() * 10);
            System.out.printf(" %.4s,   %.4s\n", points[i].getX(), points[i].getY());

        }       //for()

        //compare points' x and y values and then print
        System.out.println("\n \n 5 Points sorted by Y and X: ");
        Arrays.sort(points,new SortX());
        Arrays.sort(points, new Sort());
        for (Point2D a : points){
            System.out.printf(" %.4s,   %.4s\n",a.getX(),a.getY());}

    } // main()

    public static class Sort implements Comparator<Point2D> {


        @Override
        public int compare(Point2D a, Point2D b) {
            return Double.compare(a.getY(),b.getY());
        }
    }   //inner class Sort
    public static class SortX implements Comparator<Point2D> {

        @Override
        public int compare(Point2D a, Point2D b) {
            int compare = Double.compare(a.getX(), b.getX());
            if (a.getX() < b.getX())
                return compare;
            else
                return Double.compare(a.getX(),b.getX());
        }
    } //inner class SortX
} // class SortPoints

