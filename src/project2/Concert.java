package project2;

import java.util.Date;
import project2.MusicEvent;
import project2.Event;

public class Concert extends MusicEvent implements GoodWeather{

    private Weather weather;
    private String type;
    private static int NumberOfObjects = 0;

    public Concert(String name, String place, Date dateTime, int audience, String[] performers, String type, Weather weather){
        super(name,place,dateTime,audience,performers);
        this.setWeather(weather);
        this.setType(type);
        this.setNumberOfObjects(this.getNumberOfObjects()+1);
    }

    public Weather getWeather(){
        return weather;
    }
    public void setWeather(Weather weather){
        this.weather = weather;
    }
    public static void setNumberOfObjects(int numberOfObjects){
        NumberOfObjects = numberOfObjects;
    }

    public static int getNumberOfObjects(){
        return NumberOfObjects;
    }

    public String getType(){
        return type;
    }

    public void setType(String type){
        this.type = type;
    }

    @Override
    public String toString() {
        return String.format("%s [type = %s, %s]",
                super.toString(),
                this.getType(),
                this.getWeather().isGoodWeather() ? "Good Weather" : "Bad Weather" );
    }

    @Override
    public boolean isGoodWeather(){
        return this.getWeather().isGoodWeather();
    }


}
