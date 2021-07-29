package tut4;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;

import utils.AttrRef;
import utils.DOpt;
import utils.DomainConstraint;
import utils.NotPossibleException;
import utils.OptType;

/**
 * @overview <tt>PrimeList</tt> is a sub-type of
 *           <tt>LinkedList</tt> which contains a natural sequence of 
 *           prime numbers up to a given number.
 * 
 * @attributes
 *  max Integer
 *  
 * @object
 *  A typical PrimeList is {p1,p2,...,pn}, where pis are a 
 *  natural sequence of prime numbers.
 *  
 * @abstract_properties
 *  P_LinkedList /\ 
 *  for all p in elements. (p is a prime) /\
 *  elements are arranged in ascending order /\     
 *  mutable(max)=false /\ optional(max)=false /\ min(max)=1
 *  
 * @author dmle
 */
public class PrimeList extends LinkedList<Integer> {

  private static final int MIN_MAX = 1;
  
  @DomainConstraint(type="Integer",min=1)
  private Integer max;

  // constructor methods
  /**
   * @effects <pre>
   *            if max is valid
   *              initialise this as PrimeList bounded by max
   *            else
   *              throw NotPossibleException</pre>
   */
  public PrimeList(@AttrRef("max") Integer max) throws NotPossibleException {
    super();
    if (!validateMax(max))
      throw new NotPossibleException("PrimeList("+max+")");
    
    this.max = max;
  }

  public boolean repOK() {
//    if (!super.repOK()) 
//      return false;
    
    if (!validateMax(max))
      return false;
    
    // check that each element is a prime (slow)
    // and that they are arranged in natural sequence
    Iterator elements = iterator();
    Integer p;
    Integer prev = -1;
    while (elements.hasNext()) {
      p = (Integer) elements.next();
      if (p == null)
        return false; // null element
      
      if (prev != null && prev > p)
        return false; // not a natural sequence
      else
        prev = p;
      
      for (int i = 2; i < p; i++) {
        if ((p % i) == 0) // not a prime
          return false;
      }
    }
    
    return true;
  }

  /**
   * @modifies <tt>this</tt>
   * @effects return a generator that will produce all primes
   *          no bigger than <tt>max</tt>, if set, 
   *          as Integers, each exactly once, in ascending
   *          order and adds them to <tt>this</tt> 
   *          (i.e. <tt>this_post = this + primes</tt>)
   */
  @DOpt(type=OptType.ObserverIterator)
  @Override
  public Iterator<Integer> iterator() {
    return new PrimeGen();
  }
  
  /**
   * @effects 
   *  if max is valid
   *    return true
   *  else
   *    return false
   */
  private boolean validateMax(Integer max) {
    if (max != null && max.intValue() < MIN_MAX)
      return false;
    
    return true;
  }

  /**
   * @overview PrimeGen represents the generator for elements of 
   *           <tt>PrimeList</tt>
   * 
   * @abstract_properties
   *  for all p in elements. ((for all 2<=i<p). (p % i) != 0) /\
   *  for all integers i,j.
   *     (0 <= i < j < elements.size => 
   *        elements[i].intValue < elements[j].intValue) /\ 
   *  max != null -> (max.intValue >= 1 /\ 
   *                  for all i. elements[i] <= max.intValue) /\
   */
  private class PrimeGen implements Iterator<Integer> {

    /**
     * @effects <pre>
     *            if PrimeList.max is null OR PrimeList is empty
     *              return true
     *            else if there is prime between the last generated prime
     *              and max
     *              return true
     *            else
     *              return false</pre>
     */
    @Override
    public boolean hasNext() {
      if (max == null || size() == 0)
        return true;

      int size = size();
      int p = get(size - 1); // the last prime
      if (p == 2)
        p = 3;
      else
        p = p + 2;

      // look for a prime > p and <= max
      for (int n = p; n <= max; n = n + 2) {
        for (int i = 0; i < size; i++) {
          int q = get(i);
          if (n % q == 0)
            break; // not a prime
          if (q * q > n) { // have a prime
            return true;
          }
        }
      }

      return false;
    }

    /**
     * @effects return the next prime number no bigger than <tt>max</tt>
     *          as Integer 
     */
    @Override
    public Integer next() throws NoSuchElementException {
      if (size() == 0) {
        add(new Integer(2));
        return 2;
      } else {
        int size = size();
        int p = get(size - 1); // the last prime
        if (p == 2)
          p = 3;
        else
          p = p + 2;

        for (int n = p; ((max != null) ? (n <= max) : true); n = n + 2) {
          for (int i = 0; i < size; i++) {
            int q = get(i);
            if (n % q == 0)
              break; // not a prime
            if (q * q > n) { // have a prime
              add(new Integer(n));
              return n;
            }
          }
        }        
        throw new NoSuchElementException("PrimeList.elements");
      }
    }

    @Override
    public void remove() {
      // do nothing
    }
  } // end PrimeGen
}
