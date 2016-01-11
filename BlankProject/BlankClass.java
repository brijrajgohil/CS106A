/*
 * File: BlankClass.java
 * ---------------------
 * This class is a blank one that you can change at will. Remember, if you change
 * the class name, you'll need to change the filename so that it matches.
 * Then you can extend GraphicsProgram, ConsoleProgram, or DialogProgram as you like.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;
public class BlankClass extends ConsoleProgram {
	
	private static final int LOWER_LIMIT = 0;
	private static final int UPPER_LIMIT = 10;
	
	
	public void run() {
		for(int c = LOWER_LIMIT; c <= UPPER_LIMIT; c++) {
			println(c + "! = " + factorial(c));
		}
	}
	
	private int factorial(int c) {
		int result = 1;
		for(int i = 1; i <= c; i++) {
			result *= i;
		}
		return result;
	}
}

