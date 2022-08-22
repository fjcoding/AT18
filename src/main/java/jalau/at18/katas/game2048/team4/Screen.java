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
            GameInput gameInput = null;
            if (game instanceof Game2048) {
                gameInput = new Input2048(input, reader);
            } else if (game instanceof HelloName) {
                gameInput = new InputHello(input);
            }
            this.game.play(gameInput);
        } while (!this.game.hasEnded());
        this.reader.close();
    }
}
