/*
 * File: BlankClass.java
 * ---------------------
 * This class is a blank one that you can change at will. Remember, if you change
 * the class name, you'll need to change the filename so that it matches.
 * Then you can extend GraphicsProgram, ConsoleProgram, or DialogProgram as you like.
 */

import acm.program.*;
import acm.util.*;

public class BlankClass extends ConsoleProgram {
	public void run() {
	int cardNumber = rgen.nextInt(1, 52);
	String suit = giveSuit(cardNumber);
	String rank = giveRank(cardNumber);
	println(rank + " of " + suit);
	}
	
	private String giveSuit(int cardNumber) {
		if(cardNumber <= 13) return "Clubs";
		else if(cardNumber >= 14 && cardNumber <= 26) return "Diamonds";
		else if(cardNumber >= 27 && cardNumber <= 39) return "Hearts";
		else return "Spades";
	}
	
	private String giveRank(int cardNumber) {
			if(cardNumber == 1) return "Ace";
			else if(cardNumber >= 2 && cardNumber <= 10) return (""+ cardNumber);
			else if(cardNumber == 11) return "Jack";
			else if(cardNumber == 12) return "Queen";
			else return "King";
	}
	
	private RandomGenerator rgen = new RandomGenerator();
}

