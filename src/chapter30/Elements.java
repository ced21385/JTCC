package chapter30;

import java.lang.System;
import java.lang.String;
import java.lang.Integer;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Elements {

    public static void main(String[] args) {

        Integer[] numbers = {1, 2, 5, 4, 3};

        Set<Integer> set = new HashSet<>(Arrays.asList(numbers));

        System.out.println("set: " + set);

        int count = 0;
        for (Integer e: set) if (e > 3) count++;  // foreach loop
        System.out.println("Count (element > 3): "+ count);

        System.out.println("Count (element > 3): " +
                set.                 // source
                        stream().            // collection stream
                        filter(e -> e > 3).  // intermediate operation
                        count()              // terminal operation
        );

    }  // main()

}  // class Elements