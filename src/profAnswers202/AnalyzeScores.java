package profAnswers202;
//chapter30
import java.lang.System;
import java.lang.String;
import java.lang.Double;
import java.util.Scanner;
import java.util.stream.IntStream;

public class AnalyzeScores {

    public static void main(String[] args) {

        int[] scores = new int[100];

        int     count = 0;
        int     score;
        boolean ok = true;

        Scanner input = new Scanner(System.in);
        while (ok) {
            System.out.print("Enter a new score: ");
            score = input.nextInt();

            if (score >= 0) {
                scores[count] = score;
                count++;
            }
            else ok = false;
        }

        double average    = IntStream.of(scores).limit(count).average().getAsDouble();
        long   numOfAbove = IntStream.of(scores).limit(count).filter(e -> e >= average).count();
        long   numOfBelow = IntStream.of(scores).limit(count).filter(e -> e <  average).count();

        System.out.println("Average is " + average);
        System.out.println("Number of scores above or equal to the average " + numOfAbove);
        System.out.println("Number of scores below the average " + numOfBelow);

    }  // mian()

}  // class AnalyzeScores