package chapter12;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.lang.System;
import java.lang.String;

public class ReadWriteData {

    public static void main(String[] args) throws IOException {

        File file = new File("scores.txt");

        if (file.exists()) System.out.println("File already exists.");
        else {
            PrintWriter output = new PrintWriter(file);  // may throw an IOException (checked exception)
            output.println("John T Smith " + 90);
            output.println("Eric K Jones " + 80);
            output.close();
        }  // else

        Scanner input = new Scanner(file);               // may throw an IOException (checked exception)

        while (input.hasNext()) {
            String firstName     = input.next   ();
            String middleInitial = input.next   ();
            String lastName      = input.next   ();
            int    score         = input.nextInt();
            System.out.println("Name/Score: " + firstName + " " + middleInitial + " " + lastName + " " + score);
        }  // while

        input.close();

    }  // main()

}  // class ReadWriteData