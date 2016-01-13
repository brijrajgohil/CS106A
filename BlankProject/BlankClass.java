/*
 * File: BlankClass.java
 * ---------------------
 * This class is a blank one that you can change at will. Remember, if you change
 * the class name, you'll need to change the filename so that it matches.
 * Then you can extend GraphicsProgram, ConsoleProgram, or DialogProgram as you like.
 */

import acm.program.*;
import acm.util.*;

public class BlankClass extends ConsoleProgram {
	public void run() {
		int total = rollTwoDice();
		if(total == 7 || total == 11) {
			println("That's a natural. You win");
		} else if(total == 2 || total == 3 || total == 12) {
			println("That's craps. You lose.");
		} else {
			int point = total;
			println("Your point is " + point);
			while(true) {
				if(total == point) {
					println("You made your point. You win.");
					break;
				} else if(total == 7) {
					println("That a 7. You lose.");
					break;
				}
			}
		}
	}
	
	private int rollTwoDice() {
		int d1 = rgen.nextInt(1, 6);
		int d2 = rgen.nextInt(1, 6);
		int total = d1 + d2;
		println("Rolled dice: " + d1 + " " + d2 + " = " + total);
		return total;
	}
	
	private RandomGenerator rgen = new RandomGenerator();
}

