package Sort;

import utils.TextIO;

public class Bubble_sort {
	public static void main(String[] args) {   
	    TextIO.put("n= ");
	    int n =  TextIO.getlnInt();
	    int[] a = new int[n];
	    
	    for (int k = 0; k<n; k++) {
	      TextIO.putf("a[%d]= ", k);
	      a[k] = TextIO.getInt();
	    }

	    for (int i = 0; i<n; i++)
	     System.out.print(a[i] + " ");

	
	/**
	 * @effects exchange pairs out of order
	 * if first > next 
	 * store first to other
	 * swap: first = second
	 * copy other to second
	 * 
	 * isSorted: boolean -> to avoid repeating
	 * 
	 */
	//O(n2). Stable
	boolean isSorted = false;
	while (!isSorted) {
		isSorted = true;
		for (int i = 0; i < n-1; i++) {
			if  (a[i] > a[i+1]) {
				int tmp = a[i];
				a[i] = a[i+1];
				a[i+1] = tmp;
				isSorted = false;
			}
		}
	}
	}
}
