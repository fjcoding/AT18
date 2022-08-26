package jalau.at18.battlecity;

public class Tank {

    protected String direction;
    public static final int GRID_LENGHT = 26;
    public static final int POSITIONS_LENGTH = 4;
    public static final int SIZE_ROW_POSITION = 4;
    protected int[][] position;

    // public Element[][] putTankOnBoard(Element[][] matrix, int[][] newPosition) {
    // TankTop tankTop = new TankTop();
    // TankBack backTop = new TankBack();
    // matrix[newPosition[0][0]][newPosition[0][1]] = tankTop;
    // matrix[newPosition[1][0]][newPosition[1][1]] = tankTop;
    // matrix[newPosition[2][0]][newPosition[2][1]] = backTop;
    // matrix[newPosition[POSITIONS_LENGTH - 1][0]][newPosition[POSITIONS_LENGTH -
    // 1][1]] = backTop;
    // return matrix;
    // }

    public int[][] getPosition() {
        return position;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String newDirection) {
        direction = newDirection;
    }

    public void setPosition(int[][] newPosition) {
        position = newPosition;
    }

    /*
     * public Element[][] shoot(Element[][] boardElements) {
     * Missile missil = new Missile(position[0][0], position[0][1], position[1][0],
     * position[1][1], direction, boardElements);
     * return missil.missileDirection();
     * }
     */
    public int[][] moveUp(int[][] newPosition) {
        newPosition = arrangeUp(newPosition);
        direction = "UP";
        if (newPosition[0][0] != 0) {
            for (int row = 0; row < POSITIONS_LENGTH; row++) {
                newPosition[row][0] = newPosition[row][0] - 1;
            }
        }
        return newPosition;
    }

    public int[][] moveDown(int[][] newPosition) {
        newPosition = arrangeDown(newPosition);
        direction = "DOWN";
        if (newPosition[0][0] != GRID_LENGHT - 1) {
            for (int row = 0; row < POSITIONS_LENGTH; row++) {
                newPosition[row][0] = newPosition[row][0] + 1;
            }
        }
        return newPosition;
    }

    public int[][] moveLeft(int[][] newPosition) {
        newPosition = arrangeLeft(newPosition);
        direction = "LEFT";
        if (newPosition[0][1] != 0) {
            for (int row = 0; row < POSITIONS_LENGTH; row++) {
                newPosition[row][1] = newPosition[row][1] - 1;
            }
        }
        return newPosition;
    }

    public int[][] moveRight(int[][] newPosition) {
        newPosition = arrangeRight(newPosition);
        direction = "RIGHT";
        if (newPosition[0][1] != GRID_LENGHT - 1) {
            for (int row = 0; row < POSITIONS_LENGTH; row++) {
                newPosition[row][1] = newPosition[row][1] + 1;
            }
        }
        return newPosition;
    }

    public int[][] arrangeUp(int[][] newPosition) {
        int[][] minMaxValues = findMinMaxValues(newPosition);
        int minRow = minMaxValues[0][0];
        int maxRow = minMaxValues[1][0];
        int minColumn = minMaxValues[0][1];
        int maxColumn = minMaxValues[1][1];
        int[][] arrangePosition = {{minRow, minColumn}, {minRow, maxColumn}, {maxRow, minColumn}, {maxRow, maxColumn}};
        return arrangePosition;
    }

    public int[][] arrangeDown(int[][] newPosition) {
        int[][] minMaxValues = findMinMaxValues(newPosition);
        int minRow = minMaxValues[0][0];
        int maxRow = minMaxValues[1][0];
        int minColumn = minMaxValues[0][1];
        int maxColumn = minMaxValues[1][1];
        int[][] arrangePosition = {{maxRow, maxColumn}, {maxRow, minColumn}, {minRow, maxColumn}, {minRow, minColumn}};
        return arrangePosition;
    }

    public int[][] arrangeLeft(int[][] newPosition) {
        int[][] minMaxValues = findMinMaxValues(newPosition);
        int minRow = minMaxValues[0][0];
        int maxRow = minMaxValues[1][0];
        int minColumn = minMaxValues[0][1];
        int maxColumn = minMaxValues[1][1];
        int[][] arrangePosition = {{maxRow, minColumn}, {minRow, minColumn}, {maxRow, maxColumn}, {minRow, maxColumn}};
        return arrangePosition;
    }

    public int[][] arrangeRight(int[][] newPosition) {
        int[][] minMaxValues = findMinMaxValues(newPosition);
        int minRow = minMaxValues[0][0];
        int maxRow = minMaxValues[1][0];
        int minColumn = minMaxValues[0][1];
        int maxColumn = minMaxValues[1][1];
        int[][] arrangePosition = {{minRow, maxColumn}, {maxRow, maxColumn}, {minRow, minColumn}, {maxRow, minColumn}};
        return arrangePosition;
    }

