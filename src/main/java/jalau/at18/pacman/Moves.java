package jalau.at18.pacman;
//import java.util.Scanner;

public class Moves {
    private String direction;
    private static final int TIME = 200;


    public Moves(String nextDirection) {
        this.direction = nextDirection;
    }

    public void movements(char a) {
        Board board = new Board();
        Board tablero = new Board();
        int row = 1;
        int column = 1;
        if (a == 'd') {
            try {
                while (board.getGameBoard()[row][column + 1] != "▒") {
                    column++;
                    if (board.getGameBoard()[row][column] == "·") {
                        board.getGameBoard()[row][column - 1] = " ";
                        // score += 10;
                    } else {
                        board.getGameBoard()[row][column - 1] = " ";
                        // score = score + 0;
                    }
                    board.getGameBoard()[row][column] = "C";
                    Thread.sleep(TIME);
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    tablero.showBoard(board.getGameBoard());
                }
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            board.getGameBoard()[row][column] = "C";
        }
        if (a == 's') {
            try {
                while (board.getGameBoard()[row + 1][column] != "▒") {
                    row++;
                    if (board.getGameBoard()[row][column] == "·") {
                        board.getGameBoard()[row - 1][column] = " ";
                        // score += 10;
                    } else {
                        board.getGameBoard()[row - 1][column] = " ";
                        // score = score + 0;
                    }

                    board.getGameBoard()[row][column] = "C";
                    Thread.sleep(TIME);
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    tablero.showBoard(board.getGameBoard());
                }
            } catch (InterruptedException ex) {
                ex.printStackTrace();

            }
        }
        if (a == 'a') {
            try {
                while (board.getGameBoard()[row][column - 1] != "▒") {
                    column--;
                    if (board.getGameBoard()[row][column] == "·") {
                        board.getGameBoard()[row][column + 1] = " ";
                        // score += 10;
                    } else {
                        board.getGameBoard()[row][column + 1] = " ";
                        // score = score + 0;
                    }
                    board.getGameBoard()[row][column] = "C";
                    Thread.sleep(TIME);

                    System.out.print("\033[H\033[2J");

                    System.out.flush();

                    tablero.showBoard(board.getGameBoard());
                }
            } catch (InterruptedException ex) {

                ex.printStackTrace();
            }

        }
        if (a == 'w') {
            /////////////////////////////////////////////////
            try {
                while (board.getGameBoard()[row - 1][column] != "▒") {
                    row--;
                    if (board.getGameBoard()[row][column] == "·") {
                        board.getGameBoard()[row + 1][column] = " ";
                        // score += 10;
                    } else {
                        board.getGameBoard()[row + 1][column] = " ";
                        // score = score + 0;
                    }
                    board.getGameBoard()[row][column] = "C";
                    Thread.sleep(TIME);
                    System.out.print("\033[H\033[2J");

                    System.out.flush();

                    tablero.showBoard(board.getGameBoard());
                }
            } catch (InterruptedException ex) {

                ex.printStackTrace();
            }
        }
    }
}