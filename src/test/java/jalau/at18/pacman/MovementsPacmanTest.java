package jalau.at18.pacman;

import static org.junit.Assert.*;
import org.junit.Test;

public class MovementsPacmanTest {
    // private static final int FIRSTLIMIT = 277;
    // private static final int SECONDLIMIT = 278;
    // private static final int THIRDLIMIT = 279;
    // private static final int FOURTHLIMIT = 280;
    // private static final int FIFTHLIMIT = 281;
    // private static final int SIXTHLIMIT = 282;
    // private static final int SEVENTHLIMIT = 283;
    // private static final int EIGHTTHLIMIT = 284;
    // private static final int FIVE = 5;
    // private static final int SIX = 6;
    // private static final int SEVEN = 7;
    // private static final int EIGHT = 8;
    // private static final int NINE = 9;
    // private static final int TEN = 10;
    // private static final int FIFTY = 50;
    // private static int xBORDER = 25;
    // private static int yBORDER = 29;
    // private static int countPointsOld = 0;
    // private static int countPointsNew = 0;
    // private Board board = new Board();
    // private MovementsPacman movements = new MovementsPacman();
    // private MovementsPacman point = new MovementsPacman();
    // private String[][] arr = board.getGameBoard();
    // private final int rowPacman = 1;
    // private final int columsPacman = 1;
    // private static int rowGhost = 8;
    // private static int columnGhost = 15;

    // @Test
    // public void testMoveDown() {
    // board.getGameBoard()[rowPacman][columsPacman] = "\033[33mC\u001B[0m";
    // String[][] move_arr = movements.moveDown();
    // board.setGameBoard(move_arr);
    // String[][] new_arr = board.getGameBoard();
    // for (int rows = 0; rows < xBORDER; rows++) {
    // for (int colums = 0; colums < yBORDER; colums++) {
    // if (arr[rows][colums] == "·") {
    // countPointsOld++;
    // }
    // if (new_arr[rows][colums] == "·") {
    // countPointsOld++;
    // }
    // }
    // }
    // if (countPointsNew == THIRDLIMIT) {
    // assertEquals(countPointsOld - TEN, countPointsNew);
    // }
    // if (countPointsNew == FOURTHLIMIT) {
    // assertEquals(countPointsOld - NINE, countPointsNew);
    // }
    // if (countPointsNew == FIFTHLIMIT) {
    // assertEquals(countPointsOld - EIGHT, countPointsNew);
    // }
    // if (countPointsNew == SIXTHLIMIT) {
    // assertEquals(countPointsOld - SEVEN, countPointsNew);
    // }
    // if (countPointsNew == SEVENTHLIMIT) {
    // assertEquals(countPointsOld - SIX, countPointsNew);
    // }
    // if (countPointsNew == EIGHTTHLIMIT) {
    // assertEquals(countPointsOld - FIVE, countPointsNew);
    // }
    // }

    // @Test
    // public void testMoveDownGhost() {
    // board.getGameBoard()[rowPacman][columsPacman] = "\033[33mC\u001B[0m";
    // board.getGameBoard()[rowGhost][columnGhost] = "\033[31mG\u001B[0m";
    // String[][] move_ghost = movements.moveDownGhost(arr, rowGhost, columnGhost);
    // board.setGameBoard(move_ghost);
    // String[][] new_arr = board.getGameBoard();
    // for (int rows = 0; rows < xBORDER; rows++) {
    // for (int colums = 0; colums < yBORDER; colums++) {
    // if (arr[rows][colums] == "·") {
    // countPointsOld++;
    // }
    // if (new_arr[rows][colums] == "·") {
    // countPointsNew++;
    // }
    // }
    // }
    // if (countPointsNew == FIRSTLIMIT) {
    // assertEquals(countPointsOld - TEN, countPointsNew);
    // }
    // if (countPointsNew == SECONDLIMIT) {
    // assertEquals(countPointsOld - NINE, countPointsNew);
    // }
    // if (countPointsNew == THIRDLIMIT) {
    // assertEquals(countPointsOld - EIGHT, countPointsNew);
    // }
    // if (countPointsNew == FOURTHLIMIT) {
    // assertEquals(countPointsOld - SEVEN, countPointsNew);
    // }
    // if (countPointsNew == FIFTHLIMIT) {
    // assertEquals(countPointsOld - SIX, countPointsNew);
    // }
    // if (countPointsNew == SIXTHLIMIT) {
    // assertEquals(countPointsOld - FIVE, countPointsNew);
    // }
    // }

