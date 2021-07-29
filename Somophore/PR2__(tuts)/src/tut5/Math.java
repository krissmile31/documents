package tut5;

import utils.TextIO;

public class Math {
	
	
	/**
     * determine the remainder after integer division using only subtraction. 
     * @requires d!=0
     * @effects
     * while (i>d) 
     *   i = i - d
     *   return i 
     */
    public static int remainder(int i, int d) {
    	while (i > d)
    		i = i - d;
    	return i;
    }
    
        
   /**
    * determine the integer division using only addition and subtraction.
    * @requires d!=0
    * @effects
    * count=0
    * while(i >= d)
    *    i=i-d
    *    count++
    * return count
    */         
     public static int div(int i, int d) {
    	 int count = 0;
    	 while (i >= d) {
    		 i = i - d;
    		 count++;
    	 }
    	 return count;
     }
            
    
   /**
    * determine the middle one of three numbers
    * @requires a!=b /\ b!=c /\ c!=a
    * @effects 
    * mid = Math.max(Math.min(a,b), Math.min(Math.max(a,b),c));
    * return mid
    */          
     public static int middle(int a,int b, int c) {
    	// Checking for b 
    	 if ((a < b && b < c) || (c < b && b < a)) 
    	       return b; 
    	    // Checking for a 
    	 else if ((b < a && a < c) || (c < a && a < b)) 
    	       return a; 
         else
    	       return c; 
     }
	

	public static void main(String[] args) {
		boolean in = true;
		while (in) {
		TextIO.putln("1. Determine the remainder");
		TextIO.putln("2. The integer divison");
		TextIO.putln("3. The middle");
		TextIO.putln("4. Exit");
		TextIO.putln("Your choice: ");
		int choice = TextIO.getInt();
		
			switch(choice) {
			case 1:
				TextIO.putln("1. Determine the remainder");
				TextIO.put("i= ");
				int i = TextIO.getInt();
				TextIO.put("d (d<i) = ");
				int d = TextIO.getInt();
				TextIO.putln("i % d = " + remainder(i, d));
				TextIO.putln();
				break;
				
			case 2: 
				TextIO.putln("2. Determine the integer divison");
				TextIO.put("i= ");
				i = TextIO.getInt();
				TextIO.put("d (d<i) = ");
				d = TextIO.getInt();
				TextIO.putf("div(%d, %d)= %d\n",i , d, div(i,d));
				TextIO.putln();
				break;
				
			case 3:
				TextIO.putln("3. Determine the middle one of three numbers");
				TextIO.put("a= ");
				int a = TextIO.getInt();
				TextIO.put("b= ");
				int b = TextIO.getInt();
				TextIO.put("c= ");
				int c = TextIO.getInt();
				TextIO.putf("middle(%d, %d, %d)= %d\n", a, b, c, middle(a, b, c));
				TextIO.putln();
				break;
			
			case 4:
				TextIO.putln("Goodbye!");
				in = false;
				break;
			
			default:
				TextIO.putln("Wrong input!\n");
				break;
			}
		}
		
	
	}

}
