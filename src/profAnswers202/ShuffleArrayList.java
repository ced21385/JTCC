package profAnswers202;
//chapter13
import java.lang.System;
import java.lang.String;
import java.util.ArrayList;
import java.lang.Number;
import java.lang.Integer;

public class ShuffleArrayList {

    public static void main(String[] args) {

        ArrayList<Number> list = new ArrayList<>();
        list.add(new Integer(1));
        list.add(new Integer(2));
        list.add(new Integer(3));
        list.add(new Integer(4));
        list.add(new Integer(5));
        ShuffleArrayList.shuffle(list);
        for (int i = 0; i < list.size(); i++) System.out.print(list.get(i) + " ");
        System.out.println();

    }  // main()

    public static void shuffle(ArrayList<Number> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            int index = (int)(Math.random() * list.size());
            Number temp = list.get(i);
            list.set(i, list.get(index));
            list.set(index, temp);
        }  // for
    }  // shufffle()

}  // class SuffleArrayList