/*
 * File: Pyramid.java
 * Name: 
 * Section Leader: 
 * ------------------
 * This file is the starter file for the Pyramid problem.
 * It includes definitions of the constants that match the
 * sample run in the assignment, but you should make sure
 * that changing these values causes the generated display
 * to change accordingly.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Pyramid extends GraphicsProgram {

/** Width of each brick in pixels */
	private static final int BRICK_WIDTH = 30;

/** Height of each brick in pixels */
	private static final int BRICK_HEIGHT = 12;

/** Number of bricks in the base of the pyramid */
	private static final int BRICKS_IN_BASE = 14;
	
	public void run() {
		int x = (getWidth()/2) - ((BRICKS_IN_BASE/2) * BRICK_WIDTH);
		int y = getHeight() - BRICK_HEIGHT;
		for(int i = BRICKS_IN_BASE; i >= 1; i--) {
			bricksRow(i, x, y);
			x += (BRICK_WIDTH/2);
			y -= BRICK_HEIGHT;
		}
	}
	
	private void bricksRow(int rowSize, int x, int y) {
		for(int i = 1; i <= rowSize; i++) {
			GRect brick = new GRect(x, y, BRICK_WIDTH, BRICK_HEIGHT);
			add(brick);
			x += BRICK_WIDTH;
		}
	}
}

