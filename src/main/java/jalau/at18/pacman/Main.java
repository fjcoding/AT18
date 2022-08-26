package jalau.at18.pacman;

import java.util.Scanner;
import java.util.List;
import java.io.IOException;
import java.io.File;
import javax.sound.sampled.*;;
public class Main {
    public static final int INITIAL_PACMAN_POSITION = 1;
    public static final int INITIAL_GHOST1_XPOSITION = 11;
    public static final int INITIAL_GHOST1_YPOSITION = 14;
    public static final int INITIAL_GHOST2_XPOSITION = 12;
    public static final int INITIAL_GHOST2_YPOSITION = 15;
    public static final int INITIAL_GHOST3_XPOSITION = 13;
    public static final int INITIAL_GHOST3_YPOSITION = 15;
    public static final int INITIAL_GHOST4_XPOSITION = 14;
    public static final int INITIAL_GHOST4_YPOSITION = 15;
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException  {
        ConditionMovements newMovement = new ConditionMovements();
        Board board = new Board();
        Ghost movementGhost = new Ghost();
        MovementsPacman point = new MovementsPacman();
        Scanner keyword = new Scanner(System.in);
        File file = new File("src/main/java/jalau/at18/pacman/M1987.wav");
        AudioInputStream audioo = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioo);
        clip.start();
        char movementsFollow = 'm';
        final int rowPacman = 1;
        final int columsPacman = 1;
        final int rowGhost1 = 9;
        final int columsGhost1 = 20;
        final int rowGhost2 = 15;
        final int columsGhost2 = 20;
        final int rowGhost3 = 7;
        final int columsGhost3 = 6;
        final int rowGhost4 = 19;
        final int columsGhost4 = 5;
        List<Object> arr;
        List<Object> arr2;
        List<Object> arr3;
        List<Object> arr4;
        List<Object> arrGhost;
        List<Object> arrGhost2;
        List<Object> arrGhost3;
        List<Object> arrGhost4;
        System.out.println("*****************************************************************");
        System.out.println("   ");
        System.out.println("                     Welcome to the game Pac-Man                 ");
        System.out.println("   ");
        System.out.println("          W = up    s = down     a = left     d = right          ");
        System.out.println("   ");
        board.getGameBoard()[rowPacman][columsPacman] = point.yellowColor('C');
        board.getGameBoard()[rowGhost1][columsGhost1] = point.redColor('G');
        board.getGameBoard()[rowGhost2][columsGhost2] = point.redColor('G');
        board.getGameBoard()[rowGhost3][columsGhost3] = point.redColor('G');
        board.getGameBoard()[rowGhost4][columsGhost4] = point.redColor('G');
        board.showBoard(board.getGameBoard());
        System.out.println("                                                      SCORE:  s" + point.showScore());
        System.out.println("                                                      POINTS: "
                                + point.showWining());
        System.out.println(" LIVES: " + point.gameOver());
        System.out.println("Enter a move: ");
        char movements = keyword.next().charAt(0);
        point.setRowGhost1(rowGhost1);
        point.setColumnGhost1(columsGhost1);
        arr = newMovement.movement(movements, point.getRowGhost1(), point.getColumnGhost1());
        point.setRowGhost2(rowGhost2);
        point.setColumnGhost2(columsGhost2);
        arr2 = movementGhost.ghostMovement((String[][]) arr.get(0), point.getRowGhost2(),
                                point.getColumnGhost2());
        point.setRowGhost3(rowGhost3);
        point.setColumnGhost3(columsGhost3);
        arr3 = movementGhost.ghostMovement((String[][]) arr2.get(0), point.getRowGhost3(),
                                point.getColumnGhost3());
        point.setRowGhost4(rowGhost4);
        point.setColumnGhost4(columsGhost4);
        arr4 = movementGhost.ghostMovement((String[][]) arr3.get(0), point.getRowGhost4(),
                                point.getColumnGhost4());
        point.setRowGhost1((int) arr.get(1));
        point.setColumnGhost1((int) arr.get(2));
        while (true) {
            System.out.println("                                                      SCORE: " + point.showScore());
            System.out.println("                                                      POINTS: "
                                + point.showWining());
            System.out.println(" LIVES: " + point.gameOver());
            System.out.println("Enter a move: ");
            movementsFollow = keyword.next().charAt(0);
            arrGhost = newMovement.movement(movementsFollow, point.getRowGhost1(), point.getColumnGhost1());
            point.setRowGhost1((int) arrGhost.get(1));
            point.setColumnGhost1((int) arrGhost.get(2));
            arrGhost2 = movementGhost.ghostMovement((String[][]) arrGhost.get(0), point.getRowGhost2(),
                                        point.getColumnGhost2());
            point.setRowGhost2((int) arrGhost2.get(1));
            point.setColumnGhost2((int) arrGhost2.get(2));
            arrGhost3 = movementGhost.ghostMovement((String[][]) arrGhost2.get(0), point.getRowGhost3(),
                                        point.getColumnGhost3());
            point.setRowGhost3((int) arrGhost3.get(1));
            point.setColumnGhost3((int) arrGhost3.get(2));
            arrGhost4 = movementGhost.ghostMovement((String[][]) arrGhost3.get(0), point.getRowGhost4(),
                                        point.getColumnGhost4());
            point.setRowGhost4((int) arrGhost4.get(1));
            point.setColumnGhost4((int) arrGhost4.get(2));
            if (point.isWinner(point.showWining())) {
                break;
            }
        }
    }
}
