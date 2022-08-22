package jalau.at18.pacman;

public class MovementsGhosts {
    private static int row = 8;
    private static int column = 15;
    private static final int TIME = 200;
    Board board = new Board();
    private String[][] arr = board.getGameBoard();

    public String[][] moveRight() {
        try {
            while (arr[row][column + 1] != "▒") {
                column++;
                if (arr[row][column] == "·") {
                    arr[row][column - 1] = "·";
                    // score += 10;
                } else {
                    arr[row][column - 1] = " ";
                    // score = score + 0;
                }
                arr[row][column] = "\033[31mG\u001B[0m";
                //arr[row][column] = "G";
                Thread.sleep(TIME);
                System.out.print("\033[H\033[2J");
                System.out.flush();
                board.showBoard(arr,row,column);
                if ((arr[row + 1][column] == "·" || arr[row - 1][column] == "·") && arr[row][column - 1] != "▒") {
                    break;
                }
                if ((arr[row + 1][column] == " " || arr[row - 1][column] == " ") && arr[row][column - 1] != "▒") {
                    break;
                }
                if (column == 0) {
                    column = 28;
                    arr[row][column] ="\033[31mG\u001B[0m";
                    //arr[row][column] = "G";
                    arr[row][column - 28] = "·";
                } else if (column == 28) {
                    column = 0;
                    arr[row][column] ="\033[31mG\u001B[0m";
                    //arr[row][column] = "G";
                    arr[row][column + 28] = "·";
                }
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        return arr;
    }

    public String[][] moveDown() {
        try {
            while (arr[row + 1][column] != "▒") {
                row++;
                if (arr[row][column] == "·") {
                    arr[row - 1][column] = "·";
                    // score += 10;
                } else {
                    arr[row - 1][column] = " ";
                    // score = score + 0;
                }
                arr[row][column] ="\033[31mG\u001B[0m";
                //arr[row][column] = "G";
                Thread.sleep(TIME);
                System.out.print("\033[H\033[2J");
                System.out.flush();
                board.showBoard(arr,row,column);
                if ((arr[row][column + 1] == "·" || arr[row][column - 1] == "·") && arr[row - 1][column] != "▒") {
                    break;
                }
                if ((arr[row][column + 1] == " " || arr[row][column - 1] == " ") && arr[row - 1][column] != "▒") {
                    break;
                }
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();

        }
        return arr;
    }

    public String[][] moveLeft() {
        try {
            while (arr[row][column - 1] != "▒") {
                column--;
                if (arr[row][column] == "·") {
                    arr[row][column + 1] = "·";
                    // score += 10;
                } else {
                    arr[row][column + 1] = " ";
                    // score = score + 0;
                }
                arr[row][column] ="\033[31mG\u001B[0m";
                //arr[row][column] = "G";
                Thread.sleep(TIME);

                System.out.print("\033[H\033[2J");

                System.out.flush();
                board.showBoard(arr,row,column);
                if ((arr[row + 1][column] == "·" || arr[row - 1][column] == "·") && arr[row][column + 1] != "▒") {
                    break;
                }
                if ((arr[row + 1][column] == " " || arr[row - 1][column] == " ") && arr[row][column + 1] != "▒") {
                    break;
                }
                if (column == 0) {
                    column = 28;
                    arr[row][column] ="\033[31mG\u001B[0m";
                    //arr[row][column] = "G";
                    arr[row][column - 28] = "·";
                } else if (column == 28) {
                    column = 0;
                    arr[row][column] = "\033[33mC\u001B[0m";
                    // arr[row][column] = "C";
                    arr[row][column + 28] = "·";
                }
            }
        } catch (InterruptedException ex) {

            ex.printStackTrace();
        }
        return arr;
    }

    public String[][] moveUp() {
        try {
            while (arr[row - 1][column] != "▒") {
                row--;
                if (arr[row][column] == "·") {
                    arr[row + 1][column] = "·";
                    // score += 10;
                } else {
                    arr[row + 1][column] = " ";
                    // score = score + 0;
                }
                arr[row][column] ="\033[31mG\u001B[0m";
                //arr[row][column] = "G";
                Thread.sleep(TIME);
                System.out.print("\033[H\033[2J");

                System.out.flush();
                board.showBoard(arr,row,column);
                if ((arr[row][column + 1] == "·" || arr[row][column - 1] == "·") && arr[row + 1][column] != "▒") {
                    break;
                }
                if ((arr[row][column + 1] == " " || arr[row][column - 1] == " ") && arr[row + 1][column] != "▒") {
                    break;
                }
            }
        } catch (InterruptedException ex) {

            ex.printStackTrace();
        }
        return arr;
    }
}
