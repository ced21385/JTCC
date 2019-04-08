package project4;

import javafx.application.Application;
import javafx.stage.Stage;

import java.lang.String;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Event  {

    private String name;
    private String place;
    private Date dateTime;
    private int audience;
    private static ArrayList<project4.Event> eventList = new ArrayList<>();

    private static int numberOfObjects = 0;

    protected Event(){ project4.Event.numberOfObjects++;}

    protected Event(String name, String place, Date dateTime, int audience){
        this.setName(name);
        this.setPlace(place);
        this.setDate(dateTime);
        this.setAudience(audience);
        eventList.add(this);
        project4.Event.numberOfObjects++;
    }

    public final void setName(String name){ this.name = name; }
    public String getName(){ return this.name; }

    public final void setPlace(String place){ this.place = place; }
    public String getPlace(){ return this.place; }

    public final void setDate(Date dateTime){ this.dateTime = dateTime; }
    public Date getDateTime(){return this.dateTime;}

    public final void setAudience(int audience){ this.audience = audience; }
    public int getAudience(){ return this.audience; }

    public String getDateTimeString(){ return (new SimpleDateFormat("MM/dd/yyyy HH:mm")).format(this.getDateTime()); }

    public static int getNumberOfObjects(){ return project4.Event.numberOfObjects; }

    public static ArrayList getEventList(){ return eventList;}

    @Override  // java.lang.Object.toString()
    public String toString() {return "[class = " + this.getClass().getSimpleName() +
            ", name = " + this.getName() + ", place = " +this.getPlace()  + ", date/time = "
            + this.getDateTimeString() +  ", " + ((Week.isWeekEnd(this.getDateTime())) ? "Weekend" : "Weekday")
            + ", audience = " + this.getAudience() + "]";
    }
}



