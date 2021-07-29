package Sort;

import utils.TextIO;

public class Selection_sort {
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
	 * @effects largest swap end
	 * Max is the last number
	 * if Max < pre-number -> swap   
	 */
	    // O(n2). No stable
	for (int i = n-1; i >= 1; i--) {  // end
		int Max = a[i];   // last number is largest
		int pos = i;          // that position
		
		for (int j = i-1; j >= 0; j--) {   // near last (previous)
			if (Max < a[j]) {    // largest is smaller than its pre-number 
				Max = a[j];    //swap , take a[j] value, Max is largest 
				pos = j;       // current position
			}
		}
		
		a[pos] = a[i];   // swap, because above prove that Max is smaller -> push up
		a[i] = Max;     // first default, pre = Max, to continue swap for the previous element
	}
}
}
