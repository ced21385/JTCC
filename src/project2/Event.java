package project2;
import com.sun.org.apache.xpath.internal.operations.Number;

import java.lang.String;
import java.time.Month;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import project2.Week;
import java.text.ParseException;

public class Event {

    private static int numberOfObjects = 0;
    private String name;
    private String place;
    private Date dateTime;
    private int audience;


    protected Event() { Event.numberOfObjects++;}
    protected Event(String name, String place, Date dateTime, int audience){
        Event.numberOfObjects++;
        this.setName(name);
        this.setPlace(place);
        this.setDateTime(dateTime);
        this.setAudience(audience);
    }

    public String getName(){
        return this.name;
    }

    public final void setName(String name){
        this.name = name;
    }

    public String getPlace(){
        return this.place;
    }

    public final void setPlace(String place){
        this.place = place;
    }

    public static int getNumberOfObjects(){
        return Event.numberOfObjects;
    }

    public final void setDateTime(Date dateTime){
        this.dateTime = dateTime;
    }

    public Date getDateTime(){
       return this.dateTime;
    }

    public String getDateTimeString(){
        return (new SimpleDateFormat("MM/dd/yyyy HH:mm")).format(this.getDateTime());
    }

    public int getAudience(){
        return this.audience;
    }

    public final void setAudience(int audience){
        this.audience = audience;
    }

    @Override
    public String toString() {return "[class = " + this.getClass().getSimpleName() +
            ", name = " + this.getName() + ", place = " +this.getPlace()  + ", date/time = "
            + this.getDateTimeString() +  ", " + ((Week.isWeekEnd(this.getDateTime())) ? "Weekend" : "Weekday") +
            ", audience = " + this.getAudience() + "]";}

}
