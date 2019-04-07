package chapter20;

import java.lang.System;
import java.lang.String;
import java.lang.Integer;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class TestArrayListAndLinkedList {

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(new Integer(1));
        arrayList.add(new Integer(2));
        arrayList.add(new Integer(3));
        arrayList.add(new Integer(1));
        arrayList.add(new Integer(4));

        arrayList.add(0, new Integer(7));
        arrayList.add(3, new Integer(8));

        System.out.println("arrayList: " + arrayList);
        System.out.println();

        LinkedList<Object> linkedList = new LinkedList<>(arrayList);
        linkedList.add(1, "red");
        linkedList.removeLast();
        linkedList.addFirst("green");

        System.out.println("linkedList: " + linkedList);
        System.out.println();

        ListIterator<Object> listIterator;

        System.out.print("linkedList (forward): ");

        listIterator = linkedList.listIterator();
        while (listIterator.hasNext())
            System.out.print(listIterator.next() + " ");  // iterator
        System.out.println();
        System.out.println();

        System.out.print("linkedList (backward): ");

        listIterator = linkedList.listIterator(linkedList.size());
        while (listIterator.hasPrevious())
            System.out.print(listIterator.previous() + ", ");  // iterator
        System.out.println();
        System.out.println();

        System.out.print("linkedList (backward): ");

        for (int i = linkedList.size() - 1; i >= 0; i--)
            System.out.print(linkedList.get(i) + ", ");  // for loop
        System.out.println();
        System.out.println();

    }  // main()

}  // class TestArrayListAndLinkedList