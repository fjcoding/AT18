package jalau.at18.battlecity;

public class MoveEnemy extends Thread {
    String letter = "";
	//String input ="";
	//KeyListenerExample keyListener = new KeyListenerExample();
	@Override
	public void run () {
		while(true) {
			//input = keyListener.getInput();
			letter += "A" ;
			System.out.println(letter);
			try {
				MoveEnemy.sleep(1000);
			} catch (InterruptedException e) {
				System.out.print(e);
			}

		}

	}
}
