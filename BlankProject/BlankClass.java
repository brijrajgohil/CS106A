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
		int i = 1;
		int num = readInt("Enter the number?");
		int temp = 0;
		int total = 0;
		while(temp != num) {
			if(i%2 != 0) {
				println(i + " ");
				total += i;
				temp++;
			}
			i++;
		}
		println("Total = " + total);
	}
}

