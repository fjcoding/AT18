package jalau.at18.katas.game2048.team4.rene;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class MainRene {
    public static int[][] matrix = new int[4][4];
    public static String nextDirection;
    public static final int MIN_BOUND = 0;
    public static final int MAX_BOUND = 3;

    public static void main(String[] args) {
        Scanner keyBoard = new Scanner(System.in);
        System.out.println("Bienvenido al juego");
        String exit = "Y";
        String continuePlaying;
        
        System.out.println();
        putNewTwoOnMatrix();
        putNewTwoOnMatrix();
        showMatrix();
        System.out.println();
        
        do {
            
            isWinner();
            
            System.out.println("Type the direction you want to go \nDirections: up, left, right, down");
            nextDirection = keyBoard.nextLine();
            directionChecker(nextDirection);
            showMatrix();
            System.out.println("\nIf you want to stop playing type exit \nif not type any key");
            continuePlaying = keyBoard.nextLine();
            if (continuePlaying.equals("exit")) {
                exit = "exit";     
            }
            
        } while (!isWinner() && exit != "exit" && !isLoser()); // The game stops when the player type exit or wins

        keyBoard.close();
        
    }

    static void showMatrix() {
        for (int index = 0; index < matrix.length; index++) {
            for (int jIndex = 0; jIndex < matrix.length; jIndex++) {
                System.out.print(matrix[index][jIndex] + " ");
            }
            System.out.println();
        }
    }

    static boolean isWinner() {
        for (int index = 0; index < matrix.length; index++) {
            for (int jIndex = 0; jIndex < matrix.length; jIndex++) {
                if (matrix[index][jIndex] == 2048) {
                    return true;
                }
            }
        }
        return false; 
    }

    static void directionChecker(String direction) { //
        switch (direction) {
            case "up":
              System.out.println("You move the numbers up!");
              moveNumbersUp();
              putNewTwoOnMatrix();
              System.out.println();

              break;
            case "left":
            System.out.println("You move the numbers left!");
            moveNumbersLeft();
            putNewTwoOnMatrix();
            System.out.println();

              break;
            case "right":
            System.out.println("You move the numbers right!");
            moveNumbersRight();
            putNewTwoOnMatrix();
            System.out.println();
              break;
            case "down":
            System.out.println("You move the numbers down!");
            moveNumbersDown();
            putNewTwoOnMatrix();
            System.out.println();
              break; 
            default:
              System.out.println("Type a correct direction");
          }
    }

    //Case 1: The number is in a border cell
    //Case 2: The next number is 0
    //Case 3: The next number is th same number (So it has to sum the numbers)
    //Case 4: Th next number is other number (So do nothing) 

    static void moveNumbersUp() {
        for (int index = 0; index < matrix.length; index++) {
            for (int jIndex = 0; jIndex < matrix.length; jIndex++) {
                if (matrix[index][jIndex] != 0 && index == 0) { // Case 1
                    continue;
                } else if (matrix[index][jIndex] != 0 && matrix[index - 1][jIndex] == 0) { //Case 2
                    for (int innerIndex = index; innerIndex > 0 && matrix[innerIndex - 1][jIndex] == 0; innerIndex--) {
                        matrix[innerIndex - 1][jIndex] = matrix[innerIndex][jIndex];
                        matrix[innerIndex][jIndex] = 0;
                    } // movu up till reach a border or a number
                } else if (matrix[index][jIndex] != 0 && matrix[index - 1][jIndex] == matrix[index][jIndex]) { //Case 3
                    matrix[index - 1][jIndex] *= 2;
                    matrix[index][jIndex] = 0;
                } else if (matrix[index][jIndex] != 0 && matrix[index - 1][jIndex] != 0) { //Case 4
                    continue;
                }

            }
        }
    }
    static void moveNumbersDown() {
        for (int index = 0; index < matrix.length; index++) {
            for (int jIndex = 0; jIndex < matrix.length; jIndex++) {
                if (matrix[index][jIndex] != 0 && index == 3) { //Case 1
                    continue;
                } else if (matrix[index][jIndex] != 0 && matrix[index + 1][jIndex] == 0) { //Case 2
                    for (int innerIndex = index; innerIndex < 3 && matrix[innerIndex + 1][jIndex] == 0; innerIndex++) {
                        matrix[innerIndex + 1][jIndex] = matrix[innerIndex][jIndex];
                        matrix[innerIndex][jIndex] = 0;
                    } // movu up till reach a border or a number 
                }  else if (matrix[index][jIndex] != 0 && matrix[index + 1][jIndex] == matrix[index][jIndex]) { //Case 3
                    matrix[index + 1][jIndex] *= 2;
                    matrix[index][jIndex] = 0;
                }  else if (matrix[index][jIndex] != 0 && matrix[index + 1][jIndex] != 0) { //Case 4
                    continue;
                }
            }
        }
    }
    static void moveNumbersLeft() { //Fix!!!
        for (int index = 0; index < matrix.length; index++) {
            for (int jIndex = 0; jIndex < matrix.length; jIndex++) {
                if (matrix[index][jIndex] != 0 && jIndex == 0) { //Case 1
                    continue;
                } else if (matrix[index][jIndex] != 0 && matrix[index][jIndex - 1] == 0) { //Case 2
                    for (int innerIndex = jIndex; innerIndex > 0 && matrix[index][innerIndex - 1] == 0; innerIndex--) {
                        matrix[index][innerIndex - 1] = matrix[index][innerIndex];
                        matrix[index][innerIndex] = 0;
                    } // movu up till reach a border or a number   
                } else if (matrix[index][jIndex] != 0 && matrix[index][jIndex - 1] == matrix[index][jIndex]) { //Case 3
                    matrix[index][jIndex - 1] *= 2;
                    matrix[index][jIndex] = 0;
                }  else if (matrix[index][jIndex] != 0 && matrix[index][jIndex - 1] != 0) { //Case 4
                    continue;
                }
            }
        }
    }
    static void moveNumbersRight() { //Fix!!!
        for (int index = 0; index < matrix.length; index++) {
            for (int jIndex = 0; jIndex < matrix.length; jIndex++) {
                if (matrix[index][jIndex] != 0 && jIndex == 3) { //Case 1
                    continue;
                } else if (matrix[index][jIndex] != 0 && matrix[index][jIndex + 1] == 0) { //Case 2
                    for (int innerIndex = jIndex; innerIndex < 3 && matrix[index][innerIndex + 1] == 0; innerIndex++) {
                        matrix[index][innerIndex + 1] = matrix[index][innerIndex];
                        matrix[index][innerIndex] = 0;
                    } // movu up till reach a border or a number   
                } else if (matrix[index][jIndex] != 0 && matrix[index][jIndex + 1] == matrix[index][jIndex]) { //Case 3
                    matrix[index][jIndex + 1] *= 2;
                    matrix[index][jIndex] = 0;
                }  else if (matrix[index][jIndex] != 0 && matrix[index][jIndex + 1] != 0) { //Case 4
                    continue;
                }
            }
        }
    }

    static void putNewTwoOnMatrix() { // Recursividad?
        int randomPositionX = ThreadLocalRandom.current().nextInt(MIN_BOUND, MAX_BOUND + 1);
        int randomPositionY = ThreadLocalRandom.current().nextInt(MIN_BOUND, MAX_BOUND + 1);
        while (matrix[randomPositionX][randomPositionY] != 0) { // It searchs a cell with a 0 for putting a 2
            randomPositionX = ThreadLocalRandom.current().nextInt(MIN_BOUND, MAX_BOUND + 1);
            randomPositionY = ThreadLocalRandom.current().nextInt(MIN_BOUND, MAX_BOUND + 1); 
        }
        matrix[randomPositionX][randomPositionY] = 2;
    } 

    // Is loser function
    static boolean isLoser() {
        for (int index = 0; index < matrix.length; index++) {
            for (int jIndex = 0; jIndex < matrix.length; jIndex++) {
                if (matrix[index][jIndex] == 0) {
                    return false;
                }
            }
        }
        System.out.println("Game Over");
        return true;
}

}

