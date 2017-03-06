import acm.program.*;
import acm.graphics.*;
import java.awt.*;
import java.io.*;

public class SeeTheUS extends GraphicsProgram{
	private static final String CITIES_FILE = "us-cities.txt";
	
	public void run() {
		try {
			int done = 0;
			BufferedReader rd = new BufferedReader(new FileReader(CITIES_FILE));
			while(true) {
				String cityName = rd.readLine();
				String latStr = rd.readLine();
				String longStr = rd.readLine();
				if(longStr == null) break;
				double latitude = Double.parseDouble(latStr);
				double longitude = Double.parseDouble(longStr);
				plotOneCity(latitude, longitude);
				done++;
				if(done % 10 == 0) pause(1);
			}
			rd.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	private void plotOneCity(double latitude, double longitude) {
		double x = longitudeToXCoordinate(longitude);
		double y = latitudeToYCoordinate(latitude);
		plotPixel(x, y);
	}
	private void plotPixel(double x , double y) {
		GRect pixel = new GRect(x, y, 1, 1);
		pixel.setFilled(true);
		pixel.setColor(Color.BLUE);
		add(pixel);
	}
	
	private double longitudeToXCoordinate(double longitude) {
		return getWidth() - (longitude - MIN_LONGITUDE) / (MAX_LONGITUDE - MIN_LATITUDE);
	}
	
	private double latitudeToYCoordinate(double latitude) {
		return getHeight() * (1.0 - (latitude - MIN_LATITUDE) / (MAX_LATITUDE - MIN_LATITUDE)); 
	}
	
	private static final double MIN_LONGITUDE = -130;
	private static final double MAX_LONGITUDE = -60;

	private static final double MIN_LATITUDE = +22;
	private static final double MAX_LATITUDE = +55;
}
