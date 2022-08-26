package jalau.at18.battlecity;

public class MoveEnemy extends Thread {
    private String letter = "";
    private EnemyTank enemyTank;
    private Board board;
    private static final int TIME = 500;
    private static final int TIME2 = 12000;
    private static final int TIME3 = 24000;
    private static final int FIRST_ENEMY = 20;
    private static final int SECOND_ENEMY = 19;
    private static final int THIRD_ENEMY = 18;
    private boolean exitThread;
    
    protected boolean createdEnemy = false;

    public MoveEnemy(Board board, EnemyTank enemyTank) {
        this.board = board;
        this.enemyTank = enemyTank;
        exitThread = true;
    }
    @Override
    public void run() {
        if (enemyTank.getCountEnemy() == FIRST_ENEMY) {
            exitThread = false;
            createdEnemy = true;
        }
        if (enemyTank.getCountEnemy() == SECOND_ENEMY) {
            try {
                MoveEnemy.sleep(TIME2);
                exitThread = false;
                createdEnemy = true;
            } catch (InterruptedException e) {
                System.out.print(e);
            }
        }
        if (enemyTank.getCountEnemy() == THIRD_ENEMY) {
            try {
                MoveEnemy.sleep(TIME3);
                exitThread = false;
                createdEnemy = true;
            } catch (InterruptedException e) {
                System.out.print(e);
            }
        }
        while (!exitThread) {
            Element[][] matrix = board.getMatrix();
            matrix = enemyTank.moveEnemy(matrix);
            board.setMatrix(matrix);
            try {
                MoveEnemy.sleep(TIME);
            } catch (InterruptedException e) {
                System.out.print(e);
            }
        }


    }
    public void stopThread() {
        Element[][] matrix = board.getMatrix();
        enemyTank.cleanPosition(matrix, enemyTank.getPosition());
        if (!exitThread){
            exitThread = true;
        }
        //exitThread = true;
    }
    public boolean getIsEnemyCreated() {
        return createdEnemy;
    }
    public void setIsEnemyCreated(boolean createdEnemy) {
        this.createdEnemy = createdEnemy;
    }
}
