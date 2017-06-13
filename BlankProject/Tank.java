import java.util.ArrayList;
import acm.graphics.*;
import acm.program.*;
import acm.util.RandomGenerator;

public class Tank extends GCanvas {
	private static final int N_FISHES = 7;
	private static final int N_CRABS = 2;
	public static final int SCREEN_WIDTH = 800;
	public static final int SCREEN_HEIGHT = 600;
	private static final double FOOD_CHANCE = 0.02;
	
	private ArrayList<Fish> fishes = new ArrayList<Fish>();
	private ArrayList<Food> foods = new ArrayList<Food>();
	private ArrayList<Crab> crabs = new ArrayList<Crab>();
	
	public void init() {
		addBackground();
		addSeaLife();
	}
	
	private void addBackground() {
		GImage img = new GImage("background.jpg");
		img.setSize(getWidth(), getHeight());
		add(img);
	}
	
	private void addSeaLife() {
		for(int i = 0; i < N_FISHES; i++) {
			Fish fish = new Fish();
			add(fish.getImage());
			fishes.add(fish);
		}
		
		for(int i = 0; i < N_CRABS; i++) {
			Crab crab = new Crab();
			add(crab.getImage());
			crabs.add(crab);
		}
	}
 }
