package chapter17;

import java.lang.System;
import java.lang.String;
import java.lang.ClassNotFoundException;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class TestObjectStream {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        String name  = "John";      // String
        double score = 85.5;        // primitive type
        Date   date  = new Date();  // object

        try (ObjectOutputStream output = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("object.dat")));) {
            output.writeUTF   (name );  // unicode transformation format; ascii
            output.writeDouble(score);
            output.writeObject(date );
        }  // try-with-resources

        try (ObjectInputStream input = new ObjectInputStream(new BufferedInputStream(new FileInputStream("object.dat")));) {
            name  =        input.readUTF   () ;
            score =        input.readDouble() ;
            date  = (Date)(input.readObject());

            System.out.println(name + " " + score + " " + date);
        }  // try-with-resources

    }  // main()

} // class TestObjectStream