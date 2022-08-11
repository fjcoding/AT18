package jalau.at18.katas.game2048.team4;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static int[][] matrix = new int[4][4];
    public static String nextDirection;
    public static void main(String[] args) {
        Scanner keyBoard = new Scanner(System.in);
        System.out.println("Bienvenido al juego");
        String exit = "Y";
        String continuePlaying;
        int min = 0;
        int max = 3;
        int randomPositionX = ThreadLocalRandom.current().nextInt(min, max + 1);
        int randomPositionY = ThreadLocalRandom.current().nextInt(min, max + 1);
        System.out.println(randomPositionX);
        System.out.println(randomPositionY);
        matrix[randomPositionX][randomPositionY] = 2;
        randomPositionX = ThreadLocalRandom.current().nextInt(min, max + 1);
        randomPositionY = ThreadLocalRandom.current().nextInt(min, max + 1);
        System.out.println(randomPositionX);
        System.out.println(randomPositionY);
        matrix[randomPositionX][randomPositionY] = 2;

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
    static void directionChecker(String direction){
        switch(direction) {
            case "up":
              System.out.println("uup");

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

    static void moveNumbers(){
        for (int index = 0; index < matrix.length; index++) {
            for (int jIndex = 0; jIndex < matrix.length; jIndex++) {
                if (matrix[index][jIndex] != 0 && index == 0){
                    continue;
                }
                else if (matrix[index][jIndex] != 0 && matrix[index - 1][jIndex] == 0 ){
                    int innerIndex = index; // movu up till reach a border or a number
                    matrix[index - 1][jIndex] = matrix[index][jIndex];
                    matrix[index][jIndex] = 0;
                    
                }
            }
        }
    }

}

