package chapter19;

import java.lang.System;
import java.lang.String;
import java.lang.Integer;
import java.lang.Character;
import java.lang.Double;
import chapter19.GenericSelectionSort;

public class TestGenericSelectionSort {
    public static void main(String[] args) {
        // Create an Integer array
        Integer[] intArray = {new Integer(2), new Integer(4), new Integer(3)};

        // Create a Double array
        Double[] doubleArray = {new Double(3.4), new Double(1.3), new Double(-22.1)};

        // Create a Character array
        Character[] charArray = {new Character('a'), new Character('j'), new Character('r')};

        // Create a String array
        String[] stringArray = {"Tom", "Susan", "Jerry"};

        // Sort the arrays
        GenericSelectionSort.<Integer  >sort(intArray);
        GenericSelectionSort.<Double   >sort(doubleArray);
        GenericSelectionSort.<Character>sort(charArray);
        GenericSelectionSort.<String   >sort(stringArray);

        // Display the sorted arrays
        System.out.print("Sorted Integer objects: ");
        GenericSelectionSort.printList(intArray);
        System.out.print("Sorted Double objects: ");
        GenericSelectionSort.printList(doubleArray);
        System.out.print("Sorted Character objects: ");
        GenericSelectionSort.printList(charArray);
        System.out.print("Sorted String objects: ");
        GenericSelectionSort.printList(stringArray);
    }  // main()

}  // TestGenericSelectionSort