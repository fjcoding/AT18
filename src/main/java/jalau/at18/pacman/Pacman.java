package jalau.at18.pacman;

public class Pacman {
    private static int row = 1;
    private static int column = 1;
    private static final int TIME = 200;
    Board board = new Board();
    private String[][] arr = board.getGameBoard();

    public void moveUp(char a) {
        if (a == 'd') {
            try {
                while (arr[row][column + 1] != "▒") {
                    column++;
                    if (arr[row][column] == "·") {
                        arr[row][column - 1] = " ";
                        // score += 10;
                    } else {
                        arr[row][column - 1] = " ";
                        // score = score + 0;
                    }
                    arr[row][column] = "C";
                    Thread.sleep(TIME);
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    board.showBoard(arr);
                }
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            arr[row][column] = "C";
        }
        if (a == 's') {
            try {
                while (arr[row + 1][column] != "▒") {
                    row++;
                    if (arr[row][column] == "·") {
                        arr[row - 1][column] = " ";
                        // score += 10;
                    } else {
                        arr[row - 1][column] = " ";
                        // score = score + 0;
                    }

                    arr[row][column] = "C";
                    Thread.sleep(TIME);
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    board.showBoard(arr);
                }
            } catch (InterruptedException ex) {
                ex.printStackTrace();

            }
        }
        if (a == 'a') {
            try {
                while (arr[row][column - 1] != "▒") {
                    column--;
                    if (arr[row][column] == "·") {
                        arr[row][column + 1] = " ";
                        // score += 10;
                    } else {
                        arr[row][column + 1] = " ";
                        // score = score + 0;
                    }
                    arr[row][column] = "C";
                    Thread.sleep(TIME);

                    System.out.print("\033[H\033[2J");

                    System.out.flush();
                    board.showBoard(arr);
                }
            } catch (InterruptedException ex) {

                ex.printStackTrace();
            }

        }
        if (a == 'w') {
            /////////////////////////////////////////////////
            try {
                while (arr[row - 1][column] != "▒") {
                    row--;
                    if (arr[row][column] == "·") {
                        arr[row + 1][column] = " ";
                        // score += 10;
                    } else {
                        arr[row + 1][column] = " ";
                        // score = score + 0;
                    }
                    arr[row][column] = "C";
                    Thread.sleep(TIME);
                    System.out.print("\033[H\033[2J");

                    System.out.flush();
                    board.showBoard(arr);
                }
            } catch (InterruptedException ex) {

                ex.printStackTrace();
            }
        }
    }
}
