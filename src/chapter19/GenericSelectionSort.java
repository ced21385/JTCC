package chapter19;

import java.lang.System;
import java.lang.Comparable;

public class GenericSelectionSort <E extends Comparable<E>> {

    public static <E extends Comparable<E>> void sort(E[] list) {

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

    }  // sort()

    public static void printList(Object[] list) {
        for (Object element: list) System.out.print(element + " ");
        System.out.println();
    }  // printList()

}  // class GenericSelectionSort