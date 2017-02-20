import acm.program.*;
import acm.graphics.*;
import java.awt.event.MouseEvent;
import java.awt.Color;
public class MouseTrackerSquare extends GraphicsProgram {
	
	private static final int SQUARE_SIZE = 40;
	private static final Color SQUARE_COLOR = Color.BLUE;
	GRect square = null;
	
	public void run() {
		square = makeSquare();
		addSquareToCenter(square);
		addMouseListeners();
	}
	
	public void mouseMoved(MouseEvent e) {
		int x = e.getX() - SQUARE_SIZE / 2;
		int y = e.getY() - SQUARE_SIZE / 2;
		square.setLocation(x, y);
	}
	
	private void addSquareToCenter(GRect square) {
		int x = (getWidth() - SQUARE_SIZE) / 2;
		int y = (getHeight() - SQUARE_SIZE) / 2;
		add(square, x, y);
	}
	
	private GRect makeSquare() {
		GRect square = new GRect(SQUARE_SIZE, SQUARE_SIZE);
		square.setFilled(true);
		square.setFillColor(SQUARE_COLOR);
		return square;
	}
}
