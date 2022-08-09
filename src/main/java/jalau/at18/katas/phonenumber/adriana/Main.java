package jalau.at18.katas.phonenumber.adriana;

public class Main {
    static final Integer T_NUMBER_1 = 3;
    static final Integer T_NUMBER_2 = 4;
    static final Integer T_NUMBER_3 = 8;
    static final Integer T_NUMBER_4 = 6;
    static final Integer T_NUMBER_5 = 1;
    static final Integer T_NUMBER_6 = 1;
    static final Integer T_NUMBER_7 = 9;
    static final Integer T_NUMBER_8 = 1;
    static final Integer T_NUMBER_9 = 5;
    static final Integer T_NUMBER_10 = 2;

    static final Integer LENGHT = 10;
    static final Integer MAX_POS = 9;
    static final Integer MAX_POS_CODE = 5;
    
    public static void main(String[] args) {
        Integer[] array = {T_NUMBER_1, T_NUMBER_2, T_NUMBER_3, T_NUMBER_4, T_NUMBER_5, T_NUMBER_6, T_NUMBER_7, T_NUMBER_8, T_NUMBER_9, T_NUMBER_10};
        printArray(array);
        if (checkNumber(array)) {
            System.out.println(createPhoneNumber(array));
        } else {
            System.out.println("Numbers are incorrects");
        }
    }
    private static void printArray(Integer[] array) {
        Integer length = array.length;
        System.out.print("Numbers: [");
        for (int count = 0; count < length; count++) {
            if (count < length - 1) {
                System.out.print(array[count] + ", ");
            } else {
                System.out.println(array[count] + "]");
            }
        }
    }
    private static Boolean checkNumber(Integer[] number) {
        Integer length = number.length;
        if (length != LENGHT) {
            return false;
        }
        for (int count = 0; count < length; count++) {
            if (number[count] < 0 || number[count] > MAX_POS) {
                return false;
            }
        }
        return true;
    }
    private static String createPhoneNumber(Integer[] num) {
        Integer length = num.length;
        String str = "(";
        for (int count = 0; count < length; count++) {
            if (count < 2) {
                str = str + num[count];
            } else {
                if (count == 2) {
                    str = str + num[count] + ") ";
                } else {
                    if (count < MAX_POS_CODE) {
                        str = str + num[count];
                    } else {
                        if (count == MAX_POS_CODE) {
                            str = str + num[count] + " - ";
                        } else {
                            str = str + num[count];
                        }
                    }
                }
            }
        }
        return str;
    }
}