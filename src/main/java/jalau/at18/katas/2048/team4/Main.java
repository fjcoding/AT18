package jalau.at18.katas.2048.team4;

import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        int min = 0;
        int max = 3;
        int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
        System.out.println(randomNum);

    static Integer GeneratingAMatrix(int randomNum) {
        int matriz[][] = new int[4][4];
        matriz[0][0] = 0;
        matriz[0][1] = 0;
        matriz[0][2] = 0;
        matriz[0][3] = 0;
        matriz[1][0] = 0;
        matriz[1][1] = 0;
        matriz[1][2] = 0;
        matriz[1][3] = 0;
        matriz[2][0] = 0;
        matriz[2][1] = 0;
        matriz[2][2] = 0;
        matriz[2][3] = 0;
        matriz[3][0] = 0;
        matriz[3][1] = 0;
        matriz[3][2] = 0;
        matriz[3][3] = 0;
    }

}}
