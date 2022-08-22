package jalau.at18.pacman;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Random;

public class Pacman {
    public static int points = 0;
//    public static int score = 0;
    private static int row = 1;
    private static int column = 1;
    private static final int TIME = 200;
    public static String  primero ="\033[34mO\u001B[0m", segundo = "·";
    public static int  a1 = 0, a2 = 0, a3 = 0, a4 = 0, a5 = 0;
    
    public static int auxCantidadImpresiones = 0;

    Board board = new Board();
    private String[][] arr = board.getGameBoard();

    public void moveUp(char a) {
        if (a == 'd') {
            try {
                while (arr[row][column + 1] != "▒") {
                    column++;
                    //board.position(arr,row,column);
                   // timefruits(arr,row,column);
                    if (arr[row][column] == "·") {
                        arr[row][column - 1] = " ";
                        //score += 10;
                    }/*
                    if (arr[row][column] == "\033[34mO\u001B[0m")
                    {
                            arr[row][column - 1] = " ";
                            score = score + 50;
                            
                    }
                    else if (arr[row][column]=="\033[35mX\u001B[0m")//X
                    {       
                            arr[row][column - 1] = " ";
                            score = score + 100;
                    }
                    else if (arr[row][column] == "\033[32mM\u001B[0m")//arr[n][m]=="M")
                    {       
                            arr[row][column - 1] = " ";
                            score = score + 300;
                    }*/ else {
                        arr[row][column - 1] = " ";
                        //score = score + 0;
                    }
                    arr[row][column] = "\033[33mC\u001B[0m";
                    
                    Thread.sleep(TIME);
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    board.showBoard(arr,row,column);
                    //contTimeToShowFruits+=1;
                }
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            arr[row][column] = "\033[33mC\u001B[0m";
            //arr[row][column] = "C";
        }
        if (a == 's') {
            try {
                while (arr[row + 1][column] != "▒") {
                    row++;
                   // board.position(arr,row,column);
                    //timefruits(arr,row,column);
                    if (arr[row][column] == "·") {
                        arr[row - 1][column] = " ";
                        //score += 10;
                    } /*if(arr[row][column] =="\033[34mO\u001B[0m")//arr[n][m] == "O")                 
                    {       arr[row - 1][column] = " ";
                            score = score + 50;
                    }
                    else if (arr[row][column]=="\033[35mX\u001B[0m")
                    {       
                        arr[row - 1][column] = " ";
                        score = score + 100;
                    }
                    else if (arr[row][column]=="\033[32mM\u001B[0m")
                    {
                    arr[row - 1][column] = " ";
                    score = score + 300;
                    }*/ else {
                        arr[row - 1][column] = " ";
                        //score = score + 0;
                    }
                    arr[row][column] = "\033[33mC\u001B[0m";
                    //arr[row][column] = "C";
                    Thread.sleep(TIME);
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                   // board.showBoard(arr);
                    board.showBoard(arr,row,column);
                   // contTimeToShowFruits+=1;
                }
            } catch (InterruptedException ex) {
                ex.printStackTrace();

            }
        }
        if (a == 'a') {
            try {
                while (arr[row][column - 1] != "▒") {
                    column--;
                    //board.position(arr,row,column);
                    //timefruits(arr,row,column);
                    if (arr[row][column] == "·") {
                        arr[row][column + 1] = " ";
                       // score += 10;
                    }
                     else {
                        arr[row][column + 1] = " ";
                        //score = score + 0;
                    }
                    arr[row][column] = "\033[33mC\u001B[0m";
                    //arr[row][column] = "C";
                    Thread.sleep(TIME);

                    System.out.print("\033[H\033[2J");

                    System.out.flush();
                    board.showBoard(arr,row,column);
                    //contTimeToShowFruits+=1;
                    //board.showBoard(arr);
                }
            } catch (InterruptedException ex) {

                ex.printStackTrace();
            }

        }
        if (a == 'w') {
            /////////////////////////////////////////////////
            try {
                while (arr[row - 1][column] != "▒") {
                    row--;
                    //board.position(arr,row,column);
                   // timefruits(arr,row,column);
                    if (arr[row][column] == "·") {
                        arr[row + 1][column] = " ";
                        // score += 10;
                    }
                     else {
                        arr[row + 1][column] = " ";
                        //score = score + 0;
                    }
                    arr[row][column] = "\033[33mC\u001B[0m";
                    //arr[row][column] = "C";
                    Thread.sleep(TIME);
                    System.out.print("\033[H\033[2J");

                    System.out.flush();
                    //board.showBoard(arr);
                    board.showBoard(arr,row,column);
                    //contTimeToShowFruits+=1;
                }
            } catch (InterruptedException ex) {

                ex.printStackTrace();
            }
        }
    }






        
}
