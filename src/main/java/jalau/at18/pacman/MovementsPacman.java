package jalau.at18.pacman;

import java.util.Random;
import java.util.Arrays;
import java.util.List;

public class MovementsPacman {
    private int rowGhostInitial1;
    private int columnsGhostIntial1;
    private int rowGhostInitial2;
    private int columnsGhostIntial2;
    private int rowGhostInitial3;
    private int columnsGhostIntial3;
    private int rowGhostInitial4;
    private int columnsGhostIntial4;
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
    public static final String FIRST = blueColor('O');
    private static final int POSITION5 = 5;
    private static final int POSITION25 = 25;
    private static final int POSITION3 = 3;
    private static final int POSITION23 = 23;
    private static final int POSITION11 = 11;
    private static final int POSITION17 = 17;

    private Board board = new Board();
    private String[][] newboardarr = board.getGameBoard();

    public void setRowGhost1(int rowForGhost) {
        this.rowGhostInitial1 = rowForGhost;
    }

    public int getRowGhost1() {
        return this.rowGhostInitial1;
    }

    public void setColumnGhost1(int columnForGhost) {
        this.columnsGhostIntial1 = columnForGhost;
    }

    public int getColumnGhost1() {
        return this.columnsGhostIntial1;
    }

    public void setRowGhost2(int rowForGhost) {
        this.rowGhostInitial2 = rowForGhost;
    }

    public int getRowGhost2() {
        return this.rowGhostInitial2;
    }

    public void setColumnGhost2(int columnForGhost) {
        this.columnsGhostIntial2 = columnForGhost;
    }

    public int getColumnGhost2() {
        return this.columnsGhostIntial2;
    }

    public void setRowGhost3(int rowForGhost) {
        this.rowGhostInitial3 = rowForGhost;
    }

    public int getRowGhost3() {
        return this.rowGhostInitial3;
    }

    public void setColumnGhost3(int columnForGhost) {
        this.columnsGhostIntial3 = columnForGhost;
    }

    public int getColumnGhost3() {
        return this.columnsGhostIntial3;
    }

    public void setRowGhost4(int rowForGhost) {
        this.rowGhostInitial4 = rowForGhost;
    }

    public int getRowGhost4() {
        return this.rowGhostInitial4;
    }

    public void setColumnGhost4(int columnForGhost) {
        this.columnsGhostIntial4 = columnForGhost;
    }

    public int getColumnGhost4() {
        return this.columnsGhostIntial4;
    }

    public int getNewColumn(int obtainColumn) {
        int newColumn = obtainColumn;
        return newColumn;
    }

    public int getNewRow(int obtainRow) {
        int newRow = obtainRow;
        return newRow;
    }

