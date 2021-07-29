package TestCase.GBT;

/**
 * condition & loop
 */

static void myMethod(int n, int m) {
	for (int i = 1; i <= n; i++) {
		if (pred (i*m))
			m++;
	}
}

// n = 2
// i = {1, 2}

Choose m to satisfy these:
		
	pred(m) && pred(2m + 2)     n%2 == 2
	pred(m) && ¬pred(2m + 2)
	
	¬pred(m) && pred(2m)		n%2 == 0
	¬pred(m) && ¬pred(2m)
