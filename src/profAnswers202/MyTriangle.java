package profAnswers202;
//chapter06
import java.util.Scanner;
import java.lang.Math;
import java.lang.System;
import java.lang.String;

public class MyTriangle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter three sids in double: ");
        double edge1 = input.nextDouble();
        double edge2 = input.nextDouble();
        double edge3 = input.nextDouble();

        if (MyTriangle.isValid(edge1, edge2, edge3))
            System.out.printf ("Area: %.2f\n", MyTriangle.area(edge1, edge2, edge3));
        else System.out.println("Input is invalid");

    }  // main()

    public static boolean isValid(double side1, double side2, double side3) {
        return (side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1);
    }  // isValid()

    public static double area(double side1, double side2, double side3) {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }  // area()

}  // class MyTriangle
