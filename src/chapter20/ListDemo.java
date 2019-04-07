package chapter20;

import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.lang.Character;
import java.lang.System;
import java.lang.String;

public class ListDemo {

    public static void main(String[] args) {

        List<String> list1 = Arrays.asList("red", "green", "blue", "yellow");
        System.out.println("list1: " + list1);
        System.out.println();

        Collections.reverse(list1);
        System.out.println("Reverse: " + list1);
        System.out.println();

        Collections.shuffle(list1);
        System.out.println("Shuffled: " + list1);
        System.out.println();

        Collections.sort(list1);
        System.out.println("Sorted: " + list1);
        System.out.println("(1) Index of \"red\": "    + Collections.binarySearch(list1, "red"   ));
        System.out.println("(2) Index of \"orange\": " + Collections.binarySearch(list1, "orange"));
        System.out.println();

        Collections.sort(list1, Collections.reverseOrder());
        System.out.println(list1);
        System.out.println();

        List<String> list2 = Arrays.asList(Character.toString('A'), Character.toString('B'));

        Collections.copy(list1, list2);
        System.out.println("list1: " + list1);
        System.out.println();

        System.out.println("max: " + Collections.max(list1));
        System.out.println("min: " + Collections.min(list1));
        System.out.println();

        System.out.println("Disjoint: " +  Collections.disjoint (list1, list2));
        System.out.println("Frequency: " + Collections.frequency(list1, "red"));
        System.out.println();

        Collections.fill(list1, "black");
        System.out.println(list1);
        System.out.println();

        List<Integer> list3 = Arrays.asList(2, 4, 7, 10, 11, 45, 50, 59, 60, 66);
        System.out.println("(3) Index of 7: " + Collections.binarySearch(list3, 7));
        System.out.println("(4) Index of 9: " + Collections.binarySearch(list3, 9));
        System.out.println();
        System.out.println();

    }  // main()

}  // class ListDemo