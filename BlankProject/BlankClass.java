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
		println("The program converts integers to Card Ranks");
		int n = readInt("Enter the integer between 1 and 13");
		switch(n) {
		case 1: println("Ace"); break;
		case 11: println("Jack"); break;
		case 12: println("Queen"); break;
		case 13: println("King"); break;
		default: println(n); break;
		}
	}
}

