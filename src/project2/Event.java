package project2;

import java.lang.String;
import java.util.Date;

public abstract class Event {

    static int numberOfObjects;
    private String name;
    private String place;
    private Date dateTime;
    private int audience;

    public Event(){

    }
    public Event(String name, String place, Date dateTime, int audience){

        this.name = name;
        this.place = place;
        this.dateTime = dateTime;
        this.audience = audience;
    }
    public static int getNumberOfObjects(){
        return numberOfObjects;
    }

}
