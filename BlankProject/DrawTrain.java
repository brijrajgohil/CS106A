import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class DrawTrain extends GraphicsProgram {
	public void run() {
		double trainWidth = 3 * CAR_WIDTH + 4 * CONNECTOR;
		double x = (getWidth() - trainWidth) / 2;
		double y = getHeight();
		double dx = CAR_WIDTH + CONNECTOR;
		drawEngine(x, y);
		drawBoxCar(x + dx, y, Color.GREEN);
		drawCaboose(x + 2 * dx, y);
	}
	
	private void drawCarFrame(double x, double y, Color color) {
		double x0 = x + CONNECTOR;
		double y0 = y - CAR_BASELINE;
		double top = y0 - CAR_HEIGHT;
		add(new GLine(x, y0, x + CAR_WIDTH + 2 * CONNECTOR, y0));
		drawWheel(x0 - WHEEL_INSET, y - WHEEL_RADIUS);
		drawWheel(x0 + CAR_WIDTH - WHEEL_INSET, y - WHEEL_RADIUS);
		GRect r = new GRect(x0, top, CAR_WIDTH, CAR_HEIGHT);
		r.setFilled(true);
		r.setFillColor(color);
		add(r);
	}
	
	private void drawWheel(double x, double y) {
		double r = WHEEL_RADIUS;
		GOval wheel = new GOval(x - r, y - r, 2 * r, 2 *r);
		wheel.setFilled(true);
		wheel.setColor(Color.GRAY);
		add(wheel);
	}
	
	private void drawBoxCar(double x, double y, Color color) {
		drawCarFrame(x, y, color);
		double xRight = x + CONNECTOR + CAR_WIDTH / 2;
		double xLeft = xRight - DOOR_WIDTH;
		double yDoor = y - CAR_BASELINE - DOOR_HEIGHT;
		add(new GRect(xLeft, yDoor, DOOR_WIDTH, DOOR_HEIGHT));
		add(new GRect(xRight, yDoor, DOOR_WIDTH, DOOR_HEIGHT));
	}
	
	private void drawEngine(double x, double y) {
		
	}
	
	private static final double CAR_WIDTH = 75;
	private static final double CAR_HEIGHT = 36;
	
	private static final double CAR_BASELINE = 10;
	
	private static final double CONNECTOR = 6; 
	
	private static final double WHEEL_RADIUS = 8;
	
	private static final double WHEEL_INSET = 16;
		
	private static final double CAB_WIDTH = 35;
	private static final double CAB_HEIGHT = 8;
	
	private static final double SMOKESTACK_WIDTH = 8;
	private static final double SMOKESTACK_HEIGHT = 8;
	private static final double SMOKESTACK_INSET = 8;
	
	private static final double DOOR_WIDTH = 18;
	private static final double DOOR_HEIGHT = 32;
	
	private static final double CUPOLA_WIDTH = 35;
	private static final double CUPOLA_HEIGHT = 8;
}
