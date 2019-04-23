package profAnswers202;
//project04
import java.lang.String;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

public final class Orchestra04 extends MusicEvent04 {

    private boolean casualAttire;

    private static final ArrayList<Orchestra04> eventList = new ArrayList<Orchestra04>();

    public Orchestra04(String name, String place, Date dateTime, int audience, String[] performers, boolean casualAttire) throws ParseException {
        super(name, place, dateTime, audience, performers);
        this.setCasualAttire(casualAttire);
        Orchestra04 event = this;
        Orchestra04.eventList.add(event);
    }  // Orchestra()

    public void    setCasualAttire(boolean casualAttire) {this.casualAttire = casualAttire;}
    public boolean  isCasualAttire() {return this.casualAttire;}

    public static ArrayList getEventList() {return Orchestra04.eventList;}

    public static int getNumberOfObjects() {return Orchestra04.getEventList().size();}

    @Override  // project3.MusicEvent.toString()
    public String toString() {return super.toString() + " [" + ((this.isCasualAttire()) ? "Casual Attire" : "Formal Attire") + "]";}

}  // class Orchestra
