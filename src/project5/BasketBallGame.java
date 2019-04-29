package project5;

import java.text.ParseException;
import java.util.Date;
import java.util.ArrayList;
import project5.Event;
import project5.SportEvent;

public class BasketBallGame extends SportEvent {

    private static int numberOfObjects = 0;

    public BasketBallGame(String name, int audience) throws ParseException{
        super(name,audience);
        BasketBallGame.numberOfObjects++;
    }
    public static int getNumberOfObjects() {return BasketBallGame.numberOfObjects;}

}
