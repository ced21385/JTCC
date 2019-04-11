package chapter21;

import java.lang.System;
import java.lang.String;
import java.util.Set;
import java.util.HashSet;

public class TestMethodsInCollection {

    public static void main(String[] args) {

        Set<String> set1 = new HashSet<>();

        set1.add("London"  );
        set1.add("Paris"   );
        set1.add("Richmond");
        set1.add("Boston"  );
        set1.add("Taipei"  );
        set1.add("Richmond");

        System.out.println("set1 is " + set1);
        System.out.println(set1.size() + " elements in set1");
        System.out.println();

        set1.remove("London");
        System.out.println("set1 is " + set1);
        System.out.println(set1.size() + " elements in set1");
        System.out.println();

        Set<String> set2 = new HashSet<>();

        set2.add("London");
        set2.add("Tokyo" );
        set2.add("Paris" );

        System.out.println("set2 is " + set2);
        System.out.println(set2.size() + " elements in set2");
        System.out.println();

        System.out.println("Is Taipei in set2? " + set2.contains("Taipei"));
        System.out.println();

        set1.addAll(set2);
        System.out.println("After adding set2 to set1, set1 is " + set1);
        System.out.println();

        set1.removeAll(set2);
        System.out.println("After removing set2 from set1, set1 is " + set1);
        System.out.println();

        set1.retainAll(set2);
        System.out.println("After removing common elements in set2 " + "from set1, set1 is " + set1);
        System.out.println();

    }  // main()

}  // class TestMethodsInCollection