package tut3.exception;

import utils.EmptyException;

public class sumInt {
	
	/**
	 * A method to calculate the sum of the elements in an array of integers
	 * @requires a is nonempty array
	 * @effects <pre>
	 * if a is empty
	 * 		throws EmptyException
	 * else
	 * 		returns the total sum of the elements of a
	 * </pre>
	 */
	public static int sumInt(int[] a) throws EmptyException {
		
		if (a.length == 0)
			throw new EmptyException("Ex3.sumInt: array is null");
		int sum = 0;
		for (int x: a)
			sum += x;
		return sum;
	}
	
	// test method
	public static void main(String[] args) {
		
		// valid array
		System.out.println("Create a valid array a");
		try {
			int[] a = {5, 69, 2, -1};
			System.out.println(sumInt(a));
		}catch(EmptyException e) {
			System.out.println(e.getClass() + " " + e.getMessage());
		}
		System.out.println();
		
		// invalid array
		System.out.println("Create an invalid array a");
		try {
			int[] a = {};
			System.out.println(sumInt(a));
		}catch(EmptyException e) {
			System.out.println(e.getClass() + ": " + e.getMessage());
			e.printStackTrace();
		}
	}

}
