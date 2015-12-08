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
	public void run() {
		for(int i = 1; i <= 100; i++) {
			if(i%6 == 0 || i%7 == 0) {
				if(i%6 == 0 && i%7 == 0) {
					continue;
				}
				println(i + " ");
			}
		}
	}
}

