package jalau.at18.pacman;
import java.util.Random;

public class MovementsPacman {
    private static final int EIGHT = 8;
    private static final int FIFTEEN = 15;
    private static int rowGhost = EIGHT;
    private static int columnsGhost = FIFTEEN;
    private static int row = 1;
    private static int column = 1;
    private static final int TIME = 200;
    private static int contTimeToShowFruits = 0;
    private static int score = 0;
    public static final int SCOREBALL = 10;
    public static final int POWERBALL = 50;
    public static final int FRUIT1 = 100;
    public static final int FRUIT2 = 300;
    public static final int RECHARGE4 = 4;
    public static final int RECHARGE8 = 8;
    public static final int RECHARGE10 = 10;
    public static final int RECHARGE14 = 14;
    public static final int ROWX = 25;
    public static final int COLUMY = 29;
    public static final int SPACES = 28;
    private static int energizer1 = 0;
    private static int energizer2 = 0;
    private static int energizer3 = 0;
    private static int energizer4 = 0;
    private static int energizer5 = 0;
    private static int eat1 = 1;
    private static int eat2 = 2;
    public static final String FIRST = "\033[34mO\u001B[0m";
    private static final int POSITION5 = 5;
    private static final int POSITION25 = 25;
    private static final int POSITION3 = 3;
    private static final int POSITION23 = 23;
    private static final int POSITION11 = 11;
    private static final int POSITION17 = 17;

    private Board board = new Board();
    private String[][] newboardarr = board.getGameBoard();

