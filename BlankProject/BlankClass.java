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
	
	private static final int NDARTS = 10000;
	
	public void run() {
		int inside = 0;
		for(int i = 0; i < NDARTS; i++) {
			double x = rgen.nextDouble(-1.0, +1.0);
			double y = rgen.nextDouble(-1.0, +1.0);
			
			if(((x * x) + (y * y)) < 1.0) {
				inside++;
			}
		}
		double pi = (4.0 * inside) / NDARTS;
		println("Pi is approx " + pi);
	}
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
}