    public String[][] moveRight() {
        try {
            while (newboardarr[row][column + 1] != "▒") {
                column++;
                position(newboardarr, row, column);
                balls(newboardarr, row, column);
                timefruits(newboardarr, row, column);

                // --------------- New Function Score -------------------
                updateScore(newboardarr[row][column]);
                newboardarr[row][column - 1] = " ";
                // --------------- New Function Score -------------------

                newboardarr[row][column] = yellowColor('C');
                Thread.sleep(TIME);
                flushScreen();

                board.showBoard(newboardarr);

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
                    newboardarr[row][column] = yellowColor('C');
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

                // --------------- New Function Score -------------------
                updateScore(newboardarr[row][column]);
                newboardarr[row - 1][column] = " ";
                // --------------- New Function Score -------------------

                newboardarr[row][column] = yellowColor('C');
                Thread.sleep(TIME);
                flushScreen();
                board.showBoard(newboardarr);
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

                // --------------- New Function Score -------------------
                updateScore(newboardarr[row][column]);
                newboardarr[row][column + 1] = " ";
                // --------------- New Function Score -------------------

                newboardarr[row][column] = yellowColor('C');
                // newboardarr[row][column] = "C";
                Thread.sleep(TIME);

                flushScreen();

                board.showBoard(newboardarr);
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
                    newboardarr[row][column] = yellowColor('C');
                    // newboardarr[row][column] = "C";
                    newboardarr[row][column - SPACES] = " ";
                } else if (column == SPACES) {
                    column = 0;
                    newboardarr[row][column] = yellowColor('C');
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

                // --------------- New Function Score -------------------
                updateScore(newboardarr[row + 1][column]);
                newboardarr[row + 1][column] = " ";
                // --------------- New Function Score -------------------

                newboardarr[row][column] = yellowColor('C');
                // newboardarr[row][column] = "C";
                Thread.sleep(TIME);
                flushScreen();
                board.showBoard(newboardarr);
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

    public List<Object> moveRightGhost(String[][] newboardarr, int rowGhost, int columnsGhost) {
        try {

            while (newboardarr[rowGhost][columnsGhost + 1] != "▒") {
                columnsGhost++;
                if (newboardarr[rowGhost][columnsGhost] == "·") {
                    newboardarr[rowGhost][columnsGhost - 1] = "·";
                } else {
                    newboardarr[rowGhost][columnsGhost - 1] = " ";
                }
                newboardarr[rowGhost][columnsGhost] = redColor('G');

                Thread.sleep(TIME);
                flushScreen();
                board.showBoard(newboardarr);

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
                    newboardarr[rowGhost][columnsGhost] = redColor('G');
                    newboardarr[rowGhost][columnsGhost - SPACES] = "·";
                } else if (columnsGhost == SPACES) {
                    columnsGhost = 0;
                    newboardarr[rowGhost][columnsGhost] = redColor('G');
                    newboardarr[rowGhost][columnsGhost + SPACES] = "·";
                }
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        int newRowGhost = getNewRow(rowGhost);
        int newColumnGhost = getNewColumn(columnsGhost);
        return Arrays.asList(newboardarr, newRowGhost, newColumnGhost);
    }

    public List<Object> moveDownGhost(String[][] newboardarr, int rowGhost, int columnsGhost) {
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

                newboardarr[rowGhost][columnsGhost] = redColor('G');
                Thread.sleep(TIME);
                flushScreen();
                board.showBoard(newboardarr);
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
        int newRowGhost = getNewRow(rowGhost);
        int newColumnGhost = getNewColumn(columnsGhost);
        return Arrays.asList(newboardarr, newRowGhost, newColumnGhost);
    }

    public List<Object> moveLeftGhost(String[][] newboardarr, int rowGhost, int columnsGhost) {
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
                newboardarr[rowGhost][columnsGhost] = redColor('G');
                Thread.sleep(TIME);

                flushScreen();
                board.showBoard(newboardarr);
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
                    newboardarr[rowGhost][columnsGhost] = redColor('G');
                    newboardarr[rowGhost][columnsGhost - SPACES] = "·";
                } else if (columnsGhost == SPACES) {
                    columnsGhost = 0;

                    newboardarr[rowGhost][columnsGhost] = yellowColor('C');
                    // newboardarr[rowGhost][columnGhost] = "C";
                    newboardarr[rowGhost][columnsGhost + SPACES] = "·";
                }
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        int newRowGhost = getNewRow(rowGhost);
        int newColumnGhost = getNewColumn(columnsGhost);
        return Arrays.asList(newboardarr, newRowGhost, newColumnGhost);
    }

    public List<Object> moveUpGhost(String[][] newboardarr, int rowGhost, int columnsGhost) {
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
                flushScreen();
                board.showBoard(newboardarr);
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
        int newRowGhost = getNewRow(rowGhost);
        int newColumnGhost = getNewColumn(columnsGhost);
        return Arrays.asList(newboardarr, newRowGhost, newColumnGhost);
    }

    public int showScore() {
        int points = score;
        return points;
    }

    public static void balls(String[][] arr, int n, int m) {
        position(arr, n, m);

        if (energizer1 == eat1) {
            energizer1 = eat2; // <---------- Why ?
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
        // 1 25 | 5 11| 17 11 |23 3| 23 25
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

            String[][] auxFruits1 = new String[ROWX][COLUMY];// <---------- Length ?

            // Random fruta1
            row1 = getRandom(auxFruits1); // 13
            colum2 = getRandom(auxFruits1); // 13

            if (newboardarr[row1][colum2] != "▒" && newboardarr[row1][colum2] != " "
                    && newboardarr[row1][colum2] != blueColor('O')) {

                newboardarr[row1][colum2] = pinkColor('X');
            } else if (newboardarr[row1][colum2] == "▒" && newboardarr[row1][colum2] == " "
                    && newboardarr[row1][colum2] == blueColor('O')) {

                String[][] auxFruits2 = new String[ROWX][COLUMY];

                // Random fruta2
                row3 = getRandom(auxFruits2); // 13
                colum4 = getRandom(auxFruits2); // 13

                newboardarr[row3][colum4] = pinkColor('X');
            }
        } else if (contTimeToShowFruits >= RECHARGE10 && contTimeToShowFruits <= RECHARGE14) { // 4 recargas
            String[][] auxFruits1 = new String[ROWX][COLUMY];
            // Random fruta1
            row1 = getRandom(auxFruits1); // 13
            colum2 = getRandom(auxFruits1); // 5

            if (newboardarr[row1][colum2] != "▒" && newboardarr[row1][colum2] != " "
                    && newboardarr[row1][colum2] != pinkColor('X')
                    && newboardarr[row1][colum2] != pinkColor('X')) {
                newboardarr[row1][colum2] = greenColor('M');
            } else if (newboardarr[row1][colum2] == "▒" && newboardarr[row1][colum2] == " "
                    && newboardarr[row1][colum2] == blueColor('O')
                    && newboardarr[row1][colum2] == pinkColor('X')) {

                String[][] auxFruits2 = new String[ROWX][COLUMY];
                // Random fruta2
                row3 = getRandom(auxFruits2);
                colum4 = getRandom(auxFruits2);

                newboardarr[row3][colum4] = greenColor('M');
            }
        }
    }

    // ->>>>>>>>>>>>>>>>>>>>>> New Functions <<<<<<<<<<<<<<<<<<<<<<<<<-
    public void flushScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static int getRandom(String[][] auxFruit) {
        Random fruit = new Random();
        int number = fruit.nextInt(auxFruit.length);
        return number;
    }

    public static String pinkColor(char character) {
        return "\033[35m" + character + "\u001B[0m";
    }

    public static String blueColor(char character) {
        return "\033[34m" + character + "\u001B[0m";
    }

    public static String greenColor(char character) {
        return "\033[32m" + character + "\u001B[0m";
    }

    public static String yellowColor(char character) {
        return "\033[33m" + character + "\u001B[0m";
    }

    public static String redColor(char character) {
        return "\033[31m" + character + "\u001B[0m";
    }

    public static void updateScore(String value) {
        if (value == "·") {
            score += SCOREBALL;
        }
        if (value == blueColor('O')) {
            score += POWERBALL;
        }
        if (value == pinkColor('X')) {
            score += FRUIT1;
        }
        if (value == greenColor('M')) {
            score += FRUIT2;
        }
        if (value == " ") {
            score += 0;
        }

    }
    // --------------- New Function Score -------------------
    // if (newboardarr[row][column] == "·") {
    // newboardarr[row + 1][column] = " ";
    // score += SCOREBALL;
    // }
    // if (newboardarr[row][column] == blueColor('O')) {
    // newboardarr[row + 1][column] = " ";
    // score = score + POWERBALL;
    // } else if (newboardarr[row][column] == pinkColor('X')) {
    // newboardarr[row + 1][column] = " ";
    // score = score + FRUIT1;
    // } else if (newboardarr[row][column] == greenColor('M')) {
    // newboardarr[row + 1][column] = " ";
    // score = score + FRUIT2;
    // } else {
    // newboardarr[row + 1][column] = " ";
    // score = score + 0;
    // }
    // --------------- New Function Score -------------------

}