package chapter17;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReadWriteData {

    public static void main(String[] args) throws IOException {

        File file = new File("scores.txt");

        if (file.exists()) System.out.println("File already exists, appending to the existing file.");

        PrintWriter output = new PrintWriter(new FileOutputStream(file, true));
        output.println("John T Smith " + 90);  // "John T Smith 90"
        output.println("Eric K Jones " + 80);  // "Eric K Jones 80"
        output.close();


        try {
            Scanner input = new Scanner(file);

            while (input.hasNext()) {
                String firstName     = input.next   ();
                String middleInitial = input.next   ();
                String lastName      = input.next   ();
                int    score         = input.nextInt();
                System.out.println("Name/Score: " + firstName + " " + middleInitial + " " + lastName + " " + score);
            }  // while

            input.close();

        }  // try

        catch (IOException ex) {System.out.println(ex);}

    }  // main()

}  // class ReadWriteData