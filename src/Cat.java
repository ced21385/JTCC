package chapter13;

import chapter13.Pet;

class Cat extends Pet {

    @Override  // chapter13.Animal.sound()
    String sound() {return "Cat: meow";}

}  // class Cat

//class Cat extends Pet {
//
//    String sound() {return "Cat: meow";}
//
//}  // class Cat