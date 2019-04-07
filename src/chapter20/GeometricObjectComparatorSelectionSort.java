package chapter20;

import java.util.Comparator;
import java.lang.System;
import java.lang.String;
import java.lang.Math;
import chapter20.GeometricObjectComparator;
import chapter20.GeometricObject;
import chapter20.Circle;
import chapter20.Rectangle;

public class GeometricObjectComparatorSelectionSort {

    public static void main(String[] args) {

        GeometricObject[] list = {new Circle(5), new Rectangle(4, 5), new Circle(3), new Rectangle(3, 5)};

        GeometricObjectComparatorSelectionSort.selectionSort(list, new GeometricObjectComparator());

        for (int i = 0; i < list.length; i++)
            System.out.print(Math.round(list[i].getArea() * 100.0) / 100.0 + " ");

        System.out.println();

    }  // main()

//    public static <E> void selectionSort(E[] list, Comparator<? super E> comparator) {

    public static <E> void selectionSort(E[] list, Comparator<E> comparator) {

        boolean needNextPass = true;

        for (int k = 1; k < list.length && needNextPass; k++) {
            needNextPass = false;
            for (int i = 0; i < list.length - k; i++) {
                if (comparator.compare(list[i], list[i + 1]) > 0) {
                    E temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;

                    needNextPass = true; // Next pass still needed
                }  // if
            }  // for
        }  // for
    }  // selectionSort()

}  // class eometricObjectComparator