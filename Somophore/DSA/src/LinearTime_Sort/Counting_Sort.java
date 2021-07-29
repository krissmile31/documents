package LinearTime_Sort;

public class Counting_Sort {
	/**
	 * @effects add [] to store
	 */
	// each of the n input elements is an integer in the range 0 to k,
	// for some integer k. 
	// O(n + k). Stable
	
	public static void CountingSort(int[] a, int[] b, int k) {
		int n = a.length;
		int[] c = new int[k+1];
		
		//Initialize the array c to all zeros
		for (int i = 0; i<=k; i++ )  
			c[i] = 0;         
		
		//c[i] now contains the number of elements equal to i
		for (int i = 0; i<n; i++)
			c[a[i]]++;        // appeared times
		
		//c[i] now contains the number of elements less than or equal to i
		for(int i = 1; i<= k; i++) 
			c[i] = c[i] + c[i-1];      // next number + pre-number
		
		for (int i = n-1; i>=0; i--) {
			b[c[a[i]] - 1] = a[i];      //arrange
			c[a[i]]--;        // decrease times in c
		}
			
	}
	

}
