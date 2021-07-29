package Sort;

public class Heap_Sort {
	
	/**
	 * @effects binary tree
	 * child <= parent -> root is largest -> max-heap
	 * child >= parent -> root is smallest -> min-heap
	 * 
	 * left = 2i + 1
	 * right = 2i +2
	 * 
	 * HeapSort: build + swap root and last leaf
	 * BuildHeap: trickle down n/2 element
	 * TrickleDown: maxPos
	 */
	// RunningTime = Time build max-heap + (n-1)Time TrickleDown
	//                 O(n)                       (Ologn)
	//  O(nlogn)
	public static int leftChild(int i) {
		return 2*i + 1;
	}
	public static int rightChild(int i) {
		return 2*i + 2;
	}
	public static void HeapSort(int[] a) {
		int n = a.length;    
		BuildHeap(a, n);
		for (int i = n-1; i>0; i++) {    // last element (last leaf node)
			int tmp = a[0];    // swap root
			a[0] = a[i];
			a[i] = tmp;
			n--;
			TrickleDown(a, n, 0);
		}
	}
	public static void BuildHeap(int[] a, int n) {
		for (int i = n/2; i >= 0; i--) 
			TrickleDown(a, n, i);		
	}
	public static void TrickleDown(int[] a, int n, int i) {
		int l = leftChild(i);
		int r = rightChild(i);
		int maxPos = i;
		while (l<n && a[l] > a[maxPos])
			maxPos = l;
		while (r<n && a[r] > a[maxPos])
			maxPos = r;
		if (maxPos != i) {
			int tmp = a[i];
			a[i] = a[maxPos];
			a[maxPos] = tmp;
			TrickleDown(a, n, maxPos);
		}
	}
	

}
