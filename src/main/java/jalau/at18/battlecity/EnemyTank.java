package jalau.at18.battlecity;

import java.util.Random;

public class EnemyTank extends Tank {

    private String direction;
    public static final int GRID_LENGHT = 26;
    public static final int[][] INITIAL_POSITION_ONE = {{1, 1}, {1, 0}, {0, 1}, {0, 0}};
    public static final int[][] INITIAL_POSITION_TWO = {{1, 13}, {1, 12}, {0, 13}, {0, 12}};
    public static final int[][] INITIAL_POSITION_THREE = {{1, 25}, {1, 24}, {0, 25}, {0, 24}};
    //public static final int ENEMY_FRONT = 10;
    //public static final int ENEMY_BACK = 11;
    public static final int INITIAL_POSITIONS = 3;
    public static final int POSITIONS_LENGTH = 4;
    public static final int NUMBER_OF_DIRECTIONS = 4;
    private int enemyCount;
    private int[][] enemyPosition;

    public EnemyTank(int enemyCount) {
        this.enemyCount = enemyCount;
    }

    public int[][] getPosition() {
        return enemyPosition;
    }
    public String getDirection() {
        return direction;
    }
    public void setDirection() {
        String[] directions = {"UP", "DOWN", "LEFT", "RIGHT"};
        Random random = new Random();
        int upperBound = NUMBER_OF_DIRECTIONS;
        int randomDirection = random.nextInt(upperBound);
        direction = directions[randomDirection];
    }
    public void goStraight() {
        if (direction == "UP") {
            enemyPosition = arrangeUp(enemyPosition);
            enemyPosition = moveUp(enemyPosition);
        }
        if (direction == "DOWN") {
            enemyPosition = arrangeDown(enemyPosition);
            enemyPosition = moveDown(enemyPosition);

        }
        if (direction == "LEFT") {
            enemyPosition = arrangeLeft(enemyPosition);
            enemyPosition = moveLeft(enemyPosition);
        }
        if (direction == "RIGHT") {
            enemyPosition = arrangeRight(enemyPosition);
            enemyPosition = moveRight(enemyPosition);
        }
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
        direction = "DOWN";
        return enemyPosition;
    }

    @Override
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

    @Override
    public int[][] moveDown(int[][] position) {
        position = arrangeDown(position);
        direction = "DOWN";
        if (position[0][0] != GRID_LENGHT - 1) {
            for (int row = 0; row < POSITIONS_LENGTH; row++) {
                position[row][0] = position[row][0] + 1;
            }
        }
        return position;
    }

    @Override
    public int[][] moveLeft(int[][] position) {
        position = arrangeLeft(position);
        direction = "LEFT";
        if (position[0][1] != 0) {
            for (int row = 0; row < POSITIONS_LENGTH; row++) {
                position[row][1] = position[row][1] - 1;
            }
        }
        return position;
    }

    @Override
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

    @Override
    public Element[][] shoot(Element[][] boardElements) {
        Missile missil = new Missile(enemyPosition[0][0], enemyPosition[0][1], enemyPosition[1][0], enemyPosition[1][1], direction, boardElements);
        return missil.missileDirection();
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