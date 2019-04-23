package profAnswers202;
//project03

import java.lang.String;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Calendar;

public class Event03 {

    private String name;
    private String place;
    private Date   dateTime;
    private int    audience;

    private static final ArrayList<Event03> eventList = new ArrayList<Event03>();

    protected Event03() {}

    protected Event03(String name, String place, Date dateTime, int audience) {
        this.setName(name); this.setPlace(place); this.setDateTime(dateTime); this.setAudience(audience);
        Event03 event = this;
        Event03.eventList.add(event);
    }  // Event()

    public final void setName    (String name  ) {this.name     = name    ;}
    public final void setPlace   (String place ) {this.place    = place   ;}
    public final void setDateTime(Date dateTime) {this.dateTime = dateTime;}
    public final void setAudience(int audience ) {this.audience = audience;}

    public String getName    () {return this.name    ;}
    public String getPlace   () {return this.place   ;}
    public Date   getDateTime() {return this.dateTime;}
    public int    getAudience() {return this.audience;}

    public String getDateTimeString() {return (new SimpleDateFormat("MM/dd/yyyy HH:mm")).format(this.getDateTime());}

    public static ArrayList getEventList() {return Event03.eventList;}

    public static int getNumberOfObjects() {return Event03.getEventList().size();}

    public boolean isWeekEnd() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(this.getDateTime());
        return (calendar.get(Calendar.DAY_OF_WEEK) == 1 || calendar.get(Calendar.DAY_OF_WEEK) == 7);
    }  // isWeekEnd()

    public boolean isWeekDay() {return !(this.isWeekEnd());}

    @Override  // java.lang.Object.toString()
    public String toString() {return "[class = " + this.getClass().getSimpleName() + ", name = " + this.getName() + ", place = " +this.getPlace()  + ", date/time = " + this.getDateTimeString() +  ", " + ((this.isWeekEnd()) ? "Weekend" : "Weekday") + ", audience = " + this.getAudience() + "]";}

}  // class Event