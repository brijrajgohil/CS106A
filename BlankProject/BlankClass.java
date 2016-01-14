/*
 * File: BlankClass.java
 * ---------------------
 * This class is a blank one that you can change at will. Remember, if you change
 * the class name, you'll need to change the filename so that it matches.
 * Then you can extend GraphicsProgram, ConsoleProgram, or DialogProgram as you like.
 */

import acm.program.*;


public class BlankClass extends ConsoleProgram {
	public void run() {
		Stoplight myStoplight = new Stoplight();
		println(myStoplight.getState());
		myStoplight.advance();
		println(myStoplight.getState());
	}
}

