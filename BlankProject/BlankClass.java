/*
 * File: BlankClass.java
 * ---------------------
 * This class is a blank one that you can change at will. Remember, if you change
 * the class name, you'll need to change the filename so that it matches.
 * Then you can extend GraphicsProgram, ConsoleProgram, or DialogProgram as you like.
 */

import acm.program.*;
import acm.graphics.*;

public class BlankClass extends ConsoleProgram {
	private static final int NVALUES = 10;
	public void run() {
		println("The program adds " + NVALUES + "integers.");
		int total = 0;
		for(int i = 0; i < NVALUES; i++) {
			int value = readInt("?");
			total += value;
		}
		println("Total is " + total);
	}
}

