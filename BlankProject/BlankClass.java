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
		int a = readInt("Enter a ");
		int b = readInt("Enter b ");
		int c = readInt("Enter c ");
		int x = (int) (-b + Math.sqrt((b * b) - (4 * a * c)) / (2 * a));
		println("The solutions are " + x);
		x = (int) (-b - Math.sqrt((b * b) - (4 * a * c)) / (2 * a));
		println(x);
	}
}

