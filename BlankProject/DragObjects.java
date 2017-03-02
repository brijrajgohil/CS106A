import acm.program.*;
import acm.graphics.*;

import java.awt.*;
import java.awt.event.MouseEvent;
public class DragObjects extends GraphicsProgram {
	public void init() {
		GRect rect = new GRect(100, 100, 150, 100);
		rect.setFilled(true);
		rect.setColor(Color.RED);
		add(rect);
		GOval oval = new GOval(300, 115, 100, 70);
		oval.setFilled(true);
		oval.setColor(Color.BLUE);
		add(oval);
		addMouseListeners();
	}
	
	public void mousePressed(MouseEvent e) {
		last = new GPoint(e.getPoint());
		gobj = getElementAt(last); 
	}
	
	public void mouseDragged(MouseEvent e) {
		if(gobj != null) {
			gobj.move(e.getX() - last.getX(), e.getY() - last.getY());
			last = new GPoint(e.getPoint());
		}
	}
	
	public void mouseClicked(MouseEvent e) {
		if(gobj != null) gobj.sendToFront();
	}
	
	private GObject gobj;
	private GPoint last;
	
	
	
}
