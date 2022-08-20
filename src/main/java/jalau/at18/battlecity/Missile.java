package jalau.at18.battlecity;

public class Missile {

    private static final int BOARD_DIMENSION = 26;
    private String pointingWhere;
    //private static final int[][] BOARD = new int[BOARD_DIMENSION][BOARD_DIMENSION];
    private int row1;
    private int column1;
    private int row2;
    private int column2;
    private Element[][] missileBoard;
    private Missiles shotMissiles = new Missiles();
    private Empty empty = new Empty();

    public Missile(int xCoordinate1, int yCoordinate1, int xCoordinate2, int yCoordinate2, String direction, Element[][] missBoard) {
        missileBoard = missBoard;
        this.row1 = xCoordinate1;
        this.column1 = yCoordinate1;
        this.row2 = xCoordinate2;
        this.column2 = yCoordinate2;
        pointingWhere = direction;
    }

    public void missileDirection() {
        switch (pointingWhere) {
            case "UP":
                moveMissileUp(missileBoard);
                break;
            case "DOWN":
                moveMissileDown(missileBoard);
                break;
            case "LEFT":
                moveMissileLeft(missileBoard);
                break;
            case "RIGHT":
                shootMissileRight(missileBoard);
                break;
            default:
                break;
        }

    }

    public Element[][] moveMissileUp(Element[][] board) {
        row1 = row1 - 1;
        row2 = row2 - 1;
        putMissileOnBoard(row1, column1, row2, column2);
        showBoard();
        while (row1 > 0  && missileBoard[row1 - 1][column1] == empty && missileBoard[row2 - 1][column2] == empty) {
            removeMissilefromBoard(row1, column1, row2, column2);
            row1 = row1 - 1;
            row2 = row2 - 1;
            putMissileOnBoard(row1, column1, row2, column2);
            showBoard();
        }
        return missileBoard;
    }
    public Element[][] moveMissileDown(Element[][] board) {
        row1 = row1 + 1;
        row2 = row2 + 1;
        putMissileOnBoard(row1, column1, row2, column2);
        showBoard();
        while (row1 < BOARD_DIMENSION - 1 && missileBoard[row1 + 1][column1] == empty && missileBoard[row2 + 1][column2] == empty) {
            removeMissilefromBoard(row1, column1, row2, column2);
            row1 = row1 + 1;
            row2 = row2 + 1;
            putMissileOnBoard(row1, column1, row2, column2);
            showBoard();
        }
        return missileBoard;
    }
    public Element[][] moveMissileLeft(Element[][] board) {
        column1 = column1 - 1;
        column2 = column2 - 1;
        putMissileOnBoard(row1, column1, row2, column2);
        showBoard();
        while (column1 > 0 && missileBoard[row1][column1 - 1] == empty && missileBoard[row2][column2 - 1] == empty) {
            column1 = column1 - 1;
            column2 = column2 - 1;
            putMissileOnBoard(row1, column1, row2, column2);
            showBoard();
        }
        return missileBoard;
    }
    public Element[][] shootMissileRight(Element[][] board) {
        column1 = column1 + 1;
        column2 = column2 + 1;
        putMissileOnBoard(row1, column1, row2, column2);
        showBoard();
        while (column1 < (BOARD_DIMENSION - 1) && board[row1][column1 + 1] == empty && board[row2][column2 + 1] == empty) {
            removeMissilefromBoard(row1, column1, row2, column2);
            column1 = column1 + 1;
            column2 = column2 + 1;
            putMissileOnBoard(row1, column1, row2, column2);
            showBoard();
        }
        return missileBoard;
    }
    public void showBoard() {
        for (int row = 0; row < BOARD_DIMENSION; row++) {
            for (int column = 0; column < BOARD_DIMENSION; column++) {
                System.out.print(missileBoard[row][column].getImage() + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public Element[][] putMissileOnBoard(int rowM1, int columnM1, int rowM2, int columnM2) {
        missileBoard[rowM1][columnM1] = shotMissiles;
        missileBoard[rowM2][columnM2] = shotMissiles;
        return missileBoard;
    }

    public Element[][] removeMissilefromBoard(int rowM1, int columnM1, int rowM2, int columnM2) {
        missileBoard[rowM1][columnM1] = empty;
        missileBoard[rowM2][columnM2] = empty;
        return missileBoard;
    }

}
