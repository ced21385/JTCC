package profAnswers202;
//chapter19
import java.util.ArrayList;
import java.lang.String;
import java.lang.Integer;
import java.lang.System;

public class MaxArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(new Integer(8));
        list.add(new Integer(9));
        list.add(new Integer(4));
        list.add(new Integer(5));

        System.out.println("Max: " + MaxArrayList.<Integer>max(list));
    }

    public static <E extends Comparable<E>> E max(ArrayList<E> list) {

        E currentMax = list.get(0);

        for (int i = 1; i < list.size(); i++)
            if (currentMax.compareTo(list.get(i)) < 0) currentMax = list.get(i);

        return currentMax;

    }  // max()

}  // class MaxArrayList