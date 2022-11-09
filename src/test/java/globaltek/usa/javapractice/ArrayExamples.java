package globaltek.usa.javapractice;

import java.util.Arrays;

public class ArrayExamples {

	// What is the array?
	// Array is an object as well it's a class
	// Array are used to store the multiple values in a single unit
	// because of one variable can handle only one value at the same time

	public static void singleVariable() {
		int num = 10;
		num = 20;
		num = 30;
		num = 50;
		num = 400;
		num = 40;
		System.out.println(num);
	}

	// How to declare an arrays?
	// Ans: There are many way i can declare an array
	// And there are single dimension Array and multi-dimension Array

	// What is the difference between single dimension Array and multi-dimension Array
	// Ans: single dimension [] can handle only single row or single column
	// multi-dimension Array [] [] can handle multiple row and multiple columns

	// What is the disadvantage of an arrays?
	// Ans: Array length is fixed
	// If i want the value beyond the declaration i am getting the
	// "ArrayIndexOutOfBoundsException"

	// How do you resolved this issues?
	// Ans: With the help of ArrayList because of ArrayList is dynamic
	// Array performance is faster

	// How to declare an arrays?
	public static void declareSingledimensionArray() {
		int num[] = {10, 20, 30, 40, 50, 39};

		// How do you get specific value from an arrays?
		// By index number
		System.out.println(num[5]);

		// How do you get all the value from single arrays?
		// With the help looping concept
		for (int newNum : num) {
			System.out.println(newNum);

		}
	}

	public static void declareMultidimensionArray() {
		int num[][] = { { 10, 20, 30, 40, 50, 80 },
				       { 60, 70, 80, 90 }, 
				       { 60, 70, 80, 90 },
				       { 110, 120, 130, 140, 150, 60, 70 } };

		//System.out.println(num[1][2] + " 2nd values " + num[2][0]);
		
		 for (int[] row : num){
			    System.out.println(Arrays.toString(row));
			   }
		
		 Arrays.stream(num).forEach((i) -> {
		        Arrays.stream(i).forEach((j) -> System.out.print(j + " "));
		        System.out.println();
		    });
		 
		 
	     // first for...each loop access the individual array
	        // inside the 2d array
	        for (int[] innerArray: num) {
	            // second for...each loop access each element inside the row
	            for(int data: innerArray) {
	                System.out.println(data);
	            }
	        }
		// System.out.println(num[2][0]);
		// How do you get all the value from multi arrays?
		// With the help nested loop

		// What is the nested loop?
		// Ans: One loop inside another loop
	}

	public static void main(String[] args) {
		//ArrayExamples.declareSingledimensionArray();
		ArrayExamples.declareMultidimensionArray();
	}

}
