package chapter13;

import java.lang.String;
import chapter13.Fruit;

public final class Orange extends Fruit {

    public Orange() {
//        super();  // constructor chaining
    }  // no-arg constructor

    @Override  // chapter13.Edible
    public String howToEat() {return "Orange: Make orange juice";}

}  // class Orange