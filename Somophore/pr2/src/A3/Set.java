package A3;

import java.util.Vector;
import utils.collections.Collection;
import utils.DomainConstraint;
import utils.DOpt;
import utils.OptType;

/**
 * @overview Set are mutable, unbounded sets of objects.
 * 
 * @attributes
 * objects    Set<Object>    Vector<Object>
 * 
 * @object A typical Set object is c = {x1,..., xn} where x1,..., xn are elements.
 * 
 * @abstract_properties
 * mutable(objects) = true  /\  optional(objects) = false  /\
 * objects != {} → (for all x in objects. x is Object)     /\
 * objects != {} → (for all x, y in objects. x != y)
 *
 * @author NgocAnh
 */
public class Set implements Collection<Object> {
	@DomainConstraint(type = "Vector", mutable = true, optional = false)
	private Vector<Object> objects;
	
	// constructor methods
	/**
	 * @effects initialize <tt> this </tt> to be an empty Set
	 */
	public Set() {
		objects = new Vector<>();     
	}
	
	/**
	 * @modifies <tt>this</tt>
	 * @effects <pre>
	 * if m already in this
	 *    do nothing
	 * else
	 *    add m to this
	 *    i.e. this_post = this + {m}
	 * </pre>
	 */
	@DOpt(type = OptType.MutatorAdd)
	public void add(Object m) {
		if (getIndex(m) < 0)
			objects.add(m);
	}
	
	/**
	 * @modifies <tt>this</tt>
	 * @effects <pre>
	 * if m is not in this
	 *    do nothing
	 * else
	 *    remove m from this
	 *    i.e. this_post = this - {m}
	 * </pre>
	 */
	@DOpt(type = OptType.MutatorRemove)
	public void remove(Object m) {
		int i = getIndex(m);
		if (i<0)
			return;
		objects.set(i, objects.lastElement());
		objects.remove(objects.size() - 1);
	}
	
	/**
	 * @effects <pre>
	 * if m is in this
	 *    return true
	 * else
	 *    return false
	 * </pre>
	 */
	@DOpt(type = OptType.ObserverContains)
	public boolean isIn(Object m) {
		return (getIndex(m) >= 0);
	}
	
	/**
	 * @effects return the cardinality of <tt>this</tt>
	 */
	@DOpt(type = OptType.ObserverSize)
	public int size() {
		return objects.size();
	}
	
	/**
	 * @effects <pre>
	 * if this is not empty
	 *    return array Object[] of elements of this
	 * else
	 *    return null
	 */
	@DOpt(type = OptType.Observer)
	public Object[] getObjects() {
		if (size() == 0)
			return null;
		return objects.toArray(new Object[size()]);
	}
	
	/**
	 * @effects <pre>
	 * if m is in this
	 *    return the index where m appears
	 * else
	 *    return -1
	 * </pre>
	 */
	private int getIndex(Object m) {
		for (int i=0; i < objects.size(); i++) {
			if (m.equals(objects.get(i)))
				return i;
		}
		return -1;
	}
	
	/**
	 * @effects <pre>
	 * if this is empty
	 *    throw an IllegalStateException
	 * else
	 *    return an arbitrary element of this
	 * </pre>
	 */
	@DOpt(type = OptType.Observer)
	public Object choose() throws IllegalStateException {
		if (size() == 0)
			throw new IllegalStateException("Set.choose: set is empty");
		return (Object) objects.lastElement();
	}
	
	// return String representation of Set object
	@Override
	public String toString() {
		if (size() == 0)
			return "Set: { }";
		
		String s = "Set: {" + objects.elementAt(0).toString();
		for(int i = 1; i < size(); i++)
			s = s + ", " + objects.elementAt(i).toString();
		return s + "}";
	}
	
	// determine equality of two Set objects based on the elements
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Set))
			return false;
		
		// use Vector.equals to compare elements
		Vector<Object> yourEls = ((Set)o).objects;
		return objects.equals(yourEls);
	}
	
	/**
	 * @effects <pre>
	 * if this satisfies abstract properties
	 *    return true
	 * else
	 *    return false
	 * </pre>
	 */
	public boolean repOK() {
		if (objects == null)
			return false;
		
		for(int i = 0; i < objects.size(); i++) {
			Object m = objects.get(i);
			
			for(int j = i+1; j < objects.size(); j++) {
				if (objects.get(j).equals(m))
					return false;
			}
		}
		return true;
	}
}
