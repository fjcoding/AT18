package jalau.at18.katas.game2048.team1;


import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Random;
import java.util.Scanner;

public class Main {
    //final int RANDOM_INITIAL_VALUES = 2;
    public static void main(String[] args) {
        /*
        for (int i = 0; i < 40; i++) {
            System.out.println(Arrays.toString(randomValuesGrid()));
        }
        */
        /*
        int[] initialValues = randomValuesGrid();
        Integer[][] matrix = initialMatrix(initialValues[0], initialValues[1]);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
        */
        int[] initialValues = randomValuesGrid();
        Integer[][] matrix = initialMatrix(initialValues[0], initialValues[1]);
        printMatrix(matrix);
        direcctions(matrix); // se envia la matriz

    }

    public static void printMatrix(Integer [][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static int[] randomValuesGrid() {
        int[] numbers = { 2, 4 };
        Random random = new Random();
        int upperBound = 2; // utilizado para colocar el maximo valor, en nuestro caso la posicion de mi array
        int numberOne = random.nextInt(upperBound);
        int numberTwo = random.nextInt(upperBound);
        return new int[]{numbers[numberOne], numbers[numberTwo]};
    }

    public static Integer[] randomPositionGrid() {

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
        //System.out.println(firstPositionRowColum + ""+secondPositionRowColum);

        while (firstPositionRowColum[0]  == secondPositionRowColum[0] && firstPositionRowColum[1]  == secondPositionRowColum[1]){
            secondPositionRowColum = randomPositionGrid();
        }
        matrix[firstPositionRowColum[0]][firstPositionRowColum[1]] = firstNumber;
        matrix[secondPositionRowColum[0] ][secondPositionRowColum[1]] = secondNumber;
        return matrix;
    }

    // w = arriba, a = izquierda, d = derecha, s = abajo

    public static void direcctions(Integer [][] matrix){ // el metodo pide la matriz
    	Integer [][] newMatrix= new Integer [4][4]; // nueva matriz
        System.out.println("Instrucciones del juego");

        System.out.println("Top: w");
        System.out.println("Left: a");
        System.out.println("Right: d");
        System.out.println("Down: s");

        Scanner scan = new Scanner(System.in);
        String directionValue = scan.nextLine();

        if(directionValue.equals("w")){
            System.out.println("metodo para mover arriba");
            newMatrix=moveTop(matrix);// guarda la matriz en una nueva
            printMatrix(newMatrix); // imprime la nueva matriz
            direcctions(newMatrix); // recursividad (funcion se llama a si misma)
        }
        if(directionValue.equals("s")){
            System.out.println("Move down");
            newMatrix=moveDown(matrix);// guarda la matriz en una nueva
            printMatrix(newMatrix); // imprime la nueva matriz
            direcctions(newMatrix); // recursividad (funcion se llama a si misma)

        }
        if(directionValue.equals("a")){
            System.out.println("Move left");
            newMatrix=moveLeft(matrix);// guarda la matriz en una nueva
            printMatrix(newMatrix); // imprime la nueva matriz
            direcctions(newMatrix); // recursividad (funcion se llama a si misma)
        }
        if(directionValue.equals("d")){
            System.out.println("Move Rigth");
            newMatrix=moveRigth(matrix);// guarda la matriz en una nueva
            printMatrix(newMatrix); // imprime la nueva matriz
            direcctions(newMatrix); // recursividad (funcion se llama a si misma)
        }

    }

    public static Integer [][] moveTop(Integer[][] matrix){

        /*Integer[][] matrixAux = new Integer[4][4];
        Integer aux = 0;*/
    	for(int moves = 0; moves < 3; moves++) { // en cada ciclo se mueven todas las lineas una vez
    		for (int row = 1; row < matrix.length; row++) {
                for (int column = 0; column < matrix.length; column++) {
                    if(matrix[row][column] != 0 && matrix[row-1][column] == 0) {
                        matrix[row-1][column] = matrix[row][column];
                        matrix[row][column] = 0;
                    }
                    else if (matrix[row][column] != 0 && matrix[row-1][column] == matrix[row][column]){
                        matrix[row-1][column] = 2 * (matrix[row][column]);
                        matrix[row][column] = 0;
                    }
                }
            }
    	}
    	return matrix;
    }

    public static Integer [][] moveDown(Integer[][] matrix){
        /*Integer[][] matrixAux = new Integer[4][4];
        Integer aux = 0;*/
        for(int moves = 0; moves < 3; moves++) { // en cada ciclo se mueven todas las lineas una vez
            for (int row = 2; row >= 0; row--) {
                for (int column = 0; column < matrix.length; column++) {
                    if(matrix[row][column] != 0 && matrix[row+1][column] == 0) {
                        matrix[row+1][column] = matrix[row][column];
                        matrix[row][column] = 0;
                    }
                    else if (matrix[row][column] != 0 && matrix[row+1][column] == matrix[row][column]){
                        matrix[row+1][column] = 2 * (matrix[row][column]);
                        matrix[row][column] = 0;
                    }
                }
            }
        }
        return matrix;
    }

    public static Integer [][] moveLeft(Integer[][] matrix){
        /*Integer[][] matrixAux = new Integer[4][4];
        Integer aux = 0;*/
        for(int moves = 0; moves < 3; moves++) { // en cada ciclo se mueven todas las lineas una vez
            for (int column = 1; column < matrix.length; column++) {
                for (int row = 0; row < matrix.length; row++) {
                    if(matrix[row][column] != 0 && matrix[row][column-1] == 0) {
                        matrix[row][column-1] = matrix[row][column];
                        matrix[row][column] = 0;
                    }
                    else if (matrix[row][column] != 0 && matrix[row][column-1] == matrix[row][column]){
                        matrix[row][column-1] = 2 * (matrix[row][column]);
                        matrix[row][column] = 0;
                    }
                }
            }
        }
        return matrix;
    }

    public static Integer [][] moveRigth(Integer[][] matrix){
        /*Integer[][] matrixAux = new Integer[4][4];
        Integer aux = 0;*/
        for(int moves = 0; moves < 3; moves++) { // en cada ciclo se mueven todas las lineas una vez
            for (int column = 2; column >= 0; column--) {
                for (int row = 0; row < matrix.length; row++) {
                    if(matrix[row][column] != 0 && matrix[row][column+1] == 0) {
                        matrix[row][column+1] = matrix[row][column];
                        matrix[row][column] = 0;
                    }
                    else if (matrix[row][column] != 0 && matrix[row][column-1] == matrix[row][column]){
                        matrix[row][column+1] = 2 * (matrix[row][column]);
                        matrix[row][column] = 0;
                    }
                }
            }
        }
        return matrix;
    }

}


