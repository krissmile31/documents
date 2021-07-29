package TestCase.GBT;

/**
 *		recursion
 */

static int fact(int n) {
	if (n < 1)
		return -1;
	else if (n == 1)
		return 1;
	else		// n > 1
		return n * fact(n-1);

}


// Ranges
//		n: (−∞; 1)			{1}			(1; +∞)
// TDSs
//		n: {-1, 1, 2, 3}
