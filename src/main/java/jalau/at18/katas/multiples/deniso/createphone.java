package jalau.at18.katas.multiples.deniso;
public class createphone {
    public static void main(String[] args) {
        int nro = 10;
        int sum = 0;
        if(nro>0){
        for(int i=0;i<nro;i++){
            if(i%3 ==0 || i%5==0 ){
                sum=sum+i;
            }
        }
        }
            System.out.println("La suma de multiplos es:"+sum);
        }
}
