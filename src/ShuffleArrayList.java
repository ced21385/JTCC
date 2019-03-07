package chapter13;

import java.lang.System;
import java.lang.String;
import java.util.ArrayList;
import java.lang.Number;
import java.lang.Integer;

public class ShuffleArrayList {
    public static void main(String[] args){

        ArrayList<Number> list = new ArrayList<Number>();
        list.add(new Integer(1));
        list.add(new Integer(2));
        list.add(new Integer(3));
        list.add(new Integer(4));
        list.add(new Integer(5));

        ShuffleArrayList.shuffle(list);
        for(int i=0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }

    }

    public static void shuffle(ArrayList<Number> list) {
        java.util.Collections.shuffle(list);
    }

}
