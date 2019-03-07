package project2;

import project2.Event;


public class SportEvent extends Event {

    private String teams[] = new String[2];
    private int scores[] = new int[2];
    private String league;

    public SportEvent(){}

    public SportEvent(String teams, int scores, String league){

        this.teams = new String[2];
        this.scores = new int[2];
        this.league = league;

    }

    public static int getNumberOfObjects(){ return numberOfObjects++; }

    public String[] getTeams(){
        return teams;
    }

}
