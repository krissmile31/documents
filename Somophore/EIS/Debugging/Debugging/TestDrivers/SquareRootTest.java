package TestDrivers;

/**
 * @overview 	A Test Driver for Num.sqrt method
 * @Bonus
 * 	data abstractions: ....Test
 * 	Steps:
 * 		initialise TDSs + TCs
 * 		initialise expected test result
 * 		test each unit
 *
 */
public class SquareRootTest {
	
	/**
	 * @modifies	System.out
	 * @effects
	 * 	for each test case TC = <x, e, r>
	 * 	if | Num.sqrt(x, e)^2 - r^2 | > e
	 * 		throws AssertionError
	 * 	else
	 * 		displays result on the standard output
	 */
	@Test		// (timeout = 5000)
	public void squareRoot() throws AssertionError {
		// ... (code omitted) ...
		
		
		// Test Cases
		// arrays -> initialise TCs <- generate TDSs
		float[] tcEps = {0.00002f, 0.0001f, 0.009f};
		float[] tcX = {0f, 0.001f, 0.01f, 0.09f, 0.5f, 1f, 2f, 10f, 100f, 2147483600f};
		
		
		// test Results
		// arrays -> initialise expected test results
		float[] results = new float[tcX.length];
		
		// loop -> run TC (for x)
		for (int i=0; i< tcX.length; i++) 
			results[i] = (float) Math.sqrt(tcX[i]);
		float x, e, r;		// for each TC = <x, e, r>
		
		// loop -> run each TC
		for (int i=0; i< tcX.length; i++) {
			x = tcX[i];			// TDS for x
			r = results[i];		// runned TC for X
			
			// loop -> run TC (for eps)
			for (int j=0; j< tcEps.length; j++) {
				System.out.println(">>Test Case " + ((i * tcEps.length) + j));
				e = tcEps[j];
				float result = Num.sqrt(x, e);
				
				
				// assume same delta error b/w 2 results
				assertEquals(r*r, result*result, 2*e);
				
				System.out.printf("sqrt(%f, %f) = %f" + "(expected = %f) %n", x, e, result, r);
				
			}
			
		}
		
	}

	private void assertEquals(float f, float g, float h) {
		// TODO Auto-generated method stub
		
	}

} // end squareRoot
