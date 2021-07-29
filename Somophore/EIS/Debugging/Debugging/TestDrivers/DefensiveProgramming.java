package TestDrivers;


/**
 * @theory
 * 	check representation <-- repOK
 * 		  @requires
 * 	exhaustive testing
 *
 */
 static void DefensiveProgramming {
	 String s = Com.receive();
	 
	 if (s.equals("deliver"))
		 // carry out deliver request
	
	 else if (s.equals("examine"))
		 // carry out examine request
	
	 else
		 // handle error case: can never happen~!
		 assert false;

}
 
 
Assertion:
	enable : java -ea MyProgram
	disable: java -da MyProgram
