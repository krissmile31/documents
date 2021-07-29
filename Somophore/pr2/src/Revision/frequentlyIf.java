package Revision;

import utils.TextIO;

public class frequentlyIf {

	/**
	 * output an array of frequencies of elements satisfying a given condition
	 * 
	 * @requires a!=null /\ a.length > 0 /\ a = [e such that e in N* /\ e%2 = 1] 
	 * 		c has the form of "op val", e.g. ">=3"
	 * 
	 * @effects Let output b on array of same size with a 
	 * foreach element e in a 
	 * if e satisfies c 
	 * 		b[indexOf(e)] = frequency of e in a 
	 * else
	 *      b[indexOf(e)] = 0 
	 * return b
	 */
	public static int[] frequentlyI(int[] a, String c) {
		int[] b = new int[a.length];
		String[] condition = c.trim().split("\\s");
		String op = condition[0];
		int val = Integer.parseInt(condition[1]);

		for (int i = 0; i < a.length; i++) {
			int freq = 0;
			switch (op) {

			case ">=":
				if (a[i] < val) {
					
					continue;
				}

				for (int j = 0; j < a.length; j++) {
					if (a[i] == a[j]) {
						freq++;
					}
				}
				b[i] = freq;

			case "<=":
				if (a[i] > val) {
					continue;
				}
				
				for (int j = 0; j < a.length; j++) {
					if (a[i] == a[j]) {
						freq++;
					}
				}

				b[i] = freq;
				break;
			case "|":
				if (a[i] % val != 0) {
					
					continue;
				}
				
				for (int j = 0; j < a.length; j++) {
					if (a[i] == a[j])
						freq++;
				}
				b[i] = freq;
				break;
			}
		}
		return b;
	}

	public static void main(String[] args) {
		System.out.println("n=");
		int n = TextIO.getInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = TextIO.getInt();
		}
		System.out.println(java.util.Arrays.toString(a));
		String c = "| 3";
		int[] b = frequentlyI(a, c);
		System.out.println(java.util.Arrays.toString(b));
	}
}
