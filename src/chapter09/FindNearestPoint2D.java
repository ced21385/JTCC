package chapter09;

import javafx.geometry.Point2D;
import java.util.Scanner;
import java.lang.System;
import java.lang.String;

public class FindNearestPoint2D {

    Point2D i;
    Point2D j;


    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        FindNearestPoint2D thisPoint = new FindNearestPoint2D();
        thisPoint.i = new Point2D(input.nextDouble(), input.nextDouble());
        thisPoint.j = new Point2D(input.nextDouble(), input.nextDouble());

        System.out.print(thisPoint.i.getX());

    }


}
