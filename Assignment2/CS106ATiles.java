/*
 * File: CS106ATiles.java
 * Name: Brijrajsinh Gohil
 * Section Leader: 
 * ----------------------
 * This file is the starter file for the CS106ATiles problem.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class CS106ATiles extends GraphicsProgram {
	
	/** Amount of space (in pixels) between tiles */
	private static final int TILE_SPACE = 20;
	private static final int TILE_WIDTH = 200;
	private static final int TILE_HEIGHT = 100;
	
	public void run() {
		double cx = getWidth()/2;
		double cy = getHeight()/2;
		upperTiles(cx, cy);
		lowerTiles(cx, cy);
	}
	private void upperTiles(double x, double y) {
		x -= (TILE_SPACE + TILE_WIDTH);
		y -= TILE_HEIGHT;
		for(int i = 1; i<=2; i++) {
			GRect g = new GRect(x, y, TILE_WIDTH, TILE_HEIGHT);
			add(g);
			add106Text(x, y);
			x += (TILE_WIDTH + (TILE_SPACE*2));
		}
	}
	
	private void lowerTiles(double x, double y) {
		x -= (TILE_SPACE + TILE_WIDTH);
		y += TILE_SPACE * 2;
		for(int i = 1; i <= 2; i++) {
			GRect g = new GRect(x, y, TILE_WIDTH, TILE_HEIGHT);
			add(g);
			add106Text(x, y);
			x += (TILE_WIDTH + (TILE_SPACE*2));
		}
	}
	
	private void add106Text(double x, double y) {
		GLabel label = new GLabel("CS106A");
		double mx = (x + TILE_WIDTH/2);
		double my = (y + TILE_HEIGHT/2);
		label.setFont("SanSerif-25");
		double xl = (mx - label.getWidth()/2);
		double yl = (my - label.getAscent());
		label.setLocation(xl, yl);
		add(label);
		
	}
}

