package jalau.at18.katas.game2048.team4;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static int[][] matrix = new int[4][4];
    public static String nextDirection;
    public static final int MIN_BOUND = 0;
    public static final int MAX_BOUND = 3;
    public static void main(String[] args) {
        Scanner keyBoard = new Scanner(System.in);
        System.out.println("Bienvenido al juego");
        String exit = "Y";
        String continuePlaying;
        

        showMatrix();
        System.out.println();
        putNewTwoOnMatrix();
        showMatrix();
        System.out.println();
        putNewTwoOnMatrix();
        showMatrix();
        System.out.println();
        showMatrix();
        
        do{
            
            isWinner();
            
            System.out.println("Type the direction you want to go \nDirections: up, left, right, down");
            nextDirection = keyBoard.nextLine();
            directionChecker(nextDirection);
            showMatrix();
            
            System.out.println("If you want to stop playing type exit \nif not type any key");
            continuePlaying = keyBoard.nextLine();
            if (continuePlaying.equals("exit")){
                exit = "exit";     
            }
            
        } while(!isWinner() && exit != "exit"); //The game stops when the player type exit or wins


        keyBoard.close();
        
    }

    static void showMatrix ( ){
        for (int index = 0; index < matrix.length; index++) {
            for (int jIndex = 0; jIndex < matrix.length; jIndex++) {
                System.out.print(matrix[index][jIndex] + " ");
            }
            System.out.println( );
        }
    }
    static boolean isWinner( ){
        for (int index = 0; index < matrix.length; index++) {
            for (int jIndex = 0; jIndex < matrix.length; jIndex++) {
                if (matrix[index][jIndex] == 2048){
                    return true;
                }
            }
        }
        return false; 
    }
    static void directionChecker(String direction){ //
        switch(direction) {
            case "up":
              System.out.println("uup");
              moveNumbersUp();
              System.out.println();

              break;
            case "left":
            System.out.println("leeeft");
              break;
            case "right":
            System.out.println("riiight");
              break;
            case "down":
            System.out.println("dooown");
              break; 
            default:
              System.out.println("Type a correct direction");
          }
    }

    static void moveNumbersUp(){
        for (int index = 0; index < matrix.length; index++) {
            for (int jIndex = 0; jIndex < matrix.length; jIndex++) {
                if (matrix[index][jIndex] != 0 && index == 0){
                    continue;
                }
                else if (matrix[index][jIndex] != 0 && matrix[index - 1][jIndex] == 0 ) {
                    //for (int innerIndex = index; innerIndex >= 0 || matrix[innerIndex - 1][jIndex] != 0; innerIndex--) {
                        matrix[index - 1][jIndex] = matrix[index][jIndex];
                        matrix[index][jIndex] = 0;
                    //} // movu up till reach a border or a number
                   
                    
                }
            }
        }
    }
    static void putNewTwoOnMatrix() {
        int positionX = ThreadLocalRandom.current().nextInt(MIN_BOUND, MAX_BOUND + 1);
        int positionY = ThreadLocalRandom.current().nextInt(MIN_BOUND, MAX_BOUND + 1);
        matrix[positionX][positionY] = 2;
    }

    

}

