package chapter20;

import java.lang.System;
import java.lang.String;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class TestIterator {

    public static void main(String[] args) {

        Collection<String> collection = new ArrayList<>();
        collection.add("Richmond");
        collection.add("Atlanta" );
        collection.add("Dallas"  );
        collection.add("Madison" );

        for (int i = 0; i < collection.size(); i++)
            System.out.print(collection.toArray()[i] + " ");  // for loop
        System.out.println();

        for (int i = 0; i < collection.size(); i++)
            System.out.print(((List)collection).get(i) + " ");  // down casting
        System.out.println();

        for (String element: collection)
            System.out.print(element + " ");    // foreach loop
        System.out.println();

        collection.forEach(element -> System.out.print(element + " "));  // forEach() method
        System.out.println();

        Iterator<String> iterator = collection.iterator();

        while (iterator.hasNext())
            System.out.print(iterator.next() + " ");  // iterator
        System.out.println();

    }  // main()

}  // class TestIterator