package throwException;


/**
 * @effects <pre>
 * if n is non-positive
 * 		log error and return -1
 * else
 * 		returns the factorial of n
 * </pre>
 */
public static int computeFact(int n) {
	try {
		int f = fact(n);
		return f;
	} catch (NonPositiveException e) {
		System.err.println("Error: invalid input" + e.getMessage());
		return -1;
	}

}
