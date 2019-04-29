package project5;

import project5.Event;
import java.text.ParseException;
import java.util.ArrayList;

public class ArtEvent  extends Event {

    private static int numberOfObjects = 0;

    protected ArtEvent() {
        ArtEvent.numberOfObjects++;
    }

    protected ArtEvent(String name, int audience) throws ParseException {
        super(name, audience);
        ArtEvent.numberOfObjects++;
    }

    public static int getNumberOfObjects() {
        return ArtEvent.numberOfObjects++;
    }
}