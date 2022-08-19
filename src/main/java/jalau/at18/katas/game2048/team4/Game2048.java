package jalau.at18.katas.game2048.team4;

public class Game2048 extends Game {

    public static final int GRID_SIZE = 4;

    private int[][] matrix;
    private boolean hasEnded;

    public Game2048(int[][] matrix) {
        this.matrix = matrix;
        this.hasEnded = false;
    }

    @Override
    public void start() {
        System.out.println(
            "***Welcome to the game. Objective: get tile 2048 by moving existing tiles: up, down, left and right.***");
        Main.putNewTwoOnMatrix(matrix);
        Main.putNewTwoOnMatrix(matrix);
        Main.showMatrix();
    }

    @Override
    public void play(GameInput input) {
        String nextDirection = input.getTextInput();
        System.out.println(
                    "Type the direction you want to go. Directions: [up, down, left, right] = [w, s, a, d]. If you want to exit type 'q' and ENTER");
        Main.directionChecker(nextDirection);
        System.out.println();
        Main.showMatrix();
        if ("q".equals(nextDirection)) {
            System.out.println("\nIf you want to stop playing type 'q' again. If not type any key.");
            String continuePlaying = input.getReader().read();
            if (continuePlaying.equals("q")) {
                this.hasEnded = nextDirection.equals("q");
            }
        }
    }

    @Override
    public boolean hasEnded() {
        return hasEnded || Main.isWinner(matrix) || Main.isLoser(matrix);
    }
}
