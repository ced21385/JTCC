package project2;

import java.lang.String;
import java.util.Date;
import java.text.SimpleDateFormat;

public abstract class Event {

    private static int numberOfObjects;
    private String name;
    private String place;
    private Date dateTime;
    private int audience;


    public Event(String name, String place, Date dateTime, int audience){

        this.setNumberOfObjects();
        this.setName(name);
        this.setPlace(place);
        this.setDateTime(dateTime);
        this.setAudience(audience);
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getPlace(){
        return place;
    }

    public void setPlace(String place){
        this.place = place;
    }

    public static void setNumberOfObjects(){
        numberOfObjects+= 1;
    }

    public static int getNumberOfObjects(){
        return numberOfObjects;
    }


    public Date getDateTime(){
       return dateTime;
    }

    public void setDateTime(Date dateTime){
        this.dateTime = dateTime;
    }

    public String formatDate(Date dateTime){
        SimpleDateFormat Date = new SimpleDateFormat("mm/dd/yyyy kk:mm");
        return Date.format(this.getDateTime());
    }

    public int getAudience(){
        return audience;
    }

    public void setAudience(int audience){
        this.audience = audience;
    }

    @Override
    public String toString() {
        return
                String.format("[class = %s, name = %s, place = %s , date/time = %s, %s, audience = %s]",
                        this.getClass().getSimpleName(), this.getName(), this.getPlace(),
                        this.formatDate(this.getDateTime()), Week.isWeekEnd(this.getDateTime()),
                        this.getAudience());
    }

}
