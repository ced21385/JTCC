package project4;

import project4.GoodWeather;
import project4.MusicEvent;
import project4.Weather;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

public class Concert extends MusicEvent implements GoodWeather {
    private String type;
    private project4.Weather weather;
    private static int numberOfObjects = 0;

    protected Concert(String name, String place, Date dateTime, int audience, String[] performers,
                      String type, project4.Weather weather) throws ParseException {
        super(name, place, dateTime, performers, audience);
        this.setType(type);
        this.setWeather(weather);
        project4.Concert.numberOfObjects++;
    }
    public void setType(String type){ this.type = type;}
    public String getType(){ return this.type;}

    public void setWeather(project4.Weather weather){ this.weather = weather;}
    private Weather getWeather(){return this.weather;}

    public static int getNumberOfObjects(){ return project4.Concert.numberOfObjects;}


    @Override
    public boolean isGoodWeather() {
        return this.getWeather().isGoodWeather();
    }
    @Override
    public String toString() {return super.toString() + "[type = " + this.getType() + ", " + ((this.isGoodWeather()) ? "Good Weather" : "Bad Weather") + "]";}

}
