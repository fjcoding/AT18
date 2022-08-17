package jalau.at18.battlecity;

public class Missile {

    
    private final int BOARD_DIMENSION = 5;
    private final String POINTING_WHERE = "LEFT";
    private int[][] BOARD = new int[5][5];
    private int row;
    private int column;
//Just to test code
    public static void main(String [] args) throws Exception {
        Missile mainMissile = new Missile();
        mainMissile.createMissile(1, 3);
        mainMissile.showBoard();
        mainMissile.missileDirection();
    }
    public Missile(){


    }

    public void createMissile(int xCoordinate, int yCoordinate){
        this.row = xCoordinate;
        this.column = yCoordinate;
        BOARD[row][column] = 1;
        
    }

    public void missileDirection(){
        switch (POINTING_WHERE) {
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
                moveMissileRight(BOARD);
                break;
            default:
                break;
        }

    }

    public void moveMissileUp(int [][] board) {

    }
    public void moveMissileDown(int [][] board) {

    }
    public void moveMissileLeft(int [][] board) {
        while (column >= 0) {
            BOARD[row][column] = 0;
            column = column - 1;
            BOARD[row][column] = 1;
            showBoard();
        }

    }
    public void moveMissileRight(int [][] board) {
        while (column < BOARD_DIMENSION) {
            BOARD[row][column] = 0;
            column = column + 1;
            BOARD[row][column] = 1;
            showBoard();
        }
        
    }
    public void showBoard() {
        for (int row = 0; row < 5; row++) {
            for (int column = 0; column < 5; column++) {
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
