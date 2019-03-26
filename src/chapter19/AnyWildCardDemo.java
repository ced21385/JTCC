package chapter19;

import java.lang.String;
        import java.lang.Integer;
        import java.lang.System;
        import chapter19.GenericStackComposition;

public class AnyWildCardDemo {

    public static void main(String[] args ) {

        GenericStackComposition<Integer> intStack = new GenericStackComposition<>();
        intStack.push(new Integer( 1));
        intStack.push(new Integer( 2));
        intStack.push(new Integer(-2));

        AnyWildCardDemo.print(intStack);
        System.out.println();

    }  // main()

    public static void print(GenericStackComposition<?> stack) {  // un-bounded wildcard: ? extends Object
        while (!stack.isEmpty()) System.out.print(stack.pop() + " ");
    }  // print()

}  // class AnyWildCardDemo