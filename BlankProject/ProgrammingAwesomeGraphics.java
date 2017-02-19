import acm.program.*;
import acm.graphics.*;
import java.awt.*;
public class ProgrammingAwesomeGraphics extends GraphicsProgram {
	public void run() {
		//half the height of the screen
		double centerY = getHeight() / 2;
		
		//make and add a blue square
		GRect blueSquare = new GRect(70, 70);
		blueSquare.setFilled(true);
		blueSquare.setFillColor(Color.BLUE);
		add(blueSquare);
		
		//make and add a black background rect
		GRect blackRect = new GRect(200, 180);
		blackRect.setFilled(true);
		blackRect.setFillColor(Color.BLACK);
		add(blackRect, 120, centerY);
		
		//make and add a red oval int the exact same spot as black rect
		//as above
		GOval redOval = new GOval(200, 180);
		redOval.setFilled(true);
		redOval.setFillColor(Color.RED);
		add(redOval, 120, centerY);
		
		//add a long yellow rectangle
		GRect nick = new GRect(60, 300);
		nick.setFilled(true);
		nick.setColor(Color.YELLOW);
		add(nick, 550, 10);
		
		//add a graphical rendering text
		GLabel label = new GLabel("Programming is Awesome!");
		label.setFont("Courier-52");
		add(label, 10, centerY);
		
		//add an underline for the text
		GLine line = new GLine(10, centerY, 10 + label.getWidth(), 10);
		add(line);
	}
}
