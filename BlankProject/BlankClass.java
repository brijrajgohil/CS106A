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
		int a = 0;
		int b = 1;
		int i = 0;
		int c = 0;
		println(a + " ");
		println(b + " ");
		while(i != 15) {
			c = a + b;
			a = b;
			b = c;
			println(c + " ");
			i++;
		}
		
	}
}

