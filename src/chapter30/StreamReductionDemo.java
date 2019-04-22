package chapter30;

import java.lang.System;
import java.lang.String;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamReductionDemo {

    public static void main(String[] args) {

        int[] values = {1, 2, 3, 5, 4};

        System.out.print("values: ");
        IntStream.of(values).forEach(e -> System.out.print(e + " "));
        System.out.println();

        System.out.println("The result of multiplying all values is " +
                IntStream.of(values).parallel().
                        reduce(1, (e1, e2) -> e1 * e2));

        System.out.print("The values are " +
                IntStream.of(values).
                        mapToObj(e -> e + "").  // map int to String
                        reduce((e1, e2) -> e1 + ", " + e2).
                        get()
        );
        System.out.println();

    }  // main()

}  // class StreamReductionDemo
