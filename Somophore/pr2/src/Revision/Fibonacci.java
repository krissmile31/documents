package Revision;
import java.util.Arrays;

import utils.DomainConstraint;
import utils.DOpt;
import utils.OptType;
import utils.AttrRef;

/**
 * @overview represents a sequence of fibonacci numbers.
 * @attributes
 * fibo 		Set<Fibo> 		Arrays<Fibo>
 * @object a typical Fibonacci object is c = {x1,...,xn} where x1,...,xn are fibonacci numbers.
 * @abstract_properties
 * mutable(fibo) = true /\ optional(fibo) = false 
 * @author ADMIN
 *
 */
public class Fibonacci {
	@DomainConstraint(type = "Set<Fibo>", mutable = true, optional = false)
	private Fibo[] fibo;
	
	/**
	 * @effects initialise this as a sequence of the first n fibonacci numbers.
	 */
	public Fibonacci(int n) {
		fibo = new Fibo[n];
		for (int i = 0; i<n ; i++)
			fibo[i] = new Fibo(i+1);
	}
	
	/**
	 * @effects print sequence fibo to the terminal console
	 */
	public void print() {
		System.out.println(Arrays.toString(fibo));
	}
	
	/**
	 * @overview A private class that represents a fibonacci number.
	 * @attributes
	 * val 		Integer 		int
	 * @object A typical Fibo object is f = <val> where val is a fibonacci number.
	 * @abstract_properties
	 * mutable(val) = true /\ optional(val) = false
	 * @author dmle
	 */
	private class Fibo {
		@DomainConstraint(type = "Integer", mutable = true, optional=false)
		private int val;
		
		/**
		 * Recursive construct this
		 * 
		 * @requires n>=1
		 */
		public Fibo(int n) {
			if(n==0)
	            val=0;
	        else if (n==1)
	        	val=1;
	        else 
	            val= new Fibo(n-1).val+new Fibo(n-2).val;
		}
		
		/**
		 * @effects return this.val
		 */
		@DOpt(type = OptType.Observer) @AttrRef("val")
		public int getValue() {
			return this.val;
		}
		
		@Override
		public String toString() {
			return val + "";
		}
	}
		/**
		 * The run method
		 * @effects initialise a Fibonacci and print it to the terminal console
		 */
	public static void main(String[] args) {
		Fibonacci fibo = new Fibonacci(9);
		fibo.print();
	
	}

}
