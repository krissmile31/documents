package TestCase.BBT;


/**
 * @requires 		x >= 0  &&   .00001 < epsilon < .001
 * @effects
 * 		return n such that
 * 			x - epsilon < n^2 <= x + epsilon
 *
 */
public static float sqrt(float x, float epsilon) {

}

// Ranges
// 		x      : [0; +∞)
//      epsilon: (.00001; .001)
// TDSs
// 		x      : {0, 0.001, 0.01, 0.09, 0.5, 1, 2, 10, 100, 2147483600}
//		epsilon: {.00002, .0001, .0009}
