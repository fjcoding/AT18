package jalau.at18.battlecity;

public enum ElementType {
    COMPLETE_BRICK(20),
    LEFT_BRICK(21),
    RIGHT_BRICK(22),
    TOP_BRICK(23),
    DOWN_BRICK(24),
    EMPTY(0),
    BUSHES(6),
    ICE(7),
    WATER(8),
    LEFT_STEAL(25),
    RIGHT_STEAL(26),
    DOWN_STEAL(27),
    TOP_STEAL(28);
    private final int code;

    ElementType(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

}
