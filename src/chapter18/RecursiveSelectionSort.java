package chapter18;

import java.lang.System;
import java.lang.String;

public class RecursiveSelectionSort {

    public static void main(String[] args) {
        double[] list = {2, 1, 3, 1, 2, 5, 2, -1, 0};
        RecursiveSelectionSort.sort(list);
        for (int i = 0; i < list.length; i++) System.out.print(list[i] + " ");
    }  // main()

    public static void sort(double[] list) {RecursiveSelectionSort.sort(list, 0, list.length - 1);}

    public static void sort(double[] list, int low, int high) {
        if (low < high) {
            int indexOfMin = low;
            double min = list[low];
            for (int i = low + 1; i <= high; i++) {
                if (list[i] < min) {
                    min = list[i];
                    indexOfMin = i;
                }  // if
            }  // for

            list[indexOfMin] = list[low];
            list[low] = min;

            RecursiveSelectionSort.sort(list, low + 1, high);
        } // if
    }  // sort()

}  // class RecursiveSelectionSort