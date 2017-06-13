import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

import javax.swing.*;

import com.sun.prism.paint.Color;

import acm.program.*;
import acm.graphics.*;
import acm.util.*;

public class XKCDColors extends GraphicsProgram {
	private static final int NUM_COLUMNS = 16;
	private static final String COLORS_FILE = "xkcd-colors.txt";
	private JTextField colorInput = new JTextField(NUM_COLUMNS);
	private HashMap<String, ArrayList<Color>> colorMap;
	
	public void init() {
		colorMap = loadXKCDColors();
		
		colorInput.addActionListener(this);
		colorInput.setActionCommand("Graph");
		add(colorInput, SOUTH);
		
		JButton graphButton = new JButton("Graph");
		add(graphButton, SOUTH);
		
		JButton clearButton = new JButton("Clear");
		add(clearButton, SOUTH);
		
		addActionListeners();
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Clear")) {
			clear();
		} else if(e.getActionCommand().equals("Graph")) {
			String colorName = colorInput.getText().toLowerCase();
			if(colorMap.containsKey(colorName)) {
				ArrayList<Color> allOfColor = colorMap.get(colorName);
				for(Color c: allColor) {
					plotColor(c);
				}
			}
		}
	}
	
	public void run() {
		clear();
	}
	
	private void clear() {
		removeAll();
		addCircle();
	}
	
	private HashMap<String, ArrayList<Color>> loadXKCDColors() {
		try {
			BufferedReader br = new BufferedReader(new FileReader(COLORS_FILE));
			
			HashMap<String, ArrayList<Color>> result = new HashMap<String, ArrayList<Color>>();
			
			while(true) {
				String colorName = br.readLine();
				String r = br.readLine();
				String g = br.readLine();
				String b = br.readLine();
				
				if(b == null) break;
				
				Color color = new Color(Integer.parseInt(r), Integer.parseInt(g), Integer.parseInt(b));
				if(!result.containsKey(colorName)) {
					result.put(colorName, new ArrayList<Color>());
				}
				result.get(colorName).add(color);
			}
			br.close();
			return result;
		} catch(IOException e) {
			throw new ErrorException(e);
		}
	}
	
	private static final double RADIUS_MODIFIER = 0.95;
	
	private void plotColor(Color color) {
		float[] components = Color.RGBtoHSB(color.getRed(), color.getGreen(), color.getBlue(), null);
		
		double radius = getRadius() * components[1];
		double theta = components[0] * Math.PI * 2.0;
		
		double x = getWidth() / 2.0 + radius * Math.cos(theta);
		double y = getHeight() / 2.0 - radius * Math.sin(theta);
		
		GRect pt = new GRect(x, y, 1, 1);
		pt.setFilled(true);
		pt.setColor(color);
		add(pt);
	}
	
	private double getRadius() {
		return Math.min(getWidth(), getHeight()) / 2.0 * RADIUS_MODIFIER;
	}
	
	private void addCircle() {
		double r = getRadius();
		add(new GOval(getWidth() / 2.0 - r, getHeight() / 2.0 - r, 2 * r, 2 * r));
	}
	
	private HashMap<String, ArrayList<int[]>> loadColorsFile() {
		try {
			BufferedReader br = new BufferedReader(new FileReader(COLORS_FILE));
			
			HashMap<String, ArrayList<int[]>> result = new HashMap<String, ArrayList<int[]>>();
			
			while(true) {
				String colorName = br.readLine();
				String r = br.readLine();
				String g = br.readLine();
				String b = br.readLine();
				
				if(b == null) break;
				int[] color = new int[3];
				color[0] = Integer.parseInt(r);
				color[1] = Integer.parseInt(g);
				color[2] = Integer.parseInt(b);
				
				if(!result.containsKey(colorName)) {
					result.put(colorName, new ArrayList<int[]>());
				}
				
				result.get(colorName).add(color);
			}
			br.close();
			return result;
		} catch(IOException e) {
			throw new ErrorException(e);
		}
	}
}
