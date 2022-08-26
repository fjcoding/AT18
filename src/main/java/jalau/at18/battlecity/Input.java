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
        matrix = tankPlayer.arrageTank(matrix, input);
        if (!tankPlayer.isTankCrash(matrix)) {
            matrix = tankPlayer.movePlayer(matrix, input);
        } else {
            matrix = tankPlayer.arrageTank(matrix, input);
            System.out.println("Desbloqueado");
        }
        System.out.println(tankPlayer.isTankCrash(matrix));

    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}
