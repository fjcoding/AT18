package jalau.at18.pacman.Rene;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Board board = new Board();

        board.showBoard(board.getBoard());
        int[] position = { 10, 15 };
        board.gameBoard = board.addElementToTheBoard(new Ghost().getRepresentation(), position );
        board.showBoard(board.getBoard());
        
    }

}