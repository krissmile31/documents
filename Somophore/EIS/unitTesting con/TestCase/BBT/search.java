package TestCase.BBT;


/**
 * @effects
 * if a is null
 * 		throws NullPointerException
 * else if x is not in a
 * 		throws NotFoundException
 * else
 * 		returns i such that a[i] = x
 *
 */
public static int search(int[] a, int x) {

}


// Ranges
// 		a: {null}		{[]}		{[x1, ..., xn] | xi are integers}
//		x: {y| y in a}			{y| y not in a}
// TDSs
//		a: {null, [], [1], [3, 1], [3, 1, 4], [3, 5, 1, 4]}
//		x: {1, 2}
