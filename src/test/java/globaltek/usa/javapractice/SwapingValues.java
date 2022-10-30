package globaltek.usa.javapractice;

public class SwapingValues {

	// How to swap the number
	public static void main(String[] args) {
		int a = 10; // after swapping a value should be 20
		int b = 20; // after swapping b value should be 10
		int result;  // Result is third variable 
		// result value is 30
		result = a + b;
		// A value
		a = result - a;
		System.out.println("After swapping a value is :  " + a);
		b = result - b;
		System.out.println("After swapping b value is :  " + b);

		
		
		int x = 10;
		int y = 5;
		 
	    // Code to swap 'x' and 'y'
	    x = x * y; // x now becomes 50
	    y = x / y; // y becomes 10
	    x = x / y; // x becomes 5
	    
		System.out.println("After swapping y value is :  " + y);
		System.out.println("After swapping x value is :  " + x);
	    
	}

}
