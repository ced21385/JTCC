package project2;

import project2.SportEvent;
import project2.Event;
import java.util.Date;
import java.text.ParseException;

public final class BasketballGame extends SportEvent {

    private static int numberOfObjects = 0;

    public BasketballGame(String name, String place, Date dateTime, int audience, String[] teams, int[] scores, String league)
    throws ParseException{
        super(name, place, dateTime, audience, teams, scores, league);
        BasketballGame.numberOfObjects++;
    }

    public static int getNumberOfObjects(){
        return BasketballGame.numberOfObjects;
    }


    @Override
    public String toString(){
        return super.toString();
    }

}

