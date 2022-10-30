package globaltek.usa.javapractice;

public class If_Else_Condition {
    // How to verify expected result from your Codes / Web elements  
	// Ans: With the help of conditional statement to verify the expected result 
	
	// What is the difference between && ||?	
	// Rafat & Afsan getting job (is needed)
	// Rafat or Afsana getting job first (Maybe)
	
	public static void main(String[] args) {
		int num = 0;
				
		if (num > 9) {  // first check first condition 
			System.out.println("Num is gretar then 9 : = " + num);
		}
		else if (num < 9) { // If first condition is no satisfy  then come to 2nd condition 
			System.out.println("Num is less then 9 : = " + num);
		}
		
		else if (num == 9) { // If 2nd condition is no satisfy  then come to 3rd condition 
			System.out.println("Num is equal 9 : = " + num);
		}
		
		else { // If 3rd condition is no satisfy  then come to 4th condition 
			System.out.println("Num is empty : " + num );
		}
		
		
		
	}
}
