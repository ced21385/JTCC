package chapter19;

import java.util.ArrayList;
import java.lang.Integer;
import java.lang.String;
import java.lang.System;
import java.lang.Comparable;

/* Christopher Davis
   CSC 202
   HW CH 19 - 19.9: SelectionSortArrayList
   this program sorts an array list */

public class SelectionSortArrayList {

    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();

        list.add(new Integer (8));
        list.add(new Integer (9));
        list.add(new Integer (4));
        list.add(new Integer (5));

        SelectionSortArrayList.<Integer>sort(list);

        System.out.println(list);

    }      //main()

    //method that will accept list and sort it before returning
    public static <E extends Comparable <E>>
        void sort(ArrayList <E>list) {

        //comparable var E
        E min;
        int indexMin;


        for (int i = 0; i < list.size(); i++) {

            min = list.get(i);
            indexMin = i;

            for(int j = i + 1; j < list.size(); j++){
                if(min.compareTo(list.get(j)) > 0) {
                    min = list.get(j);
                    indexMin = j;
                } //for (j)
            }  //for (i)

            if (indexMin != i) {
                list.set(indexMin, list.get(i));
                list.set(i, min);
            }
        }  //sort()
    }

}
