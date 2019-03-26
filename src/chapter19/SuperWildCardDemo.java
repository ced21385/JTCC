package chapter19;

import java.lang.System;
import java.lang.String;
import java.lang.Integer;
import chapter19.GenericStackComposition;
import chapter19.AnyWildCardDemo;

public class SuperWildCardDemo {

    public static void main(String[] args) {

        GenericStackComposition<String> stack1 = new GenericStackComposition<String>();
        stack1.push("Sun");

        GenericStackComposition<Object> stack2 = new GenericStackComposition<Object>();
        stack2.push("Java");
        stack2.push(new Integer(2));

        SuperWildCardDemo.add(stack1, stack2);
        AnyWildCardDemo.print(stack2);
        System.out.println();

    }  // main()

    public static <T> void add(GenericStackComposition<T>         stack1,
                               GenericStackComposition<? super T> stack2) {
        while (!stack1.isEmpty()) stack2.push(stack1.pop());
    }  // add()

}  // class SuperWildCardDemo