package jalau.at18.katas.game2048.team2;

public class Main {
    public static void main(String[] args) {
        Board board = new Board(4, 0);
        board.createTable();
        board.showTable();
        board.generateTokens();
    }
}
