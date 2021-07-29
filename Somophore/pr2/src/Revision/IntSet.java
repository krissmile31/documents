package Revision;
import java.util.Vector;
import utils.DomainConstraint;
import utils.DOpt;
import utils.OptType;
import utils.collections.Collection;
/**
 * @overview IntSet are mutable, unbounded sets of integers.
 * @attributes
 * elements		Set<Integer> 		Vector<Integer>
 * @object A typical IntSet object is c={x1,...,xn}, where x1,..., xn are elements.
 * @abstract_properties
 * mutable(elements) = true /\ optional(elements)= false/\
 * elements != {} -> (for all x in elements. x is integer)
 * elements != {} -> (for all x, y in elements. x!=y)
 * 
 * @author ADMIN
 *
 */
public class IntSet implements Collection { 
	@DomainConstraint(type = "Vector", mutable= true, optional = false)
	private Vector<String> elements;
	
	/**
	 * @effects initialise this to be empty
	 */
	public IntSet() {
		elements = new Vector<>();
	}
	
	/**
	 * @modifies this
	 * @effects 
	 * if x is already in this
	 * 		do nothing
	 * else
	 * 		add x to this
	 * i.e. this_post= this + {x}
	 */
	@DOpt(type = OptType.MutatorAdd)
	public void add(String x) {
		if (getIndex(x) < 0)
			elements.add(x);
	}
	
	/**
	 * @modifies this
	 * @effects
	 * if x is not in this
	 * 		do nothing
	 * else
	 * 		remove x from this
	 * i.e. this_post = this - {x}
	 */
	@DOpt(type = OptType.MutatorRemove)
	public void remove(String x) {
		int i = getIndex(x);
		if (i<0)
			return;
		elements.set(i, elements.lastElement());
		elements.remove(elements.size() - 1);
	}
	
	/**
	 * @effects
	 * if x is in this
	 * 		return true
	 * else
	 * 		return false
	 */
	@DOpt(type=OptType.ObserverContains)
	public boolean isIn(String x) {
		return (getIndex(x) >= 0);
	}
	
	/**
	 * @effects
	 * if this is empty
	 * 		throw an IllegalStateException
	 * else
	 * 		return an arbitrary element of this
	 */
	@DOpt(type = OptType.Observer)
	public String choose() throws IllegalStateException {
		if (size() == 0)
			throw new IllegalStateException("IntSet.choose: set is empty");
		return (String) elements.lastElement();
	}
	
	/**
	 * @effects return the cardinality of this
	 */
	@DOpt(type=OptType.ObserverSize)
	public int size() {
		return elements.size();
	}
	
	/**
	 * @effects
	 * if this is not empty
	 * 		return array Integer[] of this
	 * else
	 * 		return null
	 */
	@DOpt(type = OptType.Observer)
	public String[] getElements() {
		if (size() == 0)
			return null;
		return elements.toArray(new String[size()]);
	}
	
	/**
	 * @effects
	 * if x is in this
	 * 		return the index where x appears
	 * else
	 * 		return -1
	 */
	private int getIndex(String x) {
		for (int i=0; i< elements.size(); i++) {
			if (x.equals(elements.get(i)))
				return i;
		}
		return -1;
	}
	
	@Override
	public String toString() {
		if(size()==0)
			return "IntSet: { }";
		String s = "IntSet: {" + elements.elementAt(0).toString();
		for (int i=0; i< size(); i++)
			s += ", "+ elements.elementAt(i).toString();
		return s+ "}";
	}
	
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof IntSet))
			return false;
		return elements.equals(((IntSet)o).elements);
	}
	
	/**
	 * @effects
	 * if this satisfies abstract properties
	 * 		return true
	 * else
	 * 		return false
	 */
	public boolean repOK() {
		if (elements == null)
			return false;
		for(int i=0; i< elements.size(); i++) {
			String x = elements.get(i);
		for (int j=i+1; j< elements.size(); j++) {
			if (elements.get(j).equals(x))
				return false;
		}
		}
		return true;
		
	}
	
	/**
	 * @effects
	 * if this is empty
	 * 		return null
	 * else
	 * 		find and return the longest name in this
	 */
	public String maxName() {
		if (size()==0)
			return null;
		String maxName;
		int index = 0;
		int maxLength = elements.get(0).length();
		for(int i=0; i< size(); i++) {
			if (maxLength < elements.get(i).length()) {
				index = i;
				maxLength = elements.get(i).length();
				
			}	
		}
		maxName = elements.get(index);
		return maxName;
	}
}