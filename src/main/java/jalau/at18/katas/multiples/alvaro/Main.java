package jalau.at18.katas.multiples.alvaro;

public class Main {
    public static void main(String[] args) {
    int input = 10;
    int added = 0;
    for(int ind=0;ind<input;ind++){
        if(ind%3 ==0 || ind%5==0 ){
            added = added + ind;
        }
    }
    if(input<0){
        System.out.println("0");
    }
    else{
        System.out.println("La suma es: "+added);
    }
    }
}
