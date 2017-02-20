import acm.program.*;
import acm.graphics.*;
import acm.util.*;
import java.awt.*;

public class DribbleCastle extends GraphicsProgram {
	// Preferred window size
	public static final int APPLICATION_WIDTH = 500;
	
	//the delay between frames
	public static final double PAUSE_TIME = 1;
	
	//How fast the snowflakes fall.
	private static final double Y_VELOCITY = 5;
	
	//color of a snowflake
	private static final Color SAND_COLOR = Color.ORANGE;
	
	//size of a snowflake
	private static final double DRIBBLE_SIZE = 20;
	
	public void run() {
		for(int i = 0; i < 200; i++) {
			dropOneSnowflake();
		}
	}
	
	/*
	 * Given a snowflake whether that snowflake has hit the 
	 * bottom of the screen
	 */
	private boolean hasHitBottom(GOval snowflake) {
		double bottomY = snowflake.getY() + snowflake.getHeight();
		return bottomY >= getHeight();
	}
	
	/*
	 * Given a snowflake, generates a random X coordinate 
	 * at which place that snowflake
	 */
	private double getRandomX(GOval snowflake) {
		RandomGenerator rgen = RandomGenerator.getInstance();
		double x = getWidth() / 2 + rgen.nextGaussian() * getWidth() / 8;
		return x; 
	}
	
	/*
	 * Creates and returns a new, randomly-fashioned
	 * snowflake
	 */
	private GOval makeSnowflake() {
		GOval result = new GOval(DRIBBLE_SIZE, DRIBBLE_SIZE);
		result.setFilled(true);
		result.setFillColor(SAND_COLOR);
		result.setLocation(getRandomX(result), 0);
		return result;
	}
	
	/*
	 * Given a snowflake, returns whether that snowflake has
	 * collided
	 */
	private boolean hasHitSomethingElse(GOval snowflake) {
		GObject hit = getElementAt(snowflake.getX() + snowflake.getWidth() / 2.0,
					snowflake.getY() + snowflake.getHeight() + 1);
		return hit != null;
	}
	
	/*
	 * Simulated dropping one snowflake on the screen
	 */
	private void dropOneSnowflake() {
		GOval snowflake = makeSnowflake();
		add(snowflake);
		
		while(!hasHitBottom(snowflake) && !hasHitSomethingElse(snowflake)) {
			snowflake.move(0, Y_VELOCITY);
			pause(PAUSE_TIME);
		}
	}
}
