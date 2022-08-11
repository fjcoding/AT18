package jalau.at18.katas.game2048.team2;

import java.util.Random;
//import java.util.Vector;

//import javax.swing.text.Position;

//2 clases una de jugador y de tablero
//Array de 2 dimensiones
//funcion de movimientos validos
//Casillas vacias y con eso limitar los movimientos
//Variable score
//Crear sumatoria de variables iguales
//Solo la posición es random y el numero aparece es siempre el 2
//public static final position1 = 0;
public class Board {
    public int[][] board;
    public int score;
    public int sizeBoard;
    public final int tokenInitial = 2;
    public final int tokenSecond = 2;
    public final int size = 4;

    public Board(int sizeBoard, int score) {
        this.sizeBoard = sizeBoard;
        this.score = score;
        score = 0;
        board = new int[4][4];
        createTable();
    }

    public void showTable() {
        for (int indexRows = 0; indexRows < size; indexRows++) {
            for (int indexColumns = 0; indexColumns < size; indexColumns++) {
                System.out.print(board[indexRows][indexColumns] + " ");
            }
            System.out.println();
        }
    }

    public void createTable() {
        for (int indexRows = 0; indexRows < size; indexRows++) {
            for (int indexColumns = 0; indexColumns < size; indexColumns++) {
                board[indexRows][indexColumns] = 0;
            }
        }
    }

    public int getPosition(int x, int y) {
        return board[x][y];
    }

    public boolean isValidThePosition(int x, int y) {
        if (board[x][y] == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void replacePositions(int position1, int Position2, int number) {

        if (board[position1][Position2] == 0) {
            board[position1][Position2] = number;
        }
    }

    public void moveNumbers(char direction) {
        if (direction == 'w') {
            for (int indexRow = 1; indexRow < 4; indexRow++) {
                if (board[indexRow - 1][0] == 0) {
                    board[indexRow - 1][0] = board[indexRow][0];
                    board[indexRow][0] = 0;
                }
            }
            /*
             * for (int indexRows = 0; indexRows < 4; indexRows++) {
             * for (int indexColumns = 0; indexColumns < 4; indexColumns++) {
             * if( board[indexRows][indexColumns] != 0 && indexRows !=0){
             * board[0][indexColumns] = board[indexRows][indexColumns];
             * board[indexRows][indexColumns] = 0;
             * }
             * }
             *
             * }
             */
        }
    }

    public void moveNumberR(char direction) {
        if (direction == 'a') {
            for (int indexRows = 0; indexRows < 4; indexRows++) {
                for (int indexColumns = 0; indexColumns < 4; indexColumns++) {
                    if (board[indexRows][indexColumns] != 0 && indexColumns != 0) {
                        board[indexRows][0] = board[indexRows][indexColumns];
                        board[indexRows][indexColumns] = 0;
                    }
                }

            }
        }
    }

    public void moveNumberL(char direction) {
        if (direction == 'd') {
            for (int indexRows = 0; indexRows < 4; indexRows++) {
                for (int indexColumns = 0; indexColumns < 4; indexColumns++) {
                    if (board[indexRows][indexColumns] != 0 && indexColumns != 0) {
                        board[indexRows][3] = board[indexRows][indexColumns];
                        board[indexRows][indexColumns] = 0;
                    }
                }

            }
        }
    }

    public void MoveNumberD(char direction) {
        if (direction == 's') {
            for (int indexRows = 0; indexRows < 4; indexRows++) {
                for (int indexColumns = 0; indexColumns < 4; indexColumns++) {
                    if (board[indexRows][indexColumns] != 0 && indexRows != 0) {
                        board[3][indexColumns] = board[indexRows][indexColumns];
                        board[indexRows][indexColumns] = 0;
                    }
                }

            }
        }

    }

}
