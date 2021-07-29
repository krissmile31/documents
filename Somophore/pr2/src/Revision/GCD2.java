package Revision;
import utils.TextIO;

/**
 * @overview Solves GCD using a recursive algorithm.
 * @author Rain
 */
public class GCD2 {
	 /*
	  * @requires a > b /\ b >= 1
	  *@effects
	  *  return the greatest common divisor (GCD) of a and b;
	  *  i.e. the largest natural number by which both a and b are divisible;
	  *  e.g. GCD(6,9) = 3, GCD(3,5) = 1
	  *
	  */
	public static int Gcd(int a, int b) {
		/*
		* BASIS. for all natural numbers a > 0, b = 0: GCD(x,y)=x
		* INDUCTION. for all natural numbers a > b > 0: GCD(x,y)=GCD(y,x mod y)
		*/
		if (b==0)
			return a;
		else
			return Gcd(b, a%b);
	}
	public static void main (String[] args) {
		TextIO.put("a= ");
		int a = TextIO.getlnInt();
		TextIO.put("b= ");
		int b = TextIO.getlnInt();
		TextIO.putf("Gcd(%d,%d) = %d", a, b, Gcd(a,b));
	
		

	}


}
