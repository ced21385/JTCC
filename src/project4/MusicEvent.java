package project4;

import java.io.DataOutputStream;
import java.lang.String;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import project4.Event;

public class MusicEvent extends Event {

    private String [] performers;
    private static int numberOfObjects = 0;

    protected MusicEvent(){ project4.MusicEvent.numberOfObjects++;}

    protected MusicEvent(String name, String place, Date dateTime, String[] performers,int audience)
            throws ParseException{
        super(name, place, dateTime, audience);
        this.setPerformers(performers);
        project4.MusicEvent.numberOfObjects++;
    }

    public final void setPerformers(String[] performers){ this.performers = performers;}
    public String[] getPerformers(){ return this.performers;}

    public static int getNumberOfObjects(){ return project4.MusicEvent.numberOfObjects;}

    @Override
    public String toString() {return super.toString() + " [performers = " + Arrays.toString(this.getPerformers()) + "]";}
}
