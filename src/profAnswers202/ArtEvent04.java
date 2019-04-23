package profAnswers202;
//project04
import java.lang.String;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

public final class ArtEvent04 extends Event04 {

    private String type;

    private static final ArrayList<ArtEvent04> eventList = new ArrayList<ArtEvent04>();

    protected ArtEvent04(String name, String place, Date dateTime, int audience, String type) throws ParseException {
        super(name, place, dateTime, audience);
        this.setType(type);
        ArtEvent04 event = this;
        ArtEvent04.eventList.add(event);
    }  // ArtEvent()

    public final void setType(String type) {this.type = type;}
    public String     getType()     {return this.type;}

    public static ArrayList getEventList() {return ArtEvent04.eventList;}

    public static int getNumberOfObjects() {return ArtEvent04.getEventList().size();}

    @Override  // project3.Event.toString()
    public String toString() {return super.toString() + " [type = " + this.getType() + "]";}

}  // class MusicEvent
