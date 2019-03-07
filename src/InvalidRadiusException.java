package chapter12;

import java.lang.Exception;

public class InvalidRadiusException extends Exception {  // checked exception

    public InvalidRadiusException(double radius) {super("Invalid radius " + radius);}

}  // class InvalidRadiusException