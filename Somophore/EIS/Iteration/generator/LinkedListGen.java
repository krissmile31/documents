package generator;

import utils.DomainConstraint;
import java.util.Iterator;


/**
 * @overview LinkedList.LinkedListGen represents a generator
 * of elements of an LinkedList
 * 
 * @attributes
 * ind 		Integer
 * 
 * @abstract_properties
 * mutable(ind) = false		/\ 		min(ind) = 0 /\
 * ind < LinkedList.size()  /\
 * LinkedListGen.new = [x1, ...] where each xi is in LinkedListGen.LinkedList
 * 				and xis are arranged in same order as LinkedListGen.LinkedList's elements
 *
 */
//private inner class
private class LinkedListGen<T> implements Iterator<E> {
	@DomainConstraint(type = "Integer", mutable = false, min = 0)
	private int ind;   // next index
	
	// constructor method 
	public LinkedListGen() {
		ind = 0;
	}
	
	@Override
	public boolean hasNext() {
		// check size
		return (ind < size());    // ind(index, min=0)  <  LinkedList.size()
	}
	
	@Override
	public E next() throws NoSuchElementException {
		if (hasNext()) {
			E next = get(ind);    //get 
			ind++;    // incremental index
			return next;     // return element at index ind
		}
		// throw exception if fail. message point to iterator
		throw new NoSuchElementException("LinkedList.iterator");
		}
	
	@Override
	public void remove() {
		// do nothing
	}
}





