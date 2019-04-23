package profAnswers202;
//project04
import java.lang.String;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class MusicEvent04 extends Event04 {

    private String performers[];

    private static final ArrayList<MusicEvent04> eventList = new ArrayList<MusicEvent04>();

    protected MusicEvent04(String name, String place, Date dateTime, int audience, String[] performers) throws ParseException {
        super(name, place, dateTime, audience);
        this.setPerformers(performers);
        MusicEvent04 event = this;
        MusicEvent04.eventList.add(event);
    }  // MusicEvent()

    public final void setPerformers(String[] performers) {this.performers = performers;}
    public String[]   getPerformers()             {return this.performers;}

    public static ArrayList getEventList() {return MusicEvent04.eventList;}

    public static int getNumberOfObjects() {return MusicEvent04.getEventList().size();}

    @Override  // project3.Event.toString()
    public String toString() {return super.toString() + " [performers = " + Arrays.toString(this.getPerformers()) + "]";}

}  // class MusicEvent
