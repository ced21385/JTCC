package profAnswers202;
//project03
import java.lang.String;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import project3.SportEvent;

public final class BasketBallGame03 extends SportEvent {

    private static final ArrayList<BasketBallGame03> eventList = new ArrayList<BasketBallGame03>();

    public BasketBallGame03(String name, String place, Date dateTime, int audience, String[] players, int[] scores, String league) throws ParseException {
        super(name, place, dateTime, audience, players, scores, league);
        BasketBallGame03 event = this;
        BasketBallGame03.eventList.add(event);
    }  // BasketBallGame()

    public static ArrayList getEventList() {return BasketBallGame03.eventList;}              // static method, cannot be over-ridden

    public static int getNumberOfObjects() {return BasketBallGame03.getEventList().size();}  // static method, cannot be over-ridden

    @Override  // project3.SportEvent.toString()
    public String toString() {return super.toString();}

}  // class BaseketBallGame
