
package chapter13;

import java.lang.String;
import java.lang.Object;

public abstract class Animal extends Object {  // abstract superclass
//public abstract class Animal {  // abstract class

    private double weight;  // datafield, instance variable

    protected Animal() {    // protected constructor
        super();
//        super();  // constructor chaining
    }  // no-arg constructor

    protected Animal(double weight) {  // protected constructor
        super();
//        super();  // constructor chaining
        this.setWeight(weight);
    }

    public final void setWeight(double weight) {this.weight = weight;}
    public double     getWeight()       {return this.weight;}

    public abstract String sound();  // abstract method, no implementation

}  // abstract class Animal