    // @Test
    // public void testMoveLeft() {
    // board.getGameBoard()[rowPacman][columsPacman] = "\033[33mC\u001B[0m";
    // String[][] move_arr = movements.moveLeft();
    // board.setGameBoard(move_arr);
    // String[][] new_arr = board.getGameBoard();
    // for (int rows = 0; rows < xBORDER; rows++) {
    // for (int colums = 0; colums < yBORDER; colums++) {
    // if (arr[rows][colums] == "·") {
    // countPointsOld++;
    // }
    // if (new_arr[rows][colums] == "·") {
    // countPointsNew++;
    // }
    // }
    // }
    // if (countPointsNew == THIRDLIMIT) {
    // assertEquals(countPointsOld - TEN, countPointsNew);
    // }
    // if (countPointsNew == FOURTHLIMIT) {
    // assertEquals(countPointsOld - NINE, countPointsNew);
    // }
    // if (countPointsNew == FIFTHLIMIT) {
    // assertEquals(countPointsOld - EIGHT, countPointsNew);
    // }
    // if (countPointsNew == SIXTHLIMIT) {
    // assertEquals(countPointsOld - SEVEN, countPointsNew);
    // }
    // if (countPointsNew == SEVENTHLIMIT) {
    // assertEquals(countPointsOld - SIX, countPointsNew);
    // }
    // if (countPointsNew == EIGHTTHLIMIT) {
    // assertEquals(countPointsOld - FIVE, countPointsNew);
    // }
    // }

    // @Test
    // public void testMoveLeftGhost() {
    // board.getGameBoard()[rowPacman][columsPacman] = "\033[33mC\u001B[0m";
    // board.getGameBoard()[rowGhost][columnGhost] = "\033[31mG\u001B[0m";
    // String[][] move_ghost = movements.moveLeftGhost(arr, rowGhost, columnGhost);
    // board.setGameBoard(move_ghost);
    // String[][] new_arr = board.getGameBoard();
    // for (int rows = 0; rows < xBORDER; rows++) {
    // for (int colums = 0; colums < yBORDER; colums++) {
    // if (arr[rows][colums] == "·") {
    // countPointsOld++;
    // }
    // if (new_arr[rows][colums] == "·") {
    // countPointsNew++;
    // }
    // }
    // }
    // if (countPointsNew == FIRSTLIMIT) {
    // assertEquals(countPointsOld - TEN, countPointsNew);
    // }
    // if (countPointsNew == SECONDLIMIT) {
    // assertEquals(countPointsOld - NINE, countPointsNew);
    // }
    // if (countPointsNew == THIRDLIMIT) {
    // assertEquals(countPointsOld - EIGHT, countPointsNew);
    // }
    // if (countPointsNew == FOURTHLIMIT) {
    // assertEquals(countPointsOld - SEVEN, countPointsNew);
    // }
    // if (countPointsNew == FIFTHLIMIT) {
    // assertEquals(countPointsOld - SIX, countPointsNew);
    // }
    // if (countPointsNew == SIXTHLIMIT) {
    // assertEquals(countPointsOld - FIVE, countPointsNew);
    // }
    // }

    // @Test
    // public void testMoveRight() {
    // board.getGameBoard()[rowPacman][columsPacman] = "\033[33mC\u001B[0m";
    // String[][] move_arr = movements.moveRight();
    // board.setGameBoard(move_arr);
    // String[][] new_arr = board.getGameBoard();
    // for (int rows = 0; rows < xBORDER; rows++) {
    // for (int colums = 0; colums < yBORDER; colums++) {
    // if (arr[rows][colums] == "·") {
    // countPointsOld++;
    // }
    // if (new_arr[rows][colums] == "·") {
    // countPointsNew++;
    // }
    // }
    // }
    // if (countPointsNew == THIRDLIMIT) {
    // assertEquals(countPointsOld - TEN, countPointsNew);
    // }
    // if (countPointsNew == FOURTHLIMIT) {
    // assertEquals(countPointsOld - NINE, countPointsNew);
    // }
    // if (countPointsNew == FIFTHLIMIT) {
    // assertEquals(countPointsOld - EIGHT, countPointsNew);
    // }
    // if (countPointsNew == SIXTHLIMIT) {
    // assertEquals(countPointsOld - SEVEN, countPointsNew);
    // }
    // if (countPointsNew == SEVENTHLIMIT) {
    // assertEquals(countPointsOld - SIX, countPointsNew);
    // }
    // if (countPointsNew == EIGHTTHLIMIT) {
    // assertEquals(countPointsOld - FIVE, countPointsNew);
    // }
    // }

