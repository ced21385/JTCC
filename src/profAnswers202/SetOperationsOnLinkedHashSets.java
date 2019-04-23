package profAnswers202;
//chapter21
import java.lang.System;
import java.lang.String;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class SetOperationsOnLinkedHashSets {

    public static void main(String[] args) {

        LinkedHashSet<String> set1 = new LinkedHashSet<>(Arrays.asList(new String[] {"George", "Jim", "John", "Blake", "Kevin", "Michael"}));
        LinkedHashSet<String> set2 = new LinkedHashSet<>(Arrays.asList(new String[] {"George", "Katie", "Kevin", "Michelle", "Ryan"}));

        LinkedHashSet<String> set1Clone1 = (LinkedHashSet<String>)set1.clone();
        LinkedHashSet<String> set1Clone2 = (LinkedHashSet<String>)set1.clone();


        set1.addAll(set2);
        set1Clone1.removeAll(set2);
        set1Clone2.retainAll(set2);

        System.out.println("The union of the two sets: " + set1);
        System.out.println();

        System.out.println("The difference of the two sets: " + set1Clone1);
        System.out.println();

        System.out.println("The intersection of the two sets: " + set1Clone2);
        System.out.println();

    }  // main()

}  // class SetOperationsOnLinkedHashSets
