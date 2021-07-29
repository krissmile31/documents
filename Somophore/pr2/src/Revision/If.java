package Revision;
import utils.TextIO;
public class If {
	
	/**
	 * @requires a!=null /\ a.length >0
	 * @effects 
	 * k=1 /\ b=[a.length]
	 * for each element x and y in condition, continue if satisfying i = j with i, j are index of x and y respectively.
	 * if x = y
	 * 	  k++
	 *    b[i]=k  where i corresponds index of x in a
	 * else
	 *    b[i]=k  where i corresponds index of x in a
	 */
	public static int[] frequentlyIf(int[] a) {
		int k=1;
		int[] b = new int [a.length];
		for (int i=0; i< a.length; i++) {
			for (int j=0; j< a.length; j++) {
				if (i==j) continue;
				else {
					if(a[i] == a[j]) {
						k++;
						b[i] = k;
					}
					else
						b[i] = k;
				}
			}
		}
		return b;
	}
	public static void main(String[] args) {
		System.out.println("n=");
		int n = TextIO.getInt();
		int[] a= new int[n];
		for (int i=0; i<n; i++) {
			a[i] = TextIO.getInt();
		}
		int[] b = frequentlyIf(a);
		System.out.println(java.util.Arrays.toString(b));
	}

}
