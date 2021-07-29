package a3_18010400155.fisi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import utils.AttrRef;
import utils.DOpt;
import utils.DomainConstraint;
import utils.EmptyException;
import utils.OptType;

/**
 * @overview SortedSet represents unbounded, sorted sets of Comparable objects; the objects are sorted in the ascending order based on the result of comparing them using the method Comparable.compareTo.
 * Specifically, for all s: SortedSet, o1, o2: Comparable, y = min(o1, o2), x = max(o1, o2): o1, o2 ∈ s ↔ x ∉  subset(s, first(s), y)
 * @attributes
 * elements 			SortedSet<Comparable>
 * @objects A typical SortedSet c = {x1, x2, ..., xn}, where x1, x2, ..., xn are elements.
 * @abstract_properties
 * mutable(elements) = true 		/\ 		optional(elements) = false
 * 
 * @author NgocAnh
 *
 */
public class SortedSet {
	
	@DomainConstraint(type = "List<Comparable", mutable = true, optional = false)
	private List<Comparable> elements;
	
	// constructor method
	/**
	 * @effects initialise this to be empty
	 */
	public SortedSet() {
		elements = new ArrayList<>();
	}
	
	/**
	 * @modifies this
	 * @effects <pre>
	 * if x is already in this
	 * 		do nothing
	 * else
	 * 		add x to this
	 * i.e this_post = this + {x}
	 * </pre>
	 */
	@DOpt(type = OptType.MutatorAdd) @AttrRef("elements")
	public void insert(Comparable x) {
		if (isIn(x))
			System.out.println("Element exist in SortedSet!");
		else {
			elements.add(x);
			
			// the elements are sorted as they are inserted into the set
			for (int j=0; j < elements.size(); j++) {
				for (int i=0; i < elements.size(); i++) {
					Comparable a = elements.get(j);
					Comparable b = elements.get(i);
					if (a.compareTo(b) < 0) {
						elements.set(j, b);
						elements.set(i, a);
					}
				}
			}
		}
	}
	
	/**
	 * @modifies this
	 * @effects <pre>
	 * if this is empty
	 * 		print error
	 * else if x is not in this
	 * 		print error
	 * else
	 * 		remove x from this
	 * i.e this_post = this - {x}
	 * </pre>
	 */
	@DOpt(type = OptType.MutatorRemove) @AttrRef("elements")
	public void remove(Comparable x) {
		if (elements.isEmpty())
			System.err.println("SortedSet is empty!");
		else if (isIn(x))
			elements.remove(x);
		else
			System.err.println("Element is not found!");
	}
	
	/**
	 * @effects <pre>
	 * if x is in this
	 * 		return true
	 * else
	 * 		return false
	 * </pre>
	 */
	@DOpt(type = OptType.ObserverContains) @AttrRef("elements")
	public boolean isIn(Comparable x) {
		return elements.contains(x);
	}
	
	/**
	 * @effects return the cardinality of this
	 */
	@DOpt(type = OptType.ObserverSize)
	public int size() {
		return elements.size();
	}
	
	/**
	 * @effects <pre>
	 * if this is empty
	 * 		throws EmptyException
	 * else
	 * 		return a generator that will produce all the elements of this in sequence. 
	 * </pre>
	 * 
	 * @requires <tt>this</tt> must not be modified while the generator is in use
	 */
	@DOpt(type = OptType.ObserverIterator)
	public Iterator<Comparable> iterator() throws EmptyException {
		if (size() == 0)
			throw new EmptyException("SortedSet.iterator: Set is Empty!");
		return new SortedSetGen<Comparable>();
	}

	@Override
	public String toString() {
		if (size() == 0)
			return "SortedSet: { }";
		String set = "SortedSet: {" + elements.get(0).toString();
		for (int s = 1; s < size(); s++)
			set += ", " + elements.get(s).toString();
		return set + "}";
	}
	
	/**
	 * @effects <pre>
	 * if this satisfies abstract properties
	 * 		return true
	 * else
	 * 		return false
	 * </pre>
	 */
	public boolean repOK() {
		if (elements == null)
			return false;
		for (int j = 0; j < elements.size(); j++) {
			Object x = elements.get(j);
			if (!(x instanceof Integer))
				return false;
			for (int i = j+1; i < elements.size(); i++) {
				if (elements.get(i).equals(x))
					return false;
			}
		}
		
		return true;
	}
	
	// Generator: SortedSet.SortedSetGen
	/**
	 * @overview SortedSet.SortedSetGen represent a generator of the elements of a SortedSet.
	 * @attributes
	 * indx			Integer
	 * @abstract_properties
	 * mutable(indx) = false 			/\ 			min(indx) = 0			/\ 		indx < SortedSet,size() 	/\
	 * SortedSetGen.new = [x1, ...] where each xi is in SortedSetGen.SortedSet and xis are arranged in same order as SortedSetGen.SortedSet's elements.
	 * 
	 */
	private class SortedSetGen<T> implements Iterator<Comparable> {
		@DomainConstraint(type = "Integer", mutable = false, min = 0)
		private int indx;			// next index
		
		// constructor method
		/**
		 * @effects initialise index equals 0
		 */
		public SortedSetGen() {
			indx = 0;
		}
		
		/**
		 * @effects <pre>
		 * if there are more elements to yield
		 * 		return true
		 * else
		 * 		return false
		 * </pre>
		 */
		@Override
		public boolean hasNext() {
			return indx < size();
		}
		
		/**
		 * @modifies this
		 * @effects <pre>
		 * if there are more results to yield
		 * 		returns the next result and modifies the state of this to record the yield
		 * else
		 * 		throws NoSuchElementException
		 * </pre>
		 */
		@Override
		public Comparable next() throws NoSuchElementException {
			if (hasNext()) {
				Comparable next = elements.get(indx);
				indx++;
				return next;
			}
			throw new NoSuchElementException("SortedSet.iterator");
		}
		
		@Override
		public void remove() {
			// do nothing
		}
	}

}
