package tut8;

import userlib.TextIO;

/**
 * @overview represents a set of even numbers
 * @author NgocAnh
 *
 */
public class EvenIntSet {
	/**
	 * @requires array a contains positive integers
	 * 
	 * @effects only accepts even numbers as elements. 
	 * while a[i]%2==0 
	 *   return a[i]
	 * 
	 */
	public static int getEvens(int[] a) {
		for (int i = 0; i < a.length; i++) {
			while (a[i] % 2 == 0)
				return a[i];
		}

		return -1;

	}
	
    /**
     * The main method
     * @effects print even integer list
     * if (a[i]%2=0)
     *   print a[i]
     * 
     */
	public static void main(String[] args) {
		TextIO.put("Enter a list of N as:\n n = ");
		int n = TextIO.getlnInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			TextIO.putf("a[%d] = ", i);
			a[i] = TextIO.getlnInt();
		}
		TextIO.putln("Even Integer Set: ");
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0)
				TextIO.putln(a[i]);
		}
	}
}
