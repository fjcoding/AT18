package jalau.at18.katas.game2048.team4;

public class Screen {
    private InputReader reader;
    private Game game;

    public Screen() {
        this.reader = new InputReader();
    }

    void loadGame(Game gameToLoad) {
        this.game = gameToLoad;
    }

    void runGame() {
        this.game.start();
        do {
            String input = this.reader.read();
            this.game.play(input);
        } while (!this.game.hasEnded());
        this.reader.close();
    }
}
