import acm.program.*;
public class Fibonacci extends ConsoleProgram{
	private static final int MAX_TERM_VALUE = 10000;
	public void run() {
		println("This program lists fibonacci sequence");
		int t1 = 0;
		int t2 = 1;
		while(t1 < MAX_TERM_VALUE) {
			println(t1);
			int t3 = t1 + t2;
			t1 = t2;
			t2 = t3;
		}
	}
}
