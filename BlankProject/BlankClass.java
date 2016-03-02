/*
 * File: BlankClass.java
 * ---------------------
 * This class is a blank one that you can change at will. Remember, if you change
 * the class name, you'll need to change the filename so that it matches.
 * Then you can extend GraphicsProgram, ConsoleProgram, or DialogProgram as you like.
 */

import acm.graphics.GRect;
import acm.program.*;
import acm.util.*;
import java.awt.*;

public class BlankClass extends GraphicsProgram {
	public void run() {
		GRect square = new GRect(0, 0, SQSIZE, SQSIZE);
		square.setFilled(true);
		square.setFillColor(Color.RED);
		add(square);
		double dx = (getWidth() - SQSIZE) / NSTEPS;
		double dy = (getHeight() - SQSIZE) / NSTEPS;
		for(int i = 0; i < NSTEPS; i++) {
			square.move(dx, dy);
			pause(PAUSE_TIME);
		}	
	}
	public static final double NSTEPS = 10.0;
	public static final double SQSIZE = 100;
	public static final double PAUSE_TIME = 1000;
}

