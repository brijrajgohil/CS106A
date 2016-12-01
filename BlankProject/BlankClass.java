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
	
	private static final int NUM_SIDES = 6;
	public void run() {
		int numRolls = readInt("Enter num of rolls ");
		for(int i = 0; i < numRolls; i++) {
			int roll = rgen.nextInt(1, NUM_SIDES);
			println(roll);
		}
	}
	private RandomGenerator rgen = new RandomGenerator();
}