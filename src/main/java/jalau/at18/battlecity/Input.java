package jalau.at18.battlecity;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Input implements KeyListener {
    String input ="";
    TankPlayer tankPlayer;
    Board board;
	//Proceso1 array = new Proceso1();
    public Input (Board board, TankPlayer tankPlayer){
        this.board = board;
        this.tankPlayer = tankPlayer;
    }
	@Override
	public void keyTyped(KeyEvent e)
	{
		input = String.valueOf(e.getKeyChar());
        Element[][] matrix = board.getMatrix();
        tankPlayer.cleanPosition(matrix, tankPlayer.getPosition());
        int [][] newPosition = tankPlayer.movements(input);
        matrix = tankPlayer.putTankOnBoard(matrix, newPosition);


	}
	@Override
	public void keyPressed(KeyEvent e)
	{
	}
	@Override
	public void keyReleased(KeyEvent e)
	{
	}
    /*public void movePlayer() {
        Input direction = new Input();
        String input = direction.read();
        Element[][] elementsMatrix = board.getMatrix();
        //int[][] newPosition = new int[SIZE_ROW_POSITION][2];
        tankPlayer.cleanPosition(elementsMatrix, tankPlayer.getPosition());
        int[][] newPosition = tankPlayer.movements(input);
        elementsMatrix = tankPlayer.putTankOnBoard(elementsMatrix, newPosition);
    }*/
}
