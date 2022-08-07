package jalau.at18.katas.multiples.rodrigov;
public class Main{
    public static void main(String[] args) {
        int limitNumber=10;
        int count=0;
        for(int i=1;i<limitNumber;i++){
            if(i%3==0 || i%5==0){
                count+=i;
                System.out.println(i);
            }
        }
        if(count<0){
            count=0;
        }else{
            System.out.println(count);
        }
        
    }
}
