package chapter30;

import java.lang.System;
import java.lang.String;
import java.lang.Double;
import java.util.Scanner;
import java.util.stream.IntStream;

/** This program is a version of Exercise 7.4, but
 *  uses an IntStream instead. User inputs scores
 *  until a score less than 0 is entered and then
 *  the average, and the number of scores above and
 *  below average are outputted.
 */

public class AnalyzeScores {

    public static void main(String[] args){

        int[] scores = new int[100];
        int score;

        Scanner input = new Scanner(System.in);

        for(int i = 0;i < scores.length;i++) {

            System.out.print("Enter a new score: ");
            score = input.nextInt();

            if (score < 0) {

                Double average = IntStream.of(scores).limit(i).average().getAsDouble();
                System.out.println("Average is: " + average);
                System.out.println("Number of scores above or equal to the average: " +
                        IntStream.of(scores).limit(i).filter(e-> e >= average).count());
                System.out.println("Number of scores below the average: " +
                        IntStream.of(scores).limit(i).filter(e-> e < average).count());
                break;
            }
            scores[i] = score;
        }
    } //main()

}  //AnalyzeScores()
