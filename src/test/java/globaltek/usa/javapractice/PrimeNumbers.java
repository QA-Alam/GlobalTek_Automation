package globaltek.usa.javapractice;

import java.util.Scanner;
import java.util.stream.IntStream;

public class PrimeNumbers {
	private static Scanner sc;
	public static void main(String[] args) {
		//System.out.println(isPrime(15));
		mains();
	}

	public static boolean isPrime(int i) {
	    return i % 2 != 0 && IntStream.iterate(3, n -> n <= 
	    		(int)(Math.sqrt(i)), n -> n + 2).noneMatch(k->i%k==0);
	}
	
	

	
	public static void mains() 
	{	
		int i, number, count = 0; 
		sc = new Scanner(System.in);
		
		System.out.print(" Please Enter any Integer : ");
		number = sc.nextInt();		
		
		for (i = 2; i <= number/2; i++)
		{
			if(number % i == 0)
		    {
				count++;
		        break;
		    }	
		}
		if(count == 0 && number != 1 )
		{
			System.out.println( number + " is a Prime");
		}
		else
		{
		   System.out.println(number + " is Not");
		}
	}
}