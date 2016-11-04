/*
 * File: BlankClass.java
 * ---------------------
 * This class is a blank one that you can change at will. Remember, if you change
 * the class name, you'll need to change the filename so that it matches.
 * Then you can extend GraphicsProgram, ConsoleProgram, or DialogProgram as you like.
 */

import acm.program.*;
import acm.util.*;
import java.awt.*;

public class BlankClass extends ConsoleProgram {
	public void run() {
		println("Fib series");
		int t1 = 0;
		int t2 = 1;
		while(t1 <= MAX_TERM_VALUE) {
			println(t1);
			int t3 = t1 + t2;
			t1 = t2;
			t2 = t3;
		}
	}
	private static final int MAX_TERM_VALUE = 10000;
}

