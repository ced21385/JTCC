package chapter17;

import java.lang.System;
import java.lang.String;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestDataStream {

    public static void main(String[] args) throws IOException {

        try (DataOutputStream output = new DataOutputStream(new FileOutputStream("temp.dat"));) {  // demo/temp.dat
            output.writeInt(1); output.writeUTF("John"  ); output.writeDouble( 85.5 );
            output.writeInt(2); output.writeUTF("Jim"   ); output.writeDouble(185.5 );
            output.writeInt(3); output.writeUTF("George"); output.writeDouble(105.25);
        }  // try-with-resouces

        try (DataInputStream input = new DataInputStream(new FileInputStream("temp.dat"));) {
            System.out.println(input.readInt() + " " + input.readUTF() + " " + input.readDouble());
            System.out.println(input.readInt() + " " + input.readUTF() + " " + input.readDouble());
            System.out.println(input.readInt() + " " + input.readUTF() + " " + input.readDouble());
        }  // try-with-resouces
        System.out.println();

//        try {
//            try (DataInputStream input = new DataInputStream(new FileInputStream("temp.dat"))) {
//                while (true) System.out.println(input.readInt() + " " + input.readUTF() + " " + input.readDouble());
//            }  // try-with-resources
//        }  // try
//        catch (EOFException ex) {System.out.println("All data were read");}
//        catch (IOException  ex) {ex.printStackTrace();}

    }  // main()

}  // class TestDataStream
