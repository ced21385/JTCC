package chapter19;

import java.lang.System;
import java.lang.String;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Integer;
import java.lang.Object;
import java.util.Date;

public class TestArrayList {

    public static void main(String[] args) {

        ArrayList list = new ArrayList();  // raw type
        list.add("Red");
        list.add(new Integer(5));
        list.add(new Date());
        System.out.println(list);
        System.out.println();

        ArrayList<String> stringList = new ArrayList<>();  //  generic type
        stringList.add("Red");
      //  stringList.add(new Integer(5));  // no suitable method found
        //stringList.add(new Date());      // no suitable method found
        System.out.println(stringList);
        System.out.println();

    }  // main()

}  // class TestArrayList