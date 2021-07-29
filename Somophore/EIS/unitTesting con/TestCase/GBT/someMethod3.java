package TestCase.GBT;

/**
 * condition & loop
 */

static int someMethod3(int x) {
	while (x > 0) {
		
		// check modulo 10
		if (x % 10 == 5)	break;
		x--;
	}
}


// Ranges
//		x: (-∞; 0]			(0; +∞)
//							{y| y = 10k + 5, k >= 0}
//							{y| y ≠ 10k + 5, k >= 0}
// TDSs
//		x: 	{ 0, 5, 15, 1, 2 }
