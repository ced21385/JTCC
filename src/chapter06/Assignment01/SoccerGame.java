package chapter06;

//soccer game object
import java.util.Scanner;
class SoccerGame {

    String firstTeam;
    String secondTeam;
    char winner = ' ';
    int firstTeamScore;
    int secondTeamScore;
    int status;

    //soccer game constructor
    SoccerGame(String firstTeam, String secondTeam, int firstTeamScore,
               int secondTeamScore, int status) {

        this.firstTeam = firstTeam;
        this.secondTeam = secondTeam;
        this.status = 0;
    }

    //check status of game
    public int getStatus() {
        Scanner input = new Scanner(System.in);
        System.out.println("Is the game over? Enter a 1 for yes or 0 for no.");
        status = input.nextInt();
        return status;
    }

    //add a point for the first team's score if they score
    public int getFirstTeamScore() {
        firstTeamScore = firstTeamScore + 1;
        return firstTeamScore;
    }

    //add a point for the second team's score if they score
    public int getSecondTeamScore() {
        secondTeamScore = secondTeamScore + 1;
        return secondTeamScore;
    }

    //winner method
    public char getWinner() {
        if (status == 0 && firstTeamScore > secondTeamScore) {
            System.out.println("The team that is currently winning is " + firstTeam);
        }
        else if (status == 0 && secondTeamScore > firstTeamScore){
            System.out.println("The team that is currently winning is " + secondTeam);
        }
        else if (status == 0 && firstTeamScore == secondTeamScore){
            System.out.println("The game is currently tied.");
        }
        else if (status == 1 && firstTeamScore > secondTeamScore) {
            System.out.println("The " + firstTeam + " finished with a score of "
                    + firstTeamScore + " and the " + secondTeam +
                    " finished with a score of " + secondTeamScore +
                    ". The team that won is " + firstTeam);
        } else if (status == 1 && secondTeamScore > firstTeamScore) {
            System.out.println("The " + firstTeam + " finished with a score of "
                    + firstTeamScore + " and the " + secondTeam +
                    " finished with a score of " + secondTeamScore +
                    ". The team that won is " + secondTeam);
        } else {
            System.out.println("The " + firstTeam + " finished with a score of "
                    + firstTeamScore + " and the " + secondTeam +
                    " finished with a score of " + secondTeamScore +
                    ". The game ended in a tie.");
        }

        return winner;
    }
}
