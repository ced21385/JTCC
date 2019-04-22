package chapter30;

import java.lang.System;
import java.lang.String;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntStreamDemoNames {

    public static void main(String[] args) {

        String[] names = {"Al", "John", "Joen"};

        System.out.print("names: ");
        for (String e: names) System.out.print(e + " ");
        System.out.println();

        System.out.println("Total character count for all names is " +
                Stream.of(names).
                        mapToInt(e -> e.length()).
                        sum()
        );

    }  // main()

}  // class IntStreamDemoNames