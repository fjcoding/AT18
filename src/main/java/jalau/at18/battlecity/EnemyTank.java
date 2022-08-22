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
    public void setDirection(String newDirection) {
        direction = newDirection;
    }

    public void setPosition(int[][] newPosition) {
        enemyPosition = newPosition;
    }

    public String randomDirection() {
        String[] directions = {"UP", "DOWN", "LEFT", "RIGHT"};
        Random random = new Random();
        int upperBound = NUMBER_OF_DIRECTIONS;
        int randomDirection = random.nextInt(upperBound);
        return directions[randomDirection];
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

    public Boolean isTankCrashUp(Element[][] boardMatrix) {
        Boolean isTankCrashUp = false;
        //int[][] position = enemyTank.getPosition();
        enemyPosition = arrangeUp(enemyPosition);
        if (enemyPosition[0][0] == 0) {
            isTankCrashUp = true;
        } else {
            Boolean elementUp1 = boardMatrix[enemyPosition[0][0] - 1][enemyPosition[0][1]].isBlockTank();
            Boolean elementUp2 = boardMatrix[enemyPosition[1][0] - 1][enemyPosition[1][1]].isBlockTank();
            if (elementUp1 || elementUp2) {
                isTankCrashUp = true;
            }
        }
        return isTankCrashUp;
    }
    public Boolean isTankCrashDown(Element[][] boardMatrix) {
        Boolean isTankCrashDown = false;
        //int[][] position = enemyTank.getPosition();
        enemyPosition = arrangeDown(enemyPosition);
        if (enemyPosition[0][0] == GRID_LENGHT - 1) {
            isTankCrashDown = true;
        } else {
            Boolean elementDown1 = boardMatrix[enemyPosition[0][0] + 1][enemyPosition[0][1]].isBlockTank();
            Boolean elementDown2 = boardMatrix[enemyPosition[1][0] + 1][enemyPosition[1][1]].isBlockTank();
            if (elementDown1 || elementDown2) {
                isTankCrashDown = true;
            }
        }
        return isTankCrashDown;
    }
    public Boolean isTankCrashLeft(Element[][] boardMatrix) {
        Boolean isTankCrashLeft = false;
        //int[][] position = enemyTank.getPosition();
        enemyPosition = arrangeLeft(enemyPosition);
        if (enemyPosition[0][1] == 0) {
            isTankCrashLeft = true;
        } else {
            Boolean elementLeft1 = boardMatrix[enemyPosition[0][0]][enemyPosition[0][1] - 1].isBlockTank();
            Boolean elementLeft2 = boardMatrix[enemyPosition[1][0]][enemyPosition[1][1] - 1].isBlockTank();
            if (elementLeft1 || elementLeft2) {
                isTankCrashLeft = true;
            }
        }
        return isTankCrashLeft;
    }
    public Boolean isTankCrashRight(Element[][] boardMatrix) {
        Boolean isTankCrashRight = false;
        //int[][] position = enemyTank.getPosition();
        enemyPosition = arrangeRight(enemyPosition);
        if (enemyPosition[0][1] == GRID_LENGHT - 1) {
            isTankCrashRight = true;
        } else {
            Boolean elementRight1 = boardMatrix[enemyPosition[0][0]][enemyPosition[0][1] + 1].isBlockTank();
            Boolean elementRight2 = boardMatrix[enemyPosition[1][0]][enemyPosition[1][1] + 1].isBlockTank();
            if (elementRight1 || elementRight2) {
                isTankCrashRight = true;
            }
        }
        return isTankCrashRight;
    }

}