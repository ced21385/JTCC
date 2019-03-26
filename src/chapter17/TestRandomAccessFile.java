package chapter17;

import java.lang.System;
import java.lang.String;
import java.io.IOException;
import java.io.RandomAccessFile;

public class TestRandomAccessFile {

    public static void main(String[] args) throws IOException {

        try (RandomAccessFile inOut = new RandomAccessFile("test.dat", "rw");)  // resource
        {
            inOut.setLength(0);  // empty the file to destroy the old contents

            for (int i = 0; i < 10; i++) inOut.writeInt(i);

            System.out.println("Current file length is " + inOut.length());

            inOut.seek(0);  // move the file point to the beginning
            System.out.println("The first number is " + inOut.readInt());

            inOut.seek(0 + ((2 - 1) * 4));  // 4 bytes int
            System.out.println("The second number is " + inOut.readInt());

            inOut.seek(inOut.length());  // move the file point to the end
            inOut.writeInt(999);

            System.out.println("The new length is " + inOut.length());
        }  // try-with-resources

    }  // main()

}  // class TestRandomAccessFile
