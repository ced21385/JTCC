package profAnswers202;
//project02
import java.lang.String;
import java.text.ParseException;
import java.util.Date;
import project2.SportEvent;

public final class BasketBallGame extends SportEvent {

    private static int numberOfObjects = 0;

    public BasketBallGame(String name, String place, Date dateTime, int audience, String[] players, int[] scores, String league) throws ParseException {
        super(name, place, dateTime, audience, players, scores, league);
        BasketBallGame.numberOfObjects++;
    }  // BasketBallGame()

    public static int getNumberOfObjects() {return BasketBallGame.numberOfObjects;}

    @Override  // project2.SportEvent.toString()
    public String toString() {return super.toString();}

}  // class BaseketBallGame
