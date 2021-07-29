package iteratorMethod;

import java.util.Iterator;
import utils.DOpt;
import utils.OptType;

/**
 * @effects <pre>
 * if this is empty
 * 		throw EmptyException
 * else
 * 		return a generator -> produce all elements of this -> sequence
 * </pre>
 * 
 * @requires <tt> this </tt> must not be modified while generator is in use
 *
 */
@DOpt(type = OptType.ObserverIterator)
public Iterator<E> iterator() throws EmptyException {
	if (size() == 0) //empty
		throw new EmptyException("LinkedList.iterator");
	return new LinkedListGen();    // generator

}
