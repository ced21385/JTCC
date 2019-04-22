package chapter30;

import java.lang.System;
import java.lang.String;
import java.lang.Exception;
import java.io.File;
import java.nio.file.Files;
import java.util.Scanner;

public class DirectorySizeStream {

    public static void main(String[] args) throws Exception {

        System.out.print("Enter a directory or a file: ");
        Scanner input = new Scanner(System.in);
        String directory = input.nextLine();
        System.out.println(DirectorySizeStream.getSize(new File(directory)) + " bytes");

    }  // main()

    public static long getSize(File file) {

        if (file.isFile()) return file.length();
        else {
            try {
                return Files.list(file.toPath()).parallel().
                        mapToLong(e -> getSize(e.toFile())).
                        sum();
            }
            catch (Exception ex) {return 0;}
        }  // else

    }    // getSize()

}  // class DirectorySizeStream
