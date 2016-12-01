import acm.program.*;

public class Stanford extends ConsoleProgram {
	private static final int CS106A_UNITS = 5;
	
	public void run() {
		setFont("Times New Roman-28");
		
		Student mehran = new Student("Mehran Sahami", 3800);
		
		mehran.setUinits(3);
		printUnits(mehran);
		
		Student nick = new Student("Nick Troccoli", 5700);
		nick.setUinits(179);
		printUnits(nick);
		
		println("Called tryToAddUnits to add to Nick's units..");
		
		tryToAddUnits(nick.getUnits(), CS106A_UNITS);
		
		takesCS106A(mehran);
		takesCS106A(nick);
		
		printUnits(mehran);
		printUnits(nick);
	}
	
	private void printUnits(Student s) {
		println(s.getName() + " has " + s.getUnits() + " units");
		println(s.toString() + " can graduate: " + s.hasEnoughUnits());
	}
	
	private void tryToAddUnits(double numUnits, double numUnitsToAdd) {
		numUnits += numUnitsToAdd;
	}
	
	private void takesCS106A(Student s) {
		println(s.getName() + " takes CS106A!!");
		s.incrementUnits(CS106A_UNITS);
	}
}
