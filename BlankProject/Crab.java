import java.awt.Image;
import java.util.List;
import acm.graphics.*;
import acm.util.*;

public class Crab {
	private static final String IMG = "crab.png";
	private static final double MOVE_AMT = 0.5;
	protected GImage img = null;
	protected Double goalX = null;
	
	public Crab() {
		img = new GImage(IMG);
		RandomGenerator rg = RandomGenerator.getInstance();
		double startX = rg.nextDouble(0, Tank.SCREEN_WIDTH - img.getWidth());
		double startY = Tank.SCREEN_HEIGHT - img.getHeight();
		img.setLocation(startX, startY);
	}
	
	public void heartbeat() {
		if(goalX = null) {
			setGoal();
		}
		moveTowardsGoal();
	}
	
	public GImage getImage() {
		return img;
	}
	
	public double getX() {
		return img.getX() + img.getWidth() / 2;
	}
	
	public double getY() {
		return img.getY();
	}
	
	private void moveTowardsGoal() {
		double dx = goalX - getCrabX();
		if(Math.abs(dx) > MOVE_AMT) {
			if(dx < 0) {
				img.move(-MOVE_AMT, 0);
			} else {
				img.move(MOVE_AMT, 0);
			}
		} else {
			goalX = null;
		}
	}
	
	private double getCrabX() {
		return img.getX() + img.getWidth() / 2;
	}
	
	protected void setGoal() {
		double minX = img.getWidth()/2;
		double maxX = Tank.SCREEN_WIDTH - img.getWidth()/2;
		RandomGenerator rg = RandomGenerator.getInstance();
		goalX = rg.nextDouble(minX, maxX);
	}
}
