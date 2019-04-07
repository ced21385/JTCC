package chapter20;

import java.lang.String;
import java.lang.System;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class CollectionsBinarySearch {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println("list: " + list);

        Collections.shuffle(list);
        System.out.println("Shuffered: " + list);

        Collections.sort(list);
        System.out.println("Sorted: " + list);

        System.out.println("Index of 4: " + Collections.binarySearch(list, 4));

    }  // main()

}  // class ColliectionsBinarySearch