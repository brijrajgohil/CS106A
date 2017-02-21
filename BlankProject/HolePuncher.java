import acm.program.*;
import acm.graphics.*;

import java.awt.event.MouseEvent;
import acm.util.*;

public class HolePuncher extends GraphicsProgram{
	private static final int HOLE_SIZE = 15;
	private RandomGenerator rgen = new RandomGenerator();
	
	public void run() {
		addMouseListeners();
	}
	
	public void mouseClicked(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		addHole(x, y);
	}
	
	private void addHole(int centerX, int centerY) {
		GOval hole = new GOval(HOLE_SIZE, HOLE_SIZE);
		hole.setFilled(true);
		hole.setFillColor(rgen.nextColor());
		add(hole, centerX - HOLE_SIZE / 2, centerY - HOLE_SIZE / 2);
	}
}
