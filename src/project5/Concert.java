package project5;

import project5.MusicEvent;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

public class Concert extends MusicEvent  {

    private static int numberOfObjects = 0;

    protected Concert(String name, int audience) throws ParseException {
        super(name,audience);
        Concert.numberOfObjects++;
    }

    public static int getNumberOfObjects() {
        return Concert.numberOfObjects;
    }
}
