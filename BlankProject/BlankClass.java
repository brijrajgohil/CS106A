/** Random programs for testing/practicing
 * Usually empty
 * */
import acm.program.*;
import acm.graphics.*;
import java.awt.*;
public class BlankClass extends ConsoleProgram{
	public void run() {
		println("ToLower = " + toLower('A'));
	}
	
	private char toLower(char ch) {
		if(ch >= 'A' || ch <= 'Z') {
			return (char) (ch - 'A' + 'a');
		}
		return ch;
	}
	
}