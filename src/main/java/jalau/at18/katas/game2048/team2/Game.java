package jalau.at18.katas.game2048.team2;

import java.util.Random;

public class Game {
    public static final int SIZE = 4;
    public static final int SCORE = 2048;
    private Board board;
    private char character;

    public Game(Board board) {
        this.board = board;
        // this.character = character;
    }

    public void move() {
    }

    public void start() {
        board.showTable();
        random();
        random();
        System.out.println();
        board.showTable();

    }

    public void random() {
        int row;
        int column;
        Random randomPosition = new Random();
        row = randomPosition.nextInt(SIZE) + 0; // range 0-3
        column = randomPosition.nextInt(SIZE) + 0;
        // System.out.println("row: "+row );
        if (board.isValidThePosition(row, column) == true) {
            board.replacePositions(row, column, 2);
            System.out.println("no es valido");
        } else {
            random();
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
    }

    public void moveLeft() {
        System.out.println("se presiono izquierda");
        board.moveNumberLeft('a');
    }

    public void moveRight() {
        System.out.println("se presiono derecha");
        board.moveNumberRight('d');
    }

    public void moveDown() {
        System.out.println("se presiono abajo");
        board.moveNumberD('s');
    }

    public void finishGame() {
        if (board.showScore() == SCORE) {
            System.out.println("YOU WIN! CONGRATULATIONS");
            System.exit(0);
        }
    }

}
