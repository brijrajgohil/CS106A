/*
 * File: BlankClass.java
 * ---------------------
 * This class is a blank one that you can change at will. Remember, if you change
 * the class name, you'll need to change the filename so that it matches.
 * Then you can extend GraphicsProgram, ConsoleProgram, or DialogProgram as you like.
 */

import acm.program.*;
import acm.graphics.*;

public class BlankClass extends GraphicsProgram {
//	private static final int HEAD_WIDTH = 150;
//	private static final int HEAD_HEIGHT = 250;
//	private static final int EYE_RADIUS = 10;
//	private static final int MOUTH_HEIGHT = 20;
	private static final int SQUARE_SIZE = 100;
	
	public void run() {
		GRect square = new GRect(SQUARE_SIZE, SQUARE_SIZE);
		square.setFilled(true);
		System.out.println(getWidth());
		System.out.println(getHeight());
		add(square, getWidth()/2 - SQUARE_SIZE, getHeight()/2 - SQUARE_SIZE);
	}
}

