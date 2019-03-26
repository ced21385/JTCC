package project2;

import java.text.ParseException;
import java.util.Date;
import project2.MusicEvent;
import project2.Event;

public final class Orchestra extends MusicEvent{

    private boolean casualAttire;
    private static int numberOfObjects = 0;

    public Orchestra(String name, String place, Date dateTime, int audience, String[] performers, boolean casualAttire)
    throws ParseException{
        super(name, place, dateTime, audience, performers);
        this.setCasualAttire(casualAttire);
        Orchestra.numberOfObjects++;
    }

    public static int getNumberOfObjects(){
        return Orchestra.numberOfObjects;
    }

    public boolean isCasualAttire(){
        return this.casualAttire;
    }

    public void setCasualAttire(boolean casualAttire){
        this.casualAttire = casualAttire;
    }

    @Override
    public String toString() {return super.toString() + " [" + ((this.isCasualAttire()) ?
            "Casual Attire" : "Formal Attire") + "]";}
}
