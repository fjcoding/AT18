package jalau.at18.katas.multiples.fernanda;

import java.util.*;

public class Main {
    public static void main(String[] args)  throws InterruptedException 
    { 
        int sumMultiples3 = 0;
        int sumMultiples5 = 0;
        int sumMultiplesBoth = 0;
        int multipleOf3 = 3;
        int multipleOf5 = 5;


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scan.nextInt();
        if (number < 0){
            System.out.println("0");
        }else {

            for ( int i = 3; i < number; i++){
                if (i % multipleOf3 == 0 && i % multipleOf5 == 0){
                    sumMultiplesBoth = sumMultiplesBoth + i;
                } else {
                    if (i % multipleOf3 == 0){
                        sumMultiples3=sumMultiples3 + i;
                    } else {
                        if (i % multipleOf5 == 0){
                            sumMultiples5 = sumMultiples5 + i;
                        }
                    }
                }

            }
        }

        int sumOfAll = sumMultiples3 + sumMultiples5 + sumMultiplesBoth;
        System.out.println(sumOfAll);
        
        scan.close();

    }      

}

