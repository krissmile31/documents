package TestCase.GBT;

/**
 * 		conditional
 */

static int maxOfThree(int x, int y, int z) {
	if (x > y) {
		if (x > z)
			return z;		// x > y & z
		else		// x <= z
			return x;		// z > x > y
	}
	else { 		// x <= y
		if (y >= z)
			return y; 		// y > x & z
		else 		// y < z
			return z; 		// z > y > x
	}
}


// Ranges (x, y, z)					TDSs

//		x > y, z					{(3, 2, 1), (3, 2, 2), (3, 1, 2)}						
		y>z, y=z, y<z
		
// 		z >= x > y					{(3, 2, 4), (3, 2, 3)}
		z>x, z=x
		
//		x, z <= y					{(1, 2, 2), (2, 2, 1), (1, 1, 1), (1, 2, 1)}
		x<z -> x<z<=y
		x>z -> z<x<=y
		x=z -> x=y=z / x=z<y
		
// 		x <= y < z					{(1, 2, 3), (1, 1, 2)}
		x<y, x=y
		

