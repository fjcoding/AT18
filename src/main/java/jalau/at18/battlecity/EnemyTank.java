package jalau.at18.battlecity;

S
public class EnemyTank extends Tank {
    
    public static final int GRID_LENGHT = 26;
    public static final int[][] INITIAL_POSITION_ONE = {{1, 1}, {1, 0}, {0, 1}, {0, 0}};
    public static final int[][] INITIAL_POSITION_TWO = {{1, 14}, {1, 13}, {0, 14}, {0, 13}};
    public static final int[][] INITIAL_POSITION_THREE = {{1, 25}, {1, 24}, {0, 25}, {0, 24}};
    public static final int ENEMY_FRONT = 10;
    public static final int ENEMY_BACK = 11;
    public static final int INITIAL_POSITIONS= 3;
    private int enemyCount;
    public int[][] enemyPosition;

    public EnemyTank(int enemyCount) {
        this.enemyCount = enemyCount;
    }

    @Override
    public int[][] initialPosition() {
        if(enemyCount % INITIAL_POSITIONS == 1) {
            enemyPosition = INITIAL_POSITION_THREE;
        }
        if(enemyCount % INITIAL_POSITIONS == 2) {
            enemyPosition = INITIAL_POSITION_TWO;
        }
        if(enemyCount % INITIAL_POSITIONS == 0) {
            enemyPosition = INITIAL_POSITION_ONE;
        }
        enemyCount--;
        return enemyPosition;
    }

    @Override
    public int[][] moveUp (int[][] matrix) {
        int[][] newPosition = new int[4][2];
        return newPosition;
    }

    public int[][] arrangeUp(int[][] position) {
        int[][] arrangePosition = new int[4][2];
        /*for (int square = 0; square < 4 ; square++) {
            for (int row = 0; row < 4 ; row++) {
                for (int column = 0; column < 2 ; column++) {
                    
                }
            }
        }*/
        return arrangePosition;
    }
    public int[][] searchTank(int[][] matrix) {
        int[][] position = new int[4][2];
        /*for (int row = 0; row < 4 ; row++) {
            for (int column = 0; column < 2 ; column++) {
                if (matrix[row][column] == ENEMY_FRONT || matrix[row][column] == ENEMY_BACK) {
                    position[][0] = row;
                    position[][1] = column;
                }
            }
        }*/
        return position;
    }

    @Override
    public int[][] moveDown (int[][] matrix) {
        return matrix;
    }

    @Override
    public int[][] moveRight (int[][] matrix) {
        return matrix;
    }

    @Override
    public int[][] moveLeft (int[][] matrix) {
        return matrix;
    }

    @Override
    public void shoot () {

    }

}