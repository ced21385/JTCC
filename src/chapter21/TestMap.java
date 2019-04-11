package chapter21;

import java.util.Map;
import java.lang.System;
import java.lang.String;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class TestMap {

    public static void main(String[] args) {

        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Smith"   , 30);
        hashMap.put("Anderson", 31);
        hashMap.put("Lewis"   , 29);
        hashMap.put("Cook"    , 29);
        hashMap.put("Smith"   , 31);

        System.out.println("hash map (duplicate-free key, un-ordered): " + hashMap);
        System.out.println();

        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("tree map (duplicate-free key, sorted by key): " + treeMap);
        System.out.println();

        // Display each entry with name and age
        System.out.println("Names and ages are: ");
        treeMap.forEach((name, age) -> System.out.print(name + ": " + age + " "));
        System.out.println();
        System.out.println();

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Smith"   , 30);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Lewis"   , 29);
        linkedHashMap.put("Cook"    , 29);
        linkedHashMap.put("Smith"   , 31);

        System.out.println("The age for " + "Lewis is " + linkedHashMap.get("Lewis"));
        System.out.println();

        System.out.println("Display entries in LinkedHashMap");
        System.out.println(linkedHashMap);
        System.out.println();



    }  // main()

}  // class TestMap