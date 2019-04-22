package chapter30;

import java.lang.System;
import java.lang.String;
import java.util.Scanner;
import java.util.stream.DoubleStream;

//import java.util.stream.*;

public class AnalyzeNumbersUsingStream {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        double[] numbers = new double[input.nextInt()];

        System.out.print("Enter the numbers: ");
        for (int i = 0; i < numbers.length; i++) numbers[i] = input.nextDouble();

        double average = DoubleStream.of(numbers).average().getAsDouble();

        System.out.println("Average is " + average);
        System.out.println("Number of elements above the average is " +
                DoubleStream.of(numbers).filter(e -> e > average).count());

    }  // main()

}  // class AnalyzeNumbersUsingStream