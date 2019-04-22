package chapter30;

import java.lang.System;
import java.lang.String;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CollectGroupDemo {

    public static void main(String[] args) {

        String[] names = {"John", "Peter", "Susan", "Kim", "Jen", "George", "Alan", "Stacy", "Steve", "john"};

        System.out.print("Names: ");
        Stream.of(names).forEach(e -> System.out.print(e + " "));
        System.out.println();
        System.out.println();

        Map<String, Long> map1 = Stream.of(names).
                map(e -> e.toUpperCase()).
                collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        System.out.println("map1: " + map1);

        Map<Character, Long> map2 = Stream.of(names).
                collect(Collectors.groupingBy(e -> e.charAt(0), TreeMap::new, Collectors.counting()));
        System.out.println("map2: " + map2);
        System.out.println();

        int[] values = {2, 3, 4, 1, 2, 3, 2, 3, 4, 5, 1};

        IntStream.of(values).mapToObj(e -> e).
                collect(Collectors.groupingBy(e -> e, TreeMap::new, Collectors.counting())).
                forEach((k, v) -> System.out.println(k + " occurs " + v + (v > 1 ? " times " : " time ")));
        System.out.println();

    }  // main()

}  // class CollectGroupDemo