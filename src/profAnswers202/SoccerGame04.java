package profAnswers202;
//project04
import java.lang.String;
import java.util.Date;
import java.text.ParseException;
import java.util.ArrayList;
import project4.SportEvent;
import project4.Weather;
import project4.GoodWeather;

public final class SoccerGame04 extends SportEvent04 implements GoodWeather {

    private Weather weather;

    private static final ArrayList<SoccerGame04> eventList = new ArrayList<SoccerGame04>();

    protected SoccerGame04(String name, String place, Date dateTime, int audience, String[] teams, int[] scores, String league, Weather weather) throws ParseException {
        super(name, place, dateTime, audience, teams, scores, league);
    }

    public void    setWeather(Weather weather) {this.weather = weather;}
    public Weather getWeather()         {return this.weather;}

    public static ArrayList getEventList() {return SoccerGame04.eventList;}

    public static int getNumberOfObjects() {return SoccerGame04.getEventList().size();}

    @Override  // project3.GoodWeather.iaGoodWeather()
    public boolean isGoodWeather() {return this.getWeather().isGoodWeather() && this.getWeather().getHeatIndex() <= 90.0;}

    @Override  // project3.SportEvent.toString()
    public String toString() {return super.toString() + " [" + ((this.isGoodWeather()) ? "Good Weather" : "Bad Weather") + "]";}

}  // class SoccerGame
