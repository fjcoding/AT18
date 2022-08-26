package jalau.at18.katas.game2048.team3;

import java.util.Scanner;

public class Main {

    private static Board board = new Board();
    private static Matrix matrix = new Matrix();

    public static void main(String[] args) {
        board.initializeMatrix();
        while (!board.didYouWin()) {
            if (matrix.areThereSpacesLeft()) {
                board.showMatrix();
                System.out.println("Make a move:");
                readMoves();
                board.generateRandomNumbers();
            } else {
                System.out.println("Make a move:");
                readMoves();
                if (!matrix.didMatrixChange()) {
                    System.out.println("YOU LOST!  NO MORE MOVES");
                }
            }

        }
    }

    public static void readMoves() {
        String input;
        Scanner data = new Scanner(System.in);
        input = data.next();
        switch (input) {
            case "a":
                board.leftMove();
                break;
            case "w":
                board.upMove();
                break;
            case "s":
                board.downMove();
                break;
            case "d":
                board.rightMove();
                break;
            default:
                break;
        }
    }
}