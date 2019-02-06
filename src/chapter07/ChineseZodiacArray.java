package chapter07;

import java.util.Scanner;
import java.lang.System;
import java.lang.String;

public class ChineseZodiacArray {
    public static void main(String[] args){


        String[] animals = {"monkey", "rooster", "dog", "pig", "rat",
                "ox", "tiger", "rabbit", "dragon", "snake", "horse", "sheep"};

        System.out.print("Enter a year: ");
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();

        System.out.print(animals[year%12]);

    }
}
