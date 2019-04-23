package profAnswers202;
//chapter19
import java.util.ArrayList;
import java.lang.Integer;
import java.lang.String;
import java.lang.System;
import java.lang.Comparable;

public class SelectionSortArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(new Integer(8));
        list.add(new Integer(9));
        list.add(new Integer(4));
        list.add(new Integer(5));

        SelectionSortArrayList.<Integer>selectionSort(list);

        System.out.println(list);

    }  // main()

    public static <E extends Comparable<E>> void selectionSort(ArrayList<E> list) {

        E   currentMin;
        int currentMinIndex;

        for (int i = 0; i < list.size() - 1; i++) {

            currentMin      = list.get(i);
            currentMinIndex = i;

            for (int j = i + 1; j < list.size(); j++) {
                if (currentMin.compareTo(list.get(j)) > 0) {
                    currentMin      = list.get(j);
                    currentMinIndex = j;
                }  // if
            }  // for

            if (currentMinIndex != i) {
                list.set(currentMinIndex, list.get(i));
                list.set(i, currentMin);
            }  // if

        }  // for

    }  // sort()

}  // class SelectionSortArrayList
