package jalau.at18.katas.likes.rene;

public class Main {
    public static void main(String args[]){
        String names [] = {"Camila", "Fabricio", "Sebastian", "Adrian", "Jose", "Cristian", "Fabian", "Ee"};
       System.out.println(likes(names));

    }

    static String likes(String[] names){
        if(names.length == 0)
            return "No one like this";
            else if(names.length == 1){
                return names[0] + "like this";
            }
            else if (names.length == 2)
                return  names[0] + " and " + names[1] + " like this";
            else if ( names.length == 3)
                return names[0] + ","  + names[1] + " and " + names[2] + " like this";
            else {
                return names[0] + ","  + names[1] + " and " + (names.length -2)+ " others like this";
        }

    }
}
