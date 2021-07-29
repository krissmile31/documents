package tut3.exception;
import java.util.Arrays;

import utils.EmptyException;

public class combine {
	
	/**
	 * A method that multiples each element of a by the sum of the elements of b
	 * @effects<pre>
	 * if a or b is null
	 * 		throws NullPointerException
	 * else
	 * 		returns the product between element in a and sum of b
	 * </pre>
	 */
	public static void combine(int[] a, int[] b) throws EmptyException {
		
		if (a.length == 0 || b.length == 0)
			throw new EmptyException("Ex4.combine: array is null");
		int sum = 0;
		for (int x: b)
			sum += x;
		
		System.out.print("[");
		for (int y: a) {
			y *= sum;
			System.out.print(y);
			if (y < a[a.length - 1]*sum)
				System.out.print(", ");
		}
		System.out.print("] ");
	}
	
	// test method
	public static void main(String[] args) {
		
		try {
			int[] a = {1,2,3};
			int[] b = {4,5};
			System.out.println(Arrays.toString(a));
			System.out.println(Arrays.toString(b));
			System.out.println();
			combine(a, b);
		} catch (EmptyException e) {
			System.err.println(e.getClass() + ": " + e.getMessage());
//        	e.printStackTrace();
		}
		
		System.out.println();
		
		try {
			int[] a = {};
			int[] b = {4,5};
			combine(a, b);
		} catch (EmptyException e) {
			System.err.println(e.getClass() + ": " + e.getMessage());
//        	e.printStackTrace();
        	System.out.println();
		}		
	}
}
