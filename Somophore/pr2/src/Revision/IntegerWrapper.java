package Revision;

import utils.TextIO;

/**
 * @overview A program creates and manipulates Integer objects
 * @author Rain
 */
public class IntegerWrapper {
	/**
	 * The run method
	 */
	public static void main (String[] args) {
		Integer i;
		int j, k;
		
		// create object using auto-boxing
		i = 10;                /* i = Integer(10) */
		
		// auto-convert to primitive using unboxing
		k = i;                /* k = 10 */
		
		// unboxing i back to primitive in expression
		j = i + 3;             /* j = 13 */
				
	    TextIO.putf("i, j, k = %d, %d, %d", i, j, k);
	}

}
