package globaltek.usa.javapractice;

public class LoopingCondition {

	// What is loop in java?
	// Ans: Loop means we are counting the values and store in to the loop new
	// variable
	// How many types of loop are there in java?
	// There are many loop
	// Examples: 1, Basic loop, 2, advance loop, 3, while loop, 4, do while loop and
	// etc..,

	// How do you declare the basic loop?

	public static void getBasicloop() {
		int num = 101;
		// First i have to initialize one variable to stating point,
		// which one is start the counting values
		// i starting count from 0 till ending the numbers
		// i ++ means increments the values
		for (int i = 0; i < num; i++) {
			System.out.println(i);
		}
	}

	public static void getDecrementValues() {
		// First i have to initialize one variable to stating point,
		// which one is start the counting values
		// i starting count from 0 till ending the numbers
		// i ++ means increments the values
		for (int i = 100; i > 0; i--) {
			System.out.println(i);
		}
	}

	public static void getAdvanceForLoop() {
		// AdvanceForLoop or Enhance loop

		int num[] = { 100, 12, 12, 65 };
		// First i have to initialize one variable to stating point,
		// which one is start the counting values
		// i starting count from 0 till ending the numbers
		// i ++ means increments the values
		for (int newValue : num) {
			System.out.println(newValue);
		}
	}

	public static void getWhileLoop() {
		int num = 0;

		while (true) {
			System.out.println(num);
			num++;
		}
	}

	// What is break statements

	public static void getBreakstatements() {
		
		for (int i = 0; i < 100; i++) {
			if (i == 5) {
				break;
			}
            System.out.println(i);
		}
	}
		public static void getContinueStatements() {
			
			for (int i = 0; i < 100; i++) {
				if (i == 10) {  // 
					continue;
				}
	            System.out.println(i);
			}	
		

	}

	public static void main(String[] args) {
		// getDecrementValues();
		// getBasicloop();
		//getWhileLoop();
		//getBreakstatements();
		 getContinueStatements();
	}
}
