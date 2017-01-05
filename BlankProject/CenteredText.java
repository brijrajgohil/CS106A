import acm.program.*;
import acm.graphics.*;

public class CenteredText extends GraphicsProgram {
	public void run() {
		GLabel label = new GLabel("CS106A rocks my socks");
		label.setFont("SanSerif-28");
		double x = (getWidth() - label.getWidth()) / 2;
		double y = (getHeight() - label.getAscent()) / 2;
		label.setLocation(x, y);
		add(label);
	}
}
