package jalau.at18.battlecity;

import jalau.at18.battlecity.elements.Element;

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
        }

    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
        /*input = String.valueOf(e.getKeyChar());
        int con=0;

            while(con<10){
                System.out.println("asdasd");
                con++;
            }
            try {
                MoveTankPlayer.sleep(1000);
            } catch (InterruptedException a) {
                System.out.print(a);
            }*/

    }
}
