package jalau.at18.battlecity;

public class Score {

    protected int score;

    public Score() {
        score = 0;
    }

    public void incrementScore() {
        score += 1;
    }

    public int getScore() {
        return score;
    }

    public void showScore() {
        System.out.println("Score: " + score);
    }

}
