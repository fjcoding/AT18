package jalau.at18.battlecity;

public class MoveTankPlayer extends Thread {
    FrameInput f = new FrameInput();

	@Override
	public void run () {
		Input k = new Input();
		f.addKey(k);
	}
}
