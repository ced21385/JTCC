package project5;

import java.util.ArrayList;
import java.lang.String;
import java.text.ParseException;
import project5.SportEvent;

public class SoccerGame extends SportEvent {

    private static int numberOfObjects = 0;

    public SoccerGame(String name, int audience) throws ParseException {
        super(name, audience);
        SoccerGame.numberOfObjects++;
    }


    public static int getNumberOfObjects() {
        return SoccerGame.numberOfObjects;
    }
}