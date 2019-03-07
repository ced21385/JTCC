package chapter15;

import java.lang.String;
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class ObservablePropertyDemo {

    public static void main(String[] args) {

        DoubleProperty balance = new SimpleDoubleProperty();

        balance.addListener(ov -> System.out.println("The new value is " + balance.doubleValue()));

        balance.set(1);
        balance.set(2);
        balance.set(3);

    }  // main()

}  // class ObervablePropertyDemo