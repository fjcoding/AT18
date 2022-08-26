package jalau.at18.battlecity.elements;

public enum ElementType {
    EMPTY(0), MISSILES(1), TANKTOP(10), TANKBACK(11), BRICK(3), STEEL(4), BUSHES(5), ICE(6), WATER(7), EAGLE(
            8), TANKBACKENEMY(12), TANKTOPENEMY(13);

    private final int code;

    ElementType(int code) {
        this.code = code;
    }

    public static ElementType findByCode(int code) {
        for (ElementType type : values()) {
            if (type.getCode() == code) {
                return type;
            }
        }
        return null;
    }

    public int getCode() {
        return code;
    }

}
