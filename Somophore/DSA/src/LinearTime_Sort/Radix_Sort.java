package LinearTime_Sort;

public class Radix_Sort {
	
	/** (column_sort)
	 * @effects
	 * 
	 */
	// O(k(n+10))
	// O(p(n+b))
	public static void RadixSort(int[] a, int[] b, int k) {
		int n= a.length;
		for (int i = 1; i<=k; i++) {
			Column_Sort(a, b, i);
			for(int j = 0; j<n; j++)
				a[j] = b[j];
		}
	}
	public static int Digit(int x, int d) {
		int p = 1;
		for (int i = 0; i< d-1; i++)
			p = p * 10;
		return (x/p) % 10;
	}
	public static void Column_Sort(int[] a, int[] b, int d) {
		int[] c = new int[10];
		int n = a.length;
		for(int i = 0; i<= 9; i++)
			c[i] = 0;
		for(int i = 0; i<n; i++) {
			int dg = Digit(a[i], d);
			c[dg]++;
		}
		for(int i = 0; i<=9; i++)
			c[i] = c[i] + c[i-1];
		for(int i = n-1; i>=0; i--) {
			int dg = Digit(a[i], d);
			b[c[dg] - 1]= a[i];
			c[dg]--;
		}
		
	}
		
	}