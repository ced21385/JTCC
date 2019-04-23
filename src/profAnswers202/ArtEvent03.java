package profAnswers202;
//project03
import java.lang.String;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import project3.Event;

public final class ArtEvent03 extends Event {

    private String type;

    private static final ArrayList<ArtEvent03> eventList = new ArrayList<ArtEvent03>();

    protected ArtEvent03(String name, String place, Date dateTime, int audience, String type) throws ParseException {
        super(name, place, dateTime, audience);
        this.setType(type);
        ArtEvent03 event = this;
        ArtEvent03.eventList.add(event);
    }  // ArtEvent()

    public final void setType(String type) {this.type = type;}
    public String     getType()     {return this.type;}

    public static ArrayList getEventList() {return ArtEvent03.eventList;}

    public static int getNumberOfObjects() {return ArtEvent03.getEventList().size();}

    @Override  // project3.Event.toString()
    public String toString() {return super.toString() + " [type = " + this.getType() + "]";}

}  // class MusicEvent
