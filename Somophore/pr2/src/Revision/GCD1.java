package Revision;
import utils.TextIO;

/**
 * @overview Solves GCD using an iterative algorithm.
 * 
 * @author Rain
 *
 */
public class GCD1 {
	/** 
	 *  @requires a > 0 /\ b >= 0
	 *  @effects
	 *   return the greatest common divisor (GCD) of a and b
	 *   i.e. the largest natural number by which both a and b are divisible
	 *    e.g. GCD(0,100) = 100, GCD(6,9) = 3, GCD(3,5) = 1
	 *    
	 */
	public static int Gcd(int a, int b) {
		/*
		* Loop variant:
		* P(a,b) = false if a-b != 0
		*          true if a-b = 0
		* Loop invariant:
		* Gcd(a0,b0) = Gcd(a,b)
		*/
		while (a!=b) {
			if (a>b)
				a = a - b;
			else
				b = b - a;
		}
		return a;
		}
	public static void main (String[] args) {
		TextIO.put("a= ");
		int a = TextIO.getlnInt();
		TextIO.put("b= ");
		int b = TextIO.getlnInt();
		TextIO.putf("Gcd(%d,%d) = %d", a, b, Gcd(a,b));
	
		

	}

}
