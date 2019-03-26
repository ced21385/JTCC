package project3;

import java.lang.String;
import java.lang.Math;
import java.util.ArrayList;
import java.util.Date;
import java.text.ParseException;
import project3.Event;

public class SportEvent extends Event {

    private String league;
    private String[] teams = new String[2];
    private int[] scores = new int[2];
   // private ArrayList<SportEvent> eventList = new ArrayList<>();
    private int winnerIndex;
    private int loserIndex;
    private static int numberOfObjects = 0;

    protected SportEvent(){ SportEvent.numberOfObjects++;}

    protected SportEvent(String name, String place, Date dateTime, int audience, String[] teams,
                         int[] scores, String league) throws ParseException {

        super(name,place,dateTime,audience);
        this.setLeague(league);
        this.setTeams(teams);
        this.setScores(scores);
        SportEvent.numberOfObjects++;

    }

    public final void setLeague(String league){ this.league = league; }
    public String getLeague(){ return this.league;}

    public final void setTeams(String[] teams){ this.teams = teams;}
    public String[] getTeams(){ return this.teams;}

    public final void setScores(int[] scores){
        this.scores = scores;
        if (scores[0] > scores[1]) this.winnerIndex = 0;
        else if (scores[0] < scores[1]) this.winnerIndex = 1;
        else                            this.winnerIndex = (Math.random() < 0.5) ? 0 : 1;
        this.loserIndex = (this.winnerIndex == 1) ? 0 : 1;
    }

    public int[] getScores(){ return this.scores;}
    public int getWinnerIndex() {return this.winnerIndex;}
    public int getLoserIndex () {return this.loserIndex ;}

    public static int getNumberOfObjects() {return SportEvent.numberOfObjects;}

    public String getWinnerName() {return this.getTeams()[this.getWinnerIndex()];}
    public String getLoserName () {return this.getTeams()[this.getLoserIndex ()];}

    public int getWinnerScore() {return this.getScores()[this.getWinnerIndex()];}
    public int getLoserScore () {return this.getScores()[this.getLoserIndex ()];}

    @Override  // chapter13.Event.toString()
    public String toString() {return super.toString() + " [teams = " + this.getTeams()[0] + " vs " + this.getTeams()[1] + ", scores = " + this.getScores()[0] + " - " + this.getScores()[1] + ", " + this.getWinnerName() + " won, league = " + this.getLeague() + "]";}


}
