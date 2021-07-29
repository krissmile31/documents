package modelling;

/**
 * @attributes
 * 	appears-in: frequency
 *  Match: sumFeq
 */
public class attributesConstraint {
	
	/**
	 * appears-in: frequency is the count of occurrences of a word
	 * 	in a given document
	 * 
	 * for all d: Document, w: Word	[
	 * 		appears-in(w, d) => appears-in(w, d):
	 * 							frequency = |{k| k in d.body, k = w}|
	 * ]
	 */
	// appears-in.frequency constraint
	
	
	/**
	 * Match: sumFreq is the total count of occurrences of all 
	 * keywords in that document
	 * 
	 * 	for all q: Query, m: Match, d: Document	[
	 * 		hasMatch(q, m)		/\ 		refers-to(m, d)
	 * 		=> m.sumFreq = sum(appears-in(w, d): frequency),
	 * 		for all w in q
	 * ]
	 */
	//match.sumFreq constraint

}
