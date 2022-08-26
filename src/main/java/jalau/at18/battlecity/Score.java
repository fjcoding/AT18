package jalau.at18.battlecity;

public class Score {
    private static final int POINTS_FOR_ENEMY_DEFEATED = 10;

    protected int score;

    public Score() {
        score = 0;
    }

    public void incrementScore() {
        score += POINTS_FOR_ENEMY_DEFEATED;
    }

    public int getScore() {
        return score;
    }

    public void showScore() {
        System.out.println("Score: " + score);
    }

}
