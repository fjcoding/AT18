package jalau.at18.katas.game2048.team4;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static int[][] matrix = new int[4][4];
    public static void main(String[] args) {
        Scanner keyBoard = new Scanner(System.in);
        System.out.println("Bienvenido al juego");
        String exit = "Y";
        String nextDirection;
        String continuePlaying;
        
        do{
            
            showMatrix();
            isWinner();
            
          
            
            System.out.println("Type the direction you want to go \n up, left, right, down");
            nextDirection = keyBoard.nextLine();
            
            System.out.println("If you want to stop playing type any exit if not type any key");
            continuePlaying = keyBoard.nextLine();
            if (continuePlaying.equals("exit")){
                exit = "exit";     
            }
            
        } while(!isWinner() && exit != "exit"); //The game stops when the player type exit or wins
        keyBoard.close();
        int min = 0;
        int max = 3;
        int randomPositionX = ThreadLocalRandom.current().nextInt(min, max + 1);
        int randomPsotionY = ThreadLocalRandom.current().nextInt(min, max + 1);
        //Just to check
        System.out.println(randomPositionX); 
        System.out.println(randomPsotionY);
        System.out.println(matrix.length);
        
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

}

