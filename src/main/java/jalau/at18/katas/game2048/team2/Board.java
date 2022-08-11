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
        board = new int[size][size];
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

    public void generateTokens() {
        int[][] matrix = new int[size][size];
        Random random = new Random();
        int firstNumberRandomRow = random.nextInt(matrix.length);
        int firstNumberRandomColumn = random.nextInt(matrix.length);
        System.out.print("Row:" + firstNumberRandomRow + ", ");
        System.out.print("Column:" + firstNumberRandomColumn + ": ");
        // Position 2
        int secondNumberRandomRow = random.nextInt(matrix.length);
        int secondNumberRandomColumn = random.nextInt(matrix.length);
        System.out.print("Row:" + secondNumberRandomRow + ", ");
        System.out.println("Column:" + secondNumberRandomColumn + ": ");
        int[][] mainMatrix = new int[size][size];
        for (int index = 0; index < mainMatrix[0].length; index++) {
            for (int indej = 0; indej < mainMatrix[1].length; indej++) {
                if (index == firstNumberRandomRow && indej == firstNumberRandomColumn) {
                    mainMatrix[index][indej] = tokenInitial;
                }
                if (index == secondNumberRandomRow && indej == secondNumberRandomColumn) {
                    mainMatrix[index][indej] = tokenSecond;
                }
                System.out.print(mainMatrix[index][indej] + " ");
            }
            System.out.println("");
        }
    }

    public void replacePositions(int position1, int position2) {
    }

}
