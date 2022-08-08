package jalau.at18.katas.phonenumber.adriana;

public class Main {
    public static void main(String[] args) {
        Integer [] array = {2,6,4,8,3,8,1,1,9,4};
        printArray(array);
        if (checkNumber(array)){
            System.out.println(createPhoneNumber(array));
        }
        else{
            System.out.println("Numbers are incorrects");
        }
        
    }
    private static void printArray (Integer []array){
        Integer length = array.length;
        System.out.print("Numbers: [");
        for (int i=0;i<length;i++){
            if(i<length-1){
                System.out.print(array[i]+", ");
            }
            else{
                System.out.println(array[i]+"]");
            }
        }
    }
    private static Boolean checkNumber (Integer []n){
        Integer length=n.length;
        if (length!=10){
            return false;
        }
        for(int i=0;i<length;i++){
            if(n[i]<0||n[i]>9){
                return false;
            }
        }
        return true;
    }
    private static String createPhoneNumber (Integer [] n){
        String str ="("+n[0]+n[1]+n[2]+") "+n[3]+n[4]+n[5]+"-"+n[6]+n[7]+n[8]+n[9];
        return str;
    }
}
