package jalau.at18.battlecity;

public class MoveTankPlayer extends Thread {
    FrameInput f = new FrameInput();
    TankPlayer tankPlayer;
    Board board;
    public MoveTankPlayer (Board board, TankPlayer tankPlayer){
        this.board = board;
        this.tankPlayer = tankPlayer;
    }
	@Override
	public void run () {
		Input k = new Input(board, tankPlayer);
		f.addKey(k);
	}
}
