package Search_algorithms;

public class Binary_Search {
	public static int BinarySearch(int[] a, int left, int right, int key) {
		if (left > right)
			return -1;
		else {
			int mid = (left + right) / 2;
			if (a[mid] < key)
				return BinarySearch(a, mid + 1, right, key);
			else if (a[mid] > key)
				return BinarySearch(a, left, mid - 1, key);
			else
				return mid;
		}
	}
}
