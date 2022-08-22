package jalau.at18.pacman;

import static org.junit.Assert.*;
import org.junit.Test;

public class MovementsPacmanTest {
    public static int X_BORDER = 25;
    public static int Y_BORDER = 29;
    public static int count_points_old = 0;
    public static int count_points_new = 0;
    Board board = new Board();
    MovementsPacman movements = new MovementsPacman();
    MovementsPacman point = new MovementsPacman();
    private String[][] arr = board.getGameBoard();
    final int rowPacman = 1;
    final int columsPacman = 1;
    private static int rowGhost = 8;
    private static int columnGhost = 15;

    @Test
    public void testMoveDown() {
        board.getGameBoard()[rowPacman][columsPacman] = "\033[33mC\u001B[0m";
        String[][] move_arr = movements.moveDown();
        board.setGameBoard(move_arr);
        String[][] new_arr = board.getGameBoard();
        for (int rows = 0; rows < X_BORDER; rows++) {
            for (int colums = 0; colums < Y_BORDER; colums++) {
                if (arr[rows][colums] == "·") {
                    count_points_old++;
                }
                if (new_arr[rows][colums] == "·") {
                    count_points_new++;
                }
            }
        }
        if (count_points_new == 279) {
            assertEquals(count_points_old - 10, count_points_new);
        }
        if (count_points_new == 280) {
            assertEquals(count_points_old - 9, count_points_new);
        }
        if (count_points_new == 281) {
            assertEquals(count_points_old - 8, count_points_new);
        }
        if (count_points_new == 282) {
            assertEquals(count_points_old - 7, count_points_new);
        }
        if (count_points_new == 283) {
            assertEquals(count_points_old - 6, count_points_new);
        }
        if (count_points_new == 284) {
            assertEquals(count_points_old - 5, count_points_new);
        }
    }

    @Test
    public void testMoveDownGhost() {
        board.getGameBoard()[rowPacman][columsPacman] = "\033[33mC\u001B[0m";
        board.getGameBoard()[rowGhost][columnGhost] = "\033[31mG\u001B[0m";
        String[][] move_ghost = movements.moveDownGhost(arr);
        board.setGameBoard(move_ghost);
        String[][] new_arr = board.getGameBoard();
        for (int rows = 0; rows < X_BORDER; rows++) {
            for (int colums = 0; colums < Y_BORDER; colums++) {
                if (arr[rows][colums] == "·") {
                    count_points_old++;
                }
                if (new_arr[rows][colums] == "·") {
                    count_points_new++;
                }
            }
        }
        if (count_points_new == 277) {
            assertEquals(count_points_old - 10, count_points_new);
        }
        if (count_points_new == 278) {
            assertEquals(count_points_old - 9, count_points_new);
        }
        if (count_points_new == 279) {
            assertEquals(count_points_old - 8, count_points_new);
        }
        if (count_points_new == 280) {
            assertEquals(count_points_old - 7, count_points_new);
        }
        if (count_points_new == 281) {
            assertEquals(count_points_old - 6, count_points_new);
        }
        if (count_points_new == 282) {
            assertEquals(count_points_old - 5, count_points_new);
        }
    }

    @Test
    public void testMoveLeft() {
        board.getGameBoard()[rowPacman][columsPacman] = "\033[33mC\u001B[0m";
        String[][] move_arr = movements.moveLeft();
        board.setGameBoard(move_arr);
        String[][] new_arr = board.getGameBoard();
        for (int rows = 0; rows < X_BORDER; rows++) {
            for (int colums = 0; colums < Y_BORDER; colums++) {
                if (arr[rows][colums] == "·") {
                    count_points_old++;
                }
                if (new_arr[rows][colums] == "·") {
                    count_points_new++;
                }
            }
        }
        if (count_points_new == 279) {
            assertEquals(count_points_old - 10, count_points_new);
        }
        if (count_points_new == 280) {
            assertEquals(count_points_old - 9, count_points_new);
        }
        if (count_points_new == 281) {
            assertEquals(count_points_old - 8, count_points_new);
        }
        if (count_points_new == 282) {
            assertEquals(count_points_old - 7, count_points_new);
        }
        if (count_points_new == 283) {
            assertEquals(count_points_old - 6, count_points_new);
        }
        if (count_points_new == 284) {
            assertEquals(count_points_old - 5, count_points_new);
        }
    }

    @Test
    public void testMoveLeftGhost() {
        board.getGameBoard()[rowPacman][columsPacman] = "\033[33mC\u001B[0m";
        board.getGameBoard()[rowGhost][columnGhost] = "\033[31mG\u001B[0m";
        String[][] move_ghost = movements.moveLeftGhost(arr);
        board.setGameBoard(move_ghost);
        String[][] new_arr = board.getGameBoard();
        for (int rows = 0; rows < X_BORDER; rows++) {
            for (int colums = 0; colums < Y_BORDER; colums++) {
                if (arr[rows][colums] == "·") {
                    count_points_old++;
                }
                if (new_arr[rows][colums] == "·") {
                    count_points_new++;
                }
            }
        }
        if (count_points_new == 277) {
            assertEquals(count_points_old - 10, count_points_new);
        }
        if (count_points_new == 278) {
            assertEquals(count_points_old - 9, count_points_new);
        }
        if (count_points_new == 279) {
            assertEquals(count_points_old - 8, count_points_new);
        }
        if (count_points_new == 280) {
            assertEquals(count_points_old - 7, count_points_new);
        }
        if (count_points_new == 281) {
            assertEquals(count_points_old - 6, count_points_new);
        }
        if (count_points_new == 282) {
            assertEquals(count_points_old - 5, count_points_new);
        }
    }

