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
		int n = readInt("Enter number of objects ");
		int k = readInt("Enter number to be chosen ");
		println("C(" + n + ", " + k + ") = " + combinations(n, k));
	}
	private int combinations(int n, int k) {
		return factorial(n) / (factorial(k) * factorial(n - k));
	}
	private int factorial(int k) {
		int result = 1;
		for(int i = 1; i <= k; i++) {
			result *= i;
		}
		return result;
	}
}

