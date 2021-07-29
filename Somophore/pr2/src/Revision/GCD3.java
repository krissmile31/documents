package Revision;

import utils.TextIO;

/**
 * @overview  Solves GCD using a recursive algorithm
 * @author Rain
 */
public class GCD3 {
    /*  @requires a > 0 /\ b >= 0
     *  @effects
     *    return the greatest common divisor (GCD) of a and b;
     *    i.e. the largest natural number by which both a and b are divisible;
     *    e.g. GCD(0,100) = 100, GCD(6,9) = 3, GCD(3,5) = 1
     */
	public static int Gcd(int a, int b) {
		/*
		 *  BASIS. for all natural numbers a > 0:
		 * i)  GCD(a,a)=a.
		 * ii) GCD(x,0)=x.
		 * INDUCTION. for all natural numbers a, b > 0:
		 * i)  GCD(a,b)=GCD(a-b,b) if a > b
		 * ii) GCD(a,b)=GCD(a,b-a) if a < b
		 */
		if (a==b || b==0) 
			return a;
		else if (a>b)
			return Gcd(a-b, b);
		else 
			return Gcd(a, b-a);
	}
	public static void main (String[] args) {
		TextIO.put("a= ");
		int a = TextIO.getlnInt();
		TextIO.put("b= ");
		int b = TextIO.getlnInt();
		TextIO.putf("Gcd(%d,%d) = %d", a, b, Gcd(a,b));
	
		

	}

}
