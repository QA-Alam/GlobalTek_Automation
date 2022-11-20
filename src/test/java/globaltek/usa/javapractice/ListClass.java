package globaltek.usa.javapractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ListClass {

	// Difference between collection, Collections and Collectors
	// collection -> is an interface to store, insertion manipulation the group of
	// the object
	// Collections -> is a utility class in java (Remove, max, min value, sorting
	// and many more)
	// Collectors -> is a java final class

	// How to remove the duplicate from arrayList?

	public static void removeDuplicate() {
		 int [] number = {1,2,3,4,5,6};
		// Interface <Class> Instance keyword Class
		
		 List<Integer> num = new ArrayList<Integer>(); 
		 num.add(1); num.add(2);
		 num.add(3); num.add(4); 
		 num.add(5); num.add(6); 
		 List<Integer> nums = Arrays.asList(1,2,3,4,5,6);
		 

		// I have to declare a value inside a list
		List<Integer> remove = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 3, 4, 4, 5, 5, 6, 1));

		// With the help array-list object i can call
		// stream().distinct().collect(Collectors.toList())
		// And store in list of instance
		List<Integer> uniqueValue = remove.stream().distinct().collect(Collectors.toList());

		// With the help list instance i can print out the value
		System.out.println(uniqueValue);

	}

	// How to find-out max value and min value
	public static void getMaxMinValue() {
		List<Integer> values = new ArrayList<Integer>(Arrays.asList(100, 200, 50, 300, 700, 400, 500, 600));
		// collection interface
		// Collections java final class
		// Collectors

		// There are many way to find-out the max/min values, as of now i can easily
		// find-out
		// with help Java collections final class calling the max/min method and passing
		// the variable of values, then i can store the max value in int variable
		int max = Collections.max(values);
		System.out.println("This is my maximum value : " + max);

		int min = Collections.min(values);
		System.out.println("This is my minimum value : " + min);

	}
// How to find-out the second highest number from array
	public static void secondHighestNumber() {
// I have to declare an array
		int[] number = { 1, 2, 3, 4, 5, 6 };
// With the help of array variable/object call length and store by reference variable
		int size = number.length;
		Arrays.sort(number);
		int res = number[size - 2];
		System.out.println(res);
	}

	// How to find-out specific value from arrayList
	public static void getSpecificValue() {
		ArrayList<String> name = new ArrayList<>();
		name.add("Tawhid");
		name.add("Afsana");
		name.add("Mariyam");
		name.add("Shadat");
		name.add("Rahaman");
		name.add("Zamil");
		name.add("Hassan");

		if (name.contains("Mariyam")) {
			System.out.println("Test is pass ");
		} else {
			System.out.println("Test is fail");
		}
	}

	// How to sort the value from arrayList
	public static void getSortTheValue() {
		ArrayList<String> name = new ArrayList<>();
		name.add("Tawhid");
		name.add("Afsana");
		name.add("Mariyam");
		name.add("Shadat");
		name.add("Rahaman");
		name.add("Zamil");
		name.add("Hassan");
		Collections.sort(name);
		for (String sort : name) {
			System.out.println(sort);
		}
	}

	// How to compare two/three array?
	public static void compareArrays() {
		int[] num1 = { 1, 2, 3, 4, 5, 6 };
		int[] num2 = { 1, 2, 3, 4, 5, 6 };
		int[] num3 = { 1, 2, 3, 4, 5, 6 };
		if (Arrays.equals(num1, num2)) {
			System.out.println("Array one and array two -> Values is same");
		}
		if (Arrays.equals(num2, num3)) {
			System.out.println("Array two and array three -> Values is same");
		} else {
			System.out.println("Values not same");
		}
	}

	// How to split the word in java?
	public static void getSplitWord() {
		String word = "United State Of America";
		String[] wd = word.split(" ");
		for (String value : wd) {
			System.out.println(value);
		}

	}

	// How to reverse string without function from array
	public static void getReverseStringWithOutFunction() {
		String rev = "MOM"; // sysofnI
		String revString = "";
		for (int i = rev.length() - 1; i >= 0; --i) {
			revString += rev.charAt(i);
		}
		System.out.println(revString);
	}

	// How to reverse string with function
	public static void getReverseStringFunction() {
		String rev = "LEVEL"; // sysofnI
		// StringBuilder class
		StringBuilder sb = new StringBuilder(rev);
		// With the help of StringBuilder object call the reverse method and get the
		// value
		rev = sb.reverse().toString();
		System.out.println(rev);
	}

	// How to find-out palindrome number?
	// After reverse any number/string remaining same value it's call palindrome
	// number
	// MOM, LEVEL, MADAM, 454 646
	public static void getPalindromeNumber() {
		String rev = "ufyfo";
		StringBuilder sb = new StringBuilder(rev);
		rev = sb.reverse().toString();
		if (rev.contains("LEVEL")) {
			System.out.println("This is a Palindrome Number " + rev);
		} else {
			System.out.println("Not a Palindrome Number");
		}
	}
	
	public static void getNum() {
		ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(5);

    for(int i =0; i < list.size(); i++) {
         if (list.contains(list.get(i))) {
             System.out.println(list.get(i)+" is duplicated");
         }
    }
	}
	
	

	public static void main(String[] args) {
		// ListClass.removeDuplicate();
		// getMaxMinValue();
		// secondHighestNumber();
		// getSpecificValue();
		// getSortTheValue() ;
		// compareArrays();
		// getSplitWord();
		// getReverseStringWithOutFunction();
		// getReverseStringFunction();
		getPalindromeNumber();
		getNum();
	}
}
