package jalau.at18.katas.multiples.Adriana;

public class Main {
    public static void main(String[] args) {
        Integer number = -20;
        System.out.println("Number: "+number);
        Integer sumMultiples = getSumMult (number);
        System.out.println("Sum: "+sumMultiples);
    }
    private static Integer getSumMult (Integer n){
        Integer sum=0;
        if (n>=0){
            for (int i=1;i<n;i++){
                if ((i%3==0)||(i%5==0)){
                    sum=sum+i;
                }
            }
        }
        return sum;
    }
}
