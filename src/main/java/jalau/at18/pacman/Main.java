package jalau.at18.pacman;

import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ConditionMovements newMovement = new ConditionMovements();
        Board board = new Board();
        Ghost movementGhost = new Ghost();
        MovementsPacman point = new MovementsPacman();
        System.out.println("Tablero mostrado");
        Scanner keyword = new Scanner(System.in);
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
        board.getGameBoard()[rowPacman][columsPacman] = "\033[33mC\u001B[0m";
        board.getGameBoard()[rowGhost1][columsGhost1] = "\033[31mG\u001B[0m";
        board.getGameBoard()[rowGhost2][columsGhost2] = "\033[31mG\u001B[0m";
        board.getGameBoard()[rowGhost3][columsGhost3] = "\033[31mG\u001B[0m";
        board.getGameBoard()[rowGhost4][columsGhost4] = "\033[31mG\u001B[0m";
        board.showBoard(board.getGameBoard());
        System.out.println("                                                      SCORE: " + point.showScore());
        System.out.println("Enter a move: ");
        char movements = keyword.next().charAt(0);
        point.setRowGhost1(rowGhost1);
        point.setColumnGhost1(columsGhost1);
        arr = newMovement.movement(movements, point.getRowGhost1(), point.getColumnGhost1());
        point.setRowGhost2(rowGhost2);
        point.setColumnGhost2(columsGhost2);
        arr2 = movementGhost.ghostMovement((String[][]) arr.get(0), point.getRowGhost2(), point.getColumnGhost2());
        point.setRowGhost3(rowGhost3);
        point.setColumnGhost3(columsGhost3);
        arr3 = movementGhost.ghostMovement((String[][]) arr2.get(0), point.getRowGhost3(), point.getColumnGhost3());
        point.setRowGhost4(rowGhost4);
        point.setColumnGhost4(columsGhost4);
        arr4 = movementGhost.ghostMovement((String[][]) arr3.get(0), point.getRowGhost4(), point.getColumnGhost4());
        point.setRowGhost1((int) arr.get(1));
        point.setColumnGhost1((int) arr.get(2));

        while (true) {
            System.out.println("                                                      SCORE: " + point.showScore());
            System.out.println("Enter a move: ");
            char movementsFollow = keyword.next().charAt(0);
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
        }
    }
}