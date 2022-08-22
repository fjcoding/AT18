package jalau.at18.pacman;

//import java.util.Scanner;
//import java.util.Timer;
//import java.util.TimerTask;
import java.util.Random;

public class MovementsPacman {
    private static int row = 1;
    private static int column = 1;
    public static int ROW_GHOST = 8;
    public static int COLUM_GHOST = 15;
    private static final int TIME = 200;
    public static int contTimeToShowFruits = 0;
    public static int score = 0;
    public static final int SCOREBALL = 10;
    public static final int POWERBALL = 50;
    public static final int FRUIT1 = 100;
    public static final int FRUIT2 = 300;
    public static final int RECHARGE1 = 4;
    public static final int RECHARGE2 = 8;
    public static final int RECHARGE3 = 10;
    public static final int RECHARGE4 = 14;
    public static final int ROWX = 25;
    public static final int COLUMY = 29;
    public static final int SPACES = 28;
    Board board = new Board();
    private String[][] arr = board.getGameBoard();

    public String[][] moveRight() {
        try {
            while (arr[row][column + 1] != "▒") {
                column++;
                board.position(arr, row, column);
                timefruits(arr, row, column);
                if (arr[row][column] == "·") {
                    arr[row][column - 1] = " ";
                    score += SCOREBALL;
                }
                if (arr[row][column] == "\033[34mO\u001B[0m") {
                    arr[row][column - 1] = " ";
                    score = score + POWERBALL;

                } else if (arr[row][column] == "\033[35mX\u001B[0m")// X
                {
                    arr[row][column - 1] = " ";
                    score = score + FRUIT1;
                } else if (arr[row][column] == "\033[32mM\u001B[0m")// arr[n][m]=="M")
                {
                    arr[row][column - 1] = " ";
                    score = score + FRUIT2;
                } else {
                    arr[row][column - 1] = " ";
                    score = score + 0;
                }
                arr[row][column] = "\033[33mC\u001B[0m";
                // arr[row][column] = "C";
                Thread.sleep(TIME);
                System.out.print("\033[H\033[2J");
                System.out.flush();
                board.showBoard(arr, row, column);
                contTimeToShowFruits += 1;
                if ((arr[row + 1][column] == "·" || arr[row - 1][column] == "·") && arr[row][column - 1] != "▒") {
                    break;
                }
                if ((arr[row + 1][column] == " " || arr[row - 1][column] == " ") && arr[row][column - 1] != "▒") {
                    break;
                }
                if (column == 0) {
                    column = SPACES;
                    arr[row][column] = "C";
                    arr[row][column - SPACES] = " ";
                } else if (column == SPACES) {
                    column = 0;
                    // arr[row][column] = "C";
                    arr[row][column] = "\033[33mC\u001B[0m";
                    arr[row][column + SPACES] = " ";
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
                board.position(arr, row, column);
                timefruits(arr, row, column);
                if (arr[row][column] == "·") {
                    arr[row - 1][column] = " ";
                    score += SCOREBALL;
                }
                if (arr[row][column] == "\033[34mO\u001B[0m") // arr[n][m] == "O")
                {
                    arr[row - 1][column] = " ";
                    score = score + POWERBALL;
                } else if (arr[row][column] == "\033[35mX\u001B[0m") {
                    arr[row - 1][column] = " ";
                    score = score + FRUIT1;
                } else if (arr[row][column] == "\033[32mM\u001B[0m") {
                    arr[row - 1][column] = " ";
                    score = score + FRUIT2;
                } else {
                    arr[row - 1][column] = " ";
                    score = score + 0;
                }
                arr[row][column] = "\033[33mC\u001B[0m";
                // arr[row][column] = "C";
                Thread.sleep(TIME);
                System.out.print("\033[H\033[2J");
                System.out.flush();
                board.showBoard(arr, row, column);
                contTimeToShowFruits += 1;
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
                board.position(arr, row, column);
                timefruits(arr, row, column);
                if (arr[row][column] == "·") {
                    arr[row][column + 1] = " ";
                    score += SCOREBALL;
                }
                if (arr[row][column] == "\033[34mO\u001B[0m")// (arr[n - 1][m]=="")
                {
                    arr[row][column + 1] = " ";
                    score = score + POWERBALL;
                } else if (arr[row][column] == "\033[35mX\u001B[0m") {
                    arr[row][column + 1] = " ";
                    score = score + FRUIT1;
                } else if (arr[row][column] == "\033[32mM\u001B[0m") {
                    arr[row][column + 1] = " ";
                    score = score + FRUIT2;
                } else {
                    arr[row][column + 1] = " ";
                    score = score + 0;
                }
                arr[row][column] = "\033[33mC\u001B[0m";
                // arr[row][column] = "C";
                Thread.sleep(TIME);

                System.out.print("\033[H\033[2J");

                System.out.flush();
                board.showBoard(arr, row, column);
                contTimeToShowFruits += 1;
                if ((arr[row + 1][column] == "·" || arr[row - 1][column] == "·") && arr[row][column + 1] != "▒") {
                    break;
                }
                if ((arr[row + 1][column] == " " || arr[row - 1][column] == " ") && arr[row][column + 1] != "▒") {
                    break;
                }
                if (column == 0) {
                    column = SPACES;
                    arr[row][column] = "\033[33mC\u001B[0m";
                    // arr[row][column] = "C";
                    arr[row][column - SPACES] = " ";
                } else if (column == SPACES) {
                    column = 0;
                    arr[row][column] = "\033[33mC\u001B[0m";
                    // arr[row][column] = "C";
                    arr[row][column + SPACES] = " ";
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
                board.position(arr, row, column);
                timefruits(arr, row, column);
                if (arr[row][column] == "·") {
                    arr[row + 1][column] = " ";
                    score += SCOREBALL;
                }
                if (arr[row][column] == "\033[34mO\u001B[0m")// (arr[n - 1][m]=="")
                {
                    arr[row + 1][column] = " ";
                    score = score + POWERBALL;
                } else if (arr[row][column] == "\033[35mX\u001B[0m") {
                    arr[row + 1][column] = " ";
                    score = score + FRUIT1;
                } else if (arr[row][column] == "\033[32mM\u001B[0m") {
                    arr[row + 1][column] = " ";
                    score = score + FRUIT2;
                } else {
                    arr[row + 1][column] = " ";
                    score = score + 0;
                }
                arr[row][column] = "\033[33mC\u001B[0m";
                // arr[row][column] = "C";
                Thread.sleep(TIME);
                System.out.print("\033[H\033[2J");

                System.out.flush();
                board.showBoard(arr, row, column);
                contTimeToShowFruits += 1;
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
            while (arr[ROW_GHOST][COLUM_GHOST + 1] != "▒") {
                COLUM_GHOST++;
                if (arr[ROW_GHOST][COLUM_GHOST] == "·") {
                    arr[ROW_GHOST][COLUM_GHOST - 1] = "·";
                } else {
                    arr[ROW_GHOST][COLUM_GHOST - 1] = " ";
                }
                arr[ROW_GHOST][COLUM_GHOST] = "\033[31mG\u001B[0m";
                Thread.sleep(TIME);
                System.out.print("\033[H\033[2J");
                System.out.flush();
                board.showBoard(arr, row, column);
                contTimeToShowFruits += 1;
                if ((arr[ROW_GHOST + 1][COLUM_GHOST] == "·" || arr[ROW_GHOST - 1][COLUM_GHOST] == "·")
                        && arr[ROW_GHOST][COLUM_GHOST - 1] != "▒") {
                    break;
                }
                if ((arr[ROW_GHOST + 1][COLUM_GHOST] == " " || arr[ROW_GHOST - 1][COLUM_GHOST] == " ")
                        && arr[ROW_GHOST][COLUM_GHOST - 1] != "▒") {
                    break;
                }
                if (COLUM_GHOST == 0) {
                    COLUM_GHOST = SPACES;
                    arr[ROW_GHOST][COLUM_GHOST] = "\033[31mG\u001B[0m";
                    arr[ROW_GHOST][COLUM_GHOST - SPACES] = "·";
                } else if (COLUM_GHOST == SPACES) {
                    COLUM_GHOST = 0;
                    arr[ROW_GHOST][COLUM_GHOST] = "\033[31mG\u001B[0m";
                    arr[ROW_GHOST][COLUM_GHOST + SPACES] = "·";
                }
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        return arr;
    }

    public String[][] moveDownGhost(String[][] arr) {
        try {
            while (arr[ROW_GHOST + 1][COLUM_GHOST] != "▒") {
                ROW_GHOST++;
                if (arr[ROW_GHOST][COLUM_GHOST] == "·") {
                    arr[ROW_GHOST - 1][COLUM_GHOST] = "·";
                    // score += 10;
                } else {
                    arr[ROW_GHOST - 1][COLUM_GHOST] = " ";
                    // score = score + 0;
                }

                arr[ROW_GHOST][COLUM_GHOST] = "\033[31mG\u001B[0m";
                Thread.sleep(TIME);
                System.out.print("\033[H\033[2J");
                System.out.flush();
                board.showBoard(arr, row, column);
                if ((arr[ROW_GHOST][COLUM_GHOST + 1] == "·" || arr[ROW_GHOST][COLUM_GHOST - 1] == "·")
                        && arr[ROW_GHOST - 1][COLUM_GHOST] != "▒") {
                    break;
                }
                if ((arr[ROW_GHOST][COLUM_GHOST + 1] == " " || arr[ROW_GHOST][COLUM_GHOST - 1] == " ")
                        && arr[ROW_GHOST - 1][COLUM_GHOST] != "▒") {
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
            while (arr[ROW_GHOST][COLUM_GHOST - 1] != "▒") {
                COLUM_GHOST--;
                if (arr[ROW_GHOST][COLUM_GHOST] == "·") {
                    arr[ROW_GHOST][COLUM_GHOST + 1] = "·";
                    // score += 10;
                } else {
                    arr[ROW_GHOST][COLUM_GHOST + 1] = " ";
                    // score = score + 0;
                }
                arr[ROW_GHOST][COLUM_GHOST] = "\033[31mG\u001B[0m";
                Thread.sleep(TIME);

                System.out.print("\033[H\033[2J");

                System.out.flush();
                board.showBoard(arr, row, column);
                if ((arr[ROW_GHOST + 1][COLUM_GHOST] == "·" || arr[ROW_GHOST - 1][COLUM_GHOST] == "·")
                        && arr[ROW_GHOST][COLUM_GHOST + 1] != "▒") {
                    break;
                }
                if ((arr[ROW_GHOST + 1][COLUM_GHOST] == " " || arr[ROW_GHOST - 1][COLUM_GHOST] == " ")
                        && arr[ROW_GHOST][COLUM_GHOST + 1] != "▒") {
                    break;
                }
                if (COLUM_GHOST == 0) {
                    COLUM_GHOST = SPACES;
                    arr[ROW_GHOST][COLUM_GHOST] = "\033[31mG\u001B[0m";
                    arr[ROW_GHOST][COLUM_GHOST - SPACES] = "·";
                } else if (COLUM_GHOST == SPACES) {
                    COLUM_GHOST = 0;

                    arr[ROW_GHOST][COLUM_GHOST] = "\033[33mC\u001B[0m";
                    // arr[rowGhost][columnGhost] = "C";
                    arr[ROW_GHOST][COLUM_GHOST + SPACES] = "·";
                }
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        return arr;
    }

    public String[][] moveUpGhost(String[][] arr) {
        try {
            while (arr[ROW_GHOST - 1][COLUM_GHOST] != "▒") {
                ROW_GHOST--;
                if (arr[ROW_GHOST][COLUM_GHOST] == "·") {
                    arr[ROW_GHOST + 1][COLUM_GHOST] = "·";
                    // score += 10;
                } else {
                    arr[ROW_GHOST + 1][COLUM_GHOST] = " ";
                    // score = score + 0;
                }
                arr[ROW_GHOST][COLUM_GHOST] = "\033[31mG\u001B[0m";
                Thread.sleep(TIME);
                System.out.print("\033[H\033[2J");

                System.out.flush();
                board.showBoard(arr, row, column);
                if ((arr[ROW_GHOST][COLUM_GHOST + 1] == "·" || arr[ROW_GHOST][COLUM_GHOST - 1] == "·")
                        && arr[ROW_GHOST + 1][COLUM_GHOST] != "▒") {
                    break;
                }
                if ((arr[ROW_GHOST][COLUM_GHOST + 1] == " " || arr[ROW_GHOST][COLUM_GHOST - 1] == " ")
                        && arr[ROW_GHOST + 1][COLUM_GHOST] != "▒") {
                    break;
                }
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        return arr;
    }

    public int showScore() {
        int points = score;
        return points;
    }

    public static void timefruits(String arr[][], int n, int m) {
        int row1;
        int colum2;
        int row3;
        int colum4; // frutas en color verde
        if (contTimeToShowFruits >= RECHARGE1 && contTimeToShowFruits <= RECHARGE2) { // 4 recargas
            String auxFruits1[][] = new String[ROWX][COLUMY];
            Random fruta = new Random();
            Random fruta1 = new Random();
            row1 = fruta.nextInt(auxFruits1.length); // 13
            colum2 = fruta1.nextInt(auxFruits1.length); // && arr[i1][i2] != arr[n][m]
        if (arr[row1][colum2] != "▒" && arr[row1][colum2] != " " && arr[row1][colum2] != "\033[34mO\u001B[0m") {
            arr[row1][colum2] = "\033[35mX\u001B[0m";
            } else if (arr[row1][colum2] == "▒" && arr[row1][colum2] == " " 
                && arr[row1][colum2] == "\033[34mO\u001B[0m") {
            String auxFruits2[][] = new String[ROWX][COLUMY];
            Random fruta2 = new Random();
            Random fruta22 = new Random();
            row3 = fruta2.nextInt(auxFruits2.length); // 13
            colum4 = fruta22.nextInt(auxFruits2.length);
            arr[row3][colum4] = "\033[35mX\u001B[0m";
            }
        } else if (contTimeToShowFruits >= RECHARGE3 && contTimeToShowFruits <= RECHARGE4) { // 4 recargas
            String auxFruits1[][] = new String[ROWX][COLUMY];
            Random fruta = new Random();
            Random fruta1 = new Random();
            row1 = fruta.nextInt(auxFruits1.length); // 13
            colum2 = fruta1.nextInt(auxFruits1.length); // 5
        if (arr[row1][colum2] != "▒" && arr[row1][colum2] != " " && arr[row1][colum2] != "\033[34mO\u001B[0m" 
            && arr[row1][colum2] != "\033[35mX\u001B[0m") {
                arr[row1][colum2] = "\033[32mM\u001B[0m";
            } else if (arr[row1][colum2] == "▒" && arr[row1][colum2] == " " && arr[row1][colum2] == "\033[34mO\u001B[0m" 
                && arr[row1][colum2] == "\033[35mX\u001B[0m") {
            String auxFruits2[][] = new String[ROWX][COLUMY];
            Random fruta2 = new Random();
            Random fruta22 = new Random();
            row3 = fruta2.nextInt (auxFruits2.length);
            colum4 = fruta22.nextInt (auxFruits2.length);
            arr[row3][colum4] = "\033[32mM\u001B[0m";
            }
        }

    }

}
