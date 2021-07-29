package Sort;

import utils.TextIO;

public class Insertion_sort {
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
	 * @effects first element compare the next
	 * consider the second element (key)
	 * if first > next -> swap
	 *  second = first
	 *  first = key
	 * 
	 */
	// O(n2). Stable
	
	for (int j = 1; j < n; j++) {
		int key = a[j];     // the second element (next)
		int i = j - 1;       // 1st 
		while (i >= 0 && a[i] > key) {    // first > next
			a[i+1] = a[i];      // swap sencond = first
			i--;
		}
		a[i+1] = key; //insert key = a[j] with true position
	}
	}	

}
