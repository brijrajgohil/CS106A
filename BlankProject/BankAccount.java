import java.util.*;

public class BankAccount {
	private double money;
	private String name;
	private String password;
	
	public BankAccount(String name, double start) {
		this.name = name;
		this.money = start;
		this.password = "";
	}
	
	public boolean withdraw(double amount) {
		if(this.money >= amount) {
			this.money -= amount;
			return true;
		}
		return false;
	}
	
	public void deposit(double amount) {
		this.money += money;
	}
	
	public double checkBalance() {
		return this.money;
	}
	
	public boolean transfet(BankAccount other, double amount) {
		if(this.money >= amount) {
			this.money -= amount;
			other.money += amount;
			return true;
		}
		return false;
	}
	
	public String toString() {
		String str = "";
		String dollarFormat = String.format("%10.3f", this.money).trim();
		str = this.name + ": $" + dollarFormat;
		return str;
	}
	
	public boolean checkPassword(String password) {
		return this.password.equals(password);
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
}
