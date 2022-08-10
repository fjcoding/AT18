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

    public Board(int sizeBoard, int score) {
        this.sizeBoard = sizeBoard;
        this.score = score;
        score = 0;
        board = new int[4][4];
        // int position1 = 0;
        // int position2 = 0;

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

    public int generateTokens(int[][] matriz) {
        int[][] matriz = new int[4][4];

        Random r = new Random();
        int i1 = r.nextInt(matriz.length);
        int i2 = r.nextInt(matriz.length);
        System.out.print("Fila:" + i1 + ", ");
        System.out.print("Columna:" + i2 + ": ");
        // 2 posicion
        int i11 = r.nextInt(matriz.length);
        int i22 = r.nextInt(matriz.length);
        System.out.print("Fila:" + i11 + ", ");
        System.out.println("Columna:" + i22 + ": ");
        int[][] matrizprincipal = new int[4][4];
        for (int index = 0; index < matrizprincipal[0].length; index++) {
            for (int indej = 0; indej < matrizprincipal[1].length; indej++) {
                if (index == i1 && indej == i2) {
                    matrizprincipal[index][indej] = 2;
                }

                if (index == i11 && indej == i22) {
                    matrizprincipal[index][indej] = 2;
                }
                System.out.print(matrizprincipal[index][indej] + " ");
            }
            System.out.println("");
        }
    }

    public void replacePositions(int position1, int Position2) {

    }

}
