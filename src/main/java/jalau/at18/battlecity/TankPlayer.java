package jalau.at18.battlecity;

public class TankPlayer extends Tank {

    private String direction;
    public static final int[][] INITIAL_POSITION = {{24, 9}, {24, 10}, {25, 9}, {25, 10}};
    public static final int SIZE_ROW_POSITION = 4;
    public static final int SIZE_MAX_BOARD = 26;
    private int[][] newPosition = new int[SIZE_ROW_POSITION][2];

    public TankPlayer() {

    }

    public Element[][] putTankOnBoard(Element[][] matrix, int[][] position) {
        TankTop tankTop = new TankTop();
        TankBack backTop = new TankBack();
        matrix[position[0][0]][position[0][1]] = tankTop;
        matrix[position[1][0]][position[1][1]] = tankTop;
        matrix[position[2][0]][position[2][1]] = backTop;
        matrix[position[SIZE_ROW_POSITION - 1][0]][position[SIZE_ROW_POSITION - 1][1]] = backTop;

        return matrix;
    }
    @Override
    public int[][] initialPosition() {
        this.newPosition = INITIAL_POSITION;
        return newPosition;
    }

    public void setMove(String newDirection) {
        this.direction = newDirection;
    }

    public void setPosition(int[][] position) {
        this.newPosition = position;

    }

    @Override
    public int[][] moveUp(int[][] position) {
        newPosition = arrangeUp(position);
        if (newPosition[0][0] != 0) {
            for (int row = 0; row < SIZE_ROW_POSITION; row++) {
                newPosition[row][0] = newPosition[row][0] - 1;
            }
        }
        return newPosition;
    }

    @Override
    public int[][] moveDown(int[][] position) {
        newPosition = arrangeDown(position);
        if (newPosition[0][0] != SIZE_MAX_BOARD - 1) {
            for (int row = 0; row < SIZE_ROW_POSITION; row++) {
                newPosition[row][0] = newPosition[row][0] + 1;
            }
        }
        return newPosition;
    }

    @Override
    public int[][] moveRight(int[][] position) {
        newPosition = arrangeRight(position);
        if (newPosition[0][1] != SIZE_MAX_BOARD - 1) {
            for (int row = 0; row < SIZE_ROW_POSITION; row++) {
                newPosition[row][1] = newPosition[row][1] + 1;
            }
        }
        return newPosition;
    }

    @Override
    public int[][] moveLeft(int[][] position) {
        newPosition = arrangeLeft(position);
        if (newPosition[0][1] != 0) {
            for (int row = 0; row < SIZE_ROW_POSITION; row++) {
                newPosition[row][1] = newPosition[row][1] - 1;
            }
        }
        return newPosition;
    }

    @Override
    public void shoot() {
        Missile missil = new Missile(newPosition[0][0], newPosition[0][1], newPosition[1][0], newPosition[1][1], direction);
        missil.missileDirection();
    }
}
