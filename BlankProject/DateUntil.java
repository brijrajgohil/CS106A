import java.util.ArrayList;
import acm.graphics.*;
import acm.program.*;

public class DateUntil extends ConsoleProgram {
	public void run() {
		Date today = new Date(2017, 3, 1);
		Date summer = new Date(2017, 6, 14);
		print(today.daysUntil(summer));
	}
	
	public void init() {
		setFont("Courier-24");
	}
}
