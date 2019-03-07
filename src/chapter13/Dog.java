package chapter13;

import chapter13.Pet;

class Dog extends Pet {

    @Override  // chapter13.Animal
    String sound() {return "Dog: woof";}

}  // class Dog

//class Dog extends Pet {
//
//    String sound() {return "Dog: woof";}
//
//}  // class Dog
