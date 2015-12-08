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
	private static final int SENTINAL = 0;
	public void run() {
		println("Enter the integers ");
		int i = 0;
		int total = 0;
		while(true) {
			int val = readInt("? ");
			if(val == SENTINAL) break;
			total += val;
			i++;
		}
		println("Avg = " + total/i);
		
	}
}

