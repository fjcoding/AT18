package jalau.at18.pacman;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Random;

public class MovementsPacman {
    private static int row = 1;
    private static int column = 1;
    private static int rowGhost = 8;
    private static int columnGhost = 15;
    private static final int TIME = 200;
    public static int contTimeToShowFruits = 0;
    public static int score = 0;
    Board board = new Board();
    private String[][] arr = board.getGameBoard();

    public String[][] moveRight() {
        try {
            while (arr[row][column + 1] != "▒") {
                column++;
                //board.position(arr,row,column);
                    timefruits(arr,row,column);
                if (arr[row][column] == "·") {
                    arr[row][column - 1] = " ";
                    score += 10;
                } 
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
                }else {
                    arr[row][column - 1] = " ";
                    score = score + 0;
                }
                arr[row][column] = "\033[33mC\u001B[0m";
                //arr[row][column] = "C";
                Thread.sleep(TIME);
                System.out.print("\033[H\033[2J");
                System.out.flush();
                board.showBoard(arr,row,column);
                contTimeToShowFruits+=1;
                if ((arr[row + 1][column] == "·" || arr[row - 1][column] == "·") && arr[row][column - 1] != "▒") {
                    break;
                }
                if ((arr[row + 1][column] == " " || arr[row - 1][column] == " ") && arr[row][column - 1] != "▒") {
                    break;
                }
                if (column == 0) {
                    column = 28;
                    arr[row][column] = "C";
                    arr[row][column - 28] = " ";
                } else if (column == 28) {
                    column = 0;
                    //arr[row][column] = "C";
                    arr[row][column] = "\033[33mC\u001B[0m";
                    arr[row][column + 28] = " ";
                }
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        return arr;
    }

    public String[][] moveDown() {
        try {
            while (arr[row + 1][column] != "▒") {
                row++;
                //board.position(arr,row,column);
                    timefruits(arr,row,column);
                if (arr[row][column] == "·") {
                    arr[row - 1][column] = " ";
                    score += 10;
                }
                if(arr[row][column] =="\033[34mO\u001B[0m")//arr[n][m] == "O")                 
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
                } else {
                    arr[row - 1][column] = " ";
                    score = score + 0;
                }
                arr[row][column] = "\033[33mC\u001B[0m";
                //arr[row][column] = "C";
                Thread.sleep(TIME);
                System.out.print("\033[H\033[2J");
                System.out.flush();
                board.showBoard(arr,row,column);
                contTimeToShowFruits+=1;
                if ((arr[row][column + 1] == "·" || arr[row][column - 1] == "·") && arr[row - 1][column] != "▒") {
                    break;
                }
                if ((arr[row][column + 1] == " " || arr[row][column - 1] == " ") && arr[row - 1][column] != "▒") {
                    break;
                }
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        return arr;
    }

    public String[][] moveLeft() {
        try {
            while (arr[row][column - 1] != "▒") {
                column--;
                //board.position(arr,row,column);
                    timefruits(arr,row,column);
                if (arr[row][column] == "·") {
                    arr[row][column + 1] = " ";
                    score += 10;
                } if(arr[row][column] == "\033[34mO\u001B[0m" )//(arr[n - 1][m]=="")
                {
                        arr[row][column + 1] = " ";
                        score = score + 50;
                }
                else if (arr[row][column]=="\033[35mX\u001B[0m")
                {   
                        arr[row][column + 1] = " ";
                        score = score + 100;
                }
                else if (arr[row][column]=="\033[32mM\u001B[0m")
                {   
                        arr[row][column + 1] = " ";
                        score = score + 300;
                }else {
                    arr[row][column + 1] = " ";
                    score = score + 0;
                } arr[row][column] = "\033[33mC\u001B[0m";
                //arr[row][column] = "C";
                Thread.sleep(TIME);

                System.out.print("\033[H\033[2J");

                System.out.flush();
                board.showBoard(arr,row,column);
                contTimeToShowFruits+=1;
                if ((arr[row + 1][column] == "·" || arr[row - 1][column] == "·") && arr[row][column + 1] != "▒") {
                    break;
                }
                if ((arr[row + 1][column] == " " || arr[row - 1][column] == " ") && arr[row][column + 1] != "▒") {
                    break;
                }
                if (column == 0) {
                    column = 28;
                    arr[row][column] = "\033[33mC\u001B[0m";
                    //arr[row][column] = "C";
                    arr[row][column - 28] = " ";
                } else if (column == 28) {
                    column = 0;
                    arr[row][column] = "\033[33mC\u001B[0m";
                    //arr[row][column] = "C";
                    arr[row][column + 28] = " ";
                }
            }
        } catch (InterruptedException ex) {

            ex.printStackTrace();
        }
        return arr;
    }

    public String[][] moveUp() {
        try {
            while (arr[row - 1][column] != "▒") {
                row--;
                //board.position(arr,row,column);
                    timefruits(arr,row,column);
                if (arr[row][column] == "·") {
                    arr[row + 1][column] = " ";
                    score += 10;
                }
                if(arr[row][column] == "\033[34mO\u001B[0m")//(arr[n - 1][m]=="")
                {
                        arr[row + 1][column] = " ";
                        score = score + 50;
                }
                else if (arr[row][column]=="\033[35mX\u001B[0m")
                {
                        arr[row + 1][column] = " ";
                        score = score + 100;
                }
                else if (arr[row][column]=="\033[32mM\u001B[0m")
                {       arr[row + 1][column] = " ";
                        score = score + 300;
                }  else {
                    arr[row + 1][column] = " ";
                    score = score + 0;
                }
                arr[row][column] = "\033[33mC\u001B[0m";
                //arr[row][column] = "C";
                Thread.sleep(TIME);
                System.out.print("\033[H\033[2J");

                System.out.flush();
                board.showBoard(arr,row,column);
                contTimeToShowFruits+=1;
                if ((arr[row][column + 1] == "·" || arr[row][column - 1] == "·") && arr[row + 1][column] != "▒") {
                    break;
                }
                if ((arr[row][column + 1] == " " || arr[row][column - 1] == " ") && arr[row + 1][column] != "▒") {
                    break;
                }
            }
        } catch (InterruptedException ex) {

            ex.printStackTrace();
        }
        return arr;
    }

    public String[][] moveRightGhost(String[][] arr) {
        try {
            while (arr[rowGhost][columnGhost + 1] != "▒") {
                columnGhost++;
                if (arr[rowGhost][columnGhost] == "·") {
                    arr[rowGhost][columnGhost - 1] = "·";
                    // score += 10;
                } else {
                    arr[rowGhost][columnGhost - 1] = " ";
                    // score = score + 0;
                }
                arr[rowGhost][columnGhost] = "\033[31mG\u001B[0m";
                Thread.sleep(TIME);
                System.out.print("\033[H\033[2J");
                System.out.flush();
                board.showBoard(arr,row,column);
                contTimeToShowFruits+=1;
                if ((arr[rowGhost + 1][columnGhost] == "·" || arr[rowGhost - 1][columnGhost] == "·")
                        && arr[rowGhost][columnGhost - 1] != "▒") {
                    break;
                }
                if ((arr[rowGhost + 1][columnGhost] == " " || arr[rowGhost - 1][columnGhost] == " ")
                        && arr[rowGhost][columnGhost - 1] != "▒") {
                    break;
                }
                if (columnGhost == 0) {
                    columnGhost = 28;
                    arr[rowGhost][columnGhost] = "\033[31mG\u001B[0m";
                    arr[rowGhost][columnGhost - 28] = "·";
                } else if (columnGhost == 28) {
                    columnGhost = 0;
                    arr[rowGhost][columnGhost] = "\033[31mG\u001B[0m";
                    arr[rowGhost][columnGhost + 28] = "·";
                }
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        return arr;
    }

    public String[][] moveDownGhost(String[][] arr) {
        try {
            while (arr[rowGhost + 1][columnGhost] != "▒") {
                rowGhost++;
                if (arr[rowGhost][columnGhost] == "·") {
                    arr[rowGhost - 1][columnGhost] = "·";
                    // score += 10;
                } else {
                    arr[rowGhost - 1][columnGhost] = " ";
                    // score = score + 0;
                }

                arr[rowGhost][columnGhost] = "\033[31mG\u001B[0m";
                Thread.sleep(TIME);
                System.out.print("\033[H\033[2J");
                System.out.flush();
                board.showBoard(arr,row,column);
                if ((arr[rowGhost][columnGhost + 1] == "·" || arr[rowGhost][columnGhost - 1] == "·")
                        && arr[rowGhost - 1][columnGhost] != "▒") {
                    break;
                }
                if ((arr[rowGhost][columnGhost + 1] == " " || arr[rowGhost][columnGhost - 1] == " ")
                        && arr[rowGhost - 1][columnGhost] != "▒") {
                    break;
                }
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();

        }
        return arr;
    }

    public String[][] moveLeftGhost(String[][] arr) {
        try {
            while (arr[rowGhost][columnGhost - 1] != "▒") {
                columnGhost--;
                if (arr[rowGhost][columnGhost] == "·") {
                    arr[rowGhost][columnGhost + 1] = "·";
                    // score += 10;
                } else {
                    arr[rowGhost][columnGhost + 1] = " ";
                    // score = score + 0;
                }
                arr[rowGhost][columnGhost] = "\033[31mG\u001B[0m";
                Thread.sleep(TIME);

                System.out.print("\033[H\033[2J");

                System.out.flush();
                board.showBoard(arr,row,column);
                if ((arr[rowGhost + 1][columnGhost] == "·" || arr[rowGhost - 1][columnGhost] == "·")
                        && arr[rowGhost][columnGhost + 1] != "▒") {
                    break;
                }
                if ((arr[rowGhost + 1][columnGhost] == " " || arr[rowGhost - 1][columnGhost] == " ")
                        && arr[rowGhost][columnGhost + 1] != "▒") {
                    break;
                }
                if (columnGhost == 0) {
                    columnGhost = 28;
                    arr[rowGhost][columnGhost] = "\033[31mG\u001B[0m";
                    arr[rowGhost][columnGhost - 28] = "·";
                } else if (columnGhost == 28) {
                    columnGhost = 0;
                    
                    arr[rowGhost][columnGhost] = "\033[33mC\u001B[0m";
                    //arr[rowGhost][columnGhost] = "C";
                    arr[rowGhost][columnGhost + 28] = "·";
                }
            }
        } catch (InterruptedException ex) {

            ex.printStackTrace();
        }
        return arr;
    }

    public String[][] moveUpGhost(String[][] arr) {
        try {
            while (arr[rowGhost - 1][columnGhost] != "▒") {
                rowGhost--;
                if (arr[rowGhost][columnGhost] == "·") {
                    arr[rowGhost + 1][columnGhost] = "·";
                    // score += 10;
                } else {
                    arr[rowGhost + 1][columnGhost] = " ";
                     //score = score + 0;
                }
                arr[rowGhost][columnGhost] = "\033[31mG\u001B[0m";
                Thread.sleep(TIME);
                System.out.print("\033[H\033[2J");

                System.out.flush();
                board.showBoard(arr,row,column);
                if ((arr[rowGhost][columnGhost + 1] == "·" || arr[rowGhost][columnGhost - 1] == "·")
                        && arr[rowGhost + 1][columnGhost] != "▒") {
                    break;
                }
                if ((arr[rowGhost][columnGhost + 1] == " " || arr[rowGhost][columnGhost - 1] == " ")
                        && arr[rowGhost + 1][columnGhost] != "▒") {
                    break;
                }
            }
        } catch (InterruptedException ex) {

            ex.printStackTrace();
        }
        return arr;
    }
    public int showScore() {
        int points = score;
        return points;
    }


    
    public static void timefruits(String arr[][],int n, int m) {
        int i1,i2,i3,i4;//frutas en color verde
        if(contTimeToShowFruits >= 4 && contTimeToShowFruits <= 8 ) {//4 recargas
                String auxFruits1[][] = new String[25][29];
                Random fruta= new Random();
                Random fruta1= new Random();
                i1 = fruta.nextInt(auxFruits1.length);//13
                i2 = fruta1.nextInt(auxFruits1.length); //&& arr[i1][i2] != arr[n][m]
                if (arr[i1][i2] != "▒" && arr[i1][i2] != " " && arr[i1][i2] != "\033[34mO\u001B[0m" ) {
                                arr[i1][i2] = "\033[35mX\u001B[0m";
                                
                } else if (arr[i1][i2] == "▒" && arr[i1][i2] == " " && arr[i1][i2] == "\033[34mO\u001B[0m" ) {
                        String auxFruits2[][] = new String[25][29];
                        Random fruta2= new Random();
                        Random fruta22= new Random();
                        i3 = fruta2.nextInt(auxFruits2.length);//13
                        i4 = fruta22.nextInt(auxFruits2.length);
                        // arr[i3][i4] = "\033[32mY\u001B[0m";
                        arr[i3][i4]  = "\033[35mX\u001B[0m";
                }
        }
        else if (contTimeToShowFruits >= 10 && contTimeToShowFruits <= 14 ) {//4 recargas
                String auxFruits1[][] = new String[25][29];
                Random fruta= new Random();
                Random fruta1= new Random();
                i1 = fruta.nextInt(auxFruits1.length);//13
                i2 = fruta1.nextInt(auxFruits1.length); //5

                if (arr[i1][i2] != "▒" && arr[i1][i2] != " " && arr[i1][i2] != "\033[34mO\u001B[0m" && arr[i1][i2] != "\033[35mX\u001B[0m") {

                        arr[i1][i2] = "\033[32mM\u001B[0m";

                } else if (arr[i1][i2] == "▒" && arr[i1][i2] == " " && arr[i1][i2] == "\033[34mO\u001B[0m" && arr[i1][i2] == "\033[35mX\u001B[0m") {
                        String auxFruits2[][] = new String[25][29];
                        Random fruta2= new Random();
                        Random fruta22= new Random();
                        i3 = fruta2.nextInt(auxFruits2.length);
                        i4 = fruta22.nextInt(auxFruits2.length);
                        //arr[i3][i4] = "\033[32mN\u001B[0m";
                        arr[i3][i4] = "\033[32mM\u001B[0m";
                }
        }
        
    }


}
