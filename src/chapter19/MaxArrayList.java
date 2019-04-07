package chapter19;

import java.util.ArrayList;
import java.lang.System;
import java.lang.String;
import java.lang.Integer;
import java.lang.Comparable;

/* Christopher Davis, CSC 202, HW CH 19.10 - MaxArrayList
   This program finds the max number in an ArrayList and returns it
 */

public class MaxArrayList {

    public static void main(String[] args){

        //ArrayList creation
        ArrayList<Integer> list = new ArrayList<>();

        list.add(new Integer(8));
        list.add(new Integer(9));
        list.add(new Integer(4));
        list.add(new Integer(5));

        System.out.println("Max: " + max(list));

    }  //main()

    //method to return max number in created ArrayList above
    public static <E extends Comparable<E>>E max(ArrayList<E>list){

        E max = list.get(0);

        for(int i = 1; i < list.size(); i++){
            if(max.compareTo(list.get(i)) < 0){
                max = list.get(i);
            }
        } //for()

        return max;
    }
}
