package profAnswers202;
//project02
import java.lang.String;
import java.util.Date;
import java.text.ParseException;
import project2.SportEvent;
import project2.Weather;
import project2.GoodWeather;

public final class SoccerGame extends SportEvent implements GoodWeather {

    private Weather weather;

    private static int numberOfObjects = 0;

    public SoccerGame(String name, String place, Date dateTime, int audience, String[] teams, int[] scores, String league, Weather weather) throws ParseException {
        super(name, place, dateTime, audience, teams, scores, league);
        this.setWeather(weather);
        SoccerGame.numberOfObjects++;
    }  // SoccerGame()

    public void    setWeather(Weather weather) {this.weather = weather;}
    public Weather getWeather()         {return this.weather;}

    public static int getNumberOfObjects() {return SoccerGame.numberOfObjects;}

    @Override  // project2.GoodWeather.isGoodWeather()
    public boolean isGoodWeather() {return this.getWeather().isGoodWeather() && this.getWeather().getHeatIndex() <= 90.0;}

    @Override  // project2.SportEvent.toString()
    public String toString() {return super.toString() + " [" + ((this.isGoodWeather()) ? "Good Weather" : "Bad Weather") + "]";}

}  // class SoccerGame
