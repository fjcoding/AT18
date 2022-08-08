package jalau.at18.katas.likes.alvaro;

public class Main {
    private static final int NUMBER_OF_NAMES = 3;
    public static void main(String[] args) {
        String[ ] names = {"Pedro", "Juanito", "Francisco", "Carla", "Julia"};
        if (names.length == 0) {
            System.out.println("No one likes this");
        }
        if (names.length == 1) {
            System.out.println(names[0] + " likes this");
        }
        if (names.length == 2) {
            System.out.println(names[0] + " and " + names[1] + " Like this");
        }
        if (names.length == NUMBER_OF_NAMES) {
            System.out.println(names[0] + "," + names[1] + " and " + names[2] + " like this");
        } else {
            System.out.println(names[0] + "," + names[1] + " and " + (names.length - 2) + " others like this");
        }
    }
}
