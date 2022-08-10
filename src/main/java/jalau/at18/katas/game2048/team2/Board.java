package jalau.at18.katas.game2048.team2;

import java.util.Random;
import java.util.Vector;

import javax.swing.text.Position;

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
    public final int TOKEN_INITIAL = 2;
    public final int TOKEN_SECOND = 2;
    public Board(int sizeBoard, int score) {
        this.sizeBoard = sizeBoard;
        this.score = score;
        score = 0;
        board = new int[4][4];
    }
    public void showTable() {
        for (int indexRows = 0; indexRows < 4; indexRows++) {
            for (int indexColumns = 0; indexColumns < 4; indexColumns++) {
                System.out.print(board[indexRows][indexColumns] + " ");
            }
            System.out.println();
        }
    }
    public void createTable() {
        for (int indexRows = 0; indexRows < 4; indexRows++) {
            for (int indexColumns = 0; indexColumns < 4; indexColumns++) {
                board[indexRows][indexColumns] = 0;
            }
        }
    }
    public void generateTokens() {
        int[][] matrix = new int[4][4];
        Random r = new Random();
        int firstNumberRandomRow = r.nextInt(matrix.length);
        int firstNumberRandomColumn = r.nextInt(matrix.length);
        System.out.print("Row:" + firstNumberRandomRow + ", ");
        System.out.print("Column:" + firstNumberRandomColumn + ": ");
        // Position 2
        int secondNumberRandomRow = r.nextInt(matrix.length);
        int secondNumberRandomColumn = r.nextInt(matrix.length);
        System.out.print("Row:" + secondNumberRandomRow + ", ");
        System.out.println("Column:" + secondNumberRandomColumn + ": ");
        int[][] mainMatrix = new int[4][4];
        for (int index = 0; index < mainMatrix[0].length; index++) {
            for (int indej = 0; indej < mainMatrix[1].length; indej++) {
                if (index == firstNumberRandomRow && indej == firstNumberRandomColumn) {
                    mainMatrix[index][indej] = TOKEN_INITIAL;
                }
                if (index == secondNumberRandomRow && indej == secondNumberRandomColumn) {
                    mainMatrix[index][indej] = TOKEN_SECOND;
                }
                System.out.print(mainMatrix[index][indej] + " ");
            }
            System.out.println("");
        }
    }
    public void replacePositions(int position1, int Position2) {
    }

}
