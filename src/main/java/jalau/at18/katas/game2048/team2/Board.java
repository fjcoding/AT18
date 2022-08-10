package jalau.at18.katas.game2048.team2;

import java.util.Random;
import java.util.Vector;

//2 clases una de jugador y de tablero
//Array de 2 dimensiones
//funcion de movimientos validos
//Casillas vacias y con eso limitar los movimientos
//Variable score
//Crear sumatoria de variables iguales
//Solo la posición es random y el numero aparece es siempre el 2
public static final position1 = 0;
public class Board {

    public int[][] board;
    public int score;
    public int sizeBoard;

    public Board(int sizeBoard, int score) {
        this.sizeBoard = sizeBoard;
        this.score = score;
        score = 0;
        board = new int[4][4];
        int position1 = 0;
        int position2 = 0;

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
        int[][] matriz = new int[4][4];

        Random r = new Random();

        for (int i = 0; i < 2; i++)
        {
            int i1 = r.nextInt(matriz.length);
            int i2 = r.nextInt(matriz[0].length);
            System.out.print("Fila:" + i1 + ", ");
            System.out.print("Columna:" + i2 + ": ");
            //position1 = matriz[i1][i2];
           // System.out.println("Valor:" + matriz[i1][i2]);
        }

    }
    public void replacePositions() {
        if (board[i][j] == position1) {

        }
    }

}
