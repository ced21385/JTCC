package chapter13;

import java.lang.System;
import java.lang.String;
import java.lang.Object;
import chapter13.Tiger;
import chapter13.Apple;
import chapter13.Orange;
import chapter13.Chicken;
import chapter13.Edible;
import chapter13.Animal;

public class TestEdible {

    public static void main(String[] args) {

        Object[] objects = {new Tiger(), new Chicken(), new Apple(), new Orange()};

        for (int i = 0; i < objects.length; i++) {
            if (objects[i] instanceof Edible) System.out.println(((Edible)objects[i]).howToEat());
            if (objects[i] instanceof Animal) System.out.println(((Animal)objects[i]).sound()   );
            System.out.println();
        }  // for

    }  // main()

}  // class TestEdible
