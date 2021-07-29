package Revision;

public class aaa {
	
	/**
	 * @requires a!= null /\ a.length>0 /\ for all x in a | x is integer. x%2=1
	 * condition c
	 * @effects
	 * array b with the same size of a
	 * foreach element x in a
	 * if x satisfies c
	 * 		b[indexOf(a)]= frequency x in a
	 * else
	 *  	b[indexOf(a)] = 0
	 *  return b
	 */
	public static int[] frequentlyIf(int[] a, String c) {
		int [] b= new int[a.length];
		String[] condition= c.trim().split("\\s");
		String op = condition[0];
		int val = Integer.parseInt(condition[1]);
		
		for(int i=0; i< a.length; i++) {
			int fre=0;
			switch(op) {
			case "<=":
				if(a[i] > val) continue;
				for(int j=0; j< a.length; j++) {
					if(a[i] == a[j])
					fre++;
				}
				b[i] = fre;
				break;
			case ">=":
				if(a[i]<val) continue;
				for(int j=0; j< a.length; j++) {
					if(a[i]==a[j])
						fre++;
				}
				b[i]=fre;
				break;
			case "|":
				if(a[i] % val != 0) continue;
				for(int j=0; j< a.length; j++) {
					if(a[i]==a[j])
						fre++;
					
				}
				b[i]=fre;
				break;
			}
			
		}
		return b;
	}
		
	}