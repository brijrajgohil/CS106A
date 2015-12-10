/*
 * File: BlankClass.java
 * ---------------------
 * This class is a blank one that you can change at will. Remember, if you change
 * the class name, you'll need to change the filename so that it matches.
 * Then you can extend GraphicsProgram, ConsoleProgram, or DialogProgram as you like.
 */

import acm.program.*;
import acm.graphics.*;

public class BlankClass extends GraphicsProgram {
	public void run() {
		GLabel label = new GLabel("CS106A rocks my socks");
		label.setFont("SansSerif-28");
		double x = (getWidth() - label.getWidth()) /2;
		double y = (getHeight() - label.getHeight()) / 2;
		label.setLocation(x, y);
		add(label);
	}
}

