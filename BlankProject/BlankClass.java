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
		int heads = 0;
		int count = 0;
		//rgen.setSeed(2);
		while(heads != 3) {
			if(rgen.nextBoolean()) {
				println("Heads");
				heads++;
				count++;
			}else {
				println("Tails");
				heads = 0;
				count++;
			}
		}
		println("It took " + count + " flips to get 3 consecutive heads.");
	}
	
	private RandomGenerator rgen = new RandomGenerator();
}

