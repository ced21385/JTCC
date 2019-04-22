package chapter30;

import java.lang.System;
import java.lang.String;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamReductionDemoNames {

    public static void main(String[] args) {

        String[] names = {"Al", "John", "Joe"};
        System.out.print("names: ");
        System.out.println(Stream.of(names).reduce((x, y) -> x + ", " + y).get());

        System.out.print("Concat names: ");
        System.out.println(Stream.of(names).reduce((x, y) -> x + y).get());

        System.out.print("Total number of characters: ");
        System.out.println(Stream.of(names).reduce((x, y) -> x + y).get().length());

    }  // main()

}  // class StreamReductionDemoNames