package project5;

import java.lang.String;
//import java.util.ArrayList;
import java.text.ParseException;


public class SportEvent extends Event {

    private static int numberOfObjects = 0;

    protected SportEvent() {
        SportEvent.numberOfObjects++;
    }

    protected SportEvent(String name, int audience) throws ParseException {

        super(name, audience);
        SportEvent.numberOfObjects++;

    }

    public static int getNumberOfObjects() {
        return SportEvent.numberOfObjects;
    }


}
