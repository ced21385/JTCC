package project2;

import java.util.Date;
import project2.MusicEvent;
import project2.Event;
import java.text.ParseException;
import project2.Weather;
import project2.GoodWeather;

public final class Concert extends MusicEvent implements GoodWeather {

    private Weather weather;
    private String type;
    private static int numberOfObjects = 0;

    public Concert(String name, String place, Date dateTime, int audience, String[] performers, String type,
                   Weather weather) throws ParseException {
        super(name, place, dateTime, audience, performers);
        this.setWeather(weather);
        this.setType(type);
        Concert.numberOfObjects++;
    }

    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    public static int getNumberOfObjects() {
        return Concert.numberOfObjects;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override  // project2.GoodWeather.isGoodWeather()
    public boolean isGoodWeather() {
        return this.getWeather().isGoodWeather();
    }

    @Override  // project2.MusicEvent.toString()
    public String toString() {
        return super.toString() + "[type = " + this.getType() + ", " + ((this.isGoodWeather()) ? "Good Weather" : "Bad Weather") + "]";
    }

}