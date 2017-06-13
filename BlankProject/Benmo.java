import acm.graphics.GCanvas;
import acm.graphics.GOval;
import acm.program.*;
import java.util.*;

public class Benmo extends ConsoleProgram {
	HashMap<String, BankAccount> users = new HashMap<String, BankAccount>();
	public void run() {
		println("Welcome to Benmo!");
		println("-----------------");
		loadBankAccounts();
		BankAccount yourAccount = logIn();
		
		while(true) {
			String cmd = readLine("Command (send, deposit, showAll): ");
			
			if(cmd.equals("deposit")) {
				double amount = readDouble("amount: ");
				yourAccount.deposit(amount);
			}
			
			if(cmd.equals("showAll")) {
				for(String name: users.keySet()) {
					BankAccount account = users.get(name);
					println(account.toString());
				}
			}
			
			if(cmd.equals("send")) {
				String otherName = readLine("recipient: ");
				BankAccount other = users.get(otherName);
				double amount = readDouble("amount: ");
				if(yourAccount.transfet(other, amount)) {
					println("success");
				} else {
					println("fail!");
				}
			}
			println("");
		}
		
	}
	
	private BankAccount logIn() {
		println("log in");
		while(true) {
			String userName = readLine("username: ");
			if(users.containsKey(userName)) {
				String password = readLine("password: ");
				BankAccount yourAccount = users.get(userName);
				if(yourAccount.checkPassword(password)) {
					println("welcome " + userName);
					println("");
					return yourAccount;
				} else {
					println("Incorrect username!");
				}
			} else {
				println("Incorrect username!");
			}
 		}
	}
	
	private void loadBankAccounts() {
		BankAccount mehran = new BankAccount("mehran", 500);
		BankAccount chris = new BankAccount("chris", 100);
		BankAccount julie = new BankAccount("julie", 1000);
		chris.setPassword("bananas");
		mehran.setPassword("claire");
		julie.setPassword("password");
		users.put("chris", chris);
		users.put("julie", julie);
		users.put("mehran", mehran);
	}
	
	public void init() {
		setFont("courier-24");
	}
}
