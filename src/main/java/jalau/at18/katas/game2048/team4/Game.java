package jalau.at18.katas.game2048.team4;

abstract class Game {
    abstract void start();
    abstract void play(GameInput input);
    abstract boolean hasEnded();
}
