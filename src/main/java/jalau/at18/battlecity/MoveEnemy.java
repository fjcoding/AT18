package jalau.at18.battlecity;

public class MoveEnemy extends Thread {
    private String letter = "";
    private EnemyTank enemyTank;
    private Board board;
    private static final int TIME = 500;

    public MoveEnemy(Board board, EnemyTank enemyTank) {
        this.board = board;
        this.enemyTank = enemyTank;
    }

    @Override
    public void run() {
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
