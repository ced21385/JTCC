package chapter20;

import java.util.ArrayList;
import java.util.Collection;
import java.lang.System;
import java.lang.String;

public class TestCollection {

    public static void main(String[] args) {

        ArrayList<String> collection1 = new ArrayList<>();
        collection1.add("Boston" );
        collection1.add("Atlanta");
        collection1.add("Dallas" );
        collection1.add("Madison");

        System.out.println("A list of cities in collection1:" + collection1);
        System.out.println();

        System.out.println("Is Dallas in collection1? " + collection1.contains("Dallas"));
        System.out.println();

        collection1.remove("Dallas");
        System.out.println(collection1.size() + " cities are in collection1 now");
        System.out.println();

        Collection<String> collection2 = new ArrayList<>();
        collection2.add("Seattle" );
        collection2.add("Portland");
        collection2.add("Richmond");
        collection2.add("Atlanta" );

        System.out.println("A list of cities in collection2: " + collection2);
        System.out.println();

        ArrayList<String> c1;

        c1 = (ArrayList<String>)(collection1.clone());
        c1.addAll(collection2);
        System.out.println("Cities in collection1 or collection2: " + c1);
        System.out.println();

        c1 = (ArrayList<String>)(collection1.clone());
        c1.retainAll(collection2);
        System.out.println("Cities in collection1 and collection2: " + c1);
        System.out.println();

        c1 = (ArrayList<String>)(collection1.clone());
        c1.removeAll(collection2);
        System.out.println("Cities in collection1, but not in 2: " + c1);
        System.out.println();

    }  // main()

}  // class TestCollection