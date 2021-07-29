package Revision;
import java.util.Vector;
import utils.DomainConstraint;
import utils.DOpt;
import utils.OptType;
import utils.collections.Collection;

/**
 * @overview Set are mutable, unbounded sets of objects.
 * @attributes
 * objects   	Set<Object>		Vector<Object>
 * @object A typical Set object is c = {x1,...,xn} where x1,...,xn are elements.
 * @abstract_properties
 * mutable(objects) = true /\ optional(objects) = false /\
 * objects != {} -> (for all x in objects. x is object) /\
 * objects != {} -> (for all x, y in eobjects. x!=y)
 * @author ADMIN
 *
 */
public class Set implements Collection {
	@DomainConstraint(type = "Vector", mutable= true, optional = false)
	private Vector<Object> objects;
	
	/**
	 * @modifies this
	 * @effects
	 * if x is already in this
	 * 		do nothing
	 * else
	 * 		add x to this
	 * i.e. this_post=this+{x}
	 */
	@DOpt(type = OptType.MutatorAdd)
	public void add(int x) {
		if (getIndex(x) < 0)
			objects.add(x);
	}
	
	/**
	 * @modifies this
	 * @effects
	 * if x is not in this
	 * 		 do nothing
	 * else
	 * 		remove x from this
	 * i.e. this_post=this-{x}
	 */
	@DOpt(type=OptType.MutatorRemove)
	public void remove(int x) {
		int i = getIndex(x);
		if (i<0)
			return;
		objects.set(i,s objects.lastElement());
		objects.remove(objects.size() - 1);
	}
	
	/**
	 * @effects
	 * if x is in this
	 * 		return true
	 * else
	 * 		return false
	 */
	@DOpt(type=OptType.ObserverContains)
	public boolean isIn(int x) {
		return (getIndex(x) >= 0);
	}
	
	/**
	 * @effects
	 * if this is empty
	 * 		throw an IllegalStateException
	 * else
	 * 		return an arbitrary element of this
	 */
	@DOpt(type= OptType.Observer)
	public Object choose() throws IllegalStateException{
		if(size()==0)
			throw new IllegalStateException("Set.choose: set is empty");
		return (Object) objects.lastElement();
	}
	
	/**
	 * @effects return the cardinality of this
	 */
	@DOpt(type=OptType.ObserverSize)
	public int size() {
		return objects.size();
	}
	
	/**
	 * @effects
	 * if this is not empty
	 * 		return array Object[] of this
	 * else
	 * 		return null
	 */
	@DOpt(type=OptType.Observer)
	public Object[] getObjects() {
		if(size() ==0)
			return null;
		else
			return objects.toArray(new Object[size()]);
	}
	
	/**
	 * @effects
	 * if x is in this
	 * 		return the index where x appears
	 * else
	 * 		return -1
	 */
	private int getIndex(Object x) {
		for(int i=0; i< objects.size(); i++) {
			if (x.equals(objects.get(i)))
				return i;
		}
		return -1;
	}
	
	@Override
	public String toString() {
		if (size()==0)
			return "Set: { }";
		String s = "Set:{" + objects.elementAt(0).toString();
		for(int i=1; i< size(); i++)
			s += "," + objects.elementAt(i).toString();
		return s + "}";
	}
	
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Set))
			return false;
		return objects.equals(((Set)o).objects);
	}
	
	/**
	 * @effects
	 * if this satisfies abstract properties
	 * 		return true
	 * else
	 * 		return false
	 */
	public boolean repOK() {
		if (objects == null)
			return false;
		for(int i=0; i< objects.size(); i++) {
			Object x = objects.get(i);
			for(int j=i+1; j< objects.size(); j++) {
				if (objects.get(i).equals(x))
					return false;
			}
			
	}
		return true;
	}
}
