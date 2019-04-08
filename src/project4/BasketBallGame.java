package project4;
import java.text.ParseException;
import java.util.Date;
import java.util.ArrayList;
import project4.Event;
import project4.SportEvent;

public class BasketBallGame extends SportEvent {

    private static int numberOfObjects = 0;

    public BasketBallGame(String name, String place, Date dateTime, int audience, String[] teams,
                          int[] scores, String league) throws ParseException{
        super(name,place,dateTime,audience,teams,scores,league);
        project4.BasketBallGame.numberOfObjects++;
    }
    public static int getNumberOfObjects() {return project4.BasketBallGame.numberOfObjects;}

    @Override
    public String toString() {return super.toString();}

    public String getString(){return project4.BasketBallGame.super.toString();}
}
