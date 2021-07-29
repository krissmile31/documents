package tut4;

public class Arrays {
	

    /**
     *  count the number of elements of an array of integers that are negative
     * 
     * @requires a !=null /\ a.length >0. 
     * @effects<pre>
     * (post-conditon)
     * // return no.element in a those are negative
     * 
     * count = 0
     * for each element e in a 
     *    if a < 0
     *     count++
     * return count
     * i.e. result = [x in a | x < 0].length 
	 * e.g. a = [-4,-6,7,1] /\ countNegative(a) = [-4,-6].length = 2
     * </pre>
     */   
    public static int countNegatives(int[] a)
    
    
  /**
   * count the number of even elements of an array of positive integers
   * @requires a!=null /\ a.length >0 /\ elements in a >0
   * @modifies
   * @effects:<pre>
   * (post-condition)
   *  // return no.element in a1 those are even
   * count = 0
   * foreach element e in a 
   *   if a % 2 == 0
   *   count++
   * return count
   * i.e. result = [x in a | x = 2*k].length 
	 * e.g. a = [8, 5, 1] -> countEvents(a) = 1
   * </pre>
   */  
    public static int countEvens(int[] a)
            
                 
    /**
     * divide the elements of a real number array by a real number
     * @requires a != null /\ a.length >0 /\ x !=0 
     * @effects <pre>
     * (post-condition)
     *   // return a double of array which contains result of each element of a
     * 
     * x is a real number that is divided by a
     * if (x!=0)
     * foreach element e of a
     *    double e = e/x;
     * return e[]
     * </pre>
     */       
   public static double divArray(double[] a, double x) 
       
         
   /**
    * find the minimum element in an array of integers
    * @requires a !=null/\ a.length >0
    * @effects <pre>
    * (post-condition)
    * int min= a[0] 
     * foreach i in a
     *   if a[i] < min
     *      min = a[i]
     * return min
     * 
     * i.e. result = [x in a | x is the smallest ]
     * e.g. a =[4, 2, -3, 7, 5, 0] → min(a) = -3
	 * </pre>
	 */
   public static int min(int[] a)
          
                  
  /**
   * determine whether an array of integers is in ascending order
   *@requires: a !=null /\ a.length >0. 
   *@effects<pre>
   * foreach i in a
   * if a[i]>a[i+1]
   *   return false
   * else
   *   return true
   */
   public static boolean isAscSorted(int[] a)
           
           
   /**
	 * find the length of an array of CHARs
	 * 
	 * @requires a contains characters
	 * @effects 
	 * count the no.chars in a 
	 * i.e. results = [x in a | (x != NUL /\ a.indexOf("x") < a.indexOf("NUL"))].length 
	 * e.g. a = [a, f, o, NUL, p, t] = 3
	 */
	public static int length(char[] a)
	
	
   /**
    * the main procedure
    * {@Link #countNegatives(int[] a)}: obtain integers from user
    * {@Link #countEvens(int[] a)}: obtain integers from user
    * {@Link #float[] divArray(double[] a, double x)}: obtain real number from user
    * {@Link # min(int[] a)}: obtain integers from user
    * {@Link #isAscSorted(int[] a)}: print answer whether an array of integers is in ascending order.
    * {@Link #length(char[] a)}: find the length of an array of CHARs
    */         
    public static void main (String[] args)
   
