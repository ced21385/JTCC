package chapter13;

import chapter13.Animal;

public final class Tiger extends Animal {  // concrete subclass

    public Tiger() {
//        super();  // constructor chaining
    }  // no-arg constructor

    public Tiger(double weight) {super(weight);}

    @Override  // chapter13.Animal
    public String sound() {return "Tiger: RROOAARR";}

}  // class Tiger
