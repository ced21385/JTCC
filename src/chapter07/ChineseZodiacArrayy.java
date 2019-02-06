package chapter07;

import java.util.Scanner;

public class ChineseZodiacArrayy {
    public static void main(String[] args){
        String[] animals = {"rat", "ox", "tiger", "rabbit", "dragon", "snake",
        "horse", "sheep", "monkey", "rooster", "dog", "pig"};

        System.out.print("Enter a year: ");
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();

        System.out.print(animals[year%12-4]);
    }
}
