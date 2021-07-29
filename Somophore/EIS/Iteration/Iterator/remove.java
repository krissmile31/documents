package Iterator;


/**
 * @effects remove from underlying collection
 * 			the last element returned by the call to next
 * 
 * if remove is not supported
 * 			throw UnsupportedOperationException
 * if next has not yet been called 
 * 	  remove has already been called after the last call to next
 * 			throw IllegalStateException
 * 
 * the behavior is unspecified if underlying collection is modified 
 * while iteration in progress in anyway other than by calling
 *  this method
 *
 */
public void remove() throws UnsupportedOperationException, IllegalStateException {

}

// optional
// use for modifiable collections
// @modifies
