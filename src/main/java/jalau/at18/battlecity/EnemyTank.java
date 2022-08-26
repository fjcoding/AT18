package jalau.at18.battlecity;

import java.util.Random;

public class EnemyTank extends Tank {

    public static final int GRID_LENGHT = 26;
    public static final int[][] INITIAL_POSITION_ONE = {{1, 1}, {1, 0}, {0, 1}, {0, 0}};
    public static final int[][] INITIAL_POSITION_TWO = {{1, 13}, {1, 12}, {0, 13}, {0, 12}};
    public static final int[][] INITIAL_POSITION_THREE = {{1, 25}, {1, 24}, {0, 25}, {0, 24}};
    public static final int INITIAL_POSITIONS = 3;
    public static final int POSITIONS_LENGTH = 4;
    public static final int NUMBER_OF_DIRECTIONS = 4;
    public static final int ENEMY_MOVEMENTS = 15;
    private int enemyCount;
    private int movementCount = 0;
    private int screenCount = 0;
    private Boolean thereAreMissile = false;
    public static final int ENEMY_SHOOT = 3;
    private Missile missile = new Missile();

    public EnemyTank(int enemyCount) {
        missile.setDirection(direction);
        this.enemyCount = enemyCount;
        missile.setPosition(0, 0, 0, 0);
    }

    public Element[][] moveEnemy(Element[][] elementsMatrix) {
        cleanPosition(elementsMatrix, getPosition());
        while (isTankCrash(elementsMatrix)) {
            setDirection(randomDirection());
        }
        if (movementCount % ENEMY_SHOOT == 0 && !thereAreMissile) {
            missile.setDirection(direction);
            missile.setPosition(position[0][0], position[0][1], position[1][0], position[1][1]);
            thereAreMissile = true;
            missile.setBoard(elementsMatrix);
        }
        elementsMatrix = missile.removeMissilefromBoard(elementsMatrix, missile.getPosition());
        if (thereAreMissile) {
            //missile.missileDirection();
            if (!missile.getIsCollition()) {
                //System.out.println("No collition");
                if (missile.isMissilCrash()) {
                    //System.out.println("Missile crash");
                    //missile.missileDirection();
                    thereAreMissile = false;
                    elementsMatrix = missile.removeMissilefromBoard(elementsMatrix, missile.getPosition());
                } else {
                    missile.missileDirection();
                    elementsMatrix = missile.putMissileOnBoard(elementsMatrix, missile.getPosition());
                }
            } else {
                //System.out.println("Collition");
                thereAreMissile = false;
                missile.setIsCollition(false);
                elementsMatrix = missile.removeMissilefromBoard(elementsMatrix, missile.getPosition());
            }
        }
        if (screenCount % 2 == 0) {
            goStraight();
            movementCount++;
        }
        screenCount++;
        elementsMatrix = putTankOnBoard(elementsMatrix, getPosition());
        if (movementCount == ENEMY_MOVEMENTS) {
            setDirection(randomDirection());
            movementCount = 0;
        }
        return elementsMatrix;
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
            position = arrangeUp(position);
            position = moveUp(position);
        }
        if (direction == "DOWN") {
            position = arrangeDown(position);
            position = moveDown(position);
        }
        if (direction == "LEFT") {
            position = arrangeLeft(position);
            position = moveLeft(position);
        }
        if (direction == "RIGHT") {
            position = arrangeRight(position);
            position = moveRight(position);
        }
    }

    public int[][] initialPosition() {
        if (enemyCount % INITIAL_POSITIONS == 1) {
            position = INITIAL_POSITION_THREE;
        }
        if (enemyCount % INITIAL_POSITIONS == 2) {
            position = INITIAL_POSITION_TWO;
        }
        if (enemyCount % INITIAL_POSITIONS == 0) {
            position = INITIAL_POSITION_ONE;
        }
        direction = randomDirection();
        return position;
    }

}