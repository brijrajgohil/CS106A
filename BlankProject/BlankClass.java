/** Random programs for testing/practicing
 * Usually empty
 * */
import acm.program.*;
import java.util.*;

public class BlankClass extends ConsoleProgram {
	
	public void run() {
		setFont("Courier New-bold-24");
		ArrayList<Integer> intList = new ArrayList<Integer>();
		readList(intList);
		printArrayList(intList);
		readList(intList);
		printArrayList(intList);
	}
	
	private void readList(ArrayList list) {
		while(true) {
			int value = readInt("Next number: ");
			if(value == -1) break;
			list.add(value);
		}
	}
	
	private void printArrayList(ArrayList list) {
		println("List contains " + list.size() + " elements.");
		for(int i = 0; i < list.size(); i++) {
			println(list.get(i));
		}
	}
	
}