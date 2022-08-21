package jalau.at18.battlecity;


public class EnemyTank extends Tank {

    private String direction;
    public static final int GRID_LENGHT = 26;
    public static final int[][] INITIAL_POSITION_ONE = {{1, 1}, {1, 0}, {0, 1}, {0, 0}};
    public static final int[][] INITIAL_POSITION_TWO = {{1, 14}, {1, 13}, {0, 14}, {0, 13}};
    public static final int[][] INITIAL_POSITION_THREE = {{1, 25}, {1, 24}, {0, 25}, {0, 24}};
    //public static final int ENEMY_FRONT = 10;
    //public static final int ENEMY_BACK = 11;
    public static final int INITIAL_POSITIONS = 3;
    public static final int POSITIONS_LENGTH = 4;
    private int enemyCount;
    private int[][] enemyPosition;

    public EnemyTank(int enemyCount) {
        this.enemyCount = enemyCount;
    }

    @Override
    public int[][] initialPosition() {
        if (enemyCount % INITIAL_POSITIONS == 1) {
            enemyPosition = INITIAL_POSITION_THREE;
        }
        if (enemyCount % INITIAL_POSITIONS == 2) {
            enemyPosition = INITIAL_POSITION_TWO;
        }
        if (enemyCount % INITIAL_POSITIONS == 0) {
            enemyPosition = INITIAL_POSITION_ONE;
        }
        return enemyPosition;
    }

    @Override
    public int[][] moveUp(int[][] position) {
        int[][] newPosition = arrangeUp(position);
        if (newPosition[0][0] != 0) {
            for (int row = 0; row < POSITIONS_LENGTH; row++) {
                newPosition[row][0] = newPosition[row][0] - 1;
            }
        }
        return newPosition;
    }

    @Override
    public int[][] moveDown(int[][] position) {
        int[][] newPosition = arrangeDown(position);
        if (newPosition[0][0] != GRID_LENGHT - 1) {
            for (int row = 0; row < POSITIONS_LENGTH; row++) {
                newPosition[row][0] = newPosition[row][0] + 1;
            }
        }
        return newPosition;
    }

    @Override
    public int[][] moveLeft(int[][] position) {
        int[][] newPosition = arrangeLeft(position);
        if (newPosition[0][1] != 0) {
            for (int row = 0; row < POSITIONS_LENGTH; row++) {
                newPosition[row][1] = newPosition[row][1] - 1;
            }
        }
        return newPosition;
    }

    @Override
    public int[][] moveRight(int[][] position) {
        int[][] newPosition = arrangeRight(position);
        if (newPosition[0][1] != GRID_LENGHT - 1) {
            for (int row = 0; row < POSITIONS_LENGTH; row++) {
                newPosition[row][1] = newPosition[row][1] + 1;
            }
        }
        return newPosition;
    }
    @Override
    public void shoot() {
       // Missile missil = new Missile(enemyPosition[0][0], enemyPosition[0][1], enemyPosition[1][0], enemyPosition[1][1], direction);
        //missil.missileDirection();
    }

    /*public int[][] searchTank(int[][] matrix) {
        int[][] position = new int[2][2];
        /*for (int row = 0; row < 4 ; row++) {
            for (int column = 0; column < 2 ; column++) {
                if (matrix[row][column] == ENEMY_FRONT || matrix[row][column] == ENEMY_BACK) {
                    position[][0] = row;
                    position[][1] = column;
                }
            }
        }
        return position;
    }*/
}