package tut8;

import java.util.Vector;

import userlib.TextIO;
import utils.collections.Collection;
import utils.DOpt;
import utils.DomainConstraint;
import utils.OptType;

/**
 * @overview represents a set of even numbers
 * @attributes 
 * elements    Set<Integer>  ArrayList<Integer>
 * @object A typical EvenIntSet is s={x1,x2,...,xn} where x1,x2,..,xn are even numbers
 * 
 * @abstract_properties 
 * mutable(elements)=true   /\   optional(elements)g=false  /\
 * elements != {} → (for all x in elements. x is integer)  /\ 
 * elements != {} → (for all x, y in elements. x != y)
 *   
 * @author ADMIN
 */
public class EvenIntSet implements Collection{

    @DomainConstraint(type = "ArrayList", mutable = true, optional = false)
    private Vector<Integer> elements;

    /**
     * @effects initialize <tt>this</tt> to be empty
     */
    public EvenIntSet() {
        elements = new Vector<>();
    }

    /**
     * @modifies <tt>this</tt>
     * @effects<pre>
     * if x is already in this
     *    do nothing
     * else
     *    insert x to this 
     * </pre>
     */
    @DOpt(type = OptType.MutatorAdd)
    public void add(int x) {
        if (getIndex(x) < 0) {
            elements.add(x);
        }
    }

    /**
     * @modifies<tt>this</tt>
     * @effects <pre>
     * if x is not in this
     *    do nothing
     *else
     *    remove x from this
     * </pre>
     */
    @DOpt(type = OptType.MutatorRemove)
    public void remove(int x) {
        int i = getIndex(x);
        if (i < 0) {
            return;
        }
        elements.set(i, elements.lastElement());
		elements.remove(elements.size() - 1);
    }

    /**
     * @effects <pre>
     * if x is in this
     *    return true
     * else
     *    return false</pre>
     */
    @DOpt(type = OptType.ObserverContains)
    public boolean isIn(int x) {
        return (getIndex(x) >= 0);
    }

    /**
     * @effects <pre>
     * if this is empty
     *    throw an IllegalStateException
     * else
     *    return an arbitrary element of this</pre>
     */
    @DOpt(type = OptType.Observer)
    public int choose() throws IllegalStateException {
        if (size()==0) {
            throw new IllegalStateException("EvenIntSet.choose: set is empty");
        }
        return (Integer) elements.lastElement();

    }

    /**
     * @effects return the cardinality of <tt> this</tt>
     */
    @DOpt(type = OptType.ObserverSize)
    public int size() {
        return elements.size();
    }

    /**
     * @effects 
     * if this is not empty 
     *    return array Integer[] of elements of this
     * else 
     *    return null
     */
    @DOpt(type = OptType.Observer)
    public Integer[] getElements() {
        if (size()==0) {
            return null;
        } else {
            return elements.toArray(new Integer[size()]);
        }
    }

    /**
     * @effects<pre>
     * if x is in this
     *    return the index where x appears
     * else
     *    return -1</pre>
     */
    private int getIndex(int x) {
        for (int i = 0; i < elements.size(); i++) {
            if (x == elements.get(i)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        if (size() == 0) {
            return "EvenIntSet:{ }";
        }
        String s = "EvenIntSet:{ " + elements.get(0).toString();
        for (int i = 0; i < size(); i++) {
        	Integer x = elements.get(i);
        	if (x % 2 == 0)
        		s += " , " + x.toString();
        }
        s += " }";
        return s;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof EvenIntSet)) {
            return false;
        }
        return elements.equals(((EvenIntSet) o).elements);
    }

    /**
     * @effects<pre>
     * if this satisfies abstract properties
     *    return true
     * else
     *    return false</pre>
     */
    public boolean repOK() {
        if (elements == null)
            return false;
        else {
            for (int i = 0; i < size(); i++) {
                Integer x = elements.get(i);
                if (x % 2 == 1)
                    return false;
                else {
                    for (int j = i + 1; j < size(); j++) {
                        if (elements.get(j) == x) 
                            return false;
                    }
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
    	EvenIntSet even = new EvenIntSet();
    	TextIO.putln("Enter a array contains positive integers: ");
    	int evnum = TextIO.getInt();
    	even.add(evnum);
		TextIO.putln(even);	
  }
}
