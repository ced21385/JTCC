package project3;

import java.text.ParseException;
import java.util.Date;
import java.util.ArrayList;
import project3.Event;
import project3.SportEvent;

public class BasketBallGame extends SportEvent {

    private static int numberOfObjects = 0;

    public BasketBallGame(String name, String place, Date dateTime, int audience, String[] teams,
                         int[] scores, String league) throws ParseException{
        super(name,place,dateTime,audience,teams,scores,league);
        BasketBallGame.numberOfObjects++;
    }
    public static int getNumberOfObjects() {return BasketBallGame.numberOfObjects;}

    @Override
    public String toString() {return super.toString();}

}
