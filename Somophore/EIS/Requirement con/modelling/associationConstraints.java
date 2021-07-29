package modelling;

public class associationConstraints {
	
	
	// Document match Query
	/**
	 * A document matches a query if it contains all query keywords
	 * 
	 * for all q: Query, m: Match, d: Document	[
	 * 		hasMatch(q, m)		/\		refers-to(m, d)
	 * 		=> for all w in q (w in d.body)
	 * ]
	 */
	
	
	
	// Matches' ordering
	/**
	 * Matches are ordered by sum of keyword counts
	 * 
	 * for all q: Query, m1, m2: Match	[
	 * 		hasMatch(q, m1) 	/\ hasMatch(q, m2)	/\
	 * 		m1.sumFreq >= m2.sumFreq
	 * 		=> hasMatch(q, m1).index < hasMatch(q, m2).index
	 * 				// m1 > m2 -> m1 before first
	 */
}
