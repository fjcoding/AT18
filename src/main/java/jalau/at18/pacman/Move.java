package jalau.at18.pacman;

public class Move {
    private String direction;
    private static final int TIME = 200;


    public Move(String nextDirection) {
        this.direction = nextDirection;
    }
    public void directionChecker() {
        switch (this.direction) {
            case "w":
             
                break;
            case "a":
                System.out.println("You moved the numbers left!");
               
                break;
            case "d":
                System.out.println("You moved the numbers right!");
             
                break;
            case "s":
                System.out.println("You moved the numbers down!");
               
                break;
            case "q":
                System.out.println("You are about to Quit!");
                break;
            default:
                System.out.println(
                        "PLease type a correct direction. Directions: [up, down, left, right] = [w, s, a, d]. if you want to exit type 'q'");
        }
    }
    public String getDirection() {
        return this.direction;
    }

    public void movements(char a) {
        Board board = new Board();
        Board tablero = new Board();
        int row = 1;
        int column = 1;
        if (a == 'd') {
            try {
                while (board.getGameBoard()[row][column + 1] != "▒") {
                    column++;
                    if (board.getGameBoard()[row][column] == "·") {
                        board.getGameBoard()[row][column - 1] = " ";
                        // score += 10;
                    } else {
                        board.getGameBoard()[row][column - 1] = " ";
                        // score = score + 0;
                    }
                    board.getGameBoard()[row][column] = "C";
                    Thread.sleep(TIME);
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    tablero.showBoard(board.getGameBoard());
                }
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            board.getGameBoard()[row][column] = "C";
        }
        if (a == 's') {
            try {
                while (board.getGameBoard()[row + 1][column] != "▒") {
                    row++;
                    if (board.getGameBoard()[row][column] == "·") {
                        board.getGameBoard()[row - 1][column] = " ";
                        // score += 10;
                    } else {
                        board.getGameBoard()[row - 1][column] = " ";
                        // score = score + 0;
                    }

                    board.getGameBoard()[row][column] = "C";
                    Thread.sleep(TIME);
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    tablero.showBoard(board.getGameBoard());
                }
            } catch (InterruptedException ex) {
                ex.printStackTrace();

            }
        }
        if (a == 'a') {
            try {
                while (board.getGameBoard()[row][column - 1] != "▒") {
                    column--;
                    if (board.getGameBoard()[row][column] == "·") {
                        board.getGameBoard()[row][column + 1] = " ";
                        // score += 10;
                    } else {
                        board.getGameBoard()[row][column + 1] = " ";
                        // score = score + 0;
                    }
                    board.getGameBoard()[row][column] = "C";
                    Thread.sleep(TIME);

                    System.out.print("\033[H\033[2J");

                    System.out.flush();

                    tablero.showBoard(board.getGameBoard());
                }
            } catch (InterruptedException ex) {

                ex.printStackTrace();
            }

        }
        if (a == 'w') {
            /////////////////////////////////////////////////
            try {
                while (board.getGameBoard()[row - 1][column] != "▒") {
                    row--;
                    if (board.getGameBoard()[row][column] == "·") {
                        board.getGameBoard()[row + 1][column] = " ";
                        // score += 10;
                    } else {
                        board.getGameBoard()[row + 1][column] = " ";
                        // score = score + 0;
                    }
                    board.getGameBoard()[row][column] = "C";
                    Thread.sleep(TIME);
                    System.out.print("\033[H\033[2J");

                    System.out.flush();

                    tablero.showBoard(board.getGameBoard());
                }
            } catch (InterruptedException ex) {

                ex.printStackTrace();
            }
        }
    }
    
}
