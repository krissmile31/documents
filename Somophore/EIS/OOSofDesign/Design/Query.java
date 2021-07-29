package Design;


/**
 * @overview	a query: keywords(interest)
 * 	keywords (query) + documents match keywords
 * 	documents accessed indexes: 0 - size, ordered by matches
 * 	most matches: 0th
 * 	
 * @version	(iteration) 1.0
 *
 */
class Query {
	
	/**
	 * @requires	wt & w not null
	 * @effects		<(((returns an empty query)))>
	 * 
	 * 	initialises this - contain w
	 * 
	 * @pseudocode	<pre> --- implement sketch -----
	 * 		lookup key in wordTable
	 * 		sort matches -> quickSort
	 * </pre>
	 */
	Query(WordTable wt, String w)
	
	
	
	/**
	 * @effects		return count documents - match query
	 */
	int size()
	
	
	
	/**
	 * @effects
	 * 	If 0 <= i < size
	 * 		returns ith matching document
	 * 	else
	 * 		throws IndexOutOfBoundException
	 */
	Doc fetch(int i) throws IndexOutOfBoundException
	
	
	
	/**
	 * @effects		return keywords of this
	 */
	String[] keys()
	
	
	
	
	/**
	 * @requires	w not null
	 * @modifies	this
	 * @effects	
	 * 	If this empty/ w already keyword in this
	 * 		throws NotPossibleException
	 * 	else
	 * 		modifies this: w + all keywords in this
	 * 
	 * @pseudocode	<pre> --- implement sketch -----
	 * 		lookup new key in WordTable
	 * 		store matches ( hash table )
	 * 		for each current match
	 * 			if document( hash table )
	 * 				look up
	 * 				store in vector sort -> quickSort
	 * </pre>
	 */
	void addKey(String w) throws NotPossibleException
	
	
	
	
	/**
	 * @requires	d not null
	 * @odifies		this
	 * @effects
	 * 	If this empty + d: all keywords of this
	 * 		adds d -> this (query result)
	 * 	else
	 * 		do nothing	
	 */
	void addDoc(Doc d)
	
	

}	//end Query
