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
		println("The program adds sums the digits in a number");
		int n = readInt("Enter number");
		int dsum = 0;
		while(n > 0) {
			dsum += (n % 10);
			n /= 10;
		}
		println("dsum = " + dsum);
		
	}
}

