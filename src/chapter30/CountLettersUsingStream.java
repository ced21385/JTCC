package chapter30;

import java.lang.System;
import java.lang.String;
import java.util.Random;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountLettersUsingStream {

    public static void main(String[] args) {

        Object[] chars = new Random().ints(10, (int)'a', (int)'z' + 1).mapToObj(e -> (char)e).toArray();

        System.out.print("The 10 lowercase letters are: ");
        Stream.of(chars).forEach(e -> System.out.print(e + " "));
        System.out.println();

        System.out.print("The occurrences of each letter are: ");
        Stream.of(chars).
                collect(Collectors.groupingBy(e -> e, TreeMap::new, Collectors.counting())).
                forEach((k, v) -> System.out.print(v + " " + k + ", "));
        System.out.println();

    }  // main()

}  // class CountLettersUsingStream