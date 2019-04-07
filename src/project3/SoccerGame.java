package project3;

import java.util.ArrayList;
import java.util.Date;
import java.lang.String;
import java.text.ParseException;
import project3.SportEvent;
import project3.GoodWeather;
import project3.Weather;


public class SoccerGame extends SportEvent implements GoodWeather{
    private Weather weather;
    private static int numberOfObjects = 0;

    public SoccerGame(String name, String place, Date dateTime, int audience, String[] teams, int[] scores,
                      String league, Weather weather) throws ParseException{
        super(name, place, dateTime, audience, teams, scores, league);
        this.setWeather(weather);
        SoccerGame.numberOfObjects++;
    }
    public void setWeather(Weather weather){ this.weather = weather;}
    public Weather getWeather(){ return this.weather;}

    public static int getNumberOfObjects(){ return SoccerGame.numberOfObjects;}


    @Override  // project2.GoodWeather.isGoodWeather()
    public boolean isGoodWeather() {return this.getWeather().isGoodWeather() && this.getWeather().getHeatIndex() <= 90.0;}

    @Override  // project2.SportEvent.toString()
    public String toString() {return super.toString() + " [" + ((this.isGoodWeather()) ? "Good Weather" : "Bad Weather") + "]";}

}