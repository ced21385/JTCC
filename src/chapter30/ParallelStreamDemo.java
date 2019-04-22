package chapter30;

import java.lang.System;
import java.lang.String;
import java.lang.Runtime;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class ParallelStreamDemo {

    public static void main(String[] args) {

        System.out.println("Processors: " + Runtime.getRuntime().availableProcessors());
        System.out.println();

        long startTime, endTime;

        int[] list, list1, list2;

        list = new Random().ints(2000000).toArray();

        startTime = System.currentTimeMillis();

        list1 = IntStream.of(list).filter(e -> e > 0).sorted().limit(5).toArray();
        System.out.println(Arrays.toString(list1));

        endTime = System.currentTimeMillis();

        System.out.println("Sequential execution: " + (endTime - startTime) + " milliseconds");
        System.out.println();

        startTime = System.currentTimeMillis();

        list2 = IntStream.of(list).parallel().filter(e -> e > 0).sorted().limit(5).toArray();
        System.out.println(Arrays.toString(list2));

        endTime = System.currentTimeMillis();

        System.out.println("Parallel execution: " + (endTime - startTime) + " milliseconds");
        System.out.println();

        list = new Random().ints(20000).toArray();

        startTime = System.currentTimeMillis();

        list1 = IntStream.of(list).filter(e -> e > 0).sorted().limit(5).toArray();
        System.out.println(Arrays.toString(list1));

        endTime = System.currentTimeMillis();

        System.out.println("Sequential execution: " + (endTime - startTime) + " milliseconds");
        System.out.println();

        startTime = System.currentTimeMillis();

        list2 = IntStream.of(list).parallel().filter(e -> e > 0).sorted().limit(5).toArray();
        System.out.println(Arrays.toString(list2));

        endTime = System.currentTimeMillis();

        System.out.println("Parallel execution: " + (endTime - startTime) + " milliseconds");
        System.out.println();

    }  // main()

}  // class ParallelStreamDemo