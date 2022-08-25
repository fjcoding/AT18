package jalau.at18.battlecity;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Input implements KeyListener {
    private String input = "";
    private TankPlayer tankPlayer;
    private Board board;

    // Proceso1 array = new Proceso1();
    public Input(Board board, TankPlayer tankPlayer) {
        this.board = board;
        this.tankPlayer = tankPlayer;
    }

    @Override
    public void keyTyped(KeyEvent e) {
        input = String.valueOf(e.getKeyChar());
        Element[][] matrix = board.getMatrix();
        tankPlayer.cleanPosition(matrix, tankPlayer.getPosition());
        int[][] newPosition = tankPlayer.movements(input);
        matrix = tankPlayer.putTankOnBoard(matrix, newPosition);

    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}
