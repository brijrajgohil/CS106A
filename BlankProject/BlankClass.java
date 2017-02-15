/*
 * File: BlankClass.java
 * ---------------------
 * This class is a blank one that you can change at will. Remember, if you change
 * the class name, you'll need to change the filename so that it matches.
 * Then you can extend GraphicsProgram, ConsoleProgram, or DialogProgram as you like.
 */

import acm.graphics.*;
import acm.program.*;

public class BlankClass extends GraphicsProgram {
	
	public void run() {
		double width = getWidth() / 2;
		double height = getHeight() / 2;
		GPolygon diamond = new GPolygon();
		diamond.addVertex(-width / 2, 0);
		diamond.addVertex(0, -height / 2);
		diamond.addVertex(width / 2, 0);
		diamond.addVertex(0, height / 2);
		add(diamond, width, height);
	}
}