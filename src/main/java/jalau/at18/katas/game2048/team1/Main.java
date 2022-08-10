package jalau.at18.katas.game2048.team1;

import java.util.Random;

public class Main  {

    public static void main(String[] args) {
        System.out.println("Empezando");
        /*
        for (int i = 0; i < 40; i++) {
            System.out.println(Arrays.toString(randomValuesGrid()));
        }
        */
        int[] initialValues
                = randomValuesGrid();
        Integer[][] matrix = initialMatrix(initialValues[0],initialValues[1]);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }
    public static int [] randomValuesGrid() {
        int [] numbers = {2,4};
        Random random = new Random();
        int upperBound = 2; // utilizado para colocar el maximo valor, en nuestro caso la posicion de mi array
        int numberOne = random.nextInt(upperBound);
        int numberTwo = random.nextInt(upperBound);
        System.out.println(numberOne + " - " + numberTwo);
        return new int[]{numbers[numberOne], numbers[numberTwo]};
    }

    public static Integer[] randomPositionGrid () {

        Random rand = new Random(); //instance of random class
        int upperbound = 4; //generate random values from 0-4
        int column = rand.nextInt(upperbound);
        int row = rand.nextInt(upperbound);
        return new Integer[]{row, column};
    }


    public static Integer[][] initialMatrix (int firstNumber, int secondNumber) {
        Integer[][] matrix = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
        Integer[] firstPositionRowColum = randomPositionGrid();
        Integer[] secondPositionRowColum = randomPositionGrid();
        System.out.println(firstPositionRowColum + ""+secondPositionRowColum);
        //matrix = firstPositionRowColum

        while(firstPositionRowColum[0]  == secondPositionRowColum[0] && firstPositionRowColum[1]  == secondPositionRowColum[1]){
            secondPositionRowColum = randomPositionGrid();
        }

        int number1Row = firstPositionRowColum[0];
        int number1Column = firstPositionRowColum[1];

        matrix[number1Row][number1Column] = firstNumber;
        matrix[secondPositionRowColum[0] ][secondPositionRowColum[1]] = secondNumber;

        return matrix;
    }
}

