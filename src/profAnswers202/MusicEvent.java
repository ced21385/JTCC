package profAnswers202;
//project02
import java.lang.String;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Date;
import project2.Event;

public class MusicEvent extends Event {

    private String performers[];

    private static int numberOfObjects = 0;

    protected MusicEvent() {MusicEvent.numberOfObjects++;}

    protected MusicEvent(String name, String place, Date dateTime, int audience, String[] performers) throws ParseException {
        super(name, place, dateTime, audience);
        this.setPerformers(performers);
        MusicEvent.numberOfObjects++;
    }  // MusicEvent()

    public final void setPerformers(String[] performers) {this.performers = performers;}
    public String[]   getPerformers()             {return this.performers;}

    public static int getNumberOfObjects() {return MusicEvent.numberOfObjects;}

    @Override  // project2.Event.toString()
    public String toString() {return super.toString() + " [performers = " + Arrays.toString(this.getPerformers()) + "]";}

}  // class MusicEvent
