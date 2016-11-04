/*
 * File: BlankClass.java
 * ---------------------
 * This class is a blank one that you can change at will. Remember, if you change
 * the class name, you'll need to change the filename so that it matches.
 * Then you can extend GraphicsProgram, ConsoleProgram, or DialogProgram as you like.
 */

import acm.program.*;
import java.awt.*;
import acm.graphics.*;
import acm.util.*;


public class BlankClass extends GraphicsProgram {
	
	private static final int SQUARE_SIZE = 100;
	private static final int PAUSE_TIME = 1000;
	
	public void run() {
		GRect square = new GRect(SQUARE_SIZE, SQUARE_SIZE);
		square.setFilled(true);
		add(square, (getWidth() - SQUARE_SIZE)/2, (getHeight() - SQUARE_SIZE) / 2);
		
		while(true) {
			square.setColor(rgen.nextColor());
			pause(PAUSE_TIME);
		}
	}
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
}










