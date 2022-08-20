package jalau.at18.katas.game2048.team1;


public class Main {
    public static final int TILE_VALUE_TWO = 2;
    public static final int TILE_VALUE_FOUR = 4;
    public static final int MAX_RANDOM_POSITION = 4;
    public static final int MAX_ROW_MOVES = 3;
    public static final int WIN_POINT = 2048;
    public static final int MAX_ROW_MATRIX = 4;
    public static final int MAX_COLUMN_MATRIX = 4;
    public static void main(String[] args) {
        Main main = new Main();
        Game game = new Game();
        game.runGame();
    }
}
