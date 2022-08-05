package jalau.at18.katas.phonenumber.alvaro;

public class Main {
    public static void main(String[] args) {
    int number[] = {1,2,3,4,5,6,7,8,9,0};
    String caracter;
    String finalNumber ="";
    for(int ind=0;ind<number.length;ind++){

        caracter=String.valueOf(number[ind]);

        if(ind<3){
            if(ind==0)
                finalNumber=finalNumber.concat("(");
            finalNumber=finalNumber.concat(caracter);
            if(ind==2)
                finalNumber=finalNumber.concat(")");
        }
        if(3<=ind && ind<6){
            if(ind==3)
                finalNumber=finalNumber.concat(" ");
            finalNumber=finalNumber.concat(caracter);
            if(ind==5)
                finalNumber=finalNumber.concat("-");
        }
        if(6<=ind && ind<number.length){
            finalNumber=finalNumber.concat(caracter);
        }
    }
    System.out.println("Numero convertido: "+finalNumber);
    }
}
