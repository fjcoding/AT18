package jalau.at18.battlecity;

public class TankPlayer extends Tank {

    private String direction;
    public static final int[][] INITIAL_POSITION = {{24, 9}, {24, 10}, {25, 9}, {25, 10}};
    public static final int SIZE_ROW_POSITION = 4;
    public static final int SIZE_MAX_BOARD = 26;
    private int[][] newPosition = new int[SIZE_ROW_POSITION][2];

    public TankPlayer() {

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
        if (newPosition[0][0] !=0) {
            for (int row = 0; row < SIZE_ROW_POSITION; row++) {
                newPosition[row][0] = newPosition[row][0] - 1;
            }
        }
        return newPosition;
    }

    @Override
    public int[][] moveDown(int[][] position) {
        newPosition = arrangeUp(position);
        if (newPosition[0][0] != SIZE_MAX_BOARD - 1) {
            for (int row = 0; row < SIZE_ROW_POSITION; row++) {
                newPosition[row][0] = newPosition[row][0] + 1;
            }
        }
        return newPosition;
    }

    @Override
    public int[][] moveRight(int[][] position) {
        newPosition = arrangeUp(position);
        if (newPosition[0][1] != SIZE_MAX_BOARD - 1) {
            for (int row = 0; row < SIZE_ROW_POSITION; row++) {
                newPosition[row][1] = newPosition[row][1] + 1;
            }
        }
        return newPosition;
    }

    @Override
    public int[][] moveLeft(int[][] position) {
        newPosition = arrangeUp(position);
        if (newPosition[0][1] != 0) {
            for (int row = 0; row < SIZE_ROW_POSITION; row++) {
                newPosition[row][1] = newPosition[row][1] - 1;
            }
        }
       return newPosition;
    }

    @Override
    public void shoot() {

    }
}
