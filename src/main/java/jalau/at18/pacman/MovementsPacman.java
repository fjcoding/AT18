package jalau.at18.pacman;

import java.util.Scanner;

public class MovementsPacman {
    private static int row = 1;
    private static int column = 1;
    private static int rowGhost = 8;
    private static int columnGhost = 15;
    private static final int TIME = 200;
    Board board = new Board();
    private String[][] arr = board.getGameBoard();

    public String[][] moveRight() {
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
                if ((arr[row + 1][column] == "·" || arr[row - 1][column] == "·") && arr[row][column - 1] != "▒") {
                    break;
                }
                if ((arr[row + 1][column] == " " || arr[row - 1][column] == " ") && arr[row][column - 1] != "▒") {
                    break;
                }
                if (column == 0) {
                    column = 28;
                    arr[row][column] = "C";
                    arr[row][column - 28] = " ";
                } else if (column == 28) {
                    column = 0;
                    arr[row][column] = "C";
                    arr[row][column + 28] = " ";
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
                if ((arr[row + 1][column] == "·" || arr[row - 1][column] == "·") && arr[row][column + 1] != "▒") {
                    break;
                }
                if ((arr[row + 1][column] == " " || arr[row - 1][column] == " ") && arr[row][column + 1] != "▒") {
                    break;
                }
                if (column == 0) {
                    column = 28;
                    arr[row][column] = "C";
                    arr[row][column - 28] = " ";
                } else if (column == 28) {
                    column = 0;
                    arr[row][column] = "C";
                    arr[row][column + 28] = " ";
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

    public String[][] moveRightGhost(String[][] arr) {
        try {
            while (arr[rowGhost][columnGhost + 1] != "▒") {
                columnGhost++;
                if (arr[rowGhost][columnGhost] == "·") {
                    arr[rowGhost][columnGhost - 1] = "·";
                    // score += 10;
                } else {
                    arr[rowGhost][columnGhost - 1] = " ";
                    // score = score + 0;
                }
                arr[rowGhost][columnGhost] = "G";
                Thread.sleep(TIME);
                System.out.print("\033[H\033[2J");
                System.out.flush();
                board.showBoard(arr);
                if ((arr[rowGhost + 1][columnGhost] == "·" || arr[rowGhost - 1][columnGhost] == "·")
                        && arr[rowGhost][columnGhost - 1] != "▒") {
                    break;
                }
                if ((arr[rowGhost + 1][columnGhost] == " " || arr[rowGhost - 1][columnGhost] == " ")
                        && arr[rowGhost][columnGhost - 1] != "▒") {
                    break;
                }
                if (columnGhost == 0) {
                    columnGhost = 28;
                    arr[rowGhost][columnGhost] = "G";
                    arr[rowGhost][columnGhost - 28] = "·";
                } else if (columnGhost == 28) {
                    columnGhost = 0;
                    arr[rowGhost][columnGhost] = "G";
                    arr[rowGhost][columnGhost + 28] = "·";
                }
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        return arr;
    }

    public String[][] moveDownGhost(String[][] arr) {
        try {
            while (arr[rowGhost + 1][columnGhost] != "▒") {
                rowGhost++;
                if (arr[rowGhost][columnGhost] == "·") {
                    arr[rowGhost - 1][columnGhost] = "·";
                    // score += 10;
                } else {
                    arr[rowGhost - 1][columnGhost] = " ";
                    // score = score + 0;
                }

                arr[rowGhost][columnGhost] = "G";
                Thread.sleep(TIME);
                System.out.print("\033[H\033[2J");
                System.out.flush();
                board.showBoard(arr);
                if ((arr[rowGhost][columnGhost + 1] == "·" || arr[rowGhost][columnGhost - 1] == "·")
                        && arr[rowGhost - 1][columnGhost] != "▒") {
                    break;
                }
                if ((arr[rowGhost][columnGhost + 1] == " " || arr[rowGhost][columnGhost - 1] == " ")
                        && arr[rowGhost - 1][columnGhost] != "▒") {
                    break;
                }
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();

        }
        return arr;
    }

    public String[][] moveLeftGhost(String[][] arr) {
        try {
            while (arr[rowGhost][columnGhost - 1] != "▒") {
                columnGhost--;
                if (arr[rowGhost][columnGhost] == "·") {
                    arr[rowGhost][columnGhost + 1] = "·";
                    // score += 10;
                } else {
                    arr[rowGhost][columnGhost + 1] = " ";
                    // score = score + 0;
                }
                arr[rowGhost][columnGhost] = "G";
                Thread.sleep(TIME);

                System.out.print("\033[H\033[2J");

                System.out.flush();
                board.showBoard(arr);
                if ((arr[rowGhost + 1][columnGhost] == "·" || arr[rowGhost - 1][columnGhost] == "·")
                        && arr[rowGhost][columnGhost + 1] != "▒") {
                    break;
                }
                if ((arr[rowGhost + 1][columnGhost] == " " || arr[rowGhost - 1][columnGhost] == " ")
                        && arr[rowGhost][columnGhost + 1] != "▒") {
                    break;
                }
                if (columnGhost == 0) {
                    columnGhost = 28;
                    arr[rowGhost][columnGhost] = "G";
                    arr[rowGhost][columnGhost - 28] = "·";
                } else if (columnGhost == 28) {
                    columnGhost = 0;
                    arr[rowGhost][columnGhost] = "C";
                    arr[rowGhost][columnGhost + 28] = "·";
                }
            }
        } catch (InterruptedException ex) {

            ex.printStackTrace();
        }
        return arr;
    }

    public String[][] moveUpGhost(String[][] arr) {
        try {
            while (arr[rowGhost - 1][columnGhost] != "▒") {
                rowGhost--;
                if (arr[rowGhost][columnGhost] == "·") {
                    arr[rowGhost + 1][columnGhost] = "·";
                    // score += 10;
                } else {
                    arr[rowGhost + 1][columnGhost] = " ";
                    // score = score + 0;
                }
                arr[rowGhost][columnGhost] = "G";
                Thread.sleep(TIME);
                System.out.print("\033[H\033[2J");

                System.out.flush();
                board.showBoard(arr);
                if ((arr[rowGhost][columnGhost + 1] == "·" || arr[rowGhost][columnGhost - 1] == "·")
                        && arr[rowGhost + 1][columnGhost] != "▒") {
                    break;
                }
                if ((arr[rowGhost][columnGhost + 1] == " " || arr[rowGhost][columnGhost - 1] == " ")
                        && arr[rowGhost + 1][columnGhost] != "▒") {
                    break;
                }
            }
        } catch (InterruptedException ex) {

            ex.printStackTrace();
        }
        return arr;
    }

}
