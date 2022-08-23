package jalau.at18.battlecity;

public class Tank {

    public String direction;
    public static final int GRID_LENGHT = 26;
    public static final int POSITIONS_LENGTH = 4;
    public static final int SIZE_ROW_POSITION = 4;
    public int[][] position;

    public Element[][] putTankOnBoard(Element[][] matrix, int[][] position) {
        TankTop tankTop = new TankTop();
        TankBack backTop = new TankBack();
        matrix[position[0][0]][position[0][1]] = tankTop;
        matrix[position[1][0]][position[1][1]] = tankTop;
        matrix[position[2][0]][position[2][1]] = backTop;
        matrix[position[POSITIONS_LENGTH - 1][0]][position[POSITIONS_LENGTH - 1][1]] = backTop;

        return matrix;
    }
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
    
    public Element[][] shoot(Element[][] boardElements) {
        Missile missil = new Missile(position[0][0], position[0][1], position[1][0], position[1][1], direction, boardElements);
        return missil.missileDirection();
    }
    public int[][] moveUp(int[][] position) {
        int[][] newPosition = arrangeUp(position);
        direction = "UP";
        if (newPosition[0][0] != 0) {
            for (int row = 0; row < POSITIONS_LENGTH; row++) {
                newPosition[row][0] = newPosition[row][0] - 1;
            }
        }
        return newPosition;
    }

    public int[][] moveDown(int[][] position) {
        int[][] newPosition = arrangeDown(position);
        direction = "DOWN";
        if (newPosition[0][0] != GRID_LENGHT - 1) {
            for (int row = 0; row < POSITIONS_LENGTH; row++) {
                newPosition[row][0] = newPosition[row][0] + 1;
            }
        }
        return newPosition;
    }

    public int[][] moveLeft(int[][] position) {
        int[][] newPosition = arrangeLeft(position);
        direction = "LEFT";
        if (newPosition[0][1] != 0) {
            for (int row = 0; row < POSITIONS_LENGTH; row++) {
                newPosition[row][1] = newPosition[row][1] - 1;
            }
        }
        return newPosition;
    }

    public int[][] moveRight(int[][] position) {
        int[][] newPosition = arrangeRight(position);
        direction = "RIGHT";
        if (newPosition[0][1] != GRID_LENGHT - 1) {
            for (int row = 0; row < POSITIONS_LENGTH; row++) {
                newPosition[row][1] = newPosition[row][1] + 1;
            }
        }
        return newPosition;
    }

    public int[][] arrangeUp(int[][] position) {
        int[][] minMaxValues = findMinMaxValues(position);
        int minRow = minMaxValues[0][0];
        int maxRow = minMaxValues[1][0];
        int minColumn = minMaxValues[0][1];
        int maxColumn = minMaxValues[1][1];
        int[][] arrangePosition = {{minRow, minColumn}, {minRow, maxColumn}, {maxRow, minColumn}, {maxRow, maxColumn}};
        return arrangePosition;
    }

    public int[][] arrangeDown(int[][] position) {
        int[][] minMaxValues = findMinMaxValues(position);
        int minRow = minMaxValues[0][0];
        int maxRow = minMaxValues[1][0];
        int minColumn = minMaxValues[0][1];
        int maxColumn = minMaxValues[1][1];
        int[][] arrangePosition = {{maxRow, maxColumn}, {maxRow, minColumn}, {minRow, maxColumn}, {minRow, minColumn}};
        return arrangePosition;
    }

    public int[][] arrangeLeft(int[][] position) {
        int[][] minMaxValues = findMinMaxValues(position);
        int minRow = minMaxValues[0][0];
        int maxRow = minMaxValues[1][0];
        int minColumn = minMaxValues[0][1];
        int maxColumn = minMaxValues[1][1];
        int[][] arrangePosition = {{maxRow, minColumn}, {minRow, minColumn}, {maxRow, maxColumn}, {minRow, maxColumn}};
        return arrangePosition;
    }

    public int[][] arrangeRight(int[][] position) {
        int[][] minMaxValues = findMinMaxValues(position);
        int minRow = minMaxValues[0][0];
        int maxRow = minMaxValues[1][0];
        int minColumn = minMaxValues[0][1];
        int maxColumn = minMaxValues[1][1];
        int[][] arrangePosition = {{minRow, maxColumn}, {maxRow, maxColumn}, {minRow, minColumn}, {maxRow, minColumn}};
        return arrangePosition;
    }

    public int[][] findMinMaxValues(int[][] position) {
        int minRow = GRID_LENGHT;
        int maxRow = -1;
        int minColumn = GRID_LENGHT;
        int maxColumn = -1;
        for (int row = 0; row < POSITIONS_LENGTH; row++) {
            if (position[row][0] > maxRow) {
                maxRow = position[row][0];
            }
            if (position[row][0] < minRow) {
                minRow = position[row][0];
            }
            if (position[row][1] > maxColumn) {
                maxColumn = position[row][1];
            }
            if (position[row][1] < minColumn) {
                minColumn = position[row][1];
            }
        }
        int[][] minMaxValues = {{minRow, minColumn}, {maxRow, maxColumn}};
        return minMaxValues;
    }

    public Boolean isTankCrash(Element[][] boardMatrix) {
        Boolean isTankCrash = false;
        //int[][] position = tank.getPosition();
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
        //int[][] position = enemyTank.getPosition();
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
        //int[][] position = enemyTank.getPosition();
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
        //int[][] position = enemyTank.getPosition();
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
        //int[][] position = enemyTank.getPosition();
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
}
