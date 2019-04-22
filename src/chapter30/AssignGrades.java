package chapter30;

import java.lang.String;
import java.lang.System;
import java.util.Scanner;
import java.util.stream.IntStream;

public class AssignGrades {

    public static void main(String[] args){

        System.out.print("Enter number of students: ");
        Scanner input = new Scanner(System.in);

        int[] scores = new int[input.nextInt()];

        System.out.print("Enter " + scores.length + " scores: ");
        for (int i = 0; i < scores.length;i++){ scores[i] = input.nextInt();}

        for(int i = 0; i < scores.length;i++){
            int student = IntStream.of(scores[i]).findFirst().getAsInt();
            System.out.println("Student " + i + " score is " + student + " and grade is " +
                    gradeCalc(scores[i]));
        }
    }  //main()

    public static String gradeCalc(int grade){
        String letter = " ";
        if(grade < 55){
            letter = "C";
        }
        if(grade >= 55 && grade < 70){
            letter = "B";
        }
        else if(grade >= 70){
            letter = "A";
        }
        return letter;
    }  //gradeCalc()

} //AssignGrades()
