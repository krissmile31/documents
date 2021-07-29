package tut9;

public class Program2 {
	/**
	 * The run method
	 * 
	 * Stack: x, y, z, j(null)
	 * Heap:  int[] x = { 1, 3, 5 };
	          int[] y = { 1, 2, 3, 4 };
	          int[] z = { 1, 2, 3, 4 };
	 */
	 public static void main(String[] args) {
	 int[] x = { 1, 3, 5 };
	 int[] y = { 1, 2, 3, 4 };
	 int[] z = y;
	 int j;
	 for (int i = 0; i < x.length; i++) {
		 for (j = 1; j < z.length; j++) {
			 z[j] = z[j] + z[j - 1];
			 }
			 x[i] = x[i] * z[j-1];

			 System.out.println(x[i]);
			 }

			 for (int i = 0; i < y.length; i++)
			 System.out.println(y[i]);
			 }	
	 }
     /**
      * the program states in the stack and heap memories when the code is run:
      * Stack: x, y, z
      * Heap: int[] x = {10, 60, 175}
              int[] y = {1, 5, 15, 35}
              int[] z = {1, 4, 15}
      */

    /**
     * the console output after running the program: 
        10
        60
        175
        1
        5
        15
        35
     */
    

     
