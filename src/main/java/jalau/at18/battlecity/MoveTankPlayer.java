package jalau.at18.battlecity;

public class MoveTankPlayer extends Thread {
    private FrameInput frame = new FrameInput();
    private TankPlayer tankPlayer;
    private Board board;

    public MoveTankPlayer(Board board, TankPlayer tankPlayer) {
        this.board = board;
        this.tankPlayer = tankPlayer;
    }

    @Override
    public void run() {
        Input reader = new Input(board, tankPlayer);
        frame.addKey(reader);

    }
}
