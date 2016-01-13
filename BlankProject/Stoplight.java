import java.awt.*;

public class Stoplight {
	public static final Color GREEN = Color.GREEN;
	public static final Color YELLOW = Color.YELLOW;
	public static final Color RED = Color.RED;
	
	public Stoplight() {
		state = GREEN;
	}
	
	public Color getState() {
		return state;
	}
	
	public void advance() {
		if(state == RED) {
			state = GREEN;
		} else if(state == YELLOW) {
			state = RED;
		} else if(state == GREEN) {
			state = YELLOW;
		}
	}
	private Color state;
}
