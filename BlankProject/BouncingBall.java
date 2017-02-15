import acm.program.*;
import acm.graphics.*;

public class BouncingBall extends GraphicsProgram{
	
	//Size of the diameter of the ball
	private static final int DIAM_BALL = 30;
	
	/* Amount Y velocity is increased each cycle as a
	 *  a result of gravity */
	private static final double GRAVITY = 3;
	
	/* Animation delay in time between ball moves */
	private static final int DELAY = 50;
	
	/* Initial X and Y location of the ball */
	private static final double X_START = DIAM_BALL / 2;
	private static final double Y_START = 100;
	
	/* X Velocity */
	private static final double X_VEL = 5;
	
	/* Amount of y velocity reduced when it bounces */
	private static final double BOUNCE_REDUCE = 0.9;
	
	/* Starting velocities */
	private double xVel = X_VEL;
	private double yVel = 0.0;
	
	/* private instance variable */
	private GOval ball;
	
	public void run() {
		setUp();
		waitForClick();
		
		//Simulation ends when the ball exceeds the width of the screen
		while(ball.getX() < getWidth()) {
			moveBall();
			checkForCollision();
			pause(DELAY);
		}
	}
	
	/* Create and place the ball */
	private void setUp() {
		ball = new GOval(X_START, Y_START, DIAM_BALL, DIAM_BALL);
		ball.setFilled(true);
		add(ball);
	}
	
	/* Update and move ball */
	private void moveBall() {
		yVel += GRAVITY;
		ball.move(xVel, yVel);
	}
	
	/* Determine if collision with floor, update velocites, location */
	private void checkForCollision() {
		if(ball.getY() > getHeight() - DIAM_BALL) {
			yVel = -yVel * BOUNCE_REDUCE;
			double diff = ball.getY() - (getHeight() - DIAM_BALL);
			ball.move(0,  -2 * diff);
		}
	}	
}


