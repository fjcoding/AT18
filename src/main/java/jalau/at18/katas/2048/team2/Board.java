package jalau.at18.katas.2048.team2;

//2 clases una de jugador y de tablero
//Array de 2 dimensiones
//funcion de movimientos validos
//Casillas vacias y con eso limitar los movimientos
//Variable score
//Crear sumatoria de variables iguales
//Solo la posición es random y el numero aparece es siempre el 2

public class Board()
{

    public int[][] board;
    public int score;
    public int sizeBoard;

    public Board (int sizeBoard, int score) {
        this.sizeBoard = sizeBoard;
        this.score = score;
        score = 0;
    }

    public void showTable(int[][] table) {

    }

}
