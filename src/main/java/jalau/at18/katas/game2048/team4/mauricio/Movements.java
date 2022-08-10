package jalau.at18.katas.game2048.team4.mauricio;

public class Movements {
    static int[][] pressUp(int[][] matrix) {
        int c = 0;
        for (int index = 0; index < 3; index++) {
            int index_2 = index + 1;
            for (int jdex = 0; jdex < 4; jdex++) {
                int valor_actual = matrix[index][jdex];
                int valor_posterior = matrix[index_2][jdex];
                if (valor_actual == valor_posterior) {
                    if (valor_actual != 0 && valor_posterior != 0) {
                        valor_posterior *= 2;
                        matrix[index][jdex] = valor_posterior;
                        matrix[index_2][jdex] = 0;
                        c++;
                    }
                }

                if (valor_actual == 0 && valor_posterior != 0) {
                    matrix[index][jdex] = valor_posterior;
                    matrix[index_2][jdex] = 0;
                }
            }
        }
        System.out.println("Sume " + c);
        return matrix;
    }
}
