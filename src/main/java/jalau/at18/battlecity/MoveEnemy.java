package jalau.at18.battlecity;

public class MoveEnemy extends Thread {
    private String letter = "";
    private EnemyTank enemyTank;
    private Board board;
    private static final int TIME = 500;
    private static final int TIME2 = 12000;
    private static final int TIME3 = 24000;

    public MoveEnemy(Board board, EnemyTank enemyTank) {
        this.board = board;
        this.enemyTank = enemyTank;
    }
    @Override
    public void run() {
        if (enemyTank.getCountEnemy() == 19) {
            try {
                MoveEnemy.sleep(TIME2);
            } catch (InterruptedException e) {
                System.out.print(e);
            }
        }
        if (enemyTank.getCountEnemy() == 18) {
            try {
                MoveEnemy.sleep(TIME3);
            } catch (InterruptedException e) {
                System.out.print(e);
            }
        }
        while (true) {
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
}
