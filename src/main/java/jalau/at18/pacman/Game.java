package jalau.at18.pacman;

public class Game {
    


    public void runGame() {
        initGame();
        while(!(isWinner() || isGameOver())) {
            System.out.println("Enter s move:");
        }

    }
    public boolean isGameOver() {
        return true;
    }
    public boolean isWinner() {
        return true;
    }
    public void initGame() {
        Board board = new Board();
        System.out.println("******Bienvenido al juego******");
        board.showBoard(board.getGameBoard());
    }
    
}
