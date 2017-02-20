import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class DrawFlags extends GraphicsProgram{
	public void run() {
		drawNetherlandsFlag();
		pause(1000);
		
		drawIndonesianFlag();
		pause(1000);
		
		drawColumbianFlag();
	}
	
	/*
	 * Method: Draw Netherlands
	 * Draw a full screen Dutch Flag
	 */
	private void drawNetherlandsFlag() {
		drawHorizontalStrip(Color.RED, 0);
		drawHorizontalStrip(Color.WHITE, 0.33);
		drawHorizontalStrip(Color.BLUE, 0.66);
	}
	
	/*
	 * Method: Draw Indonesia
	 */
	private void drawIndonesianFlag() {
		drawHorizontalStrip(Color.RED, 0);
		drawHorizontalStrip(Color.WHITE, 0.5);
	}
	
	/*
	 * Method : Draw Columbia
	 */
	private void drawColumbianFlag() {
		drawHorizontalStrip(Color.YELLOW, 0);
		drawHorizontalStrip(Color.BLUE, 0.5);
		drawHorizontalStrip(Color.RED, 0.75);
	}
	
	/*
	 * Method: draw Horizontal Strip
	 */
	private void drawHorizontalStrip(Color color, double fractionDown) {
		double y = getHeight() * fractionDown;
		GRect rect = new GRect(getWidth(), getHeight() - y);
		rect.setFilled(true);
		rect.setFillColor(color);
		add(rect, 0, y);
	}
}
