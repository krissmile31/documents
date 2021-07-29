package Sort;

public class Merge_Sort {
	
	// divide & conquer approach
	// O(nlogn). Stable
	// 2T(n/2) + O(n) if n>1
	
	/**
	 * @effects set up Merge process
	 */
	
	public static void MergeSort(int[] a, int left, int right) {
		if (left < right) {
			int mid = (left + right)/2;
			MergeSort(a, left, mid);
			MergeSort(a, mid + 1, right);
			Merge(a, left, mid, right);
		}
	}
	 /**
	  * @effects 
	  * c[0... right - left]
	  * 	 
	  */
	public static void Merge(int[] a, int left, int mid, int right) {
		int i = left;
		int j = mid + 1;
		int[] c = new int[right - left + 1];
		int k = 0;
		while (i<=mid && j<= right) {
			if (a[i] < a[j]) {
				c[k] = a[i];
				i++;
			}
			else {
				c[k] = a[j];
				j++;
			}
			k++;	
		}
		 
		// move all items a -> c
		for (int t = i; t <= mid; t++) {
			c[k] = a[t];
			k++;
		}
		for (int t = j; t <= right; t++) {
			c[k] = a[t];
			k++;
		}
		
		// copy c -> a
		for (int t = 0; t < k; t++) {
			a[left + t] = c[t];
		}
		
	}
	
	
	
	

}
