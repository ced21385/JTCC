package chapter19;

import java.lang.Integer;
import java.lang.String;
import java.lang.System;
import java.util.Date;
import chapter19.GenericStackComposition;

public class TestGenericStack {

    public static void main(String[] args) {

        GenericStackComposition<String> stack1 = new GenericStackComposition<>();

        stack1.push("Jerry");
        stack1.push("James");
        System.out.println(stack1);

        GenericStackComposition<Integer> stack2 = new GenericStackComposition<>();

        stack2.push(new Integer(1));
        stack2.push(new Integer(2));
        System.out.println(stack2);

        GenericStackComposition stack3 = new GenericStackComposition();  // raw type, no type parameter

        stack3.push("Jerry");
        stack3.push(new Integer(1));
        System.out.println(stack3);

    }  // main()

}  // class TestStack