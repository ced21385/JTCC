package chapter17;

import java.lang.System;
import java.lang.String;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreateBinaryFile {

    public static void main(String[] args) throws IOException {
        try (DataOutputStream output = new DataOutputStream(new FileOutputStream("CreateBinaryFile.dat"))) {
            for (int i = 0; i < 10; i++) {
                output.write((int) (Math.random() * 10));

            }

            try (FileInputStream input = new FileInputStream("CreateBinaryFile.dat")) {
                int value;
                while((value =input.read())!= -1){
                    System.out.print(value + " ");
                }
            }
        }
    }
}


