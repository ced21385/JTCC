package chapter20;

import java.lang.System;
import java.lang.String;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsDemo {

    public static void main(String[] args) {

        List<String> strList = Arrays.asList("red", "green", "blue", "yellow");
        System.out.println("strList: " + strList);

        Collections.reverse(strList);
        System.out.println("Reverse Order: " + strList);

        Collections.sort(strList);
        System.out.println("Sorted: " + strList);

        System.out.println("Index of \"red\": "   + Collections.binarySearch(strList, "red"));
        System.out.println("Index of \"black\": " + Collections.binarySearch(strList, "black"));

        Collections.sort(strList, Collections.reverseOrder());
        System.out.println("Reverse Sorted: " + strList);

        Collections.shuffle(strList);
        System.out.println("Shuffered: " + strList);

//        collection1.add("New York");
//        collection1.add("Atlanta");
//        collection1.add("Dallas");
//        collection1.add("Madison");
//
//        System.out.println("A list of cities in collection1:" + collection1);
//
//        System.out.println("Is Dallas in collection1? " + collection1.contains("Dallas"));
//
//        collection1.remove("Dallas");
//        System.out.println(collection1.size() + " cities are in collection1 now");
//
//        Collection<String> collection2 = new ArrayList<>();
//        collection2.add("Seattle");
//        collection2.add("Portland");
//        collection2.add("Los Angles");
//        collection2.add("Atlanta");
//
//        System.out.println("A list of cities in collection2: " + collection2);
//
//        ArrayList<String> c1 = (ArrayList<String>)(collection1.clone());
//        c1.addAll(collection2);
//        System.out.println("Cities in collection1 or collection2: " + c1);
//
//        c1 = (ArrayList<String>)(collection1.clone());
//        c1.retainAll(collection2);
//        System.out.println("Cities in collection1 and collection2: " + c1);
//
//        c1 = (ArrayList<String>)(collection1.clone());
//        c1.removeAll(collection2);
//        System.out.println("Cities in collection1, but not in 2: " + c1);

    }  // main()

}  // class CollectionsDemo