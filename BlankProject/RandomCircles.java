import acm.graphics.*;
import acm.program.*;
import acm.util.*;

public class RandomCircles extends GraphicsProgram {
	public void run() {
		for(int i = 1; i <= 10; i++) {
			double r = rgen.nextDouble(5, 56);
			double x = rgen.nextDouble(0, getWidth());
			double y = rgen.nextDouble(0,  getHeight());
			GOval g = new GOval(x - r, y - r, r * 2, r * 2);
			g.setFilled(true);
			g.setColor(rgen.nextColor());
			add(g);
		}
	}
	private RandomGenerator rgen = RandomGenerator.getInstance();
}
