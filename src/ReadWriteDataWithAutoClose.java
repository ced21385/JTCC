package chapter12;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.lang.System;
import java.lang.String;

public class ReadWriteDataWithAutoClose {

    public static void main(String[] args) throws IOException {

        File file = new File("scores.txt");

        if (file.exists()) System.out.println("File already exists.");
        else
            try (PrintWriter output = new PrintWriter(file)) {  // resource
                output.println("John T Smith " + 90);           // "John T Smith 90"
                output.println("Eric K Jones " + 80);           // "Eric K Jones 80"
            }  // try-with-resources

        System.out.println();

        try (Scanner input = new Scanner(file)) {               // resource
            while (input.hasNext()) {
                String firstName     = input.next   ();
                String middleInitial = input.next   ();
                String lastName      = input.next   ();
                int    score         = input.nextInt();
                System.out.println("Name/Score: " + firstName + " " + middleInitial + " " + lastName + " " + score);
            }  // while
        }  // try-with-resources

    }  // main()

}  // class ReadWriteDataWithAutoClose