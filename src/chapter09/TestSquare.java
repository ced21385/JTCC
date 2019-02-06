package chapter09;

import  java.lang.Math;
import  java.lang.String;
import  java.lang.System;

public class TestSquare {

    public static void main(String[] args) {  // static method

        Square [] squares = new Square[2];
        squares[0] = new Square();
        squares[1] = new Square(2.0);

        for (int i = 0; i < squares.length; i++) {

            System.out.println(squares[i].toString());
            System.out.println("Area: " + Math.round(squares[i].getArea() * 100.0) / 100.0);
            System.out.println();

        }  // for

        System.out.println("Number of Objects: " + Square.getNumberOfObjects());

    }  // main()

}  // class TestSquare