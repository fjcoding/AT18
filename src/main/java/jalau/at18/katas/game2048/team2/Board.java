package jalau.at18.katas.game2048.team2;

//2 clases una de jugador y de tablero
//Array de 2 dimensiones
//funcion de movimientos validos
//Casillas vacias y con eso limitar los movimientos
//Variable score
//Crear sumatoria de variables iguales
//Solo la posición es random y el numero aparece es siempre el 2

public class Board {

    public int[][] board;
    public int score;
    public int sizeBoard;

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

}
