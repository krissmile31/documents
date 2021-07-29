package tut4;

import java.util.Vector;

import utils.DomainConstraint;

/**
 * @overview <tt>IntQueue</tt> is a sequence of integers that has an upper bound on the number 
 *    of integers that can be stored. 
 * @attributes
 *  maxSize   Integer       
 *  elements  Queue<Integer>  Vector<Integer>
 * @object
 *  A typical IntQueue is <n,els>, where maxSize(n) and elements(els).
 * @abstract_properties
 *  mutable(maxSize)=false /\ optional(maxSize)=false /\ min(maxSize)=1 /\
 *  elements is a sequence of Integers /\ 
 *  mutable(elements)=true /\ optional(elements)=false /\ 
 *  size(elements) <= maxSize /\
 *  for all x, y in elements. x is added before y -> x is removed before y.
 *  
 * @author dmle
 */
public class IntQueue {
  @DomainConstraint(type="Vector",optional=false)
  private Vector elements;
  @DomainConstraint(type="Integer",mutable=false,optional=false,min=1)
  private int maxSize;

  /**
   * @effects
   *   if n is valid
   *     initialise this as <n,[]>
   *   else
   *     print error "invalid queue bound value"
   */
  public IntQueue(int n) {
    if (n <= 0)
      System.err.println("IntQueue.init: invalid queue bound value");
    
    maxSize = n;
    elements = new Vector(maxSize);
  }

  /**
   * @modifies this
   * @effects
   *   if size(elements) < maxSize
   *     add x to the first position of this, i.e. elements_post = [x,elements]
   *   else
   *     print error "queue is full"
   */
  public void enq(int x) {
    int size = size();
    if (size == maxSize) {
      System.err.println("IntQueue.enq: queue is full");
      return;
    }

    if (size == 0) { // first element of the queue
      elements.add(x);
    } else { // subsequent element
      elements.add(0,x);      
    }
  }

  /**
   * @modifies this
   * @effects
   *   if size(elements) > 0
   *     remove the last element of this and return it, i.e.
   *       elements = [head,n] -> result = n /\ elements_post = [head]
   *   else
   *     print error "empty queue"
   *     return null
   */
  public Integer deq() {
    if (isEmpty()) {
      System.err.println("IntQueue.deq: empty queue");
      return null;
    } else {
      return ((Integer) elements.remove(elements.size()-1));
    }
  }
  
  /**
   * @effects return size(elements)
   */
  public int size() {
    return elements.size();
  }
  
  /**
   * @effects
   *  if size(elements) = 0
   *     return true
   *   else 
   *     return false
   */
  public boolean isEmpty() {
    return elements.size()==0;
  }

  /**
   * @effects
   *   if size(elements) = maxSize
   *     return true
   *   else 
   *     return false
   */
  public boolean isFull() {
    return (elements.size() == maxSize);
  }
      

  /**
   * @modifies this
   * @effects
   *   remove all items in elements, i.e. elements_post=[]
   */
  public void clear() {
    elements.clear();
  }
  
  @Override
  public String toString() {
    if (elements.size() == 0)
      return "IntQueue:[]";
    
    String s = "IntQueue: [" + elements.elementAt(0).toString();
    for (int i = 1; i < size(); i++) {
      s = s + " , " + elements.elementAt(i).toString();      
    }
    
    return s + "]";      
  }
  
  /**
   * @effects   <pre>
   *              if this satisfies the rep invariant
   *                return true
   *              else 
   *                return false</pre>
   */
  public boolean repOK() {
    if (elements == null || maxSize <= 0 || size() > maxSize) 
      return false;
    else
      return true;    
  }
}