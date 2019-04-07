package chapter20;

import java.lang.System;
import java.lang.String;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortStringByLength {

    public static void main(String[] args) {

        String[] cities = {"Miami", "Atlanta", "Dallas"};

        Arrays.sort(cities);
        for (String s : cities) {System.out.print(s + " ");}
        System.out.println();

        Arrays.sort(cities, new MyComparator());
        for (String s : cities) {System.out.print(s + " ");}
        System.out.println();

//        Arrays.sort(cities, (s1, s2) -> {return s1.length() - s2.length();});
//        for (String s : cities) {System.out.print(s + " ");}
//        System.out.println();
//
//        Arrays.sort(cities, (s1, s2) -> s1.length() - s2.length());
//        for (String s : cities) {System.out.print(s + " ");}
//        System.out.println();

    }  // main()

    public static class MyComparator implements Comparator<String> {
        @Override  // java.util.Comparator.compare()
        public int compare(String s1, String s2) {return s1.length() - s2.length();}
    }  // inner class MyComparator

}  // class SortStringByLength