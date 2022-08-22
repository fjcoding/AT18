package jalau.at18.katas.game2048.team4;

abstract class GameInput {
    protected String textInput;
    protected InputReader reader;

    public String getTextInput() {
        return textInput;
    }

    public InputReader getReader() {
        return reader;
    }
}
