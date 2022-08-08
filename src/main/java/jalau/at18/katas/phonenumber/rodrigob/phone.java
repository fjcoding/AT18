package jalau.at18.katas.phonenumber.rodrigob;
public class Phone {

    public static void main(String[] args) {
        final int input = 5;
        System.out.print(phoneNumber(new int[] {input, input, input, input, input, input, input, input, input, input}));
    }
    public static String phoneNumber(int[] numbers) {
        String out = "(";
        final int limit1 = 3;
        final int limit2 = 6;
        for (int increase = 0; increase < numbers.length; increase++) {
            if (increase < limit1) {
                out += numbers[increase];
            }
            if (increase == limit1) {
                out += ") ";
            }
            if (increase >= limit1 && increase < limit2) {
                out += numbers[increase];
            }
            if (increase == limit2) {
                out += "-";
            }
            if (increase >= limit2) {
                out += numbers[increase];
            }
        }
        return out;
    }
}