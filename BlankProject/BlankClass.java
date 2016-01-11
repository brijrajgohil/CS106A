/*
 * File: BlankClass.java
 * ---------------------
 * This class is a blank one that you can change at will. Remember, if you change
 * the class name, you'll need to change the filename so that it matches.
 * Then you can extend GraphicsProgram, ConsoleProgram, or DialogProgram as you like.
 */

import acm.program.*;
import java.awt.*;
public class BlankClass extends ConsoleProgram {
	public void run() {
		raiseIntPower(2, 10);
	}
	private void raiseIntPower(int n, int k) {
		for(int i = 0; i <= k; i++) {
			println(Math.pow(n, i));
		}
	}
}

