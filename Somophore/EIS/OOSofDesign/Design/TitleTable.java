package Design;


/**
 * @overview	keeps track of documents + titles
 * 
 * @author dmle
 * 
 * @version (iteration) 1.0
 *
 */
class TitleTable {
	
	/**
	 * @effects		initialises this to be empty
	 */
	TitleTable()
	
	
	
	/**
	 * @requires	d not null
	 * @modifies	this
	 * @effects
	 * 	If document, d's title already in this
	 * 		throws DuplicateException
	 * 	else
	 * 		adds d + title -> this
	 */
	void addDoc(Doc d) throws DuplicateException
	
	
	
	/**
	 * @effects
	 * 	If t null / no document title t
	 * 		throws NotPossbileException
	 * 	else
	 * 		returns document title t
	 */
	Doc lookUp(String t) throws NotPossibleException

} 	// end TitleTable
