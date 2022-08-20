package jalau.at18.katas.game2048.team1;

import java.util.Scanner;

public class Game {
    private Messages message;
    public static final int BOARD_SIZE = 4;

    public void runGame() {
        Board board = new Board(BOARD_SIZE);
        Scanner scan = new Scanner(System.in);
        initGame(board);
        while (!board.isGameOver(board.getMatrix()) && !board.got2048(board.getMatrix())) {
            message = new Messages();
            message.movementsMessage();
            Movement newMovement = new Movement(scan.nextLine(), board.getMatrix());
            board.setMatrix(newMovement.moveNumbers());
            board.printBoard(board.getMatrix());
        }
        scan.close();
    }

    public void initGame(Board boardToInit) {
        Movement initMovement =  new Movement();
        initMovement.addTile(boardToInit.getMatrix());
        initMovement.addTile(boardToInit.getMatrix());
        boardToInit.printBoard(boardToInit.getMatrix());
    }
}
