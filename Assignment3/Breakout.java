/*
 * File: Breakout.java
 * -------------------
 * Name:
 * Section Leader:
 * 
 * This file will eventually implement the game of Breakout.
 */

import acm.graphics.*;
import acm.program.*;
import acm.util.*;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Breakout extends GraphicsProgram {

/** Width and height of application window in pixels.  IMPORTANT NOTE:
  * ON SOME PLATFORMS THESE CONSTANTS MAY **NOT** ACTUALLY BE THE DIMENSIONS
  * OF THE GRAPHICS CANVAS.  Use getWidth() and getHeight() to get the 
  * dimensions of the graphics canvas. */
	public static final int APPLICATION_WIDTH = 400;
	public static final int APPLICATION_HEIGHT = 600;

/** Dimensions of game board.  IMPORTANT NOTE: ON SOME PLATFORMS THESE 
  * CONSTANTS MAY **NOT** ACTUALLY BE THE DIMENSIONS OF THE GRAPHICS
  * CANVAS.  Use getWidth() and getHeight() to get the dimensions of
  * the graphics canvas. */
	private static final int WIDTH = APPLICATION_WIDTH;
	private static final int HEIGHT = APPLICATION_HEIGHT;

/** Dimensions of the paddle */
	private static final int PADDLE_WIDTH = 60;
	private static final int PADDLE_HEIGHT = 10;

/** Offset of the paddle up from the bottom */
	private static final int PADDLE_Y_OFFSET = 30;

/** Number of bricks per row */
	private static final int NBRICKS_PER_ROW = 10;

/** Number of rows of bricks */
	private static final int NBRICK_ROWS = 10;

/** Separation between bricks */
	private static final int BRICK_SEP = 4;

/** Width of a brick */
	private static final int BRICK_WIDTH =
	  (WIDTH - (NBRICKS_PER_ROW - 1) * BRICK_SEP) / NBRICKS_PER_ROW;

/** Height of a brick */
	private static final int BRICK_HEIGHT = 8;

/** Radius of the ball in pixels */
	private static final int BALL_RADIUS = 10;

/** Offset of the top brick row from the top */
	private static final int BRICK_Y_OFFSET = 70;

/** Number of turns */
	private static final int NTURNS = 3;
	
/** Paddle Variable*/
	private GRect paddle;

/** Ball variable */
	private GOval ball;

/** Velocities */
	private double vx, vy;

/** Delay */
	private static final int DELAY = 20;

/** For generating random numbers */
	private RandomGenerator rgen = new RandomGenerator();
	
/** Brick */
	private GRect brick;
	
/* Method: run() */
/** Runs the Breakout program. */
	public void run() {
		setUp();
		addMouseListeners();
		waitForClick();
		play();
	}
	
	private void setUp() {
		addBricks();
		addPaddle();
		addBall();
	}
	

	private void play() {
		moveBall();
	}
	
	/* Setup functions */
	private void addBricks() {
		for(int i = 0; i < NBRICK_ROWS; i++) {
			for(int j = 0; j < NBRICKS_PER_ROW; j++) {
				brick = new GRect((BRICK_SEP + BRICK_WIDTH) * j, 
							BRICK_Y_OFFSET + (BRICK_SEP + BRICK_HEIGHT) * i, BRICK_WIDTH, BRICK_HEIGHT);
				brick.setFilled(true);
				switch(i) {
				case 0:
				case 1:
					brick.setFillColor(Color.RED);
					break;
				case 2:
				case 3:
					brick.setFillColor(Color.ORANGE);
					break;
				case 4:
				case 5:
					brick.setFillColor(Color.YELLOW);
					break;
				case 6:
				case 7:
					brick.setFillColor(Color.GREEN);
					break;
				case 8:
				case 9:
					brick.setFillColor(Color.CYAN);
					break;
				default: break;
				}
				add(brick);
			}
		}
	}
	
	private void addPaddle() {
		paddle = new GRect((WIDTH-PADDLE_WIDTH) / 2, HEIGHT - PADDLE_Y_OFFSET, PADDLE_WIDTH, PADDLE_HEIGHT);
		paddle.setFilled(true);
		add(paddle);
	}
	
	private void addBall() {
		ball = new GOval(WIDTH / 2 - BALL_RADIUS, HEIGHT / 2 - BALL_RADIUS, BALL_RADIUS * 2, BALL_RADIUS * 2);
		ball.setFilled(true);
		add(ball);
	}
	public void mouseMoved(MouseEvent e) {
		if(e.getX() >= 0 && e.getX() < (WIDTH - PADDLE_WIDTH)) {
			paddle.setLocation(e.getX(), HEIGHT - PADDLE_Y_OFFSET);
		} else if(e.getX() > WIDTH - PADDLE_WIDTH) {
			paddle.setLocation(WIDTH - PADDLE_WIDTH, HEIGHT - PADDLE_Y_OFFSET);
		}
  	}
	
	/* Game play methods */
	private void moveBall() {
		vx = rgen.nextDouble(1.0, 3.0);
		if(rgen.nextBoolean(0.5)) vx = -vx;
		vy = 3.0;
		
		while(true) {
			ball.move(vx, vy);
			pause(DELAY);
			checkWalls();
			GObject collider = getCollidingObject();
			if(collider == paddle) {
				 vy = -vy;
			} else if(collider != null){
				remove(collider);
				vy = - vy;
			}
		}
	}
	
	private void checkWalls() {
		if(ball.getX() <= 0) {
			vx = -vx;
		}
		else if((ball.getX() + 2*BALL_RADIUS) >= WIDTH) {
			vx = -vx;
		} else if(ball.getY() <= 0) {
			vy = -vy;
		} else if((ball.getY() + 2 * BALL_RADIUS) >= HEIGHT) {
			vy = -vy;
		}
	}
	
	private GObject getCollidingObject() {
		if(getElementAt(ball.getX(), ball.getY()) != null) {
			return getElementAt(ball.getX(), ball.getY()); 
		} else if(getElementAt(ball.getX() + (2 * BALL_RADIUS), ball.getY()) != null) {
			return getElementAt(ball.getX() + (2 * BALL_RADIUS), ball.getY());
		} else if(getElementAt(ball.getX(), ball.getY()  + (2 * BALL_RADIUS)) != null) {
			return getElementAt(ball.getX(), ball.getY()  + (2 * BALL_RADIUS));
		} else if(getElementAt(ball.getX() + (2 * BALL_RADIUS), ball.getY()  + (2 * BALL_RADIUS)) != null) {
			return getElementAt(ball.getX() + (2 * BALL_RADIUS), ball.getY()  + (2 * BALL_RADIUS));
		}	
		return null;
	}
}
