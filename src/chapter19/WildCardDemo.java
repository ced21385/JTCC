package chapter19;

import java.lang.String;
import java.lang.Integer;
import java.lang.System;
import chapter19.GenericStackComposition;

public class WildCardDemo {

    public static void main(String[] args ) {

        GenericStackComposition<Integer> intStack = new GenericStackComposition<>();
        intStack.push(new Integer( 1));
        intStack.push(new Integer( 2));
        intStack.push(new Integer(-2));

     //   System.out.print("The max number is " + max1(intStack));  // incompatible types
        System.out.print("The max number is " + max2(intStack));
        System.out.print("The max number is " + max3(intStack));

    }  // main()

    public static double max1(GenericStackComposition<Number> stack) {

        double max = stack.pop().doubleValue();  // initialize max

        while (!stack.isEmpty()) {
            double value = stack.pop().doubleValue();
            if (value > max) max = value;
        }  // while

        return max;

    }  // max1()

    public static double max2(GenericStackComposition<?> stack) {  // un-bounded wildcard: ? extemds Object

        double max = ((Double)stack.pop()).doubleValue();        // down casting

        while (!stack.isEmpty()) {
            double value = ((Double)stack.pop()).doubleValue();  // down casting
            if (value > max) max = value;
        }  // while

        return max;

    }  // max2()

    public static double max3(GenericStackComposition<? extends Number> stack) {  // bounded wildcard

        double max = stack.pop().doubleValue(); // initialize max

        while (!stack.isEmpty()) {
            double value = stack.pop().doubleValue();
            if (value > max) max = value;
        }  // while

        return max;

    }  // max3()

}  // class WildCardDemo