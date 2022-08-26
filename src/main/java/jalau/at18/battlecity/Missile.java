package jalau.at18.battlecity;

//import java.io.LineNumberInputStream;

public class Missile {

    private static final int BOARD_DIMENSION = 26;
    protected String pointingWhere = "UP";
    //private static final int[][] BOARD = new int[BOARD_DIMENSION][BOARD_DIMENSION];
    private int row1;
    private int column1;
    private int row2;
    private int column2;
    private static Element[][] missileBoard;
    private static Missiles shotMissiles = new Missiles();
    private static Empty empty = new Empty();
    private MissileCollision missileCollision = new MissileCollision();
    protected boolean isCollition = false;
    public Missile() {

    }
    public void setPosition(int newRow1, int newColumn1, int newRow2, int newColumn2) {
        if (pointingWhere == "UP" && row1 != 0) {
            this.row1 = newRow1 - 1;
            this.row2 = newRow2 - 1;
            this.column1 = newColumn1;
            this.column2 = newColumn2;
        }
        if (pointingWhere == "DOWN" && row1 != BOARD_DIMENSION - 1) {
            this.row1 = newRow1 + 1;
            this.row2 = newRow2 + 1;
            this.column1 = newColumn1;
            this.column2 = newColumn2;
        }
        if (pointingWhere == "LEFT" && column1 != 0) {
            this.column1 = newColumn1 - 1;
            this.column2 = newColumn2 - 1;
            this.row1 = newRow1;
            this.row2 = newRow2;
        }
        if (pointingWhere == "RIGHT" && column1 != BOARD_DIMENSION - 1) {
            this.column1 = newColumn1 + 1;
            this.column2 = newColumn2 + 1;
            this.row1 = newRow1;
            this.row2 = newRow2;
        }
    }
    public void setDirection(String direction) {
        this.pointingWhere = direction;
    }
    public int[][] getPosition() {
        int[][] position = {{row1, column1}, {row2, column2}};
        return position;
    }
    public void setBoard(Element[][] board) {
        missileBoard = board;
    }
    public boolean isMissilCrash() {
        Boolean isCrash = false;
        if (pointingWhere == "UP" && row1 == 0) {
            isCrash = true;
        }
        if (pointingWhere == "DOWN" && row1 == BOARD_DIMENSION - 1) {
            isCrash = true;
        }
        if (pointingWhere == "LEFT" && column1 == 0) {
            isCrash = true;
        }
        if (pointingWhere == "RIGHT" && column1 == BOARD_DIMENSION - 1) {
            isCrash = true;
        }
        return isCrash;
    }
    public boolean isCollition() {
        Boolean isCrash = missileCollision.isElementHit(missileBoard, row1, column1, row2, column2);
        return isCrash;
    }
    /*public Element[][] moveMissile(Element[][] elementsMatrix) {
        //removeMissilefromBoard(row1, column1, row2, column2);
        missileDirection();
        elementsMatrix = putMissileOnBoard(row1, column1, row2, column2);
        return elementsMatrix;
    }*/
    public void setIsCollition(boolean newIsCollition) {
        this.isCollition = newIsCollition;
    }
    public boolean getIsCollition() {
        return isCollition;
    }
    public void missileDirection() {
        switch (pointingWhere) {
            case "UP":
                moveMissileUp();
                break;
            case "DOWN":
                moveMissileDown();
                break;
            case "LEFT":
                moveMissileLeft();
                break;
            case "RIGHT":
                moveMissileRight();
                break;
            default:
                break;
        }
        //return missileBoard;
    }

    public int[][] moveMissileUp() {
        if (row1 > 0) {
            row1 = row1 - 1;
            row2 = row2 - 1;
            isCollition = false;
            if (missileCollision.isElementHit(missileBoard, row1, column1, row2, column2)) {
                isCollition = true;
                row1 = row1 + 1;
                row2 = row2 + 1;
            }
        }
        int[][] newPos = {{row1, column1}, {row2, column2}};
        return newPos;
    }

    public int[][] moveMissileDown() {
        if (row1 < BOARD_DIMENSION - 1) {
            row1 = row1 + 1;
            row2 = row2 + 1;
            isCollition = false;
            if (missileCollision.isElementHit(missileBoard, row1, column1, row2, column2)) {
                isCollition = true;
                row1 = row1 - 1;
                row2 = row2 - 1;
            }
        }
        int[][] newPos = {{row1, column1}, {row2, column2}};
        return newPos;
    }

    public int[][] moveMissileLeft() {
        if (column1 > 0) {
            column1 = column1 - 1;
            column2 = column2 - 1;
            isCollition = false;
            if (missileCollision.isElementHit(missileBoard, row1, column1, row2, column2)) {
                isCollition = true;
                column1 = column1 + 1;
                column2 = column2 + 1;
            }
        }
        int[][] newPos = {{row1, column1}, {row2, column2}};
        return newPos;
    }

    public int[][] moveMissileRight() {
        if (column1 < BOARD_DIMENSION - 1) {
            column1 = column1 + 1;
            column2 = column2 + 1;
            isCollition = false;
            if (missileCollision.isElementHit(missileBoard, row1, column1, row2, column2)) {
                isCollition = true;
                column1 = column1 - 1;
                column2 = column2 - 1;
            }
        }
        int[][] newPos = {{row1, column1}, {row2, column2}};
        return newPos;
    }

    /*public void showBoard() {
        for (int row = 0; row < BOARD_DIMENSION; row++) {
            for (int column = 0; column < BOARD_DIMENSION; column++) {
                System.out.print(missileBoard[row][column].getImage() + " ");
            }
            System.out.println();
        }
        System.out.println();
    }*/

    public Element[][] putMissileOnBoard(Element[][] newMissileBoard, int[][] missilePosition) {
        newMissileBoard[missilePosition[0][0]][missilePosition[0][1]] = shotMissiles;
        newMissileBoard[missilePosition[1][0]][missilePosition[1][1]] = shotMissiles;
        return newMissileBoard;
    }

    public Element[][] removeMissilefromBoard(Element[][] newMissileBoard, int[][] missilePosition) {
        newMissileBoard[missilePosition[0][0]][missilePosition[0][1]] = empty;
        newMissileBoard[missilePosition[1][0]][missilePosition[1][1]] = empty;
        return newMissileBoard;
    }

}
