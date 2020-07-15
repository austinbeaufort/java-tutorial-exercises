package com.newthinktank;

import java.util.*;
import java.util.stream.IntStream;
import javax.swing.JOptionPane;


public class HelloWorld {
	
	static Scanner sc = new Scanner(System.in);
	
	

	public static void main(String[] args) {


	}

}


/*

classes can only inherit from one class but can inherit from multiple interfaces


public - accessible to all classes
protected - accessible to the current class and its subclasses
private - only accessible to the current class




data types:
	byte, short, char, boolean, int, float, double, long 
	
floats have 6 decimal place precision value
doubles have 15 decimal place precision value
BigDecimal has even more precision
	
	
	
	
	
	
	
	
	
Coding Fundamentals Examples:




		// EXCEPTION HANDLING
		try {
			int badInt = 10 / 0;
		}
		catch (ArithmeticException ex) {
			System.out.println("Can't divide by Zero");
			System.out.println(ex.getMessage());
			System.out.println(ex.toString());
		}
		catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		finally {
			System.out.println("Clean up");
		}








	// ENUMS
	public enum Day { Monday, Tuesday, Wednesday };
	

	public static void main(String[] args) {
		Day favDay = Day.Monday;
		System.out.println("Favorite day is " + favDay);
	}





// METHODS
public class HelloWorld {
	
	static Scanner sc = new Scanner(System.in);
	
	
	public static int getSum(int x, int y) {
		return x + y;
	}
	
	
	
	public static int getSum2(int ... nums) {
		int sum = 0;
		for (int num: nums) {
			sum += num;
		}
		return sum;
	}
	
	
	static int[] getNext2(int num) {
		int[] vals = new int[2];
		vals[0] = num + 1;
		vals[1] = num + 2;
		return vals;
	}
	
	
	static List<Object> getRandomList() {
		String name = "Austin";
		int age = 27;
		return Arrays.asList(name, age);
	}
	
	static int factorial(int num) {
		if (num == 1) {
			return 1;
		} else {
			int result = num * factorial(num - 1);
			return result;
		}
	}
	

	public static void main(String[] args) {
		System.out.println(getSum(5, 4));
		System.out.println(getSum2(1, 2, 3, 4, 5, 6, 7));
		System.out.println(getSum2(1, 2, 3, 4, 5));
		
		int[] multValues = getNext2(5);
		
		for (int num: multValues) {
			System.out.println(num);
		}
		
		List<Object> randList = getRandomList();
		System.out.println(randList);
		
		System.out.println(factorial(5));
		
	}

}








		// User Input
		System.out.print("Enter name: ");
		if(sc.hasNextLine()) {
			String userName = sc.nextLine();
			System.out.println("Hello " + userName);
		}
		
		String jopName = JOptionPane.showInputDialog("Enter name");
		System.out.println("Hello " + jopName);




	
		// Linked Lists
		LinkedList<Integer> iL1 = new LinkedList<Integer>();
		iL1.add(1);
		iL1.add(2);
		iL1.add(3);
		iL1.addAll(Arrays.asList(1,2,3,4));
		iL1.addFirst(0);
		System.out.println(iL1.contains(4));
		System.out.println(iL1.indexOf(4));
		iL1.set(0, 2);
		System.out.println(iL1.get(0));
		Object[] a1 = iL1.toArray();
		
		for (Integer num: iL1)
			System.out.print(num + " ");








		// Array Lists
		ArrayList<String> aL1 = new ArrayList<String>(20);
		aL1.add("Sue");
		ArrayList<Integer> aL2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
		
		for (Integer num: aL2)
			System.out.print(num + " ");
		
		System.out.println(aL2.get(1));
		aL2.set(1, 5);
		System.out.println(aL2.toString());
		aL2.remove(3);
		System.out.println(aL2.toString());
		
		
		Iterator it = aL2.iterator();
		
		while(it.hasNext())
			System.out.println(it.next());





		// Arrays
		int[] myArray = new int[10];
		myArray[1] = 1;
		Arrays.fill(myArray, 2);
		System.out.println(myArray[0]);
		System.out.println(myArray.length);
		
		String[] a2 = { "one", "two" };
		int[] oneTo10 = IntStream.rangeClosed(1, 10).toArray();
		
		for (int num: oneTo10)
			System.out.println(num);
		
		System.out.println(Arrays.binarySearch(oneTo10, 9));
		
		int a3[][] = new int [2][2];
		String[][] a4 = {{"00", "10"}, {"01", "11"}};
		
		System.out.println(a4[1][1]);
		
		int a5[] = {1, 2, 3};
		int a6[] = Arrays.copyOf(a5, 3);
		System.out.println(Arrays.equals(a5, a6));
		int a7[] = {3, 2, 1};
		Arrays.sort(a7);
		System.out.println(Arrays.toString(a7));
	
		// string builders
		StringBuilder sb = new StringBuilder("I am a string builder");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		sb.append(". Appending this to sb.");
		System.out.println(sb);
		System.out.println(sb.insert(6, " large"));







		String wholeName = "Austin Beaufort";
		
		System.out.println(wholeName.charAt(0));
		System.out.println(wholeName.contains("Austin"));
		System.out.println(wholeName.indexOf("Beaufort"));
		System.out.println(wholeName.length());
		System.out.println("dog".equals("cat"));
		System.out.println("dog".equalsIgnoreCase("DOG"));
		System.out.println(wholeName.compareTo("ABC"));
		
		System.out.println(wholeName.replace("Austin", "Joe"));
		System.out.println(wholeName.substring(0, 6));
		
		for (String x: wholeName.split(" "))
			System.out.println(x);



		final String firstName = "Austin";
		final String lastName = "Beaufort";
		final String wholeName = firstName + " " + lastName;
		System.out.println(wholeName);
		

		// coerces the 9 to a string, "+" operator is overloaded
		final String dog = "K" + 9;
		System.out.println(dog);



		int minNum = 5;
		int maxNum = 20;
		int randomNum = minNum + (int)(Math.random() * (maxNum - minNum) + 1);
		System.out.println(randomNum);



		// dividing float with an int returns a float
		System.out.println(5.0 / 4);
		// dividing ints returns an int
		System.out.println(5 / 4);



		System.out.println("Hello World");
		System.out.println("Byte Max: " + Byte.MAX_VALUE);
		System.out.println("Double Value: " + Double.MAX_VALUE);
		
		boolean happy = true;
		System.out.println(happy);

		double thousand = 1e+3;
		System.out.println(thousand);
		
		
		CONVERTING TYPES
			int smInt = 10;
			long smLong = smInt;
			
			double cDouble = 1.234;
			int cInt = (int) cDouble;
			System.out.println(cInt);
			
			// conversion from larger to smaller precision can cause unexpected results!
			long bigLong = 232945804353843L;
			int bigInt = (int) bigLong;
			System.out.println(bigInt);
			
			String favNum = Double.toString(1.618);
			System.out.println(favNum);
		
			int strInt = Integer.parseInt("10");
			System.out.println(strInt);
		 


*/