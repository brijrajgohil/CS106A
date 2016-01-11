/*
 * File: BlankClass.java
 * ---------------------
 * This class is a blank one that you can change at will. Remember, if you change
 * the class name, you'll need to change the filename so that it matches.
 * Then you can extend GraphicsProgram, ConsoleProgram, or DialogProgram as you like.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;
public class BlankClass extends ConsoleProgram {
	
	private static final int LOWER_LIMIT = 0;
	private static final int UPPER_LIMIT = 100;
	private static final int STEP_SIZE = 5;
	
	public void run() {
		println("Celsius to Fahrenheit table.");
		for(int c = LOWER_LIMIT; c <= UPPER_LIMIT; c += STEP_SIZE) {
			int f = (int) celsiusToFahrenheit(c);
			println(c + "C = " + f + "F");
		}
	}
	
	private double celsiusToFahrenheit(double c) {
		return 9.0/5.0 * c +32;
	}
}

