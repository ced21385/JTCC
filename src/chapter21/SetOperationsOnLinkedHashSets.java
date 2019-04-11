package chapter21;

import java.lang.System;
import java.lang.String;
import java.util.Arrays;
import java.util.LinkedHashSet;

/**Christopher Davis CSC 202
   This program creates 2 arrays of names
   and finds the union, difference, and
   intersection using LinkedHashSets
 **/

public class SetOperationsOnLinkedHashSets {

    public static void main(String[] args){

        //create 2 string arrays
        String[] array1 = new String[]{"George","Jim","John","Blake","Kevin","Michael"};
        String[] array2 = new String[]{"George","Katie","Kevin","Michelle","Ryan"};

        //take string arrays and put them into LinkedHashSets
        LinkedHashSet<String> set1 = new LinkedHashSet<>(Arrays.asList(array1));
        LinkedHashSet<String> set2 = new LinkedHashSet<>(Arrays.asList(array2));

        //union
        LinkedHashSet<String> union = new LinkedHashSet<>(set1);
        union.addAll(set2);
        System.out.println("\nThe union of the two sets:" + union);

        //difference
        LinkedHashSet<String> difference = new LinkedHashSet<>(set1);
        difference.removeAll(set2);
        System.out.println("\nThe difference of the two sets: " + difference);

        //intersection
        LinkedHashSet<String> intersection = new LinkedHashSet<>();
        for (String e: set2) {
            if (set1.contains(e))
                intersection.add(e);
        }
        System.out.println("\nIntersection of the two sets: " + intersection + "\n");
    }

} // main()
