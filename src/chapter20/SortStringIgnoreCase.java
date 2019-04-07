package chapter20;

import java.lang.System;
import java.lang.String;
import java.util.Arrays;
import java.util.List;

public class SortStringIgnoreCase {

    public static void main(String[] args) {

        List<String> cities = Arrays.asList("Atlanta", "Miami", "dallas");

        cities.sort(null);  // natural order
        for (String s: cities) {System.out.print(s + " ");}
        System.out.println(); System.out.println();

        cities.sort((s1, s2) -> s1.compareToIgnoreCase(s2));
        for (String s: cities) {System.out.print(s + " ");}
        System.out.println(); System.out.println();

        cities.sort(String::compareToIgnoreCase);  // method reference
        for (String s: cities) {System.out.print(s + " ");}
        System.out.println(); System.out.println();

    }  // main()

}  // class SortStringIgnoreCase