package chapter13;

import java.lang.String;
import chapter13.Fruit;

public final class Apple extends Fruit {  // concrete subclass

    public Apple() {
//        super();  // constructor chaining
    }  // no-arg constructor

    @Override  // chapter13.Edible.howToEat()
    public String howToEat() {return "Apple: Make apple cider";}

}  // class Apple