package jalau.at18.battlecity;

abstract class Tank {

    abstract int[][] initialPosition();
    abstract int[][] moveUp(int[][] matrix);
    abstract int[][] moveDown(int[][] matrix);
    abstract int[][] moveRight(int[][] matrix);
    abstract int[][] moveLeft(int[][] matrix);
    abstract void shoot();

    public static final int GRID_LENGHT = 26;
    public static final int POSITIONS_LENGTH = 4;

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
}