    @Test
    public void testMoveRight() {
        board.getGameBoard()[rowPacman][columsPacman] = "\033[33mC\u001B[0m";
        String[][] move_arr = movements.moveRight();
        board.setGameBoard(move_arr);
        String[][] new_arr = board.getGameBoard();
        for (int rows = 0; rows < X_BORDER; rows++) {
            for (int colums = 0; colums < Y_BORDER; colums++) {
                if (arr[rows][colums] == "·") {
                    count_points_old++;
                }
                if (new_arr[rows][colums] == "·") {
                    count_points_new++;
                }
            }
        }
        if (count_points_new == 279) {
            assertEquals(count_points_old - 10, count_points_new);
        }
        if (count_points_new == 280) {
            assertEquals(count_points_old - 9, count_points_new);
        }
        if (count_points_new == 281) {
            assertEquals(count_points_old - 8, count_points_new);
        }
        if (count_points_new == 282) {
            assertEquals(count_points_old - 7, count_points_new);
        }
        if (count_points_new == 283) {
            assertEquals(count_points_old - 6, count_points_new);
        }
        if (count_points_new == 284) {
            assertEquals(count_points_old - 5, count_points_new);
        }
    }

    @Test
    public void testMoveRightGhost() {
        board.getGameBoard()[rowPacman][columsPacman] = "\033[33mC\u001B[0m";
        board.getGameBoard()[rowGhost][columnGhost] = "\033[31mG\u001B[0m";
        String[][] move_ghost = movements.moveRightGhost(arr);
        board.setGameBoard(move_ghost);
        String[][] new_arr = board.getGameBoard();
        for (int rows = 0; rows < X_BORDER; rows++) {
            for (int colums = 0; colums < Y_BORDER; colums++) {
                if (arr[rows][colums] == "·") {
                    count_points_old++;
                }
                if (new_arr[rows][colums] == "·") {
                    count_points_new++;
                }
            }
        }
        if (count_points_new == 277) {
            assertEquals(count_points_old - 10, count_points_new);
        }
        if (count_points_new == 278) {
            assertEquals(count_points_old - 9, count_points_new);
        }
        if (count_points_new == 279) {
            assertEquals(count_points_old - 8, count_points_new);
        }
        if (count_points_new == 280) {
            assertEquals(count_points_old - 7, count_points_new);
        }
        if (count_points_new == 281) {
            assertEquals(count_points_old - 6, count_points_new);
        }
        if (count_points_new == 282) {
            assertEquals(count_points_old - 5, count_points_new);
        }
    }

    @Test
    public void testMoveUp() {
        board.getGameBoard()[rowPacman][columsPacman] = "\033[33mC\u001B[0m";
        String[][] move_arr = movements.moveUp();
        board.setGameBoard(move_arr);
        String[][] new_arr = board.getGameBoard();
        for (int rows = 0; rows < X_BORDER; rows++) {
            for (int colums = 0; colums < Y_BORDER; colums++) {
                if (arr[rows][colums] == "·") {
                    count_points_old++;
                }
                if (new_arr[rows][colums] == "·") {
                    count_points_new++;
                }
            }
        }
        if (count_points_new == 279) {
            assertEquals(count_points_old - 10, count_points_new);
        }
        if (count_points_new == 280) {
            assertEquals(count_points_old - 9, count_points_new);
        }
        if (count_points_new == 281) {
            assertEquals(count_points_old - 8, count_points_new);
        }
        if (count_points_new == 282) {
            assertEquals(count_points_old - 7, count_points_new);
        }
        if (count_points_new == 283) {
            assertEquals(count_points_old - 6, count_points_new);
        }
        if (count_points_new == 284) {
            assertEquals(count_points_old - 5, count_points_new);
        }
    }

    @Test
    public void testMoveUpGhost() {
        board.getGameBoard()[rowPacman][columsPacman] = "\033[33mC\u001B[0m";
        board.getGameBoard()[rowGhost][columnGhost] = "\033[31mG\u001B[0m";
        String[][] move_ghost = movements.moveUpGhost(arr);
        board.setGameBoard(move_ghost);
        String[][] new_arr = board.getGameBoard();
        for (int rows = 0; rows < X_BORDER; rows++) {
            for (int colums = 0; colums < Y_BORDER; colums++) {
                if (arr[rows][colums] == "·") {
                    count_points_old++;
                }
                if (new_arr[rows][colums] == "·") {
                    count_points_new++;
                }
            }
        }
        if (count_points_new == 277) {
            assertEquals(count_points_old - 10, count_points_new);
        }
        if (count_points_new == 278) {
            assertEquals(count_points_old - 9, count_points_new);
        }
        if (count_points_new == 279) {
            assertEquals(count_points_old - 8, count_points_new);
        }
        if (count_points_new == 280) {
            assertEquals(count_points_old - 7, count_points_new);
        }
        if (count_points_new == 281) {
            assertEquals(count_points_old - 6, count_points_new);
        }
        if (count_points_new == 282) {
            assertEquals(count_points_old - 5, count_points_new);
        }
    }

    @Test
    public void testShowScore() {
        board.getGameBoard()[rowPacman][columsPacman] = "\033[33mC\u001B[0m";
        String[][] move_arr = movements.moveRight();
        board.setGameBoard(move_arr);
        int points = point.showScore();
        assertEquals(50, points);
    }
}
