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

		
		// Without third variable
		int x = 100;
		int y = 200;
		 
	    // Code to swap 'x' and 'y'
		    x = x + y;    //x = 100 + 200 = 300
		    y = x - y;    //y = 300 - 200 = 100
		    x = x - y;    //x = 300 - 100 = 200
	    
		System.out.println("After swapping y value is :  " + y);
		System.out.println("After swapping x value is :  " + x);
	    
	}

}
