package Revision;
import java.util.Vector;
import utils.DomainConstraint;
import utils.DOpt;
import utils.OptType;
import utils.collections.*;

/**
 * @overview NameSet are mutable, unbounded sets of String.
 * @attributes
 * names 		Set<String> 		Vector<String>
 * @object A typical NameSet object is c = {x1,...,xn} where x1,...,xn are elements.
 * @abstract_properties
 * mutable(names) = true /\ optional(names)= false /\
 * names != {} -> (for all x in names. x is String)
 * names !={} -> (for all x, y in names. x!=y)
 * @author NgocAnh
 *
 */
public class NameSet implements Collection{
	@DomainConstraint(type = "Vector", mutable= true, optional=false)
	private Vector<String> names;
	
	/**
	 * @effects initialise this to be empty
	 */
	public NameSet() {
		names = new Vector<>();
	}
	
	/**
	 * @modifies this
	 * @effects
	 * if x is already in this
	 * 		do nothing
	 * else
	 * 		add x to this
	 * i.e. this_post=this+{x}
	 */
	@DOpt(type=OptType.MutatorAdd)
	public void add(String x) {
		if(getIndex(x) < 0)
			names.add(x);
	}
	
	/**
	 * @modifies this
	 * @effects
	 * if x is not in this
	 * 		do nothing
	 * else
	 * 		remove x from this
	 * i.e. this_post=this-{x}
	 */
	@DOpt(type= OptType.MutatorRemove)
	public void remove(String x) {
		int i = getIndex(x);
		if (i<0)
			return;
		names.set(i, names.lastElement());
		names.remove(names.size() - 1);
	}
	
	/**
	 * @effects
	 * if x is inthis
	 * 		return true
	 * else
	 * 		return false
	 */
	@DOpt(type= OptType.ObserverContains)
	public boolean isIn(String x) {
		return (getIndex(x) >= 0);
	}
	
	/**
	 * @effects
	 * if this is empty
	 * 		throw an IllegalStateException
	 * else
	 * 		return an arbitrary of element of this
	 */
	@DOpt(type = OptType.Observer)
	public String choose() throws IllegalStateException{
		if(size() == 0)
			throw new IllegalStateException("NameSet.choose: set is empty");
		return (String) names.lastElement();
	}
	
	/**
	 * @effects return the cardinality of this
	 */
	@DOpt(type = OptType.ObserverSize)
	public int size() {
		return names.size();
	}
	
	/**
	 * @effects 
	 * if this is not empty
	 * 		return array String[] of this
	 * else
	 * 		return null
	 */
	@DOpt(type=OptType.Observer)
	public String[] getNames(String x) {
		if (size() == 0)
			return null;
		return names.toArray(new String[size()]);
	}
	
	/**
	 * @effects
	 * if x is in this
	 * return the index where x appeasr
	 * else
	 * return -1
	 * 
	 */
	private int getIndex(String x) {
		for (int i=0; i< size(); i++) {
			if (x.equals(names.get(i)))
				return i;
		}
		return -1;
	}
	
	@Override
	public String toString() {
		if (size() ==0)
			return "NameSet: { }";
		String s = "NameSet: {" + names.elementAt(0).toString();
		for(int i=0; i<size(); i++)
			s += "," + names.elementAt(i).toString();
		return s+"}";
	}
	
	@Override
	public boolean equals(Object o) {
		if(!(o instanceof NameSet))
			return false;
		return names.equals(((NameSet)o).names);
	}
	
	/**
	 * @effects
	 * if this satisfies abstract properties
	 * 		return true
	 * else
	 * 		return false
	 */
	public boolean repOK() {
		if (names == null)
			return false;
		
		for(int i=0; i<size(); i++) {
			String x = names.get(i);
			for(int j=i+1; j< size(); j++) {
				if (x.equals(names.get(j)))
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
	 * 		find and return the longest name
	 */
	public String maxName() {
		int index=0;
		int maxLength= names.elementAt(0).length();
		for(int i=0; i<size(); i++) {
			if (maxLength< names.elementAt(i).length()) {
				index = i;
				maxLength = names.elementAt(i).length();
			}
		}
		return names.elementAt(index);
	}
	
}