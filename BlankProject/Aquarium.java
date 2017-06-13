import java.util.ArrayList;
import acm.graphics.GImage;
import acm.program.*;

public class Aquarium extends Program {
	private static final double DELAY = 1000.0 / 50;
	private Tank fishTank = new Tank();
	
	public void run() {
		setSize(Tank.SCREEN_WIDTH, Tank.SCREEN_HEIGHT);
		add(fishTank);
		fishTank.init();
		
		while(true) {
			fishTank.heartbeat();
			pause(DELAY);
		}
	}
}
