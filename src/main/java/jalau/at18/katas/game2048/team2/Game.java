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
        // System.out.println("row: "+row );
        if (board.isValidThePosition(numbersRandom[0], numbersRandom[1])) {
            board.replacePositions(numbersRandom[0], numbersRandom[1], 2);
            System.out.println("no es valido");
        } else {
            tryToFillPosition();
        }
        if (board.countZeros() == 0) {
            board.showTable();
            System.out.println("¡Game Over Jose!");
            System.exit(1);
        }
    }

    public void moveUp() {
        System.out.println("se presiono arriba");
        board.moveNumberUp('w');
        tryToFillPosition();
        finishGame();
        board.showTable();
        board.showScore();
    }

    public void moveLeft() {
        System.out.println("se presiono izquierda");
        board.moveNumberLeft('a');
        tryToFillPosition();
        finishGame();
        board.showTable();
        board.showScore();
    }

    public void moveRight() {
        System.out.println("se presiono derecha");
        board.moveNumberRight('d');
        tryToFillPosition();
        finishGame();
        board.showTable();
        board.showScore();
    }

    public void moveDown() {
        System.out.println("se presiono abajo");
        board.moveNumberDown('s');
        tryToFillPosition();
        finishGame();
        board.showTable();
        board.showScore();
    }

    public void finishGame() {
        if (board.showScore() == SCORE) {
            System.out.println("YOU WIN! CONGRATULATIONS");
            System.exit(0);
        }
    }

}
