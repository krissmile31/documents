package Design;
import utils.DomainConstraint;

/**
 * @overview	represents keyword search engines
 * 	An engine holds a mutable collection of documents - obtained from some given URLs
 * 	The engine is able to pocess keyword query 
 * 		-> search documents - contain keywords
 * 	The matching documents ranked based on keywords frequencies
 * 	The engine: private file - uninteresting words 
 * 
 * @attributes
 * wt	WordTable
 * tt	TitleTable
 * q	Query
 * 
 * @objects	a typical Engine object is d = <a, b, c> where wt(a), tt(b), q(c)
 * 
 * @abstract_properties
 * optional(wt) = false
 * optional(tt) = false
 * 
 * @version 	(iteration) 1.0
 *
 */
 class Engine {
	 @DomainConstraint(type = "WordTable", optional = false)
	 private WordTable wt;
	 
	 @DomainConstraint(type = "TitleTable", optional = false)
	 private TitleTable tt;
	 
	 @DomainConstraint(type = "Query")
	 private Query q;
	 
	 private String[] urls;
	 
	 
	 // need an abstraction -> represent engine
	 // -> create abstraction Engine
	 /**
	  * @effects
	  * If not retrievable uninteresting words
	  * 	throws NotPossibleException
	  * else
	  * 	creates	NonKeyword
	  * 	initialise app.state appropriately
	  */
	 Engine() throws NotPossibleException
	 
	 
	 // query: initial abstraction
	 /**
	  * @checks		w not in NonKeyword
	  * @effects
	  * 	Sets Keyword = {w}
	  * 	Match - documents match w, ordered as required
	  */
	 query(String w)
	 	// need an abstraction -> hold keyword + store matches
	 	// Keyword, NonKeyword: String
	 	/**
	 	 * @effects
	 	 * If WORD(w)= false / w in NonKeyword
	 	 * 		throws NotPossibleException
	 	 * else
	 	 * 		Keyword = {w}
	 	 * 		performs new query
	 	 * 		returns result
	 	 */
	 	Query queryFirst(String w) throws NotPossibleException
	 	
	 	
	 
	 // queryMore: initial abstraction
	 /**
	  * @checks		Key!= {} / w not in NonKeyword + Keyword
	  * @effects
	  * 	add w -> Keyword
	  * 	Match - documents already in Match additionally match w
	  * 	Orders Match properly
	  */
	 queryMore(String w)
	 	// need an abstraction -> hold keywords + store matches
	 	// -> create abstraction Query
	 	// Keyword, NonKeyword: String
	 	/**
	 	 * @effects
	 	 * If WORD(w) = false / Key = {} / w in NonKeyword/Keyword
	 	 * 		throws NotPossibleException
	 	 * else
	 	 * 		add w -> Keyword
	 	 * 		returns query result
	 	 */
	 	Query queryMore(String w) throws NotPossibleException
	 	
	 
	 	
	 // findDoc: initial abstraction
	 /**
	  * @checks		t in titles
	  * @effects
	  * 	return d in Document s.t d's title = t		
	  */
	 findDoc(String t)
	 	// need abstraction -> represent Document
	 	// -> uses abstraction Doc
	 	/**
	 	 * @effects
	 	 * 	If t not in Title
	 	 * 		throws NotPossibleException
	 	 * 	else
	 	 * 		returns document with title t
	 	 */
	 	Doc findDoc(String t) throws NotPossibleException
	 	
	 	
	 
	 	
	 // addDocuments: initial abstraction
	 /**
	  * @checks		u not name a site in URL that in provide documents
	  * @effects
	  * 	adds u -> URL, documents -> site u (new titles -> Document)
	  * 	If Keyword non-empty
	  * 		adds any documents match Keywords - Match
	  */
	 addDocuments(String u)
	 	// need an abstraction -> represent Document
	 	// -> create abstraction Doc
	 	/**
	 	 * @effects
	 	 * If u not URL site - documents / u in URL
	 	 * 		throws NotPossibleException
	 	 * else
	 	 * 		adds new documents -> Doc
	 	 * 			If no query
	 	 * 				return empty query result
	 	 * 			else
	 	 * 				returns query result - new matching documents
	 	 */
	 	Query addDocs(String u) throws NotPossbileException

} // end Engine
