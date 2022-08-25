package jalau.at18.spaceinvaders;

public class Block {
    private static final int MAX_DURABILITY = 4;
    private static final int THREE_DURABILITY = 3;
    private static final int TWO_DURABILITY = 2;
    private static final int UNICODE_CHAR = 126;
    private int duration;

    public Block() {
        duration = MAX_DURABILITY;
    }

    public void impact() {
        duration--;
    }

    public char getCharacter() {
        char res = '-';
        if (duration == MAX_DURABILITY) {
            res = '#';
        }
        if (duration == THREE_DURABILITY) {
            res = '=';
        }
        if (duration == TWO_DURABILITY) {
            res = UNICODE_CHAR;
        }
        return res;
    }
}
