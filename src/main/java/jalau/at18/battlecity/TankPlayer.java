package jalau.at18.battlecity;

public class TankPlayer extends Tank {

    private String direction;
    public static final int[][] INITIAL_POSITION = {{24, 9}, {24, 10}, {25, 9}, {25, 10}};
    public static final int SIZE_ROW_POSITION = 4;
    private int[][] position = new int[SIZE_ROW_POSITION][2];

    public TankPlayer() {

    }

    @Override
    public int[][] initialPosition() {
        this.position = INITIAL_POSITION;
        return position;
    }

    public void setMove(String newDirection) {
        this.direction = newDirection;
    }

    public void setPosition(int[][] newPosition) {
        this.position = newPosition;

    }

    @Override
    public int[][] moveUp(int[][] newPosition) {
        for (int row = 0; row < SIZE_ROW_POSITION; row++) {
            newPosition[row][0] = newPosition[row][0] - 1;
        }
        return newPosition;
    }

    @Override
    public int[][] moveDown(int[][] newPosition) {
        for (int row = 0; row < SIZE_ROW_POSITION; row++) {
            newPosition[row][0] = newPosition[row][0] + 1;
        }
        return newPosition;
    }

    @Override
    public int[][] moveRight(int[][] newPosition) {
        for (int row = 0; row < SIZE_ROW_POSITION; row++) {
            newPosition[row][1] = newPosition[row][1] + 1;
        }
        return newPosition;
    }

    @Override
    public int[][] moveLeft(int[][] newPosition) {
        for (int row = 0; row < SIZE_ROW_POSITION; row++) {
            newPosition[row][1] = newPosition[row][1] - 1;
        }
        return newPosition;
    }

    @Override
    public void shoot() {

    }
}
