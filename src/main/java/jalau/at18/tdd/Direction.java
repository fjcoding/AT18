package jalau.at18.tdd;

public enum Direction {
    UP(-1, 0),
    DOWN(1, 0),
    LEFT(0, -1),
    RIGHT(0, 1);

    private final int dirModifierX;
    private final int dirModifierY;

    Direction(int modifierX, int modifierY) {
        dirModifierX = modifierX;
        dirModifierY = modifierY;
    }

    public int getModifierX() {
        return dirModifierX;
    }

    public int getModifierY() {
        return dirModifierY;
    }
}
