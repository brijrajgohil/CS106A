import acm.program.*;
import acm.graphics.*;
public class Checkerboard extends GraphicsProgram {
	public static final int NROWS = 8;
	public static final int NCOLS = 8;
	
	public void run() {
		int sqSize = getHeight() / NROWS;
		for(int i = 0; i < NROWS; i++) {
			for(int j = 0; j < NCOLS; j++) {
				int x = j * sqSize;
				int y = i * sqSize;
				GRect sq = new GRect(x, y, sqSize, sqSize);
				sq.setFilled(((i + j) % 2) != 0);
				add(sq);
			}
		}
	}
}
