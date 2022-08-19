package jalau.at18.katas.game2048.team4;

public class HelloName extends Game {

    private boolean hasEnded;

    public void start() {
        hasEnded = false;
        System.out.println(
            "***Welcome to Hello game. Objective: just type your name and I will say hello***");
    }

    public void play(GameInput input) {
        String userName =  input.getTextInput();
        System.out.println("Hello " + userName);
        hasEnded = userName.equals("q");
    }

    public boolean hasEnded() {
        return hasEnded;
    }
}
