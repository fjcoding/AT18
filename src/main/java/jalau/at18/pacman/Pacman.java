package jalau.at18.pacman;

public class Pacman {
    private static int row = 1;
    private static int column = 1;
    private static final int TIME = 200;
    public void moveUp(char a) {
        Board board = new Board();
        Board tablero = new Board();
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
