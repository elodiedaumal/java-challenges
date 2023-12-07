package methodChallenges;

public class MainChallenge {
    public static void main(String[] args) {


        System.out.println("Your score is " + calculateScore(true, 800, 5, 100));

        System.out.println("Your final score is " + calculateScore(true, 10000, 8, 200));

        System.out.println("My age is " + calculateMyAge(1988));

        int highScorePosition= calculateHighScorePosition(1500);

        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition= calculateHighScorePosition(999);

        displayHighScorePosition("Elodie", highScorePosition);

        highScorePosition= calculateHighScorePosition(499);

        displayHighScorePosition("Elisa", highScorePosition);

        highScorePosition= calculateHighScorePosition(99);

        displayHighScorePosition("Mooncake", highScorePosition);

        highScorePosition= calculateHighScorePosition(-1000);

        displayHighScorePosition("Leo", highScorePosition);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

       int finalScore=score;

        if(gameOver) {
            finalScore += (levelCompleted * bonus) + 1000;

        }
        return finalScore;


    }
    public static int calculateMyAge(int yearOfBirth){
        return 2023-yearOfBirth;
    }

    public static void displayHighScorePosition(String playerName, int position){
        System.out.println(playerName + " manage to get into position " + position + " on the high score list");
    }

    public static int calculateHighScorePosition(int playerScore){
        int result=4;
        if(playerScore>=1000){
            result=1;
        } else if (playerScore>=500) {
            result=2;
        } else if (playerScore>=100) {
            result=3;
        }
         return result;
    }
}

