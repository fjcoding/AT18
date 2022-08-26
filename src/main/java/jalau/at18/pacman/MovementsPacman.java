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
    private static final int TOTALPOINTS = 200;
    private static int contTimeToShowFruits = 0;
    private static int score = 0;
    private static int winning = 0;
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

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
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
                ///////////////////////////////////////////////////////////////////////////////////////////
                if (breakMovesX(newboardarr, row, column)) {
                    break;
                }
                ///////////////////////////////////////////////////////////////////////////////////////////
                if (column == SPACES) {
                    newboardarr = repositionRight(newboardarr, row, column, 'C');
                }
                ////////////////////////////////////////////////////////////

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

                // break -----------------------
                if (breakMovesY(newboardarr, row, column)) {
                    break;
                }
                // break -----------------------
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
                ///////////////////////////////////////////////////////////////////////////////////////////
                if (breakMovesX(newboardarr, row, column)) {
                    break;
                }
                ///////////////////////////////////////////////////////////////////////////////////////////
                if (column == 0) {
                    newboardarr = repositionLeft(newboardarr, row, column, 'C');
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
                // break -----------------------
                if (breakMovesY(newboardarr, row, column)) {
                    break;
                }
                // break -----------------------
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

                newboardarr[rowGhost][columnsGhost - 1] = newboardarr[rowGhost][columnsGhost] == "·" ? "·" : " ";

                newboardarr[rowGhost][columnsGhost] = redColor('G');

                Thread.sleep(TIME);
                flushScreen();
                board.showBoard(newboardarr);

                contTimeToShowFruits += 1;

                ////////////////////////////////////////////////////////////
                if (breakMovesX(newboardarr, rowGhost, columnsGhost)) {
                    break;
                }
                ////////////////////////////////////////////////////////////
                if (column == SPACES) {
                    newboardarr = repositionRight(newboardarr, row, column, 'G');
                }
                ////////////////////////////////////////////////////////////

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

                newboardarr[rowGhost - 1][columnsGhost] = newboardarr[rowGhost][columnsGhost] == "·" ? "·" : " ";

                newboardarr[rowGhost][columnsGhost] = redColor('G');
                Thread.sleep(TIME);
                flushScreen();
                board.showBoard(newboardarr);
                ////////////////////////////////////////////////////////////
                if (breakMovesY(newboardarr, rowGhost, columnsGhost)) {
                    break;
                }
                ////////////////////////////////////////////////////////////
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

                newboardarr[rowGhost][columnsGhost + 1] = newboardarr[rowGhost][columnsGhost] == "·" ? "·" : " ";
                newboardarr[rowGhost][columnsGhost] = redColor('G');

                Thread.sleep(TIME);

                flushScreen();
                board.showBoard(newboardarr);
                ////////////////////////////////////////////////////////////
                if (breakMovesX(newboardarr, rowGhost, columnsGhost)) {
                    break;
                }
                ////////////////////////////////////////////////////////////
                if (column == 0) {
                    newboardarr = repositionLeft(newboardarr, row, column, 'G');
                }
                ////////////////////////////////////////////////////////////

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

                newboardarr[rowGhost + 1][columnsGhost] = newboardarr[rowGhost][columnsGhost] == "·" ? "·" : " ";

                newboardarr[rowGhost][columnsGhost] = "\033[31mG\u001B[0m";
                Thread.sleep(TIME);
                flushScreen();
                board.showBoard(newboardarr);
                ////////////////////////////////////////////////////////////
                if (breakMovesY(newboardarr, rowGhost, columnsGhost)) {
                    break;
                }
                ////////////////////////////////////////////////////////////
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

            // Random fruta1
            row1 = getRandom(ROWX); // 13
            colum2 = getRandom(COLUMY); // 13

            if (newboardarr[row1][colum2] != "▒" && newboardarr[row1][colum2] != " "
                    && newboardarr[row1][colum2] != blueColor('O')) {

                newboardarr[row1][colum2] = pinkColor('X');
            } else if (newboardarr[row1][colum2] == "▒" && newboardarr[row1][colum2] == " "
                    && newboardarr[row1][colum2] == blueColor('O')) {

                // Random fruta2
                row3 = getRandom(ROWX); // 13
                colum4 = getRandom(COLUMY); // 13

                newboardarr[row3][colum4] = pinkColor('X');
            }
        } else if (contTimeToShowFruits >= RECHARGE10 && contTimeToShowFruits <= RECHARGE14) { // 4 recargas
            // Random fruta1
            row1 = getRandom(ROWX); // 13
            colum2 = getRandom(COLUMY); // 5

            if (newboardarr[row1][colum2] != "▒" && newboardarr[row1][colum2] != " "
                    && newboardarr[row1][colum2] != pinkColor('X')
                    && newboardarr[row1][colum2] != pinkColor('X')) {
                newboardarr[row1][colum2] = greenColor('M');
            } else if (newboardarr[row1][colum2] == "▒" && newboardarr[row1][colum2] == " "
                    && newboardarr[row1][colum2] == blueColor('O')
                    && newboardarr[row1][colum2] == pinkColor('X')) {

                // Random fruta2
                row3 = getRandom(ROWX);
                colum4 = getRandom(COLUMY);

                newboardarr[row3][colum4] = greenColor('M');
            }
        }
    }

    // ->>>>>>>>>>>>>>>>>>>>>> New Functions <<<<<<<<<<<<<<<<<<<<<<<<<-
    public void flushScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static int getRandom(int auxFruit) {
        Random fruit = new Random();
        int number = fruit.nextInt(auxFruit);
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
            // wining
            winning += 1;
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

    public int showWining() {
        int pointsfinal = winning;
        if (pointsfinal >= TOTALPOINTS) {
            System.out.println("YOU WIN!!!");
            System.exit(0);
        }
        return pointsfinal;
    }

    public static boolean breakMovesX(String[][] newboardarr, int rowB, int columnB) {
        if (newboardarr[rowB + 1][columnB] != "▒" || newboardarr[rowB - 1][columnB] != "▒") {
            return true;
        }
        return false;
    }

    public static boolean breakMovesY(String[][] newboardarr, int rowB, int columnB) {
        if (newboardarr[rowB][columnB + 1] != "▒" || newboardarr[rowB][columnB - 1] != "▒") {
            return true;
        }
        return false;
    }

    public static String[][] repositionLeft(String[][] newboardarr, int rowB, int columnB, char element) {
        columnB = SPACES;
        if (element == 'G') {
            newboardarr[rowB][columnB] = redColor('G');
            newboardarr[rowB][columnB - SPACES] = "·";
        }
        if (element == 'C') {
            newboardarr[rowB][columnB] = yellowColor('C');
            newboardarr[rowB][columnB - SPACES] = " ";
        }
        return newboardarr;
    }

    public static String[][] repositionRight(String[][] newboardarr, int rowB, int columnB, char element) {
        columnB = 0;
        if (element == 'G') {
            newboardarr[rowB][columnB] = redColor('G');
            newboardarr[rowB][columnB + SPACES] = "·";
        }
        if (element == 'C') {
            newboardarr[rowB][columnB] = yellowColor('C');
            newboardarr[rowB][columnB + SPACES] = " ";
        }
        return newboardarr;
    }

}