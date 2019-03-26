package project3;

import java.lang.String;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

public class Orchestra extends MusicEvent {

    private boolean casualAttire;
    private static int numberOfObjects = 0;

    public Orchestra(String name, String place, Date dateTime, int audience, String[] performers,
                     boolean casualAttire) throws ParseException{
        super(name,place,dateTime,performers,audience);
        this.setCasualAttire(casualAttire);
        Orchestra.numberOfObjects++;

    }
    public final void setCasualAttire(boolean casualAttire){ this.casualAttire = casualAttire;}
    public boolean isCasualAttire(){ return this.casualAttire;}

    public static int getNumberOfObjects(){ return Orchestra.numberOfObjects;}


    @Override

    public String toString() {return super.toString() + " [" + ((this.isCasualAttire()) ? "Casual Attire" : "Formal Attire") + "]";}

}
