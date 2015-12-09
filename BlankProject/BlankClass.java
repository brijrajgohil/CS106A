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
	private static final int NROWS = 8;
	private static final int NCOLUMS = 8;
	public void run() {
		int sqSize = getWidth() / NROWS;
		for(int i = 0; i < NROWS; i++) {
			for(int j = 0; j < NCOLUMS; j++) {
				int x = i * sqSize;
				int y = j * sqSize;
				GRect sq = new GRect(x, y, sqSize, sqSize);
				add(sq);
				if((i + j) % 2 != 0) {
					GOval go = new GOval(x, y, sqSize-2, sqSize-2);
					add(go);
				}
			}
		}
		
	}
}

