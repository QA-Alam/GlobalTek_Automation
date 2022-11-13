package globaltek.usa.javapractice;

import java.util.HashSet;
import java.util.Set;

public class SetInterfaceTest {

	// How to find-out the duplicate 
	public static void main(String[] args) {
		// I have to declare an arrays
		String [] name = {"Selenium","Java","Maven","Cucumber","TestNG","JDBC","Java"};
		
		// again i declare hash-set object because of as we know set can handle only unique value 
		Set<String> setValue = new HashSet<String>();
		
		// Than i have create a loop take a control value of arrays 
		for (String newValue : name) {
			
			// with the help if condition i can compare the value of array by using false keyword
			if (setValue.add(newValue) ==false) {
				
				// finally i can get the duplicate value 
				System.out.println(newValue);
			}
		}
	}
}
