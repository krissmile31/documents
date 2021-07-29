package Revision;
import utils.TextIO;

/** 
 * @overview Solves GCD by using an iterative algorithm
 * @author Rain
 *
 */
public class gcd {
	/**
	 * @requires a > b /\ b >= 1
	 * @effects <pre>
	 *          return the greatest common divisor (GCD) of a and b
	 *          i.e. the largest natural number by which both a and b are divisible;
	 *          e.g. GCD(6,9) = 3, GCD(3,5) = 1
	 *          </pre>
	 */
	public static int Gcd(int a, int b) {
		/*Loop variant:
		 * P(b) = false if b != 0 
		 *        true if b = 0
		 *Loop invariant:
		 * a > b /\ Gcd(a0,b0) = Gcd(a,b)
		 */
		
		while (b!=0) {
			int m = b;
			b = a % b;
			a = m;
		}
		return a;
		
	}
	
	/**
	 * the main method
	 * @effects print the gcd of a and b
	 */
	public static void main (String[] args) {
		TextIO.put("a= ");
		int a = TextIO.getlnInt();
		TextIO.put("b= ");
		int b = TextIO.getlnInt();
		TextIO.putf("Gcd(%d,%d) = %d", a, b, Gcd(a,b));
	}

}
