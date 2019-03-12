package project2;

import java.util.Arrays;
import java.util.Date;
import project2.MusicEvent;
import project2.Event;

public class Orchestra extends MusicEvent{

    private boolean casualAttire;
    private static int NumberOfObjects = 0;

    public Orchestra(String name, String place, Date dateTime, int audience, String[] performers, boolean casualAttire) {
        super(name, place, dateTime, audience, performers);
        this.setCasualAttire(casualAttire);
        this.setNumberOfObjects();
    }


    public static void setNumberOfObjects(){
        NumberOfObjects+= 1;
    }
    public static int getNumberOfObjects(){
        return NumberOfObjects;
    }


    public boolean isCasualAttire(){
        return casualAttire;
    }

    public void setCasualAttire(boolean casualAttire){
        this.casualAttire = casualAttire;
    }

    @Override
    public String toString() {
        return String.format("[class = %s, name = %s, place = %s, date/time = %s, %s, audience = %s] %n[performers = %s] [%s]",
                this.getClass().getSimpleName(),
                this.getName(), this.getPlace(), this.formatDate(this.getDateTime()),
                Week.isWeekEnd(this.getDateTime()),
                this.getAudience(), Arrays.toString(this.getPerformers()),
                this.isCasualAttire() ? "Casual Attire" : "Formal Attire");
    }
}
