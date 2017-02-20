import acm.program.*;
import acm.graphics.*;

import java.awt.event.MouseEvent;

import acm.util.*;
public class DebrisSweeper extends GraphicsProgram{
	private static final int N_DEBRIS = 100;
	private static final int DEBRIS_MAX_WIDTH = 200;
	private static final int DEBRIS_MAX_HEIGHT = 200;
	
	private RandomGenerator rgen = new RandomGenerator();
	
	public void run() {
		makeDebris();
		addMouseListeners();
	}
	
	public void mouseClicked(MouseEvent e) {
		int clickX = e.getX();
		int clickY = e.getY();
		GObject obj = getElementAt(clickX, clickY);
		if(obj != null) {
			remove(obj);
		}
	}
	
	private void makeDebris() {
		for(int i = 0; i < N_DEBRIS; i++) {
			makeSingleDebris();
		}
	}
	
	private void makeSingleDebris() {
		int w = rgen.nextInt(DEBRIS_MAX_WIDTH);
		int h = rgen.nextInt(DEBRIS_MAX_HEIGHT);
		int x = rgen.nextInt(getWidth() - w);
		int y = rgen.nextInt(getHeight() - h);
		GOval debris = new GOval(w, h);
		debris.setFilled(true);
		debris.setFillColor(rgen.nextColor());
		add(debris, x, y);
	}
}
