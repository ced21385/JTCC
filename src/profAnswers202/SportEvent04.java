package profAnswers202;
//project04
import java.lang.String;
import java.lang.Math;
import java.util.Date;
import java.text.ParseException;
import java.util.ArrayList;

public class SportEvent04 extends Event04 {

    private String[] teams  = new String[2];
    private int   [] scores = new int   [2];
    private int      winnerIndex;
    private int      loserIndex;
    private String   league;

    //    private static final ArrayList<Event> eventList = new ArrayList<Event>();
    private static final ArrayList<SportEvent04> eventList = new ArrayList<SportEvent04>();

    protected SportEvent04(String name, String place, Date dateTime, int audience, String[] teams, int[] scores, String league) throws ParseException {
        super(name, place, dateTime, audience);
        this.setTeams(teams); this.setScores(scores); this.setLeague(league);
        SportEvent04 event = this;
        SportEvent04.eventList.add(event);
    }  // SportEvent()

    public final void setTeams(String[] teams) {this.teams = teams;}
    public String[]   getTeams()        {return this.teams;}

    public final void setScores(int[] scores) {
        this.scores = scores;
        if (scores[0] > scores[1]) this.winnerIndex = 0;
        else if (scores[0] < scores[1]) this.winnerIndex = 1;
        else                            this.winnerIndex = (Math.random() < 0.5) ? 0 : 1;
        this.loserIndex = (this.winnerIndex == 1) ? 0 : 1;
    }  // setScores()

    public int[] getScores() {return this.scores;}

    public int getWinnerIndex() {return this.winnerIndex;}
    public int getLoserIndex () {return this.loserIndex ;}

    public final void setLeague(String league) {this.league = league;}
    public String     getLeague()       {return this.league;}

    public static ArrayList getEventList() {return SportEvent04.eventList;}              // static method, cannot be over-ridden

    public static int getNumberOfObjects() {return SportEvent04.getEventList().size();}  // static method, cannot be over-ridden

    public String getWinnerName() {return this.getTeams()[this.getWinnerIndex()];}
    public String getLoserName () {return this.getTeams()[this.getLoserIndex ()];}

    public int getWinnerScore() {return this.getScores()[this.getWinnerIndex()];}
    public int getLoserScore () {return this.getScores()[this.getLoserIndex ()];}

    @Override  // project3.Event.toString()
    public String toString() {return super.toString() + " [teams = " + this.getTeams()[0] + " vs " + this.getTeams()[1] + ", scores = " + this.getScores()[0] + " - " + this.getScores()[1] + ", " + this.getWinnerName() + " won, league = " + this.getLeague() + "]";}

}  // class SportEvent
