package Revision;

public class math {
	
	/**
	 * sum of the elements of array a
	 * @requires a!= null /\ a.length >0
	 * @effects
	 * sum = 0
	 * foreach element x in a
	 * 		sum = sum + x
	 * return sum
	 * 
	 * e.g. a= [1, 2, 3] -> sum(a) = 6
	 */
	public static int sum (int[] a) {
		int sum =0;
		for (int i=0; i< a.length; i++)
			sum += a[i];
		return sum;
	}
	
	/**
	 * product of the elements in array
	 * @requires a!=null /\ a.length>0
	 * @effects
	 * product = 1
	 * foreach element x in a
	 * 		product = product * x
	 * return product
	 * 
	 * e.g. a = [1,2,3] -> product(a)=6
	 */
	public static int product(int[] a) {
		int product =1;
		for (int i=0; i< a.length; i++)
			product *= a[i];
		return product;
	}
	
	/**
	 * @requires a!=null /\ a.length>0
	 * @effects return sum(a)/product(a)
	 * 
	 */
	public static double computeArray(int[] a) {
		return sum(a)*1.0/product(a);
	}
	
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4};
		System.out.println(computeArray(a));
	}

}
