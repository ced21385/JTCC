package chapter17;

import java.lang.System;
import java.lang.String;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy {

    public static void main(String[] args) throws IOException {

        File sourceFile = new File("test1.txt");
        File targetFile = new File("test2.txt");

        try (
                BufferedInputStream  input  = new BufferedInputStream (new FileInputStream (sourceFile));  // resource
                BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(targetFile));  // resource
        ) {
            int numberOfBytesCopied = 0;

            int r;
            while ((r = input.read()) != -1) {
                output.write((byte)r);
                numberOfBytesCopied++;
            }  // while

            System.out.println(numberOfBytesCopied + " bytes copied");

        }  // try-with-resources

    }  // main()

}  // clss Copy