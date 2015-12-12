/*
 * File: PythagoreanTheorem.java
 * Name: Brijrajsinh Gohil
 * Section Leader: 
 * -----------------------------
 * This file is the starter file for the PythagoreanTheorem problem.
 */

import acm.program.*;

public class PythagoreanTheorem extends ConsoleProgram {
	public void run() {
		println("Enter the values to compute the Pythogoream theorem.");
		double a = readDouble("a:");
		double b = readDouble("b:");
		double c = Math.sqrt((a*a) + (b*b));
		println("c = " + c);
	}
}
