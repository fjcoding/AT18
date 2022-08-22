package jalau.at18.battlecity;

public class GameBattlecity extends Game {
    public static final int ENEMYS_PER_STAGE = 20;
    public static final int SIZE_ROW_POSITION = 4;
    public static final int ENEMY_MOVEMENTS = 15;
    public static final int ENEMY_SHOOT = 3;
    public static final int GRID_LENGHT = 26;
    public static final int MILLISECONDS = 1000;

    private int enemyCount = ENEMYS_PER_STAGE;
    private TankPlayer tankPlayer = new TankPlayer();
    private EnemyTank enemyTank = new EnemyTank(enemyCount);
    private Board board;

    public GameBattlecity() {

    }

    public void startGame() {
        this.board = createBoard();
        //TankPlayer tankPlayer = new TankPlayer();
        //EnemyTank enemyTank = new EnemyTank(enemyCount);
        Element[][] elementsMatrix = board.getMatrix();
        int[][] positionPlayer = tankPlayer.initialPosition();
        int[][] positionEnemy = enemyTank.initialPosition();
        elementsMatrix = tankPlayer.putTankOnBoard(elementsMatrix, positionPlayer);
        elementsMatrix = enemyTank.putTankOnBoard(elementsMatrix, positionEnemy);
        showMatrix(board);
    }
    public void playGame() {
        //Board board = createBoard();
        //Input direction = new Input();
        //String input = direction.read();
        //int[][] newPosition = new int[SIZE_ROW_POSITION][2];
        //newPosition = tankPlayer.movements(input);
        //Element[][] elementsMatrix = board.getMatrix();
        //elementsMatrix = tankPlayer.putTankOnBoard(elementsMatrix, newPosition);
        moveEnemy();
    }
    public void endGame() {

    }
    public void moveEnemy() {
        for (int movementCount = 0; movementCount < ENEMY_MOVEMENTS; movementCount++) {
            Element[][] elementsMatrix = board.getMatrix();
            cleanPosition(elementsMatrix, enemyTank.getPosition());
            //printPosition(enemyTank.getPosition());
            while (isTankCrash(enemyTank, elementsMatrix)) {
                enemyTank.setDirection(enemyTank.randomDirection());
                System.out.println(enemyTank.getDirection());
            }
            if (movementCount % ENEMY_SHOOT == 0) {
                elementsMatrix = enemyTank.shoot(elementsMatrix);
                System.out.println("Shoot");
            }
            enemyTank.goStraight();
            System.out.println(enemyTank.getDirection());
            elementsMatrix = enemyTank.putTankOnBoard(elementsMatrix, enemyTank.getPosition());
            showMatrix(board);
            wait(1);
        }
        enemyTank.setDirection(enemyTank.randomDirection());
    }
    public static Board createBoard() {
        String rute = "stage1.csv";
        Stage stage = new Stage(rute);
        Board board = stage.initBoard();
        return board;
    }

    public static void showMatrix(Board board) {
        Element[][] matrix = board.getMatrix();
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix.length; column++) {
                System.out.print(matrix[row][column].getImage() + " ");
            }
            System.out.println();
        }
    }

    public void cleanPosition(Element[][] elementsMatrix, int[][] position) {
        Empty empty = new Empty();
        elementsMatrix[position[0][0]][position[0][1]] = empty;
        elementsMatrix[position[1][0]][position[1][1]] = empty;
        elementsMatrix[position[2][0]][position[2][1]] = empty;
        elementsMatrix[position[SIZE_ROW_POSITION - 1][0]][position[SIZE_ROW_POSITION - 1][1]] = empty;
    }

    public static void wait(int seconds) {
        try {
            Thread.sleep(seconds * MILLISECONDS);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public Boolean isTankCrash(EnemyTank tank, Element[][] boardMatrix) {
        Boolean isTankCrash = false;
        int[][] position = tank.getPosition();
        if (tank.getDirection() == "UP") {
            if (position[0][0] != 0) {
                if (boardMatrix[position[0][0] - 1][position[0][1]].isBlockTank() || boardMatrix[position[1][0] - 1][position[1][1]].isBlockTank()) {
                    isTankCrash = true;
                }
            } else {
                isTankCrash = true;
            }
        }
        if (tank.getDirection() == "DOWN") {
            if (position[0][0] < GRID_LENGHT) {
                if (boardMatrix[position[0][0] + 1][position[0][1]].isBlockTank() || boardMatrix[position[1][0] + 1][position[1][1]].isBlockTank()) {
                    isTankCrash = true;
                }
            } else {
                isTankCrash = true;
            }
        }
        if (tank.getDirection() == "LEFT") {
            if (position[0][1] != 0) {
                if (boardMatrix[position[0][0]][position[0][1] - 1].isBlockTank() || boardMatrix[position[1][0]][position[1][1] - 1].isBlockTank()) {
                    isTankCrash = true;
                } else {
                    isTankCrash = true;
                }
            }
        }
        if (tank.getDirection() == "RIGHT") {
            if (position[1][1] < GRID_LENGHT) {
                if (boardMatrix[position[0][0]][position[0][1] + 1].isBlockTank() || boardMatrix[position[1][0]][position[1][1] + 1].isBlockTank()) {
                    isTankCrash = true;
                }
            } else {
                isTankCrash = true;
            }
        }
        return isTankCrash;
    }
}