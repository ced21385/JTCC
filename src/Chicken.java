package chapter13;

import java.lang.String;
import chapter13.Animal;
import chapter13.Edible;

public final class Chicken extends Animal
        implements Edible {  // interface

    public Chicken() {
//        super();  // constructor chaining
    }

    public Chicken(double weight) {super(weight);}

    @Override  // chapter13.Edible.howToEat()
    public String howToEat() {return "Chicken: Fry it";}

    @Override  // chapter13.Animal.sound()
    public String sound() {return "Chicken: cock-a-doodle-doo";}

}  // class Chicken