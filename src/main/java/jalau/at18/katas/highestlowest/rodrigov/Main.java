package jalau.at18.katas.highestlowest.rodrigov;

public class Main {
    public static void main(String[] args) {
        int numbers[]= {1,2,-3,4,5};
        int lowestNumber=numbers[0];
        int highestNumber=numbers[0];
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]<=lowestNumber){
                lowestNumber=numbers[i];
            }
            if(numbers[i]>=highestNumber){
                highestNumber=numbers[i];
            }   
        }
        System.out.println(highestNumber + " " + lowestNumber );  
    }
}