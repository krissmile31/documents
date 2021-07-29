package Design;


/**
 * @overview	
 * 	keep track of (un)interesting words
 * 	uninteresting from private file
 * 	interesting occur in document
 * @version (iteration)	1.0
 *
 */
class WordTable {
	
	/**
	 * @effects
	 * 	If not read uniteresting file
	 * 		throws NotPossibleException
	 *  else
	 *  	initialises this: all words in file
	 */
	WordTable() throws NotPossibleException

	
	
	/**
	 * @effects
	 * 	If w null/ nonword/ uninteresting
	 * 		return false
	 * 	else
	 * 		return true
	 */
	boolean isInteresting(String w)
	
	
	/**
	 * @requires	d not null
	 * @modifies	this
	 * @effects
	 * 		add interesting in d + occurrences
	 */
	void addDoc(Doc d)
	
}	// end WordTable