    public String[][] moveRight() {
        try {
            while (newboardarr[row][column + 1] != "▒") {
                column++;
                position(newboardarr, row, column);
                balls(newboardarr, row, column);
                timefruits(newboardarr, row, column);
                if (newboardarr[row][column] == "·") {
                    newboardarr[row][column - 1] = " ";
                    score += SCOREBALL;
                }
                if (newboardarr[row][column] == "\033[34mO\u001B[0m") {
                    newboardarr[row][column - 1] = " ";
                    score = score + POWERBALL;

                } else if (newboardarr[row][column] == "\033[35mX\u001B[0m") {
                    newboardarr[row][column - 1] = " ";
                    score = score + FRUIT1;
                } else if (newboardarr[row][column] == "\033[32mM\u001B[0m") {
                    newboardarr[row][column - 1] = " ";
                    score = score + FRUIT2;
                } else {
                    newboardarr[row][column - 1] = " ";
                    score = score + 0;
                }
                newboardarr[row][column] = "\033[33mC\u001B[0m";
                Thread.sleep(TIME);
                System.out.print("\033[H\033[2J");
                System.out.flush();
                board.showBoard(newboardarr, row, column);
                contTimeToShowFruits += 1;
                if ((newboardarr[row + 1][column] == "·" || newboardarr[row - 1][column] == "·")
                        && newboardarr[row][column - 1] != "▒") {
                    break;
                }
                if ((newboardarr[row + 1][column] == " " || newboardarr[row - 1][column] == " ")
                        && newboardarr[row][column - 1] != "▒") {
                    break;
                }
                if (column == 0) {
                    column = SPACES;
                    newboardarr[row][column] = "C";
                    newboardarr[row][column - SPACES] = " ";
                } else if (column == SPACES) {
                    column = 0;
                    // newboardarr[row][column] = "C";
                    newboardarr[row][column] = "\033[33mC\u001B[0m";
                    newboardarr[row][column + SPACES] = " ";
                }
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        return newboardarr;
    }

    public String[][] moveDown() {
        try {
            while (newboardarr[row + 1][column] != "▒") {
                row++;
                position(newboardarr, row, column);
                balls(newboardarr, row, column);
                timefruits(newboardarr, row, column);
                if (newboardarr[row][column] == "·") {
                    newboardarr[row - 1][column] = " ";
                    score += SCOREBALL;
                }
                if (newboardarr[row][column] == "\033[34mO\u001B[0m") {
                    newboardarr[row - 1][column] = " ";
                    score = score + POWERBALL;
                } else if (newboardarr[row][column] == "\033[35mX\u001B[0m") {
                    newboardarr[row - 1][column] = " ";
                    score = score + FRUIT1;
                } else if (newboardarr[row][column] == "\033[32mM\u001B[0m") {
                    newboardarr[row - 1][column] = " ";
                    score = score + FRUIT2;
                } else {
                    newboardarr[row - 1][column] = " ";
                    score = score + 0;
                }
                newboardarr[row][column] = "\033[33mC\u001B[0m";
                Thread.sleep(TIME);
                System.out.print("\033[H\033[2J");
                System.out.flush();
                board.showBoard(newboardarr, row, column);
                contTimeToShowFruits += 1;
                if ((newboardarr[row][column + 1] == "·" || newboardarr[row][column - 1] == "·")
                        && newboardarr[row - 1][column] != "▒") {
                    break;
                }
                if ((newboardarr[row][column + 1] == " " || newboardarr[row][column - 1] == " ")
                        && newboardarr[row - 1][column] != "▒") {
                    break;
                }
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        return newboardarr;
    }

    public String[][] moveLeft() {
        try {
            while (newboardarr[row][column - 1] != "▒") {
                column--;
                position(newboardarr, row, column);
                balls(newboardarr, row, column);
                timefruits(newboardarr, row, column);
                if (newboardarr[row][column] == "·") {
                    newboardarr[row][column + 1] = " ";
                    score += SCOREBALL;
                }
                if (newboardarr[row][column] == "\033[34mO\u001B[0m") {
                    newboardarr[row][column + 1] = " ";
                    score = score + POWERBALL;
                } else if (newboardarr[row][column] == "\033[35mX\u001B[0m") {
                    newboardarr[row][column + 1] = " ";
                    score = score + FRUIT1;
                } else if (newboardarr[row][column] == "\033[32mM\u001B[0m") {
                    newboardarr[row][column + 1] = " ";
                    score = score + FRUIT2;
                } else {
                    newboardarr[row][column + 1] = " ";
                    score = score + 0;
                }
                newboardarr[row][column] = "\033[33mC\u001B[0m";
                // newboardarr[row][column] = "C";
                Thread.sleep(TIME);

                System.out.print("\033[H\033[2J");

                System.out.flush();
                board.showBoard(newboardarr, row, column);
                contTimeToShowFruits += 1;
                if ((newboardarr[row + 1][column] == "·" || newboardarr[row - 1][column] == "·")
                        && newboardarr[row][column + 1] != "▒") {
                    break;
                }
                if ((newboardarr[row + 1][column] == " " || newboardarr[row - 1][column] == " ")
                        && newboardarr[row][column + 1] != "▒") {
                    break;
                }
                if (column == 0) {
                    column = SPACES;
                    newboardarr[row][column] = "\033[33mC\u001B[0m";
                    // newboardarr[row][column] = "C";
                    newboardarr[row][column - SPACES] = " ";
                } else if (column == SPACES) {
                    column = 0;
                    newboardarr[row][column] = "\033[33mC\u001B[0m";
                    // newboardarr[row][column] = "C";
                    newboardarr[row][column + SPACES] = " ";
                }
            }
        } catch (InterruptedException ex) {

            ex.printStackTrace();
        }
        return newboardarr;
    }

    public String[][] moveUp() {
        try {
            while (newboardarr[row - 1][column] != "▒") {
                row--;
                position(newboardarr, row, column);
                balls(newboardarr, row, column);
                timefruits(newboardarr, row, column);
                if (newboardarr[row][column] == "·") {
                    newboardarr[row + 1][column] = " ";
                    score += SCOREBALL;
                }
                if (newboardarr[row][column] == "\033[34mO\u001B[0m") {
                    newboardarr[row + 1][column] = " ";
                    score = score + POWERBALL;
                } else if (newboardarr[row][column] == "\033[35mX\u001B[0m") {
                    newboardarr[row + 1][column] = " ";
                    score = score + FRUIT1;
                } else if (newboardarr[row][column] == "\033[32mM\u001B[0m") {
                    newboardarr[row + 1][column] = " ";
                    score = score + FRUIT2;
                } else {
                    newboardarr[row + 1][column] = " ";
                    score = score + 0;
                }
                newboardarr[row][column] = "\033[33mC\u001B[0m";
                // newboardarr[row][column] = "C";
                Thread.sleep(TIME);
                System.out.print("\033[H\033[2J");

                System.out.flush();
                board.showBoard(newboardarr, row, column);
                contTimeToShowFruits += 1;
                if ((newboardarr[row][column + 1] == "·" || newboardarr[row][column - 1] == "·")
                        && newboardarr[row + 1][column] != "▒") {
                    break;
                }
                if ((newboardarr[row][column + 1] == " " || newboardarr[row][column - 1] == " ")
                        && newboardarr[row + 1][column] != "▒") {
                    break;
                }
            }
        } catch (InterruptedException ex) {

            ex.printStackTrace();
        }
        return newboardarr;
    }

    public String[][] moveRightGhost(String[][] arr) {
        try {
            while (newboardarr[rowGhost][columnsGhost + 1] != "▒") {
                columnsGhost++;
                if (newboardarr[rowGhost][columnsGhost] == "·") {
                    newboardarr[rowGhost][columnsGhost - 1] = "·";
                } else {
                    newboardarr[rowGhost][columnsGhost - 1] = " ";
                }
                newboardarr[rowGhost][columnsGhost] = "\033[31mG\u001B[0m";
                Thread.sleep(TIME);
                System.out.print("\033[H\033[2J");
                System.out.flush();
                board.showBoard(newboardarr, row, column);
                contTimeToShowFruits += 1;
                if ((newboardarr[rowGhost + 1][columnsGhost] == "·" || newboardarr[rowGhost - 1][columnsGhost] == "·")
                        && newboardarr[rowGhost][columnsGhost - 1] != "▒") {
                    break;
                }
                if ((newboardarr[rowGhost + 1][columnsGhost] == " " || newboardarr[rowGhost - 1][columnsGhost] == " ")
                        && newboardarr[rowGhost][columnsGhost - 1] != "▒") {
                    break;
                }
                if (columnsGhost == 0) {
                    columnsGhost = SPACES;
                    newboardarr[rowGhost][columnsGhost] = "\033[31mG\u001B[0m";
                    newboardarr[rowGhost][columnsGhost - SPACES] = "·";
                } else if (columnsGhost == SPACES) {
                    columnsGhost = 0;
                    newboardarr[rowGhost][columnsGhost] = "\033[31mG\u001B[0m";
                    newboardarr[rowGhost][columnsGhost + SPACES] = "·";
                }
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        return newboardarr;
    }

    public String[][] moveDownGhost(String[][] newboardarr) {
        try {
            while (newboardarr[rowGhost + 1][columnsGhost] != "▒") {
                rowGhost++;
                if (newboardarr[rowGhost][columnsGhost] == "·") {
                    newboardarr[rowGhost - 1][columnsGhost] = "·";
                    // score += 10;
                } else {
                    newboardarr[rowGhost - 1][columnsGhost] = " ";
                    // score = score + 0;
                }

                newboardarr[rowGhost][columnsGhost] = "\033[31mG\u001B[0m";
                Thread.sleep(TIME);
                System.out.print("\033[H\033[2J");
                System.out.flush();
                board.showBoard(newboardarr, row, column);
                if ((newboardarr[rowGhost][columnsGhost + 1] == "·" || newboardarr[rowGhost][columnsGhost - 1] == "·")
                        && newboardarr[rowGhost - 1][columnsGhost] != "▒") {
                    break;
                }
                if ((newboardarr[rowGhost][columnsGhost + 1] == " " || newboardarr[rowGhost][columnsGhost - 1] == " ")
                        && newboardarr[rowGhost - 1][columnsGhost] != "▒") {
                    break;
                }
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        return newboardarr;
    }

    public String[][] moveLeftGhost(String[][] newboardarr) {
        try {
            while (newboardarr[rowGhost][columnsGhost - 1] != "▒") {
                columnsGhost--;
                if (newboardarr[rowGhost][columnsGhost] == "·") {
                    newboardarr[rowGhost][columnsGhost + 1] = "·";
                    // score += 10;
                } else {
                    newboardarr[rowGhost][columnsGhost + 1] = " ";
                    // score = score + 0;
                }
                newboardarr[rowGhost][columnsGhost] = "\033[31mG\u001B[0m";
                Thread.sleep(TIME);

                System.out.print("\033[H\033[2J");

                System.out.flush();
                board.showBoard(newboardarr, row, column);
                if ((newboardarr[rowGhost + 1][columnsGhost] == "·" || newboardarr[rowGhost - 1][columnsGhost] == "·")
                        && newboardarr[rowGhost][columnsGhost + 1] != "▒") {
                    break;
                }
                if ((newboardarr[rowGhost + 1][columnsGhost] == " " || newboardarr[rowGhost - 1][columnsGhost] == " ")
                        && newboardarr[rowGhost][columnsGhost + 1] != "▒") {
                    break;
                }
                if (columnsGhost == 0) {
                    columnsGhost = SPACES;
                    newboardarr[rowGhost][columnsGhost] = "\033[31mG\u001B[0m";
                    newboardarr[rowGhost][columnsGhost - SPACES] = "·";
                } else if (columnsGhost == SPACES) {
                    columnsGhost = 0;

                    newboardarr[rowGhost][columnsGhost] = "\033[33mC\u001B[0m";
                    // newboardarr[rowGhost][columnGhost] = "C";
                    newboardarr[rowGhost][columnsGhost + SPACES] = "·";
                }
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        return newboardarr;
    }

    public String[][] moveUpGhost(String[][] newboardarr) {
        try {
            while (newboardarr[rowGhost - 1][columnsGhost] != "▒") {
                rowGhost--;
                if (newboardarr[rowGhost][columnsGhost] == "·") {
                    newboardarr[rowGhost + 1][columnsGhost] = "·";
                    // score += 10;
                } else {
                    newboardarr[rowGhost + 1][columnsGhost] = " ";
                    // score = score + 0;
                }
                newboardarr[rowGhost][columnsGhost] = "\033[31mG\u001B[0m";
                Thread.sleep(TIME);
                System.out.print("\033[H\033[2J");

                System.out.flush();
                board.showBoard(newboardarr, row, column);
                if ((newboardarr[rowGhost][columnsGhost + 1] == "·" || newboardarr[rowGhost][columnsGhost - 1] == "·")
                        && newboardarr[rowGhost + 1][columnsGhost] != "▒") {
                    break;
                }
                if ((newboardarr[rowGhost][columnsGhost + 1] == " " || newboardarr[rowGhost][columnsGhost - 1] == " ")
                        && newboardarr[rowGhost + 1][columnsGhost] != "▒") {
                    break;
                }
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        return newboardarr;
    }

    public int showScore() {
        int points = score;
        return points;
    }

    public static void balls(String[][] arr, int n, int m) {
        position(arr, n, m);
        if (energizer1 == eat1) {
            energizer1 = eat2;
        } else if (energizer1 == 0) {
            arr[eat1][POSITION25] = FIRST;
        }

        if (energizer2 == eat1) {
            energizer2 = eat2;
        } else if (energizer2 == 0) {
            arr[POSITION5][POSITION11] = FIRST;
        }

        if (energizer3 == eat1) {
            energizer3 = eat2;
        } else if (energizer3 == 0) {
            arr[POSITION17][POSITION11] = FIRST;
        }

        if (energizer4 == eat1) {
            energizer4 = eat2;
        } else if (energizer4 == 0) {
            arr[POSITION23][POSITION3] = FIRST;
        }

        if (energizer5 == eat1) {
            energizer5 = eat2;
        } else if (energizer5 == 0) {
            arr[POSITION23][POSITION25] = FIRST;
        }

    }
    public static void position(String[][] arr, int n, int m) {
        //1  25 |  5  11| 17 11  |23  3|  23 25
        if (arr[n][m] == arr[eat1][POSITION25]) {
            energizer1 = eat1;
        } else if (arr[n][m] == arr[POSITION5][POSITION11]) {
            energizer2 = eat1;
        } else if (arr[n][m] == arr[POSITION17][POSITION11]) {
            energizer3 = eat1;
        } else if (arr[n][m] == arr[POSITION23][POSITION3]) {
            energizer4 = eat1;
        } else if (arr[n][m] == arr[POSITION23][POSITION25]) {
            energizer5 = eat1;
        }
    }


    public static void timefruits(String[][] newboardarr, int n, int m) {
        int row1;
        int colum2;
        int row3;
        int colum4; // frutas en color verde
        if (contTimeToShowFruits >= RECHARGE4 && contTimeToShowFruits <= RECHARGE8) { // 4 recargas
            String[][] auxFruits1 = new String[ROWX][COLUMY];
            Random fruta = new Random();
            Random fruta1 = new Random();
            row1 = fruta.nextInt(auxFruits1.length); // 13
            colum2 = fruta1.nextInt(auxFruits1.length); // && newboardarr[i1][i2] != newboardarr[n][m]
            if (newboardarr[row1][colum2] != "▒" && newboardarr[row1][colum2] != " "
                    && newboardarr[row1][colum2] != "\033[34mO\u001B[0m") {
                newboardarr[row1][colum2] = "\033[35mX\u001B[0m";
            } else if (newboardarr[row1][colum2] == "▒" && newboardarr[row1][colum2] == " "
                    && newboardarr[row1][colum2] == "\033[34mO\u001B[0m") {
                String[][] auxFruits2 = new String[ROWX][COLUMY];
                Random fruta2 = new Random();
                Random fruta22 = new Random();
                row3 = fruta2.nextInt(auxFruits2.length); // 13
                colum4 = fruta22.nextInt(auxFruits2.length);
                newboardarr[row3][colum4] = "\033[35mX\u001B[0m";
            }
        } else if (contTimeToShowFruits >= RECHARGE10 && contTimeToShowFruits <= RECHARGE14) { // 4 recargas
            String[][] auxFruits1 = new String[ROWX][COLUMY];
            Random fruta = new Random();
            Random fruta1 = new Random();
            row1 = fruta.nextInt(auxFruits1.length); // 13
            colum2 = fruta1.nextInt(auxFruits1.length); // 5
            if (newboardarr[row1][colum2] != "▒" && newboardarr[row1][colum2] != " "
                    && newboardarr[row1][colum2] != "\033[34mO\u001B[0m"
                    && newboardarr[row1][colum2] != "\033[35mX\u001B[0m") {
                newboardarr[row1][colum2] = "\033[32mM\u001B[0m";
            } else if (newboardarr[row1][colum2] == "▒" && newboardarr[row1][colum2] == " "
                    && newboardarr[row1][colum2] == "\033[34mO\u001B[0m"
                    && newboardarr[row1][colum2] == "\033[35mX\u001B[0m") {
                String[][] auxFruits2 = new String[ROWX][COLUMY];
                Random fruta2 = new Random();
                Random fruta22 = new Random();
                row3 = fruta2.nextInt(auxFruits2.length);
                colum4 = fruta22.nextInt(auxFruits2.length);
                newboardarr[row3][colum4] = "\033[32mM\u001B[0m";
            }
        }
    }
}