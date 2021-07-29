package Overusing;


/**
 * @requires <tt> a != null </tt>
 * @effects <pre>
 * if a is sorted in ascending order
 * 		return true
 * else
 * 		return false
 * </pre>
 */
 boolean sorted(int[] a) {
	 int prev;
	 
	 try {
		 prev = a[0];
	 } catch (IndexOutOfBoundsException e) {
		 return true;
	 }
	 
	 for (int i = 1; i < a.length; i++) {
		 if (prev <= a[i])
			 prev = a[i];
		 else
			 return false;
	 }
	 return true;
}
