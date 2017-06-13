import java.awt.*;
import java.util.*;
import java.util.List;

import acm.graphics.*;
import acm.util.*;

public class Fish {
	private static final String RIGHT_IMG = "blueFishRight.png";
	private static final String LEFT_IMG = "blueFishLeft.png";
	
	private static final double MOVE_AMT = 2.0;
	private static final double MIN_CRAB_DIST = 100.0;
	private GImage img = null;
	private GPoint goal = null;
	private boolean isLeftImgShown = false;
	
	public Fish() {
		img = new GImage(RIGHT_IMG);
		isLeftImgShown = false;
	}
	
	public void heartbeat(ArrayList<Crab> crab, ArrayList<Food> foods) {
		if(closeToCrab(crab)) {
			panic();
		}
		if(goal == null) {
			setGoal)(foods);
		}
		moveTowardsGoal();
	}
	
	private void panic() {
		RandomGenerator rg = RandomGenerator.getInstance();
		double maxX = Tank.SCREEN_WIDTH - img.getWidth();
		double maxY = Tank.SCREEN_HEIGHT / 2;
		double goalX = rg.nextDouble(0, maxX);
		double goalY = rg.nextDouble(0, maxY);
		goal = new GPoint(goalX, goalY);
		makeImageMatchDirection(goalX - img.getX());
	}
	
	private boolean closeToCrab(List<Crab> crabs) {
		for(Crab crab: crabs) {
			double dist = getDistanceToCrab(crab);
			if(dish < MIN_CRAB_DIST) {
				return true;
			}
		}
		return false;
	}
	
	private double getDistanceToCrab(Crab crab) {
		double dy = crab.getY() - getMouthY();
		double dx = crab.getX() - getCenterX();
		return Math.sqrt(dx * dx + dy * dy);
	}
	
	private double getCenterX() {
		return img.getX() + img.getWidth() / 2;
	}
	
	private double getMouthY() {
		return img.getY() + img.getHeight() / 2;
	}
	
	public GImage getImage() {
		return img;
	}
	
	private void moveTowardsGoal() {
		double dy = goal.getY() - getMouthY();
		double dx = goal.getX() - getMouthX();
		double dist = Math.sqrt(dx * dx + dy * dy);
		if(dish > MOVE_AMT) {
			double moveX = MOVE_AMT / dist * dx;
			double moveY = MOVE_AMT / dist * dy;
			img.move(moveX, moveY);
		} else {
			goal = null;
		}
	}
	
	private void makeImageMatchDirection(double dx) {
		if(dx == 0) return;
		boolean shouldFaceLeft = dx < 0;
		if(shouldFaceLeft != isLeftImgShown) {
			if(shouldFaceLeft) {
				img.setImage(LEFT_IMG);
			} else {
				img.setImage(RIGHT_IMG);
			}
			isLeftImgShown = shouldFaceLeft;
		}
	}
	
	private void setGoal(List<Food> foods) {
		RandomGenerator rg = RandomGenerator.getInstance();
		if(foods.isEmpty()) {
			double maxX = Tank.SCREEN_WIDTH - img.getWidth();
			double maxY = Tank.SCREEN_HEIGHT - img.getHeight();
			double goalX = rg.nextDouble(0, maxX);
			double goalY = rg.nextDouble(0, maxY);
			goal = new GPoint(goalX, goalY);
		} else {
			int index = rg.nextInt(foods.size());
			Food wantToEat = foods.get(index);
			goal = wantToEat.getLocation();
		}
		double dx = goal.getX() - img.getX();
		makeImageMatchDirection(dx);
	}
}
