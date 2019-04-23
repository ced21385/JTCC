package profAnswers202;

import java.lang.String;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import project3.Event;

public class MusicEvent03 extends Event {

    private String performers[];

    private static final ArrayList<MusicEvent03> eventList = new ArrayList<MusicEvent03>();

    protected MusicEvent03(String name, String place, Date dateTime, int audience, String[] performers) throws ParseException {
        super(name, place, dateTime, audience);
        this.setPerformers(performers);
        MusicEvent03 event = this;
        MusicEvent03.eventList.add(event);
    }  // MusicEvent()

    public final void setPerformers(String[] performers) {this.performers = performers;}
    public String[]   getPerformers()             {return this.performers;}

    public static ArrayList getEventList() {return MusicEvent03.eventList;}

    public static int getNumberOfObjects() {return MusicEvent03.getEventList().size();}

    @Override  // project3.Event.toString()
    public String toString() {return super.toString() + " [performers = " + Arrays.toString(this.getPerformers()) + "]";}

}  // class MusicEvent
