package globaltek.usa.javapractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayListTest.getList();
	}
	
	public static void getList() {
		
		//WebDriver driver = new WebDriver();
		ArrayListTest obj = new ArrayListTest();
		// How to declare arrays
		int[] num = { 1, 2, 3, 4, 5 };

		// 1 way
		List<Integer> lists = new ArrayList<Integer>();
		// 2 way
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
		// 3 way
		// How to declare ArrayList
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(null);
		list.add(null);
		list.add(null);
		list.add(null);
		
		
		for (int n : list) {
			System.out.println("This a arrayList value : "+n);
		}
		
		
		// How to declare LinkedList
		LinkedList<Integer> llist = new LinkedList<Integer>();
		llist.add(1);
		llist.add(2);
		llist.add(3);
		llist.add(4);
		llist.add(5);

		// How to declare Vector
		Vector<Integer> vc = new Vector<Integer>();
		vc.add(1);
		vc.add(2);
		vc.add(3);
		vc.add(4);
		vc.add(5);

		// What is the deference between ArrayList and Vector
		// Ans: ArrayList is faster other hand vector is slower
		// ArrayList Non-Synchronize Other handle Vector is Synchronize
		// When i added new value in ArrayList Increase the size 50%
		// Other Hand Vector Increase the size 100%

	}

	public static void getSet() {
		// How to declare Set
		Set<Integer> sets = new HashSet<Integer>();
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(null);
		set.add(null);
		set.add(null);
		set.add(null);
	}
	
	// How to declare LinkedList
	public static void getMap() {
		// Map store the value as key and value pair 
		// Map store the value by using put method
		// Map can handle as many duplicate value 
		// Map can not handle duplicate key 
		// Map can handle only one null key 
		// Map can handle multiple null value 
		
		Map<Integer, String> maps = new HashMap<Integer, String>();	
		HashMap<Integer, String> map = new HashMap<Integer, String>();	
		map.put(1, "Alam");
		map.put(2, "Alam");
		map.put(3, "Alam");
		map.put(4, "Alam");
		map.put(4, null);
		map.put(4, null);
		map.put(null, null);
		map.put(null, null);
	}

	
	// 
}
