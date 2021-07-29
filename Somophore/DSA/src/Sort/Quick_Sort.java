package Sort;

public class Quick_Sort {
	/**
	 * @effects divide and conquer algorithm
	 * choose pivot -> irrelevant
	 * take pivot for first position
	 * Partition: move a[down] till > pivot
	 *            move a[up] till < pivot
	 *            swap up and down -> repeat above steps -> down > up
	 *            swap up with pivot
	 */
	// O(n2)
	//   best + average: O(nlogn)
	public static void QuickSort(int[] a, int left, int right) {
		if (left < right) {
			int pos = Partition(a, left, right);
			QuickSort(a, left, pos-1);
			QuickSort(a, pos+1, right);
		}
	}
	public static int Partition(int[] a, int left, int right) {
		int down = left;
		int up = right;
		int pivot = a[left];
		
		while (down < up) { //index
			while (a[down] <= pivot && down<right)
				down++;
			while (a[up] > pivot)
				up--;
			if (down < up) {
				int tmp = a[down];
				a[down] = a[up];
				a[up] = tmp;
			}			
		}
		a[left] = a[up];
		a[up] = pivot;
		return up;		
	}
}
