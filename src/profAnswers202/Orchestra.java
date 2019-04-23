package profAnswers202;
//project02
import java.lang.String;
import java.text.ParseException;
import java.util.Date;
import project2.MusicEvent;

public final class Orchestra extends MusicEvent {

    private boolean casualAttire;

    private static int numberOfObjects = 0;

    public Orchestra(String name, String place, Date dateTime, int audience, String[] performers, boolean casualAttire) throws ParseException {
        super(name, place, dateTime, audience, performers);
        this.setCasualAttire(casualAttire);
        Orchestra.numberOfObjects++;
    }  // Orchestra()

    public void    setCasualAttire(boolean casualAttire) {this.casualAttire = casualAttire;}
    public boolean  isCasualAttire()              {return this.casualAttire;}

    public static int getNumberOfObjects() {return Orchestra.numberOfObjects;}

    @Override  // project2.MusicEvent.toString()
    public String toString() {return super.toString() + " [" + ((this.isCasualAttire()) ? "Casual Attire" : "Formal Attire") + "]";}

}  // class Orchestra