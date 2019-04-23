package profAnswers202;
//project02
import java.lang.String;
import java.text.ParseException;
import java.util.Date;
import project2.Event;

public final class ArtEvent extends Event {

    private String type;

    private static int numberOfObjects = 0;

    public ArtEvent(String name, String place, Date dateTime, int audience, String type) throws ParseException {
        super(name, place, dateTime, audience);
        this.setType(type);
        ArtEvent.numberOfObjects++;
    }  // ArtEvent()

    public final void setType(String type) {this.type = type;}
    public String     getType()     {return this.type;}

    public static int getNumberOfObjects() {return ArtEvent.numberOfObjects;}

    @Override  // project2.Event.toString()
    public String toString() {return super.toString() + " [type = " + this.getType() + "]";}

}  // class MusicEvent
