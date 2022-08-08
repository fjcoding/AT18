package jalau.at18.katas.multiples.rene;

public class Main {
    public static void main(String[] args){

        System.out.println(multiples(20));


    }

    static int multiples (int number){
        int sum = 0;
        number--;
        while (number != 0){
            if (number < 0)
                return 1000;

        if(number % 3 == 0 || number % 5 == 0)
            sum = sum + number;
            number --;
         }
        return sum;
    }
    
}
