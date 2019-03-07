
package chapter12;

import java.lang.System;
import java.lang.String;
import java.lang.Exception;

public class ChainedExceptions {

    public static void main(String[] args) {

        try {ChainedExceptions.method1();}
        catch (Exception ex) {
            System.out.println("Stack Trace:");
            ex.printStackTrace();
        }  // catch
        finally {}

    }  // main

    public static void method1() throws Exception {  // checked exception
        try {ChainedExceptions.method2();}
        catch (Exception ex) {throw new Exception("New info from method1", ex);}
        finally {}
    }  // method1()

    public static void method2() throws Exception {  // checked exception
        System.out.println("Inside method2()");
        throw new Exception("New info from method2");
    }  // method2()

}  // class ChainExceptions