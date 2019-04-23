package profAnswers202;
//project02
import java.lang.String;
import java.text.ParseException;
import java.util.Date;
import project2.MusicEvent;
import project2.Weather;
import project2.GoodWeather;

public final class Concert extends MusicEvent implements GoodWeather {

    private String  type;
    private Weather weather;

    private static int numberOfObjects = 0;

    public Concert(String name, String place, Date dateTime, int audience, String[] performers, String type, Weather weather) throws ParseException {
        super(name, place, dateTime, audience, performers);
        this.setType(type);
        this.setWeather(weather);
        Concert.numberOfObjects++;
    }  // Concert()

    public void   setType(String type) {this.type = type;}
    public String getType()     {return this.type;}

    public void    setWeather(Weather weather) {this.weather = weather;}
    public Weather getWeather()         {return this.weather;}

    public static int getNumberOfObjects() {return Concert.numberOfObjects;}

    @Override  // project2.GoodWeather.isGoodWeather()
    public boolean isGoodWeather() {return this.getWeather().isGoodWeather();}

    @Override  // project2.MusicEvent.toString()
    public String toString() {return super.toString() + "[type = " + this.getType() + ", " + ((this.isGoodWeather()) ? "Good Weather" : "Bad Weather") + "]";}

}  // class Concert
