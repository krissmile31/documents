package Revision;

public class mid {
	
	/**
	 * @requires a!=null /\ a.length > 0
	 * @effects return n in a: (for all y. y in a -> y <= n
	 * e.g. method1([2, 1, 3]) = 3
	 */
	public static int method1(int[] a) {
		int n = a[0];
		int x;
		
		/**
		 * 
		 * 
		 * Loop invariant:
		 *  0 <= i < a.length /\ n in a /\ (for all y in a[0 to i-1]. n >= y)
		 */
		
		for (int i = 0; i< a.length; i++) {
			// 0 <= i < a.length /\ (n in a /\ for all y in a[0...i-1]. n>= y)
			
			x = a[i];
			// x = a[i]
			
			if(x > n)
				// 0 <= i < a.length /\ x = a[i] /\
				// (i >= 1) -> (i += 1 /\ n = a[i] | a[i] > n)
				n = x;
			
			// n = a[k] | a[k] >= a[i] | 0 <= k <= i
			return n;
		}
	}

}
