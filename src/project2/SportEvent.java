package project2;

import project2.Event;
import java.util.Date;
import java.lang.reflect.Array;


public class SportEvent extends Event {

    private String teams[] = new String[2];
    private int scores[] = new int[2];
    private String league;
    private static int numberOfObjects;

    public SportEvent(String name, String place, Date dateTime, int audience, String[] teams, int[] scores, String league) {
        super(name, place, dateTime, audience);
        this.setTeams(teams);
        this.setScores(scores);
        this.setLeague(league);
        this.setNumberOfObjects();
    }

    public static void setNumberOfObjects(){
        numberOfObjects += 1;
    }

    public static int getNumberOfObjects() {
        return numberOfObjects;
    }



    public String[] getTeams() {
        return teams;
    }

    public void setTeams(String[] teams){
        this.teams = teams;
    }

    public String getLeague() {
        return league;
    }

    public void setLeague(String league){
        this.league = league;
    }

    public int[] getScores() {
        return scores;
    }

    public void setScores(int[] scores){
        this.scores = scores;
    }

    @Override
    public String toString() {
        return String.format("%s %s", (super.toString()), (String.format("[teams = %s vs %s, scores = %s - %s, %s won, league = %s]", Array.get(this.getTeams(), 0), Array.get(this.getTeams(), 1), Array.get(this.getScores(), 0), Array.get(this.getScores(), 1), this.winner(), this.getLeague())));
    }

    public String winner() {
        final int score1 = (int) Array.get(this.getScores(), 0);
        final int score2 = (int) Array.get(this.getScores(), 1);
        final String team1 = (String) Array.get(this.getTeams(), 0);
        final String team2 = (String) Array.get(this.getTeams(), 1);

        if (score1 > score2) return team1;
        else if (score1 < score2) return team2;
        else{
            if (Math.random() > 0.5)
                return team1;
            else
                return team2;

        }
    }

}