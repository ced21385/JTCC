package chapter12;

import java.io.File;
import java.util.Date;
import java.lang.System;
import java.lang.String;

public class TestDirectory {

    public static void main(String[] args) {

        File file = new File("c:\\Windows");

        System.out.println("Is it a directory? "  + file.isDirectory    ()       );
        System.out.println("Absolute path: "      + file.getAbsolutePath()       );
        System.out.println("Last modified date: " + new Date(file.lastModified()));

    }  // main()

}  // class TestDirectory