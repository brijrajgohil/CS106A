/*
 * File: BlankClass.java
 * ---------------------
 * This class is a blank one that you can change at will. Remember, if you change
 * the class name, you'll need to change the filename so that it matches.
 * Then you can extend GraphicsProgram, ConsoleProgram, or DialogProgram as you like.
 */

import acm.graphics.GRect;
import acm.program.*;
import acm.util.*;

public class BlankClass extends GraphicsProgram {
	public void run() {
		double sqSize = (double) getHeight() / N_ROWS;
		for(int i = 0; i < N_ROWS; i++) {
			for(int j = 0; j < N_COLUMNS; j++) {
				double x = j * sqSize;
				double y = i * sqSize;
				GRect sq = new GRect(x, y, sqSize, sqSize);
				sq.setFilled((i+j)%2 != 0);
				add(sq);
			}
		}
	}
	public static final int N_ROWS = 10;
	public static final int N_COLUMNS = 10;
}

