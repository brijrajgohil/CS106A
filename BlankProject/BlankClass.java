/** Random programs for testing/practicing
 * Usually empty
 * */
import acm.program.*;
import acm.graphics.*;
import java.awt.*;
public class BlankClass extends GraphicsProgram {
	
	public void run() {
		GRect r = new GRect((getWidth() - 100) / 2, (getHeight() - 100 )/ 2, 100, 100);
		r.setFilled(true);
		r.setFillColor(Color.RED);
		add(r);
		while((r.getX() < getWidth() - 100) && (r.getY() > 0)) {
			pause(30);
			r.setLocation(getWidth() - 100, 0);
		}
	}
}