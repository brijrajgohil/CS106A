import acm.program.*;
import acm.graphics.*;
import acm.util.*;
import java.awt.*;
import java.io.*;
import java.applet.*;
import java.util.*;

public class ArrayLists_OpenCrawliSoln extends GraphicsProgram{
	/* Make the window large so that we can see more detail. */
	public static final int APPLICATION_WIDTH = 800;
	public static final int APPLICATION_HEIGHT = 1200;
	
	private static final double LABEL_PADDING = 15;
	
	private static final String CRAWL_TEXT_FILENAME = "opening-crawl.txt";
	private static final String CRAWL_MUSIC_FILENAME = "music.au";
	
	private static final double PAUSE_TIME = 20;
	
	public void run() {
		//Play background muscic
		AudioClip music = MediaTools.loadAudioClip(CRAWL_MUSIC_FILENAME);
		music.play();
		
		//Add out background image
		GImage bg = new GImage("background.jpg");
		bg.setSize(getWidth(), getHeight());
		add(bg, 0, 0);
		
		//Create GLabels from the text file
		ArrayList<GLabel> labelsList = readOpeningCrawlFile(CRAWL_TEXT_FILENAME);
		
		double y = getHeight();
		
		for(int i = 0; i < labelsList.size(); i++) {
			GLabel currentLabel = labelsList.get(i);
			
			double x = getWidth() / 2.0 - currentLabel.getWidth() / 2.0;
			add(labelsList.get(i), x, y);
			
			y += currentLabel.getAscent() + LABEL_PADDING;
		}
		
		while(true) {
			for(int i = 0; i < labelsList.size(); i++) {
				labelsList.get(i).move(0, -1);
			}
			pause(PAUSE_TIME);
		}
	}
	
	private ArrayList<GLabel> readOpeningCrawlFile(String crawlFilename) {
		try {
			BufferedReader rd = new BufferedReader(new FileReader(crawlFilename));
			
			ArrayList<GLabel> labelsList = new ArrayList<GLabel>();
			String line = rd.readLine();
		    while(line != null) {
		    	//Make a GLabel
		    	GLabel label = new GLabel(line);
		    	label.setFont("Courier New-bold-32");
		    	label.setColor(Color.WHITE);
		    	labelsList.add(label);
		    	
		    	line = rd.readLine();
		    }
		    rd.close();
		    return labelsList;
		} catch(IOException e) {
			throw new RuntimeException(e);
		}
	    
	   
	}
}
