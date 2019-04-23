package profAnswers202;
//chapter12
import java.util.Scanner;
import java.util.Arrays;
import java.lang.System;
import java.lang.String;
import java.lang.Math;
import java.lang.ArrayIndexOutOfBoundsException;

public class ArrayIndexOutOfBounds {

    public static void main(String[] args) {

        int[] data = new int[100];
        for (int i = 0; i < data.length; i++) data[i] = (int)(Math.random() * 10);
        System.out.println(Arrays.toString(data));

        System.out.print("Enter an index: ");
        Scanner input = new Scanner(System.in);
        int index = input.nextInt();

        try {System.out.println("The element is " + data[index]);}
        catch (ArrayIndexOutOfBoundsException ex) {System.out.println("Out of Bounds");}
        finally {}

    }  // main()

}  // class ArrayIndexOutOfBounds
