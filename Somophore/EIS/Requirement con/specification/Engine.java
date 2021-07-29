package specification;


/**
 * @overview	represents keyword search engines
 * 	A engine holds a mutable collection of documents - obtained
 * 	from some given URLs
 * 	The engine is able to pocess a keyword query -> search for documents
 * 	contain keywords
 * 
 *  The matching documents are ranked based on frequencies of keywords 
 *  found in them
 *  The engine has a private file - contain list of uninteresting words
 * 
 */
class Engine {
	
	/**
	 * @effects
	 * 	starts the engine running with NonKeyword - contain the words in
	 * 		in private file
	 * 	All other sets are empty.
	 */
	static startEngine() 
		
	
	/**
	 * @checks 		u does not name a site in URL
	 * 				u names a site - provide documents
	 * 
	 * @effects
	 * 	adds u -> URL
	 *  adds documents at site u -> new titles to Document
	 *  
	 *  If keyword -> non-empty
	 *  	adds any documents - match keywords -> Match
	 */
	addDocuments(String u)
	
	
	/**
	 * @checks	w is not in NonKeyword
	 * 
	 * @effects
	 * 	Sets Keyword = {w}
	 *  makes Match contain documents - match w, ordered as required
	 */
	query(String w)
	
	
	/**
	 * @checks 	Keyword != {}
	 * 			w not in NonKeyword
	 * 			w not in Keyword
	 * 
	 * @effects
	 * 	adds w -> Keyword
	 * 	makes Match - documents already in Match - additionally match w
	 * 	orders Match properly.
	 */
	queryMore(String w)
	
	
	/**
	 * @checks	t is in titles
	 * 
	 * @effects
	 * 		return d in Document s.t
	 * 		d's title = t
	 */
	findDoc(String t)
	

} // end Engine
