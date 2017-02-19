import acm.program.*;

public class PerfectNumbers extends ConsoleProgram {
	
	//Min value to check
	private static final int MIN_NUM = 1;
	
	//Max value to check
	private static final int MAX_NUM = 10000;
	
	public void run() {
		//used to set fonts
		setFont("Courier-24");
		for(int i = MIN_NUM; i <= MAX_NUM; i++) {
			if(isPerfect(i)) {
				println(i);
			}
		}
		println("Done");
	}
	/*
	 * Return true if the number is perfect 
	 */
	private boolean isPerfect(int num) {
		int sumDivisors = 0;
		for(int i = 0; i < num; i++) {
			if(isDivisible(num, i)) {
				sumDivisors += i;
			}
		}
		return sumDivisors == num;
	}
	
	/*
	 * Returns true if first parameter is divisible by second
	 */
	private boolean isDivisible(int a, int b) {
		if(b == 0) {
			return false;
		}
		return a % b == 0;
	}
	
}
