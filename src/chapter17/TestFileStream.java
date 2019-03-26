package chapter17;

import java.lang.System;
import java.lang.String;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileStream {

    public static void main(String[] args) throws IOException {

        try (FileOutputStream output = new FileOutputStream("temp.dat");) {  // demo/temp.dat
            for (int i = 1; i <= 10; i++) {
                output.write(i);  // int: 4 bytes
//                output.write((byte)i);
//                output.write((byte)9.9);
//                output.write((byte)'A');
//                output.write("A");  // String
//                output.write((byte)"A");  // String
            }
        }  // try-with-resources

        try (FileInputStream input   = new FileInputStream ("temp.dat");) {
            int value;
            while ((value = input.read()) != -1) System.out.print(value + " ");
            System.out.println();
        }  // try-with-resources

    }  // main()

}  // class TestFileStream
