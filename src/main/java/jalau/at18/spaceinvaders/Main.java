package jalau.at18.spaceinvaders;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        //Board board = new Board();
        //System.out.println(board.toString());
        Alien alien = new Alien();
        alien.alienRigth();
        alien.alienLeft();
        System.out.println(alien.toString());
        Game game = new Game();
        game.move();


    }
}



