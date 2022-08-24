package jalau.at18.battlecity;

public class MoveEnemy extends Thread {
    String letter = "";
    EnemyTank enemyTank;
    Board board;
	//String input ="";
	//KeyListenerExample keyListener = new KeyListenerExample();
    public MoveEnemy (Board board, EnemyTank enemyTank){
        this.board = board;
        this.enemyTank = enemyTank;
    }
	@Override
	public void run () {
		//while(true) {
            Element[][] matrix = board.getMatrix();
			matrix = enemyTank.moveEnemy(matrix);
			board.setMatrix(matrix);
			try {
				MoveEnemy.sleep(1000);
			} catch (InterruptedException e) {
				System.out.print(e);
			}

		//}

	}
}
