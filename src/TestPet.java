package chapter13;

import java.lang.System;
import java.lang.String;
import chapter13.Dog;
import chapter13.Cat;
import chapter13.Pet;

public class TestPet {

    public static void main(String[] args) {

        Dog d = new Dog();
        Cat c = new Cat();

        System.out.println(d.sound());
        System.out.println(c.sound());

    }  // main

}  // class TestPet