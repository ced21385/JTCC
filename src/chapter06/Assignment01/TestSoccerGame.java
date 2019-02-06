package chapter06;

import java.util.Scanner;
import java.lang.String;
import java.lang.System;

public class TestSoccerGame {

    //main method, test method
    public static void main(String[] args) {

        //create scanner
        Scanner input = new Scanner(System.in);

        //initialize variables
        int firstTeamScore = 0;
        int secondTeamScore = 0;
        int status = 0;

        //input team 1 name
        System.out.println("Enter in the name of team 1.");
        String firstTeam = input.nextLine();

        //input team 2 name
        System.out.println("Enter in the name of team 2.");
        String secondTeam = input.nextLine();

        //create new soccer game
        SoccerGame newGame = new SoccerGame(firstTeam, secondTeam,
                firstTeamScore, secondTeamScore, status);

        //create loop to allow user to enter in score updates
        while (status== 0){
            //check if any team has score
            System.out.println("Has anyone scored a goal? Enter 0 for yes or 1 for no.");
            int goalScored = input.nextInt();

            if (goalScored == 0){

                //ask which team scored
                System.out.println("Did Team 1 or Team 2 score the goal?"
                        + " Enter 1 for Team 1 or 2 for Team 2.");
                int teamGoal = input.nextInt();
                if(teamGoal == 1){
                    firstTeamScore = newGame.getFirstTeamScore();
                    status = newGame.getStatus();
                }
                else{
                    secondTeamScore = newGame.getSecondTeamScore();
                    status = newGame.getStatus();
                }
            }
            else{
                status = newGame.getStatus();
            }
            //output winner
            System.out.println(newGame.getWinner());

        }

    }
}