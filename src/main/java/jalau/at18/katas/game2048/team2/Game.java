package jalau.at18.katas.game2048.team2;

import java.util.Random;

public class Game {
    public static final int SIZE = 4;
    public static final int SCORE = 2048;
    private Board board;

    public Game(Board board) {
        this.board = board;
    }

    public void start() {
        board.showTable();
        tryToFillPosition();
        tryToFillPosition();
        System.out.println();
        board.showTable();

    }

    public int[] generateRandomNumber() {

        int[] numbersRandom = new int[2];
        Random randomPosition = new Random();
        numbersRandom[0] = randomPosition.nextInt(SIZE) + 0; // range 0-3
        numbersRandom[1] = randomPosition.nextInt(SIZE) + 0;
        return numbersRandom;

    }

    public void tryToFillPosition() {

        int[] numbersRandom = new int[2];
        numbersRandom = generateRandomNumber();
        if (board.isEmptyPosition(numbersRandom[0], numbersRandom[1])) {
            board.replacePositions(numbersRandom[0], numbersRandom[1], 2);
        } else {
            tryToFillPosition();
        }
        if (board.countZeros() == 0) {
            board.showTable();
            System.out.println("( ^ . ^ ) ¡Game Over Jose!");
            System.exit(1);
        }
    }
    public boolean gameMoves(char direction) {
        if (direction == 'w') {
            System.out.println("Push UP");
            board.moveNumberUp('w');
        }
        if (direction == 'a') {
            System.out.println("Push LEFT");
            board.moveNumberLeft('a');
        }
        if (direction == 'd') {
            System.out.println("Push RIGHT");
            board.moveNumberRight('d');
        }
        if (direction == 's') {
            System.out.println("Push DOWN");
            board.moveNumberDown('s');
        }
        try {
            tryToFillPosition();
            board.showTable();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public boolean finishGame() {
        if (board.showScore() == SCORE) {
            System.out.println("YOU WIN! CONGRATULATIONS ");
          //  System.exit(0);
            return true;
        }
        return false;
    }

}
