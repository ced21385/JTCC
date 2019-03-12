package project2;

import java.util.Date;

public class SoccerGame extends SportEvent implements GoodWeather{

    private Weather weather;
    private static int numberOfObjects;

    public SoccerGame(String name, String place, Date dateTime, int audience, String[] teams, int[] scores, String league, Weather weather) {
        super(name, place, dateTime, audience, teams, scores, league);
        this.setWeather(weather);
        this.setNumberOfObjects();
    }

    public static void setNumberOfObjects(){
        numberOfObjects+= 1;
    }
    public static int getNumberOfObjects(){
        return numberOfObjects;
    }



    public Weather getWeather(){
        return weather;
    }

    public void setWeather(Weather weather){
        this.weather = weather;
    }

    @Override
    public boolean isGoodWeather() {
        return this.getWeather().isGoodWeather();
    }

    @Override
    public String toString(){
        return String.format("%s %s", super.toString(), (this.isGoodWeather() ? "[Good Weather]" : "[Bad Weather]" ));
    }
}
