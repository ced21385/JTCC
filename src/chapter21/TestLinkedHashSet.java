package chapter21;

import java.lang.System;
import java.lang.String;
import java.util.LinkedHashSet;
import java.util.Set;

public class TestLinkedHashSet {

    public static void main(String[] args) {

        Set<String> set = new LinkedHashSet<>();

        set.add("London"  );
        set.add("Paris"   );
        set.add("Richmond");
        set.add("Boston"  );
        set.add("Taipei"  );
        set.add("Richmond");

        System.out.println("linked has set (duplicate-free, ordered): " + set);
        System.out.println(set.size() + " elements in set");
        System.out.println();

        System.out.print("set: ");
        for (String element: set) System.out.print(element + " ");
        System.out.println();
        System.out.println();

    }  // main()

}  // class TestLinkedHashSet