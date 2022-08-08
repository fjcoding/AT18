package jalau.at18.katas.likes.adriana;

public class Main {
    public static void main(String[] args) {
        String [] array = {"Jose","Maria","Pedro", "Susana"};
        printArray(array);
        System.out.println(likesText(array));
    }
    private static void printArray (String []array){
        Integer length = array.length;
        System.out.print("[");
        for (int i=0;i<length;i++){
            if(i<length-1){
                System.out.print(array[i]+", ");
            }
            else{
                System.out.println(array[i]+"]");
            }
        }
    }
    private static String likesText (String [] str){
        Integer length=str.length;
        String text="";
        if (length==0){
            text="no one";
        }
        else{
            for (int i=0;i<length;i++){
                if(i==0){
                    text=str[i];
                }
                else{
                    if (length<=3){
                        if(i<length-1){
                            text=text+", "+str[i];
                        }
                        else{
                            text=text+" and "+str[i];
                        }
                    }
                    else{
                        if(i==1){
                            text=text+", "+str[i];
                        }
                        else{
                            text=text+" and "+(length-2)+" others";
                            i=length-1;
                        }
                    }
                }
            }
        }
        if (length<=1){
            text=text+" likes this";
        }
        else{
            text=text+" like this";
        }
        return text;
    }
}
