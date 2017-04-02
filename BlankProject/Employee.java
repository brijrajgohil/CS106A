import acm.program.*;

public class Employee {
	public Employee(String newName, int newId) {
		name = newName;
		id = newId;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public boolean isActive() {
		return active;
	}
	
	public boolean setActive(boolean active) {
		this.active = active;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	
	public int getTaxId() {
		return id;
	}
	
	private String name;
	private int id;
	private String title;
	private boolean active;
	private int salary;
}








