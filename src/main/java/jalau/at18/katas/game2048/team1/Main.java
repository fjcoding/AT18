package jalau.at18.katas.game2048.team1;

import java.util.Random;

public class Main  {
    private static final int ROW_SIZE = 4;
    private static final int COLUMN_SIZE = 4;

    public static void main(String[] args){


    }
    public static Integer[] randomPos () {
      Random rand = new Random(); //instance of random class
      int upperbound = 4; //generate random values from 0-24
      int colum = rand.nextInt(upperbound);
      int row = rand.nextInt(upperbound);
      return [row, colum];
    }
    public static Integer[][] inicialMatrix () {

      Integer[][] matrix = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
      Integer[] posRandom1 = randomPos();
      Integer[] posRandom2 = randomPos();
      matrix[posRandom1[0]] [posRandom1[1]] = 2;
          while(posRandom1 == posRandom2){
        posRandom2 = randomPos();
      }
      matrix[posRandom2[0]] [posRandom2[1]] = 2;
      return matrix;
    }

    public static void printMatrix(Integer [][] matrix) {
        for (int index=0; index < ROW_SIZE; index++) {
            for (int index2=0; index2<COLUMN_SIZE;index2++) {
                System.out.print(matrix[index][index2]);
            }
            System.out.println("");
        }
    }

}

