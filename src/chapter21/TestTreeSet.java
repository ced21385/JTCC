package chapter21;

import java.lang.String;
import java.lang.System;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Set;

public class TestTreeSet {

    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("London"  );
        set.add("Paris"   );
        set.add("Richmond");
        set.add("Boston"  );
        set.add("Taipei"  );
        set.add("Richmond");

        TreeSet<String> treeSet = new TreeSet<>(set);
        System.out.println("tree set (duplicate-free, sorted): " + treeSet);
        System.out.println();

        System.out.println("first(): " + treeSet.first());
        System.out.println("last(): "  + treeSet.last ());
        System.out.println();

        System.out.println("headSet(\"Richmond\"): " + treeSet.headSet("Richmond"));
        System.out.println("tailSet(\"Richmond\"): " + treeSet.tailSet("Richmond"));
        System.out.println();

        System.out.println("lower(\"P\"): "   + treeSet.lower  ("P"));
        System.out.println("higher(\"P\"): "  + treeSet.higher ("P"));
        System.out.println("floor(\"P\"): "   + treeSet.floor  ("P"));
        System.out.println("ceiling(\"P\"): " + treeSet.ceiling("P"));
        System.out.println();

        System.out.println("pollFirst(): "  + treeSet.pollFirst());
        System.out.println("pollLast(): "   + treeSet.pollLast ());
        System.out.println("New tree set: " + treeSet);
        System.out.println();

    }  // main()

}  // class TestTreeSet