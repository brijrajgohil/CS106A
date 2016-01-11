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
public class BlankClass extends GraphicsProgram {
/* Parameters for the drawing */
	
	public void run() {
		GLabel label = new GLabel("Hello, World");
		label.setFont("London-36");
		label.setColor(Color.MAGENTA);
		double x = (getWidth() - label.getWidth()) / 2;
		double y = (getHeight() - label.getAscent()) / 2;
		add(label, x, y);
	}
}

