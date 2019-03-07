package chapter12;

import java.io.File;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.System;
import java.lang.String;
import java.lang.Exception;

public class ReplaceText {

    // public static void main(String[] args) {
    public static void main(String[] args) throws Exception {  // checked exception

        System.out.println(Arrays.toString(args));

        if (args.length != 4) System.out.println("Usage: java ReplaceText sourceFile targetFie oldString newString");
        else {
            File sourceFile = new File(args[0]);
            File targetFile = new File(args[1]);

            if      (!sourceFile.exists()) System.out.println("Source file " + args[0] + " does not exist.");
            else if ( targetFile.exists()) System.out.println("Target file " + args[1] + " exists."        );
            else
                try (
                        Scanner     input  = new Scanner    (sourceFile);  // resource
                        PrintWriter output = new PrintWriter(targetFile);  // resource
                ) {
                    while (input.hasNext()) {
                        String s1 = input.nextLine();
                        String s2 = s1.replaceAll(args[2], args[3]);
                        output.println(s2);
                    }  // while
                }  // try with resources

        }  // if (args.length != 4)

    }  // main()

}  // class ReplaceText