    // @Test
    // public void testMoveRightGhost() {
    // board.getGameBoard()[rowPacman][columsPacman] = "\033[33mC\u001B[0m";
    // board.getGameBoard()[rowGhost][columnGhost] = "\033[31mG\u001B[0m";
    // String[][] move_ghost = movements.moveRightGhost(arr, rowGhost, columnGhost);
    // board.setGameBoard(move_ghost);
    // String[][] new_arr = board.getGameBoard();
    // for (int rows = 0; rows < xBORDER; rows++) {
    // for (int colums = 0; colums < yBORDER; colums++) {
    // if (arr[rows][colums] == "·") {
    // countPointsOld++;
    // }
    // if (new_arr[rows][colums] == "·") {
    // countPointsNew++;
    // }
    // }
    // }
    // if (countPointsNew == FIRSTLIMIT) {
    // assertEquals(countPointsOld - TEN, countPointsNew);
    // }
    // if (countPointsNew == SECONDLIMIT) {
    // assertEquals(countPointsOld - NINE, countPointsNew);
    // }
    // if (countPointsNew == THIRDLIMIT) {
    // assertEquals(countPointsOld - EIGHT, countPointsNew);
    // }
    // if (countPointsNew == FOURTHLIMIT) {
    // assertEquals(countPointsOld - SEVEN, countPointsNew);
    // }
    // if (countPointsNew == FIFTHLIMIT) {
    // assertEquals(countPointsOld - SIX, countPointsNew);
    // }
    // if (countPointsNew == SIXTHLIMIT) {
    // assertEquals(countPointsOld - FIVE, countPointsNew);
    // }
    // }

    // @Test
    // public void testMoveUp() {
    // board.getGameBoard()[rowPacman][columsPacman] = "\033[33mC\u001B[0m";
    // String[][] move_arr = movements.moveUp();
    // board.setGameBoard(move_arr);
    // String[][] new_arr = board.getGameBoard();
    // for (int rows = 0; rows < xBORDER; rows++) {
    // for (int colums = 0; colums < yBORDER; colums++) {
    // if (arr[rows][colums] == "·") {
    // countPointsOld++;
    // }
    // if (new_arr[rows][colums] == "·") {
    // countPointsNew++;
    // }
    // }
    // }
    // if (countPointsNew == THIRDLIMIT) {
    // assertEquals(countPointsOld - TEN, countPointsNew);
    // }
    // if (countPointsNew == FOURTHLIMIT) {
    // assertEquals(countPointsOld - NINE, countPointsNew);
    // }
    // if (countPointsNew == FIFTHLIMIT) {
    // assertEquals(countPointsOld - EIGHT, countPointsNew);
    // }
    // if (countPointsNew == SIXTHLIMIT) {
    // assertEquals(countPointsOld - SEVEN, countPointsNew);
    // }
    // if (countPointsNew == SEVENTHLIMIT) {
    // assertEquals(countPointsOld - SIX, countPointsNew);
    // }
    // if (countPointsNew == EIGHTTHLIMIT) {
    // assertEquals(countPointsOld - FIVE, countPointsNew);
    // }
    // }

    // @Test
    // public void testMoveUpGhost() {
    // board.getGameBoard()[rowPacman][columsPacman] = "\033[33mC\u001B[0m";
    // board.getGameBoard()[rowGhost][columnGhost] = "\033[31mG\u001B[0m";
    // String[][] move_ghost = movements.moveUpGhost(arr, rowGhost, columnGhost);
    // board.setGameBoard(move_ghost);
    // String[][] new_arr = board.getGameBoard();
    // for (int rows = 0; rows < xBORDER; rows++) {
    // for (int colums = 0; colums < yBORDER; colums++) {
    // if (arr[rows][colums] == "·") {
    // countPointsOld++;
    // }
    // if (new_arr[rows][colums] == "·") {
    // countPointsNew++;
    // }
    // }
    // }
    // if (countPointsNew == FIRSTLIMIT) {
    // assertEquals(countPointsOld - TEN, countPointsNew);
    // }
    // if (countPointsNew == SECONDLIMIT) {
    // assertEquals(countPointsOld - NINE, countPointsNew);
    // }
    // if (countPointsNew == THIRDLIMIT) {
    // assertEquals(countPointsOld - EIGHT, countPointsNew);
    // }
    // if (countPointsNew == FOURTHLIMIT) {
    // assertEquals(countPointsOld - SEVEN, countPointsNew);
    // }
    // if (countPointsNew == FIFTHLIMIT) {
    // assertEquals(countPointsOld - SIX, countPointsNew);
    // }
    // if (countPointsNew == SIXTHLIMIT) {
    // assertEquals(countPointsOld - FIVE, countPointsNew);
    // }
    // }

    // @Test
    // public void testShowScore() {
    // board.getGameBoard()[rowPacman][columsPacman] = "\033[33mC\u001B[0m";
    // String[][] move_arr = movements.moveRight();
    // board.setGameBoard(move_arr);
    // int points = point.showScore();
    // assertEquals(FIFTY, points);
    // }
}
