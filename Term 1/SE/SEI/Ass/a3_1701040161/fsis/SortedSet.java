package a3_1701040161.fsis;

import java.util.Collections;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Vector;

import utils.AttrRef;
import utils.DOpt;
import utils.DomainConstraint;
import utils.EmptyException;
import utils.OptType;

/**
 * @overview SortedSet are mutable, sets of elements
 * @attributes elements Set <Comparable> Vector <Comparable>
 * 
 * @object A typical SortedSet object is a={x1,...,xn},where x1,...,xn are
 *         elements
 * 
 * @abstract properties mutable(elements) = true /\ optional(elements) =false /\
 *           for all x in elements. x is integer /\for all x,y in elements . x
 *           neq y
 * 
 * @author tungpd
 */

public class SortedSet {
	@DomainConstraint(type = "Vector", mutable = true, optional = false)
	private Vector<Comparable> elements;

	/**
	 * @effects
	 * 
	 *          <pre>
	 * initialize <tt>this</tt> to be a new Vector
	 * thats fine
	 *          </pre>
	 */

	@DOpt(type = OptType.Constructor)
	public SortedSet() {
		elements = new Vector<>();
	}

	/**
	 * @param d
	 * @modifies <tt>this</tt>
	 * @effects
	 * 
	 *          <pre>
	*      if d is not in this 
	*        add d to this
	*      else 
	*    print out error message
	 *          </pre>
	 */
	@DOpt(type = OptType.MutatorAdd)
	@AttrRef("d")
	public void insert(Comparable d) {
		if (lookUp(d) == false) {
			elements.add(d);
			Collections.sort(elements);
		} else {
			System.err.println(" Error ! ");
		}
	}

	/**
	 * @param d
	 * @modifies <tt>this</tt>
	 * @effects return the index where d appears
	 * @return
	 */
	@DOpt(type = OptType.Observer)
	@AttrRef("d")
	public int getIndex(Comparable d) {
		return elements.indexOf(d);
	}

	/**
	 * @effects return the size of <tt>this</tt>
	 * @return
	 */
	@DOpt(type = OptType.ObserverSize)
	public int getSize() {
		return elements.size();
	}

	/**
	 * @param d
	 * @modifies <tt>this</tt>
	 * @effects
	 * 
	 *          <pre>
	 *     if d is already in this 
	 *         remove d from this 
	 *       else 
	 *        print out error message
	 *          </pre>
	 */
	@DOpt(type = OptType.MutatorRemove)
	@AttrRef("d")
	public void remove(Comparable d) {
		if (lookUp(d) == true) {
			elements.remove(d);
			Collections.sort(elements);
		} else {
			System.err.println(" Error ! ");
		}
	}

	/**
	 * @effects
	 * 
	 *          <pre>
	 *   if this satisfies abstract properties
	 *              return true 
	 *            else
	 *     return false
	 *          </pre>
	 * 
	 * @return
	 */
	public boolean repOK() {
		for (int i = 0; i < elements.size(); i++) {
			if (elements.get(i) == null)
				return false;
			if (!(elements.get(i) instanceof Comparable))
				return false;
		}
		return true;
	}

	@DOpt(type = OptType.Default)
	@Override
	public String toString() {
		if (getSize() == 0)
			return "SortedSet is empty";
		String n = " ";
		for (int i = 0; i < getSize(); i++) {
			n = n + elements.get(i).toString();
		}
		return "SortedSet :" + n;
	}

	/**
	 * @param d
	 * @modifies <tt>this</tt>
	 * @effects
	 * 
	 *          <pre>
	 * 	
	 * if d is already in this 
	 * return true
	 *          </pre>
	 * 
	 * @return
	 */
	@DOpt(type = OptType.ObserverContains)
	@AttrRef("d")
	public boolean lookUp(Comparable d) {
		return getIndex(d) >= 0;
	}

	/**
	 * @modifies <tt>this</tt>
	 * @effects
	 * 
	 *          <pre>
	 *  if this  is empty 
	 * 	 throw EmptyException
	 *  else
	 * 	 return SortedSetGen()
	 *          </pre>
	 * 
	 * @return
	 */
	@DOpt(type = OptType.ObserverIterator)
	public Iterator<Comparable> iterator() throws EmptyException {
		if (elements.size() == 0) {
			throw new EmptyException("empty elements ");
		} else {
			return new SortedSetGen();
		}
	}

	/**
	 * @modifies <tt>this</tt>
	 * @effects
	 * 
	 *          <pre>
	 * 	if this  is empty 
	 * throw EmptyException
	 * 	else
	 * return SortedSetGen()
	       * &#64;return
	 *          </pre>
	 */
	@DOpt(type = OptType.ObserverIterator)
	public Iterator<Comparable> elements() throws EmptyException {
		if (elements.size() == 0) {
			throw new EmptyException("SortedSet.elements(): No element ");
		} else {
			return new SortedSetGen();
		}
	}

	private class SortedSetGen implements Iterator<Comparable> {
		private int index;

		/**
		 * @effects
		 * 
		 *          <pre>
		 * if there are more elements to yield 
		 * 			return true
		 * else
		 * return false
		 *          </pre>
		 */
		@Override
		public boolean hasNext() {
			if (index < elements.size()) {
				return true;
			} else {
				return false;
			}
		}

		/**
		 * @effects
		 * 
		 *          <pre>
		 * 		if there are more result to yield
		 *	returns the next result
		 * 		and modifies the state of this to record the yield
		 * 		else
		 * 			throw NoSuchElementException
		 *          </pre>
		 */
		@Override
		public Comparable next() throws NoSuchElementException {
			if (hasNext() == true) {
				Comparable nexte = elements.get(index);
				index++;
				return nexte;
			} else {
				throw new NoSuchElementException();
			}
		}
	}
}
