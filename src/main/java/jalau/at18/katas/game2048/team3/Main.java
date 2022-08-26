package jalau.at18.katas.game2048.team3;

import java.util.Scanner;

public class Main {

    private static Board board = new Board();

    public static void main(String[] args) {
        Matrix matrix = new Matrix();
        Main main = new Main();
        board.startBoard(matrix);
        while (!board.didYouWin()) {
            if (matrix.areThereSpacesLeft()) {
                board.showMatrix();
                System.out.println("Make a move:");
                main.readMoves();
                board.generateRandomNumbers();
            } else {
                System.out.println("Make a move:");
                main.readMoves();
                if (!matrix.didMatrixChange()) {
                    System.out.println("YOU LOST!  NO MORE MOVES");
                }
            }

        }
    }

    public void readMoves() {
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
