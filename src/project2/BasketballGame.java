package project2;

import project2.SportEvent;
import project2.Event;
import java.util.Date;

public class BasketballGame extends SportEvent {

    private static int numberOfObjects;

    public BasketballGame(String name, String place, Date dateTime, int audience, String[] teams, int[] scores, String league) {
        super(name, place, dateTime, audience, teams, scores, league);
        this.setNumberOfObjects();
    }

    public static void setNumberOfObjects(){
        numberOfObjects+=1;
    }

    public static int getNumberOfObjects(){
        return numberOfObjects;
    }



    @Override
    public String toString(){
        return super.toString();
    }

}

