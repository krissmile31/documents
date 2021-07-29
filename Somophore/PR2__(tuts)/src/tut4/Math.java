package tut4;

public class Math {
    
	
    /**
     *  determine the remainder after integer division using only subtraction. 
     * @require: d!=0
     * @effect:
     * 
     * while (i>d) 
     *   i = i - d
     *   return i 
     */
    public static int remainder(int i, int d)
    
        
   /**
    * determine the integer division using only addition and subtraction.
    * @require: d!=0
    * @effect:
    * count=0
    * while(i>d)
    *    i=i-d
    *    count++
    *   return count
    */         
     public static int div(int i, int d)       
            
    
   /**
    *  determine the middle one of three numbers
    * @requires: a!=b /\ b!=c /\ c!=a
    * @effects: 
    * mid = Math.max(Math.min(a,b), Math.min(Math.max(a,b),c));
    * 
    * return mid
    * 
    */          
     public static int middle(int a,int b, int c)     
             
                 
   /**
    * the main procedure
    * {@Link #remainder(int i, int d)}: obtain integers from user
    * {@Link #div(int i, int d)}: obtain integers from user
    * {@Link #middle(int a,int b, int c)}: obtain threes numbers from user
    * 
    */          
    public static void main(String[] args) 
