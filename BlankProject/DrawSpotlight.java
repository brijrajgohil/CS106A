import java.awt.Color;

import acm.program.*;
import acm.graphics.*;

public class DrawSpotlight extends GraphicsProgram{
	public void run() {
		double cx = getWidth() / 2;
		double cy = getHeight() / 2;
		double fx = cx - FRAME_WIDTH / 2;
		double fy = cy - FRAME_HEIGHT / 2;
		double dy = FRAME_HEIGHT / 4 + LAMP_RADIUS / 2;
		GRect frame = new GRect(fx, fy, FRAME_WIDTH, FRAME_HEIGHT);
		frame.setFilled(true);
		frame.setColor(Color.GRAY);
		add(frame);
		add(createFilledCircle(cx, cy - dy, LAMP_RADIUS, Color.YELLOW));
		add(createFilledCircle(cx, cy, LAMP_RADIUS, Color.RED));
		add(createFilledCircle(cx, cy + dy, LAMP_RADIUS, Color.GREEN));
	}
	
	private GOval createFilledCircle(double x, double y, double r, Color color) {
		GOval circle = new GOval(x - r, y - r, 2 * r, 2 * r);
		circle.setFilled(true);
		circle.setColor(color);
		return circle;
	}
	
	private static final double FRAME_WIDTH = 50;
	private static final double FRAME_HEIGHT = 100;
	private static final double LAMP_RADIUS = 10;
}
