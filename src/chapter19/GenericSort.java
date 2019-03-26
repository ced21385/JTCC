package chapter19;

import java.lang.System;
import java.lang.String;
import java.lang.Integer;
import java.lang.Double;
import java.lang.Comparable;

public class GenericSort {

    public static void main(String[] args) {

        Integer  [] intArray    = {new Integer(2  ), new Integer(4  ), new Integer(3  )};
        Double   [] doubleArray = {new Double (3.4), new Double (1.3), new Double (2.1)};

        GenericSort.selectionSort(intArray);
        GenericSort.selectionSort(doubleArray);

        System.out.print("Sorted Integer objects: "  ); printList(intArray   );
        System.out.print("Sorted Double objects: "   ); printList(doubleArray);

    }  // mian()

    public static <E extends Comparable<E>> void selectionSort(E[] list) {  // Comparable<E> is a generic interface

        E   currentMin;
        int currentMinIndex;

        for (int i = 0; i < list.length - 1; i++) {

            currentMin      = list[i];
            currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin.compareTo(list[j]) > 0) {
                    currentMin      = list[j];
                    currentMinIndex = j;
                }  // if
            }  // for

            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i]               = currentMin;
            }  // if

        }  // for

    }  // selectionSort()

    public static void printList(Object[] list) {
        for (int i = 0; i < list.length; i++) System.out.print(list[i] + " ");
        System.out.println();
    }  // printList()

}  // class GenericSort