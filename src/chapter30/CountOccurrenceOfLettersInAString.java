package chapter30;

import java.lang.System;
import java.lang.String;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class CountOccurrenceOfLettersInAString {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.nextLine();

        System.out.print("The occurrences of each letter are: ");
        Stream.of(toCharacterArray(s.toCharArray())).
                filter(ch -> Character.isLetter(ch)).
                map(ch -> Character.toUpperCase(ch)).
                collect(Collectors.groupingBy(e -> e, TreeMap::new, Collectors.counting())).
                forEach((k, v) -> System.out.print(v + " " + k + ", "));
        System.out.println();

    }  // main()

    public static Character[] toCharacterArray(char[] list) {
        Character[] result = new Character[list.length];
        for (int i = 0; i < result.length; i++) result[i] = list[i];
        return result;
    }  // toCharacterArray()

}  // class CountOccurenceOfLettersInAString