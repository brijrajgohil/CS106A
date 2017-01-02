/*
 * File: BlankClass.java
 * ---------------------
 * This class is a blank one that you can change at will. Remember, if you change
 * the class name, you'll need to change the filename so that it matches.
 * Then you can extend GraphicsProgram, ConsoleProgram, or DialogProgram as you like.
 */

import acm.graphics.*;
import acm.program.*;

public class BlankClass extends GraphicsProgram {
	
	private static final int NROWS = 8;
	private static final int NCOLUMNS = 8;
	public void run() {
		int sqSize = getHeight() / NROWS;
		for(int i = 0; i < NROWS; i++) {
			for(int j = 0; j < NCOLUMNS; j++) {
				int x = j * sqSize;
				int y = i * sqSize;
				GRect sq = new GRect(x, y, sqSize, sqSize);
				sq.setFilled(((i+j) % 2) != 0);
				add(sq);
			}
		}
	}
}