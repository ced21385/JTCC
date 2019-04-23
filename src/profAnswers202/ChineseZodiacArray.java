package profAnswers202;
//chapter07
import java.lang.System;
import java.lang.String;
import java.util.Scanner;

public class ChineseZodiacArray {

    public static void main(String args[]) {

        String[] animals = {"rat", "ox", "tiger", "rabbit", "dragon", "snake", "horse", "sheep", "monkey", "rooster", "dog", "pig"};

        System.out.print("Enter a year: ");
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();

        System.out.println(animals[(year - 4) % 12]);

    }  // main()

}  // class ChineseZodiacArray
