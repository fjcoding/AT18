package jalau.at18.katas.game2048.team1;

public class Messages {

    public void movementsMessage() {
        System.out.println("Game instructions");
        System.out.println("Top: w");
        System.out.println("Left: a");
        System.out.println("Right: d");
        System.out.println("Down: s");
    }
    public void wrongDirection() {
        System.out.println("********Incorrect letter*********");
    }
    public void winner() {
        System.out.print("Congratulations, You got 2048!!!");
    }
}
