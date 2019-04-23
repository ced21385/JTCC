package profAnswers202;
//project03
import java.lang.String;
import java.util.Date;
import java.text.ParseException;
import java.util.ArrayList;
import project3.SportEvent;
import project3.Weather;
import project3.GoodWeather;

public final class SoccerGame03 extends SportEvent implements GoodWeather {

    private Weather weather;

    private static final ArrayList<SoccerGame03> eventList = new ArrayList<SoccerGame03>();

    public SoccerGame03(String name, String place, Date dateTime, int audience, String[] teams, int[] scores, String league, Weather weather) throws ParseException {
        super(name, place, dateTime, audience, teams, scores, league);
        this.setWeather(weather);
        SoccerGame03 event = this;
        SoccerGame03.eventList.add(event);
    }  // SoccerGame()

    public void    setWeather(Weather weather) {this.weather = weather;}
    public Weather getWeather()         {return this.weather;}

    public static ArrayList getEventList() {return SoccerGame03.eventList;}

    public static int getNumberOfObjects() {return SoccerGame03.getEventList().size();}

    @Override  // project3.GoodWeather.iaGoodWeather()
    public boolean isGoodWeather() {return this.getWeather().isGoodWeather() && this.getWeather().getHeatIndex() <= 90.0;}

    @Override  // project3.SportEvent.toString()
    public String toString() {return super.toString() + " [" + ((this.isGoodWeather()) ? "Good Weather" : "Bad Weather") + "]";}

}  // class SoccerGame