package jalau.at18.battlecity;

public class Missile {

    private static final int BOARD_DIMENSION = 26;
    private String pointingWhere;
    private static final int[][] BOARD = new int[BOARD_DIMENSION][BOARD_DIMENSION];
    private int row1;
    private int column1;
    private int row2;
    private int column2;
//Just to test code
    /*public static void main(String[] args) throws Exception {
        Missile mainMissile = new Missile(1, 2, 2, 2, "RIGHT");
        mainMissile.showBoard();
        mainMissile.missileDirection();
    }*/
    public Missile(int xCoordinate1, int yCoordinate1, int xCoordinate2, int yCoordinate2, String direction) {
        this.row1 = xCoordinate1;
        this.column1 = yCoordinate1;
        this.row2 = xCoordinate2;
        this.column2 = yCoordinate2;
        pointingWhere = direction;
        BOARD[row1][column1] = 1;
        BOARD[row2][column2] = 1;
    }

    public void missileDirection() {
        switch (pointingWhere) {
            case "UP":
                moveMissileUp(BOARD);
                break;
            case "DOWN":
                moveMissileDown(BOARD);
                break;
            case "LEFT":
                moveMissileLeft(BOARD);
                break;
            case "RIGHT":
                shootMissileRight(BOARD);
                break;
            default:
                break;
        }

    }

    public int[][] moveMissileUp(int[][] board) {
        while (row1 > 0) {
            board[row1][column1] = 0;
            row1 = row1 - 1;
            board[row1][column1] = 1;
            board[row2][column2] = 0;
            row2 = row2 - 1;
            board[row2][column2] = 1;
            showBoard();
        }
        return BOARD;
    }
    public int[][] moveMissileDown(int[][] board) {
        while (row1 < BOARD_DIMENSION - 1) {
            board[row1][column1] = 0;
            row1 = row1 + 1;
            board[row1][column1] = 1;
            board[row2][column2] = 0;
            row2 = row2 + 1;
            board[row2][column2] = 1;
            showBoard();
        }
        return BOARD;
    }
    public int[][] moveMissileLeft(int[][] board) {
        while (column1 > 0 && board[row1][column1 - 1] == 0 && board[row2][column2 - 1] == 0) {
            board[row1][column1] = 0;
            column1 = column1 - 1;
            board[row1][column1] = 1;
            board[row2][column2] = 0;
            column2 = column2 - 1;
            board[row2][column2] = 1;
            showBoard();
        }
        return BOARD;
    }
    public int[][] shootMissileRight(int[][] board) {
        while (column1 < (BOARD_DIMENSION - 1) && board[row1][column1 + 1] == 0 && board[row2][column2 + 1] == 0) {
            board[row1][column1] = 0;
            column1 = column1 + 1;
            board[row1][column1] = 1;
            board[row2][column2] = 0;
            column2 = column2 + 1;
            board[row2][column2] = 1;
            showBoard();
        }
        return BOARD;
    }
    public void showBoard() {
        for (int row = 0; row < BOARD_DIMENSION; row++) {
            for (int column = 0; column < BOARD_DIMENSION; column++) {
                System.out.print(BOARD[row][column] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public int[][] getBoard() {
        return BOARD;
    }

}
