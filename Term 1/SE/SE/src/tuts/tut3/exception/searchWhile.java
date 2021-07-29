package tut3.exception;

import java.util.Arrays;

import utils.EmptyException;
import utils.NotFoundException;

public class searchWhile {
	
	
	/**
	 * @requires <tt>a</tt> is sorted in ascending order
	 * @effects <pre>
	 * if a is null
	 * 		throws NullPointerException
	 * else if x is not in a
	 * 		throws NotFoundException
	 * else
	 * 		return i such that a[i]=x 
	 * </pre>
	 */
	public static int searchWhile(int[] a, int x) throws NullPointerException, NotFoundException {
		
		// implementation that uses a while loop
		if (a.length == 0)
			throw new NullPointerException("Ex2.searchWhile: array is null");
		
		int i = 0;
		int e = -1;
		while(true) {
			try {
				e = a[i];
			} catch (IndexOutOfBoundsException e1) {
				// end of array
				// x is greatest than all elements of a
				throw new NotFoundException("Ex2.searchWhile: element not found in array: " + x);
			}
			
			if (e == x)
				return i;
			else if (e > x)
				throw new NotFoundException("Ex2.searchWhile: element not found in array: " + x);
			i++;
		}
	}
	
	
	public static void main(String[] args) {
		// valid
		try {
			int[] a = {1, 2, 3};
			int x = 2;
			int b = searchWhile(a,x);
			System.out.println(b);
		} catch (NullPointerException e) {
			System.out.println(e.getClass() + ": " + e.getMessage());
		}
		System.out.println();
		
		// array is null
		try {
			int[] a = {};
			int x = 2;
			int b = searchWhile(a,x);
			System.out.println(b);
		} catch (NullPointerException e) {
			System.err.println(e.getClass() + ": " + e.getMessage());
			System.out.println();
		}
		
		// key x is not in a
		try {
			int[] a = {1, 2, 3};
			int x = 5;
			int b = searchWhile(a,x);
			System.out.println(b);
		} catch (NotFoundException e) {
			System.err.println(e.getClass() + ": " + e.getMessage());
		}
	}
}
