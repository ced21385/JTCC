package chapter20;

import java.util.Queue;
import java.util.LinkedList;
import java.lang.System;
import java.lang.String;

public class TestQueue {

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();
        queue.offer("Oklahoma");
        queue.offer("Indiana" );
        queue.offer("Georgia" );
        queue.offer("Texas"   );

        while (queue.size() > 0) System.out.print(queue.remove() + " ");
        System.out.println();
        System.out.println();

    }  // main()

}  // class TestQueue