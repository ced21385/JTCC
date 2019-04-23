package profAnswers202;
//project04

import java.lang.String;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import project4.MusicEvent;
import project4.Weather;
import project4.GoodWeather;

public final class Concert04 extends MusicEvent04 implements GoodWeather {

    private String  type   ;
    private Weather weather;

    private static final ArrayList<Concert04> eventList = new ArrayList<Concert04>();

    public Concert04(String name, String place, Date dateTime, int audience, String[] performers, String type, Weather weather) throws ParseException {
        super(name, place, dateTime, audience, performers);
        this.setType(type); this.setWeather(weather);
        Concert04 event = this;
        Concert04.eventList.add(event);
    }  // Concert()

    public void   setType(String type) {this.type = type;}
    public String getType()     {return this.type;}

    public void    setWeather(Weather weather) {this.weather = weather;}
    public Weather getWeather()         {return this.weather;}

    public static ArrayList getEventList() {return Concert04.eventList;}

    public static int getNumberOfObjects() {return Concert04.getEventList().size();}

    @Override  // project3.GoodWeather.isGoodWeather()
    public boolean isGoodWeather() {return this.getWeather().isGoodWeather();}

    @Override  // project3.MusicEvent.toString()
    public String toString() {return super.toString() + "[type = " + this.getType() + ", " + ((this.isGoodWeather()) ? "Good Weather" : "Bad Weather") + "]";}

}  // class Concert