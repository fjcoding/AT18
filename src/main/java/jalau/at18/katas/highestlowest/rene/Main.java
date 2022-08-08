package jalau.at18.katas.highestlowest.rene;

public class Main {
    public static void main(String args[]){
        System.out.println(func("12 3 23 55 0 -22 100 -33 2"));

    }

    static String func(String numbers){
        String [] numbersArray= numbers.split(" ");
        int highestNumber = Integer.parseInt(numbersArray[0]);
        for (int i = 0; i < numbersArray.length; i++){
            int numberToCompare = Integer.parseInt(numbersArray[i]);
            if( numberToCompare > highestNumber){
                highestNumber = numberToCompare;
            }
        }
      int lowestNumber = Integer.parseInt(numbersArray[0]);
      for (int i = 0; i < numbersArray.length; i++){
          int numberToCompare = Integer.parseInt(numbersArray[i]);
          if( numberToCompare < lowestNumber){
              lowestNumber = numberToCompare;
          }
      }
        return String.valueOf(highestNumber) + " " + String.valueOf(lowestNumber);
    }
    
}
