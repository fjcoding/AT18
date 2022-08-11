package jalau.at18.katas.game2048.team2;

import java.util.Random;

public class Game {
    private Board board;
    private char character;
    public Game(Board board) {
        this.board = board;
        //this.character = character;
    }
    public void Move() {
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
        Random r = new Random();
        row = r.nextInt(3)+0; //range 0-3
        column =r.nextInt(3)+0;
        //System.out.println("row: "+row );
        if (board.isValidThePosition(row, column)) {
            board.replacePositions(row, column, 2);
        } else {
            System.out.println("no es valido");
        }

    }
    public void moveUp() {

        System.out.println("se presiono arriba");
        board.moveNumbers('w');


    }
    public void moveLeft() {

        System.out.println("se presiono izquierda");
        board.moveNumbers('a');

    }
    public void moveRight() {

        System.out.println("se presiono derecha");
        board.moveNumbers('d');

    }
    public void moveDown() {

        System.out.println("se presiono abajo");
        board.moveNumbers('s');

    }
}
