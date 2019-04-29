package profAnswers202;
//chapter30
import java.lang.System;
import java.lang.String;
import java.util.Scanner;
import java.util.stream.IntStream;

public class AssignGrades {

    public static void main(String[] args) {

        System.out.print("Enter number of students: ");
        Scanner input = new Scanner(System.in);

        int [] scores = new int[input.nextInt()];

        System.out.print("Enter " + scores.length + " scores: ");

        for (int i = 0; i < scores.length; i++) scores[i] = input.nextInt();

        double best = IntStream.of(scores).max().getAsInt();

        char grade;

        for (int i = 0; i < scores.length; i++) {

            if (scores[i] >= best - 10) grade = 'A';
            else if (scores[i] >= best - 20) grade = 'B';
            else if (scores[i] >= best - 30) grade = 'C';
            else if (scores[i] >= best - 40) grade = 'D';
            else                             grade = 'F';

            System.out.println("Student " + i + " score is " + scores[i] + " and grade is " + grade);

        } // for

    }  // main()

}  // class AssignGrades
