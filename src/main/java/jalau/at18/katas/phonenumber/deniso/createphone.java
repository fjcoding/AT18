package jalau.at18.katas.phonenumber.deniso;

public class createphone {
    public static void main(String[] args) {
        int number[] = {1,2,3,4,5,6,7,8,9,0};
        String res="";
        String aux="(";
        String aux1=")";
        String aux2="-";
        String aux3="";
        String aux4="";
        String aux5="";
        
        for(int i=0; i<number.length;i++){
            if(i<=2) aux3+=number[i];
            if(i>2&&i<=5) aux4+=number[i];
            if(i>5 && i<=9) aux5+=number[i];
        }
        res=aux+aux3+aux1+" "+aux4+aux2+aux5;
        System.out.println("Phone number is:" + res);
        }
}
