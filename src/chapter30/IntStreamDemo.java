package chapter30;

import java.lang.System;
import java.lang.String;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntStreamDemo {

    public static void main(String[] args) {

        int[] values = {1, 2, 3, 4, 10, 5};

        System.out.print("values: ");
        for (int e: values) System.out.print(e + " ");
        System.out.println();

        System.out.println("The number of digits in values is " +
                IntStream.of(values).
                        mapToObj(e -> e + "").      // map to String
                        mapToInt(e -> e.length()).  // map to length
                        sum()
        );

        System.out.println("The average of distinct even numbers > 3: " +
                IntStream.of(values).distinct().filter(e -> e > 3 && e % 2 == 0).average().
                        getAsDouble());  // OptionalDouble

        System.out.println("The sum of the first 4 numbers is " + IntStream.of(values).limit(4).sum());

        IntSummaryStatistics stats = IntStream.of(values).summaryStatistics();

        System.out.println("The summary of the stream: "  );
        System.out.println("Count: "   + stats.getCount  ());
        System.out.println("Max: "     + stats.getMax    ());
        System.out.println("Min: "     + stats.getMin    ());
        System.out.println("Sum: "     + stats.getSum    ());
        System.out.println("Average: " + stats.getAverage());

    }  // main()

}  // class IntStreamDemo