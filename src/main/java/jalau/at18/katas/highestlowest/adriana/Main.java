package jalau.at18.katas.highestlowest.adriana;


public class Main {
    public static void main(String[] args) {
        String str = "-4 -5 7 -9 9 3 6 10 -5";
        String [] array = str.split(" ");
        Integer high = getHighest(array);
        Integer low = getLowest(array);
        System.out.println("highAndLow("+str+")");
        System.out.println(high+" "+low);
    }
    private static Integer getHighest (String []array){
        Integer high =0;
        Integer length = array.length;
        for (int i=0;i<length;i++){
            if(i==0){
                high=Integer.parseInt(array[i]);
            }
            else{
                if (Integer.parseInt(array[i])>high){
                    high=Integer.parseInt(array[i]);
                }
            }
        }
        return high;
    }
    private static Integer getLowest (String []array){
        Integer low =0;
        Integer length = array.length;
        for (int i=0;i<length;i++){
            if(i==0){
                low=Integer.parseInt(array[i]);
            }
            else{
                if (Integer.parseInt(array[i])<low){
                    low=Integer.parseInt(array[i]);
                }
            }
        }
        return low;
    }
}
