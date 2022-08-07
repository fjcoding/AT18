package jalau.at18.katas.phonenumber.rodrigov;

public class Main{
    public static void main(String[] args) {
        int phoneNumber[]={1,2,3,4,5,6,7,8,9,0};
        boolean flag = true;
        String phoneAsString = "";
        for(int i =0;i<phoneNumber.length;i++){
            if(phoneNumber[i]>10){
                flag=false;
            }
            phoneAsString+=phoneNumber[i];
        }
        if(flag==true){
            System.out.println("("+phoneAsString.substring(0,3)+") "+phoneAsString.substring(3, 6)+"-"+phoneAsString.substring(7, phoneAsString.length()));
        }else{
            System.out.println("0");
        }
        
    }
}