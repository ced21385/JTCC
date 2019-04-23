package profAnswers202;
//project02
import java.lang.String;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import project2.Week;

public class Event {

    private String name;
    private String place;
    private Date   dateTime;
    private int    audience;

    private static int numberOfObjects = 0;  // static variable

    protected Event() {Event.numberOfObjects++;}

    protected Event(String name, String place, Date dateTime, int audience) {
        this.setName(name);
        this.setPlace(place);
        this.setDateTime(dateTime);
        this.setAudience(audience);
        Event.numberOfObjects++;
    }  // Event()

    public final void setName(String name) {this.name = name;}
    public String     getName()     {return this.name;}

    public final void setPlace(String place) {this.place = place;}
    public String     getPlace()      {return this.place;}

    public final void setDateTime (Date dateTime) {this.dateTime = dateTime;}
    public Date       getDateTime()        {return this.dateTime;}

    public final void setAudience(int audience) {this.audience = audience;}
    public int        getAudience()      {return this.audience;}

    public String getDateTimeString() {return (new SimpleDateFormat("MM/dd/yyyy HH:mm")).format(this.getDateTime());}

    public static int getNumberOfObjects() {return Event.numberOfObjects;}

    @Override  // java.lang.Object.toString()
    public String toString() {return "[class = " + this.getClass().getSimpleName() + ", name = " + this.getName() + ", place = " +this.getPlace()  + ", date/time = " + this.getDateTimeString() +  ", " + ((Week.isWeekEnd(this.getDateTime())) ? "Weekend" : "Weekday") + ", audience = " + this.getAudience() + "]";}

}  // class Event
