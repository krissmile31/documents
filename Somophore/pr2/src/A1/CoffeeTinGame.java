package A1;

import java.util.Arrays;
import utils.TextIO;

/**
 * @overview A program that performs the coffee tin game.
 * 
 * @author NgocAnh
 */
public class CoffeeTinGame {
  /** constant value for the green bean*/
  private static final char GREEN = 'G';
  /** constant value for the blue bean*/
  private static final char BLUE = 'B';
  /** constant for removed beans */
  private static final char REMOVED = '-';

  /**
   * the main procedure
   * @effects 
   *    initialise a coffee tin
   *    {@link TextIO#putf(String, Object...)}: print the tin content before playing
   *    {@link @tinGame(char[])}: perform the coffee tin game on tin
   *    {@link TextIO#putf(String, Object...)}: print the tin content again
   *    if last bean is correct
   *      {@link TextIO#putf(String, Object...)}: print its colour 
   *    else
   *      {@link TextIO#putf(String, Object...)}: print an error message
   */
  public static void main(String[] args) {
    // initialise some beans
    char[] beans = { GREEN, BLUE, BLUE, GREEN, GREEN };

    // count the number of greens
    int greens = 0;
    for (char b : beans) { 
      if (b == GREEN)
        greens++;
    }
    
    // the expected last bean
    final char last = (greens % 2 == 1) ? GREEN : BLUE;
    // beans.length > 0 /\ (greens % 2 = 1 -> last=GREEN) /\ 
    //    (greens % 2 = 0 -> last=BLUE)
    
    // print the content of tin before the game
    TextIO.putf("tin before: %s %n", Arrays.toString(beans));

    // perform the game
    char lastBean = tinGame(beans);
    // lastBean in beans /\ lastBean = last
    
    // print the content of tin and last bean
    TextIO.putf("tin after: %s %n", Arrays.toString(beans));
    
    // check if last bean as expected and print
    if (lastBean == last) { 
      TextIO.putln("last bean: " + lastBean);      
    } else {
      TextIO.putf("Oops, wrong last bean: %c (expected: %c)%n",lastBean,last);
    }
  }

  /**
   * Performs the coffee tin game to determine the colour of the last bean
   * 
   * @requires <tt>tin is not null /\ tin.length > 0</tt>
   * @modifies tin
   * @effects <pre>
   *          repeatedly remove two beans from tin and update tin as follows
   *          if are same colour
   *             throw both away, put one blue bean back
   *          else
   *             put green bean back
   *          if the number of green beans is even
   *            return blue
   *          else
   *            return green
   *          </pre> <br>  
   *           
   *      i.e.<br>
   *        <pre>
   *          (p0 = 0 /\ one blue left) \/ 
   *          (p0 = 1 /\ one green left), where p0 = initial green parity
   *        </pre>
   */
  public static char tinGame(char[] tin) {    
      int count = tin.length;
      while (count>=2){  
           // tin.length-count>=0
    	   takeTwo(tin); 
           updateTin(tin,takeTwo(tin)); 
           // count>=2
           // for all j=bean2 to tin.length-1. tin[j]!=REMOVED
           count--;
       }
      char LastBean=0 ;
      for (char last:tin)         {
          if (last!=REMOVED)  
              LastBean=last;
      }
      return LastBean;
   }
    
  
  /**
   * Takes as input the tin 
   *              returns as output the indices of two beans taken at random
   *              
   * @requires <tt>tin is not null /\ tin.length > 0</tt>
   * @modifies tin
   * @effects <pre>
   *           repeatedly remove two beans from tin
   *           create an array bean[2] to store two beans
   *                   that are taken out from tin
   *           remove two beans randomly
   *           return an array bean[2] that have indices of 2 taken beans in tin
   *           i.e. bean = [bean1, bean2 | bean1 !=bean2 /\ bean1 !=REMOVED /\
   *                  bean2 !=REMOVED /\ 0<= bean1,bean2 < tin.length]
   *          </pre>
   *          
   */
  public static int[] takeTwo(char[] tin) {
	  // intialize an array of 2 elements 
	  int[] bean = new int[2];
	  do {
           bean[0] = randInt(tin.length);
      }
      while (tin.length >= 2 && tin[bean[0]] == REMOVED);
	  do {
          bean[1] = randInt(tin.length);
      }
      while (tin.length >= 2 && tin[bean[1]] == REMOVED || bean[0] == bean[1]);
	  
      return bean;	  
  }
  
   /**
    * takes as input the tin /\ the output of takeTwo
    * updates the tin
    * 
    * @requires <tt>tin is not null /\ tin.length > 0</tt>
    * @modifies tin
    * @effects <pre>
    *          {@link #takeTwo()} repeatedly take out two beans from tin 
    *          Update the beans in the tin
    *            if they are the same color
    *              throw them both away
    *              put a blue bean back in
    *            else
    *              throw away the blue one
    *              put green bean back   
    *          
    *          </pre>
    */
  public static void updateTin(char[] tin, int[] bean) {
	    int bean1, bean2;
	    char bi1, bi2;
	    
	    // take the value of bean1, bean2 from the array bean
	    bean1=bean[0];
	    bean2=bean[1];
	    
	    // take the value of bi1, bi2 from the tin
	    bi1=tin[bean1];
	    bi2=tin[bean2];
	    
	    tin[bean1] = REMOVED;
	    tin[bean2] = REMOVED;
	    
	    //  if both are green
        //n=number of greens /\ m=number of blues /\ n+m=count
	    if (bi1==GREEN && bi2==GREEN)  
	    	//put a blue bean in
            tin[bean2]=BLUE;
       
        // if both are blue
	    else if (bi1==BLUE && bi2==BLUE)               
            //  put a blue bean in
            tin[bean2]=BLUE;
	    
	    // if one blue, one green
	    else 
	       //  put a green bean in
            tin[bean2]=GREEN;	   
  }
  
  /**
   * input a positive integer n 
   * output an integer number randomly selected from the range [0, n)
   * 
   * @requires <tt>n > 0</tt>
   * @effects <pre> x is selected from the range [0, n) randomly
   *          e.g.  x = [x | 0 <= x < n]
   *          </pre>
   */
  public static int randInt(int n) {
      int x = (int)(Math.random() * n);
      return x;

	     

  }
}