package tut5;

import utils.TextIO;

public class Arrays {

	// behaviour description
	/**
	 * count the number of elements of an array of integers that are negative
	 * 
	 * @requires(pre-condition) a !=null /\ a.length >0 
	 * @effects(post-conditon) 
	 * // return no.element in a those are negative
	 * 
	 * count = 0 
	 * foreach element x in a 
	 * if a < 0 
	 *   count++ 
	 * return count 
	 * i.e. result = [x in a | x < 0].length 
	 * e.g. a = [-4,-6,7,1] /\ countNegative(a) = [-4,-6].length = 2
	 */
	public static int countNegatives(int[] a) {
		int count=0;
		for (int x : a) {
			count=0;
			if (x < 0) {
				count++;
			}
		}
		return count;
	}
			
	/**
	 * count the number of even elements of an array of positive integers
	 * 
	 * @requires a!=null /\ a.length >0 /\ elements in a >0
	 * @effects 
	 * (post-condition) 
	 * // return no.element in a1 those are even count = 0
	 * 
	 * foreach element x in a 
	 *   if a % 2 == 0
	 *   count++
	 * return count
	 * i.e. result = [x in a | x = 2*k].length 
	 * e.g. a = [8, 5, 1] → countEvents(a) = 1
	 */
	public static int countEvens(int[] a) {
		int count = 0; 
		for (int x : a) { 
			if (x % 2 == 0) { 
				count++; 
			}
		}
		return count;
	}

	/**
     * divide the elements of a real number array by a real number
     * @requires a != null /\ a.length >0 /\ x !=0 
     * @effects <pre>
     * (post-condition)
     * // return a double of array which contains result of each element of a
     * 
     * x is a real number that is divided by a
     * if (x!=0)
     * foreach element e of a
     *    double e = e/x;
     * return e[]
     * </pre>
     */       
   public static double[] divArray(double[] a, double x) {
	   
	   for (int i=0; i<a.length-1; i++){
		   a[i] = a[i]/x;
	   }
	   if (x==0)
		   TextIO.putln("Invalid input!");
	   return a;
	   
   }
	
	
	
	/**
	 * find the minimum element in an array of integers
	 *  
	 * @requires a !=null/\ a.length >0 
	 * @effects(post-condition) 
	 * <pre> 
     * int min= a[0] 
     * foreach i in a
     *  if a[i] < min
     *    min = a[i]
     * return min
     * 
     * i.e. result = [x in a | x is the smallest ]
     * e.g. a =[4, 2, -3, 7, 5, 0] → min(a) = -3
	 * </pre>
	 */
	public static int min(int[] a) {
		int min = a[0];
		for (int i=0; i<a.length-1; i++) {
			if (min > a[i]) {
				min = a[i];
			}
		}
		return min;
	}

	
	/**
	   * determine whether an array of integers is in ascending order
	   * @requires: a !=null /\ a.length >0. 
	   * @effects<pre>
	   * foreach i in a
	   * if a[i] > a[i+1]
	   *  return false
	   * 
	   */
	   public static boolean isAscSorted(int[] a) {
		   for (int i=0; i<a.length-1; i++) {
			   if (a[i] > a[i+1])
				   return false;
		   }
		   return true;
	   }
	   
	   public static void sort(int [] a) {
		   boolean isSorted= false;
		   while(!isSorted) {
			   isSorted = true;
			   for (int i=0; i< a.length; i++) {
				   if (a[i] > a[i+1]) {
					   int tmp = a[i];
					  a[i] = a[i+1];
					  a[i+1] = tmp;
					  isSorted = false;
				   }
			   }
		   }
		  
	   }
	   public static void print_array(int [] a)
	    {
	        for (int i=0; i<a.length; i++)
	        {
	           System.out.print(a[i]+" ");
	        }        
	        System.out.println(" ");
	    }
	   
	   
	   /**
		 * find the length of an array of CHARs
		 * 
		 * @requires a contains characters
		 * @effects 
		 * count the no.chars in a 
		 * i.e. results = [x in a | (x != NUL /\ a.indexOf("x") < a.indexOf("NUL"))].length 
		 * e.g. a = [a, f, o, NUL, p, t] = 3
		 */
		public static int length(char[] a) {
			int count = 0;
			for (char c : a) {
				if (c != '\u0000') {
					count++;
				} else {
					break;
				}
			}
			return count;
		}

		
		/*
		 * create an array a from user input
		 * 
		 * @requires a contains integers
		 * @effects allow user input the elements of array and add them in a
		 * 
		 * return a
		 * 
		 */
		public static int[] getIntArray() {
			TextIO.putln("The number of integers in an array: ");
			int n = TextIO.getInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				TextIO.putf("a[%d]= ", i);
				a[i] = TextIO.getInt();
			}
			return a;
		}
	/*
	 * the main procedure
	 */
	public static void main(String[] args) {		
		boolean in = true;
		
		while (in) {
		TextIO.putln("1. Count negative numbers");
		TextIO.putln("2. Count even numbers");
		TextIO.putln("3. Divide a real number");
		TextIO.putln("4. Find minimum");
		TextIO.putln("5. Ascending order");
		TextIO.putln("6. Find length");
		TextIO.putln("0. Exit");
		TextIO.put("Your choice: ");
		int choice = TextIO.getInt();
		
			switch (choice) {
			case 1:
				TextIO.putln("1. Count negative numbers");
				int[] a = getIntArray();
				int result = countNegatives(a);
				TextIO.putln("countNegatives(" + java.util.Arrays.toString(a) + ")= " +result);
				TextIO.putln();
				break;

			case 2:
				TextIO.putln("2. Count even numbers");
				a = getIntArray();
				result = countEvens(a);
				TextIO.putln("countEvens(" + java.util.Arrays.toString(a) + ")= " +result);
				TextIO.putln();
				break;
            
			case 3:
				TextIO.putln("3. Divide a real number");
				TextIO.putln("The number of items in an array: ");
				int n = TextIO.getInt();
				double[] b = new double[n];
				for (int i = 0; i < n; i++) {
					TextIO.putf("b[%d]= ", i);
					b[i] = TextIO.getDouble();
				}
				TextIO.put("Enter real numer x= ");
				double x = TextIO.getlnDouble();
				double[] divB = divArray(b, x);
				TextIO.putln("divArray= [" + java.util.Arrays.toString(divB) + "]");
				TextIO.putln();
				break;
				
			case 4:
				TextIO.putln("4. Find minimum");
				a = getIntArray();
				result = min(a);
				TextIO.putln("min(" + java.util.Arrays.toString(a) + ")=" +result);
				TextIO.putln();
				break;

			case 5:
				TextIO.putln("5. Ascending order");
				a = getIntArray();
				boolean asc = isAscSorted(a);
				TextIO.putln("isAscSorted(" + java.util.Arrays.toString(a) + ")=" +asc);
				TextIO.putln();
				break;
				
			case 6: 
				TextIO.putln("6. Find length");
				TextIO.putln("The number of CHARACTERS in an array: ");
				int m = TextIO.getInt();
				char[] c = new char[m];
				for (int i = 0; i < m; i++) {
					TextIO.putf("c[%d]= ", i);
					c[i] = TextIO.getChar();
				}
				result = length(c);
				TextIO.putln("length(" + java.util.Arrays.toString(c) + ")=" +result);
				TextIO.putln();
				break;

			case 0:
				TextIO.putln("GoodBye!");
				in = false;
				break;
				
			default:
				TextIO.putln("Wrong input!\n");
				break;
			}
		}
	}

}