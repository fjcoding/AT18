package jalau.at18.katas.multiples.fernanda;

import java.util.*;

public class Main {
    private static final int MULTIPLE3 = 3;
    private static final int MULTIPLE5 = 5;
    public static void main(String[] args)  throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        String number = scan.nextLine();
        Main main = new Main();
        System.out.print(main.sumMultiples(number));
        scan.close();
    }

    public String sumMultiples(String strMultiple) {
        int numMultiple = Integer.parseInt(strMultiple);
        int sumMultiples3 = 0;
        int sumMultiples5 = 0;
        int sumMutliplesBoth = 0;
        if (numMultiple < 0) {
            System.out.println("0");
        } else {
            for (int currentNum = 0; currentNum < numMultiple; currentNum++) {
                if (currentNum % MULTIPLE3 == 0 && currentNum % MULTIPLE5 == 0) {
                    sumMutliplesBoth = sumMutliplesBoth + currentNum;
                } else {
                    if (currentNum % MULTIPLE3 == 0) {
                        sumMultiples3 = sumMultiples3 + currentNum;
                    } else {
                        if (currentNum % MULTIPLE5 == 0) {
                            sumMultiples5 = sumMultiples5 + currentNum;
                        }
                    }
                }

            }
        }

        int sumOfAll = sumMultiples3 + sumMultiples5 + sumMutliplesBoth;
        return Integer.toString(sumOfAll);
    }
}