package Reflection;


/**
 * @effects <pre>
 * if n is non-positive
 * 		throws NotPossibleException
 * else
 * 		returns the factorial of n
 * </pre>
 */
public static void computeFact(int n) throws NotPossibleException {
	try {
		int f = fact(n);
		System.out.println(fact(n):: f);
	} catch (NonPositiveException e) {
		throw new NotPossibleException("Could not compute fact(n)");
	}

}