    public int[][] findMinMaxValues(int[][] newPosition) {
        int minRow = GRID_LENGHT;
        int maxRow = -1;
        int minColumn = GRID_LENGHT;
        int maxColumn = -1;
        for (int row = 0; row < POSITIONS_LENGTH; row++) {
            if (newPosition[row][0] > maxRow) {
                maxRow = newPosition[row][0];
            }
            if (newPosition[row][0] < minRow) {
                minRow = newPosition[row][0];
            }
            if (newPosition[row][1] > maxColumn) {
                maxColumn = newPosition[row][1];
            }
            if (newPosition[row][1] < minColumn) {
                minColumn = newPosition[row][1];
            }
        }
        int[][] minMaxValues = {{minRow, minColumn}, {maxRow, maxColumn}};
        return minMaxValues;
    }

    public Boolean isTankCrash(Element[][] boardMatrix) {
        Boolean isTankCrash = false;
        // int[][] position = tank.getPosition();
        if (direction == "UP") {
            isTankCrash = isTankCrashUp(boardMatrix);
        }
        if (direction == "DOWN") {
            isTankCrash = isTankCrashDown(boardMatrix);
        }
        if (direction == "LEFT") {
            isTankCrash = isTankCrashLeft(boardMatrix);
        }
        if (direction == "RIGHT") {
            isTankCrash = isTankCrashRight(boardMatrix);
        }
        return isTankCrash;
    }

    public Boolean isTankCrashUp(Element[][] boardMatrix) {
        Boolean isTankCrashUp = false;
        // int[][] position = enemyTank.getPosition();
        position = arrangeUp(position);
        if (position[0][0] == 0) {
            isTankCrashUp = true;
        } else {
            Boolean elementUp1 = boardMatrix[position[0][0] - 1][position[0][1]].isBlockTank();
            Boolean elementUp2 = boardMatrix[position[1][0] - 1][position[1][1]].isBlockTank();
            if (elementUp1 || elementUp2) {
                isTankCrashUp = true;
            }
        }
        return isTankCrashUp;
    }

    public Boolean isTankCrashDown(Element[][] boardMatrix) {
        Boolean isTankCrashDown = false;
        // int[][] position = enemyTank.getPosition();
        position = arrangeDown(position);
        if (position[0][0] == GRID_LENGHT - 1) {
            isTankCrashDown = true;
        } else {
            Boolean elementDown1 = boardMatrix[position[0][0] + 1][position[0][1]].isBlockTank();
            Boolean elementDown2 = boardMatrix[position[1][0] + 1][position[1][1]].isBlockTank();
            if (elementDown1 || elementDown2) {
                isTankCrashDown = true;
            }
        }
        return isTankCrashDown;
    }

    public Boolean isTankCrashLeft(Element[][] boardMatrix) {
        Boolean isTankCrashLeft = false;
        // int[][] position = enemyTank.getPosition();
        position = arrangeLeft(position);
        if (position[0][1] == 0) {
            isTankCrashLeft = true;
        } else {
            Boolean elementLeft1 = boardMatrix[position[0][0]][position[0][1] - 1].isBlockTank();
            Boolean elementLeft2 = boardMatrix[position[1][0]][position[1][1] - 1].isBlockTank();
            if (elementLeft1 || elementLeft2) {
                isTankCrashLeft = true;
            }
        }
        return isTankCrashLeft;
    }

    public Boolean isTankCrashRight(Element[][] boardMatrix) {
        Boolean isTankCrashRight = false;
        // int[][] position = enemyTank.getPosition();
        position = arrangeRight(position);
        if (position[0][1] == GRID_LENGHT - 1) {
            isTankCrashRight = true;
        } else {
            Boolean elementRight1 = boardMatrix[position[0][0]][position[0][1] + 1].isBlockTank();
            Boolean elementRight2 = boardMatrix[position[1][0]][position[1][1] + 1].isBlockTank();
            if (elementRight1 || elementRight2) {
                isTankCrashRight = true;
            }
        }
        return isTankCrashRight;
    }

    public void cleanPosition(Element[][] elementsMatrix, int[][] cleanedPosition) {
        Empty empty = new Empty();
        elementsMatrix[cleanedPosition[0][0]][cleanedPosition[0][1]] = empty;
        elementsMatrix[cleanedPosition[1][0]][cleanedPosition[1][1]] = empty;
        elementsMatrix[cleanedPosition[2][0]][cleanedPosition[2][1]] = empty;
        elementsMatrix[cleanedPosition[SIZE_ROW_POSITION - 1][0]][cleanedPosition[SIZE_ROW_POSITION - 1][1]] = empty;
    }
}
