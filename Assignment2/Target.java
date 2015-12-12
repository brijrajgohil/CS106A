/*
 * File: Target.java
 * Name: 
 * Section Leader: 
 * -----------------
 * This file is the starter file for the Target problem.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Target extends GraphicsProgram {	
	public void run() {
		int cx = getWidth()/2;
		int cy = getHeight()/2;
		double r = 72;
		redCircle(cx, cy, r);
		r = 46.8;
		whiteCircle(cx, cy, r);
		r = 21.6;
		redCircle(cx, cy, r);
	}
	private void redCircle(double cx, double cy, double r) {
		GOval tar = new GOval(cx-r, cy-r, r*2, r*2);
		tar.setColor(Color.RED);
		tar.setFilled(true);
		add(tar);
	}
	private void whiteCircle(double cx, double cy, double r) {
		GOval tar = new GOval(cx-r, cy-r, r*2, r*2);
		tar.setColor(Color.WHITE);
		tar.setFilled(true);
		add(tar);
	}
}
