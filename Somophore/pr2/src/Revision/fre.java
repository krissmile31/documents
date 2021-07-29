package Revision;


public class fre {
	
	/**
	 * @requires a!= null /\ a.length >0 /\ for all x in a | x is integer /\ x % 2=1
	 * 			condition c is string of the form
	 * @effects
	 * array b of the same size with a
	 * 
	 * foreach element x in a
	 * if x satisfies c
	 * 		b[indexOf(a)] = frequency of x in a
	 * else
	 * 		b[indexOf(a)] = 0
	 * return b
	 * @author ADMIN
	 *
	 */
	public static int[] frequencyIf(int[] a, String c) {
		int[] b = new int[a.length];
		String[] condition = c.trim().split("\\s");
		String op = condition[0];
		int val = Integer.parseInt(condition[1]);
		
		
		for(int i=0; i< a.length; i++) {
			int freq=0;
		switch(op) {
		case "<=":
			if(a[i] > val) continue;
			for(int j=0; j< a.length; j++) {
				if(a[i] == a[j])
					freq++;
			}
			b[i] = freq;
			break;
		case ">=":
			if(a[i] < val) continue;
			
			for(int j = 0; j< a.length; j++) {
				if (a[i] == a[j])
					freq++;
			}
			b[i] = freq;
			break;
		case "|":
			if (a[i] % val != 0) continue;
		
			for (int j=0; j< a.length; j++) {
				if(a[i] == a[j])
					freq++;
			}
			b[i] = freq;
			break;
		
		}
	}
		return b;
	
	}
	public static void main(String[] args) {
		int[] a= {1,9,7,9,9,8};
		String c = "| 3";
		int[] b = frequencyIf(a, c);
		System.out.println(java.util.Arrays.toString(b));
	}

}
