package profAnswers202;
//project04
import java.lang.String;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

public final class BasketBallGame04 extends SportEvent04 {

    private static final ArrayList<BasketBallGame04> eventList = new ArrayList<BasketBallGame04>();

    public BasketBallGame04(String name, String place, Date dateTime, int audience, String[] players, int[] scores, String league) throws ParseException {
        super(name, place, dateTime, audience, players, scores, league);
        BasketBallGame04 event = this;
        BasketBallGame04.eventList.add(event);
    }  // BasketBallGame()

    public static ArrayList getEventList() {return BasketBallGame04.eventList;}              // static method, cannot be over-ridden

    public static int getNumberOfObjects() {return BasketBallGame04.getEventList().size();}  // static method, cannot be over-ridden

    @Override  // project3.SportEvent.toString()
    public String toString() {return super.toString();}

}  // class BaseketBallGame
