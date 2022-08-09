package jalau.at18.katas.likes.adriana;

public class Main {
    static final Integer MAX_NUM_NAMES = 3;
    public static void main(String[] args) {
        String[] array = {"Jose", "Maria", "Pedro", "Susana"};
        printArray(array);
        System.out.println(likesText(array));
    }
    public static void printArray(String[] array) {
        Integer length = array.length;
        System.out.print("[");
        for (int count = 0; count < length; count++) {
            if (count < length - 1) {
                System.out.print(array[count] + ", ");
            } else {
                System.out.println(array[count] + "]");
            }
        }
    }
    public static String likesText(String[] str) {
        Integer length = str.length;
        String text = "";
        if (length == 0) {
            text = "no one";
        } else {
            for (int count = 0; count < length; count++) {
                if (count == 0) {
                    text = str[count];
                } else {
                    if (length <= MAX_NUM_NAMES) {
                        if (count < length - 1) {
                            text = text + ", " + str[count];
                        } else {
                            text  = text + " and " + str[count];
                        }
                    } else {
                        if (count == 1) {
                            text = text + ", " + str[count];
                        } else {
                            text = text + " and " + (length - 2) + " others";
                            count = length - 1;
                        }
                    }
                }
            }
        }
        if (length <= 1) {
            text = text + " likes this";
        } else {
            text = text + " like this";
        }
        return text;
    }
}