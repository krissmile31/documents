package Search_algorithms;


public class LinearSearch {
	public int Linear_Search(int[] a, int n, int key) {
		int i = 0;
		boolean found = false;
		int pos = -1;
		while ((i < n) && (!found)) {
			if (a[i] == key) {
				found = true;
				pos = i;
				
			}i++;
		}
		return pos;
	}
	
}
