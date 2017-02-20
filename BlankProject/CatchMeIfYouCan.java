import acm.program.*;
import acm.graphics.*;

import java.awt.*;
import java.awt.event.MouseEvent;

import acm.util.*;

public class CatchMeIfYouCan extends GraphicsProgram{
	private static final int DISTRACTOR_SIZE = 40;
	private static final int SQ_SIZE = 45;
	private static final int N_DISTRACTORS = 50;
	
	private GRect blueSquare = null;
	private RandomGenerator rgen = new RandomGenerator();
	
	public void run() {
		addMouseListeners();
		addBlueSquare();
		addDistractors();
	}
	
	public void mouseMoved(MouseEvent e) {
		GObject obj = getElementAt(e.getX(), e.getY());
		if(obj == blueSquare) {
			int x = getRandomX(SQ_SIZE);
			int y = getRandomY(SQ_SIZE);
			blueSquare.setLocation(x, y);
		}
	}
	
	private void addBlueSquare() {
		blueSquare = new GRect(SQ_SIZE, SQ_SIZE);
		blueSquare.setFilled(true);
		blueSquare.setFillColor(Color.BLUE);
		int x = getRandomX(SQ_SIZE);
		int y = getRandomY(SQ_SIZE);
		add(blueSquare, x ,y);
	}
	
	private void addDistractors() {
		for(int i = 0; i < N_DISTRACTORS; i++) {
			addDistractor();
		}
	}
	
	private void addDistractor() {
		GRect r = new GRect(DISTRACTOR_SIZE, DISTRACTOR_SIZE);
		r.setFilled(true);
		int x = getRandomX(DISTRACTOR_SIZE);
		int y = getRandomY(DISTRACTOR_SIZE);
		add(r, x, y);
	}
	
	private int getRandomX(int size) {
		return rgen.nextInt(getWidth() - size);
	}
	
	private int getRandomY(int size) {
		return rgen.nextInt(getHeight() - size);
	}
}
