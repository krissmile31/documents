package TestDrivers;


/**
 * @effects		validate test results + defensive programming
 * 	initialise s
 * 	assert
 * 		s.repOK is true
 * 	otherwise
 * 		throws an AssertionError
 * 
 * 	assert
 * 		s has 2 elements
 * 	otherwise
 * 		throws AssertionError with message "invalid size ..."
 */
static boolean Assertion() {
	
	// initialise s
	IntSet s = ...;
	
	// assert that s.repOK true
	// otherwise throws an AssertionError
	assert (s.repOK() == true);
	
	// assert that s has 2 elements
	// otherwise throws AssertionError with message "invalid size..."
	assert (s.size() == 2) : "invalid size " + s.size();
	

}
