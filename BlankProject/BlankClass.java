/*
 * File: BlankClass.java
 * ---------------------
 * This class is a blank one that you can change at will. Remember, if you change
 * the class name, you'll need to change the filename so that it matches.
 * Then you can extend GraphicsProgram, ConsoleProgram, or DialogProgram as you like.
 */

import acm.program.*;
import acm.graphics.*;

public class BlankClass extends ConsoleProgram {
	public void run() {
		for(int i=1; i<=10; i++) {
			println("This old man, he played " + i);
			switch(i) {
			case 1:
				println("He played knick-knack on my thumb.");
				break;
			case 2:
				println("He played knick-knack on my shoe.");
				break;
			case 3:
				println("He played knick-knack on my knee.");
				break;
			case 4:
				println("He played knick-knack on my door.");
				break;
			case 5:
				println("He played knick-knack on my hive.");
				break;
			case 6:
				println("He played knick-knack on my sticks.");
				break;
			case 7:
				println("He played knick-knack on my up to the heaven.");
				break;
			case 8:
				println("He played knick-knack on my pate.");
				break;
			case 9:
				println("He played knick-knack on my spin.");
				break;
			case 10:
				println("He played knick-knack on my shin.");
				break;
			}
			println("With a knick-knack, paddy-whack,");
			println("Give your dog a bone.");
			println("This old man came rolling home.");
		}
	}
}

