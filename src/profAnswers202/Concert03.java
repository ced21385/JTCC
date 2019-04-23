package profAnswers202;
//project03
import java.lang.String;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import project3.MusicEvent;
import project3.Weather;
import project3.GoodWeather;

public final class Concert03 extends MusicEvent03 implements GoodWeather {

    private String  type;
    private Weather weather;

    private static final ArrayList<Concert03> eventList = new ArrayList<Concert03>();

    public Concert03(String name, String place, Date dateTime, int audience, String[] performers, String type, Weather weather) throws ParseException {
        super(name, place, dateTime, audience, performers);
        this.setType(type);
        this.setWeather(weather);
        Concert03 event = this;
        Concert03.eventList.add(event);
    }  // Concert()

    public void   setType(String type) {this.type = type;}
    public String getType()     {return this.type;}

    public void    setWeather(Weather weather) {this.weather = weather;}
    public Weather getWeather()         {return this.weather;}

    public static ArrayList getEventList() {return Concert03.eventList;}

    public static int getNumberOfObjects() {return Concert03.getEventList().size();}

    @Override  // project3.GoodWeather.isGoodWeather()
    public boolean isGoodWeather() {return this.getWeather().isGoodWeather();}

    @Override  // project3.MusicEvent.toString()
    public String toString() {return super.toString() + "[type = " + this.getType() + ", " + ((this.isGoodWeather()) ? "Good Weather" : "Bad Weather") + "]";}

}  // class Concert