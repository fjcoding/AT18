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
    public static final int RECHARGE1 = 4;
    public static final int RECHARGE2 = 8;
    public static final int RECHARGE3 = 10;
    public static final int RECHARGE4 = 14;
    public static final int ROWX = 25;
    public static final int COLUMY = 29;
    public static final int SPACES = 28;
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

    public List<Object> moveRightGhost(String[][] newboardarr, int rowGhost, int columnsGhost) {
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
        int newRowGhost = getNewRow(rowGhost);
        int newColumnGhost = getNewColumn(columnsGhost);
        return Arrays.asList(newboardarr, newRowGhost, newColumnGhost);
    }

    public int showScore() {
        int points = score;
        return points;
    }

    public static void timefruits(String[][] newboardarr, int n, int m) {
        int row1;
        int colum2;
        int row3;
        int colum4; // frutas en color verde
        if (contTimeToShowFruits >= RECHARGE1 && contTimeToShowFruits <= RECHARGE2) { // 4 recargas
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
        } else if (contTimeToShowFruits >= RECHARGE3 && contTimeToShowFruits <= RECHARGE4) { // 4 recargas
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