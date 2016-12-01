
public class Student {

	public static final double UNITS_TO_GRADUATE = 180.0;
	
	public Student(String studentName, int studentID) {
		name = studentName;
		ID =  studentID;
	}
	
	public String getName() {
		return name;
	}

	public int getID() {
		return ID;
	}
	
	public void setUinits(double units) {
		unitsEarned = units;
	}
	
	public double getUnits() {
		return unitsEarned;
	}
	
	public void incrementUnits(double additionalUnits) {
		unitsEarned += additionalUnits;
	}
	
	public boolean hasEnoughUnits() {
		return (unitsEarned >= UNITS_TO_GRADUATE);
	}
	
	public String toString() {
		return name + " (#" + ID + ")";
	}
	
	private String name;
	private int ID;
	private double unitsEarned;
}
