package chapter18;

import java.lang.System;
import java.lang.String;

public class BinarySearch {

    public static void main(String[] args) {

        int[] list = new int[] {4, 5, 6, 7, 8};  // sorted

        int key;    // search key
        int index;  // index of int[] list

        key = 4;
        index = BinarySearch.recursiveBinarySearch(list, key);
        System.out.println("Found " + key + " at index " + index);
        System.out.println();

        key = 9;
        index = BinarySearch.recursiveBinarySearch(list, key);
        System.out.println("Found " + key + " at index " + index);
        System.out.println();

    }  // main()

    public static int recursiveBinarySearch(int[] list, int key) {
        return BinarySearch.recursiveBinarySearch(list, key, 0, list.length - 1);
    }  // recursiveBinarySearch()

    private static int recursiveBinarySearch(int[] list, int key, int low, int high) {  // recursive helper method

        if (high >= low) {

            int mid = (low + high) / 2;

            if      (key == list[mid]) return mid;  // base case (stopping condition)
            else if (key <  list[mid]) return BinarySearch.recursiveBinarySearch(list, key, low, mid - 1);
            else                       return BinarySearch.recursiveBinarySearch(list, key, mid + 1, high);
        }
        else return -low -1;  // base case (stopping condition)

    }  // recursiveBinarySearch()

}  // class BinarySearch