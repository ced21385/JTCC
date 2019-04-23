package profAnswers202;
//project03
import java.lang.String;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import project3.MusicEvent;

public final class Orchestra03 extends MusicEvent03 {

    private boolean casualAttire;

    private static final ArrayList<Orchestra03> eventList = new ArrayList<Orchestra03>();

    public Orchestra03(String name, String place, Date dateTime, int audience, String[] performers, boolean casualAttire) throws ParseException {
        super(name, place, dateTime, audience, performers);
        this.setCasualAttire(casualAttire);
        Orchestra03 event = this;
        Orchestra03.eventList.add(event);
    }  // Orchestra()

    public void    setCasualAttire(boolean casualAttire) {this.casualAttire = casualAttire;}
    public boolean  isCasualAttire() {return this.casualAttire;}

    public static ArrayList getEventList() {return Orchestra03.eventList;}

    public static int getNumberOfObjects() {return Orchestra03.getEventList().size();}

    @Override  // project3.MusicEvent.toString()
    public String toString() {return super.toString() + " [" + ((this.isCasualAttire()) ? "Casual Attire" : "Formal Attire") + "]";}

}  // class Orchestra
