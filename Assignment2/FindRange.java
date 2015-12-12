/*
 * File: FindRange.java
 * Name: Brijrajsinh Gohil
 * Section Leader: 
 * --------------------
 * This file is the starter file for the FindRange problem.
 */

import acm.program.*;

public class FindRange extends ConsoleProgram {
	private static final int SENTINAL = 0;
	public void run() {
		int n = readInt("?");
		int largest = n;
		int smallest = n;
		while(n != SENTINAL) {
			n = readInt("?");
			if(n > largest) {
				largest = n;
			}
			else if(n < smallest) {
				smallest = n;
			}
		}
		println("smallest: " + smallest);
		println("largest: " + largest);
	}
}

