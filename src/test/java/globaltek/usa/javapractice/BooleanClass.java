package globaltek.usa.javapractice;

public class BooleanClass {

	public static void main(String[] args) {
		// System.out.println(BooleanClass.getOddNumber(8));
		//BooleanClass.duplicateValue();
		
		switchCase("CA");

	}

	// Write a method which gives us return either true or false
	public static boolean getOddNumber(int num) {
		if ((num % 2) == 0) {
			return false;
		} else if ((num % 2) > 0) {
		}
		return true;
	}

	public static void duplicateValue() {
		String[] name = { "selenium", "java", "cucumber", "maven", "testNG", "java" };

		for (int i = 0; i < name.length; i++) {
			for (int j = i + 1; j < name.length; j++) {
				if (name[i] == name[j]) {
					System.out.println(name[i]);

				}
			}

		}
	}

	// What is the switch statement? How to use it?

	public static void switchCase(String state) {
		
		switch (state) {
		
		case "CA":
			System.out.println(" xpath 1");
			break;
			
		case "VA":
			System.out.println("xpath 2");
			break;
			
		case "NY":
			System.out.println("xpath 3");
			break;
			
		case "PA":
			System.out.println("xpath 4");
			break;
		case "NJ":
			System.out.println("xpath 5");
			break;
			
		case "FL":
			System.out.println("xpath 6");
			break;

		case "TN":
			System.out.println("xpath 7");
			break;

		default:
			System.out.println(" Another xpath");

		}

	}

}
