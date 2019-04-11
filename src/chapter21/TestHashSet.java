package chapter21;

import java.util.Set;
import java.lang.System;
import java.lang.String;
import java.util.HashSet;

public class TestHashSet {

    public static void main(String[] args) {

        Set<String> set = new HashSet<>();

        set.add("London"  );
        set.add("Paris"   );
        set.add("Richmond");
        set.add("Tokyo"   );
        set.add("Taipei"  );
        set.add("Richmond");

        System.out.println("hash set (duplicate-free, un-ordered): " + set);
        System.out.println(set.size() + " elements in set");
        System.out.println();

        System.out.print("set: ");
        for (String s: set) System.out.print(s + " ");  // foreach loop
        System.out.println();
        System.out.println();

        System.out.print("set: ");
        set.forEach(e -> System.out.print(e + " "));    // forEach()
        System.out.println();
        System.out.println();

    }  // main()

}  // class TestHashSet