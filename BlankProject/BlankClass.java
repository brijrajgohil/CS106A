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
	public void run() {
		println("This program classifies an integer by its sign");
		int n = readInt("Enter n : ");
		if(n > 0) {
			println("Positive");
		}
		else if(n == 0) {
			println("Zero");
		}
		else {
			println("Negative");
		}
	}
}

