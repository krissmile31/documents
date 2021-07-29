package Revision;
import utils.DomainConstraint;

/**
 * @overview IntegerArray is a fixed sequence of integer numbers.
 * @attributes
 * array   		Integer[]		int[]
 * len			Integer			int
 * @object A typical IntegerArray is [x1, x2,..., xn] where xi is integer for all 1 <= i <= n.
 * @abstract_properties
 * mutable(array) = true /\ optional(array) = false /\
 * mutable(len) = false /\ optional(len) = false /\ min(len) = 1 /\
 * lenth(array) = len
 * @author ADMIN
 *
 */
public class IntegerArray {
	@DomainConstraint(type= "Integer[]", mutable= true, optional = false)
	private int[] array;
	
	@DomainConstraint(type= "Integer", mutable= false, optional = false, min = 1)
	private int len;
	
	/**
	 * An empty constructor used to clone objects
	 * @effects initialise this as:<>
	 */
	private IntegerArray() {
		// do nothing
	}
	
	/**
	 * @effects
	 * if array is valid
	 * 		len = array.length
	 * 		initialise this as <array, len>
	 * else
	 * 		initialise this as <> and print error
	 */
	public IntegerArray(int[] array) {
		if (!validateArray(array)) {
			System.err.println("Invalid array!");
			return;
		}
		this.array = array;
		computeLen();
	}
	
	/**
	 * @effects
	 * if array is valid
	 * 		set this.array = array
	 * 		invoke computeLen
	 * 		return true
	 * else
	 * 		return false
	 */
	public boolean setArray(int[] array) {
		if (validateArray(array)) {
			this.array = array;
			computeLen();
			return true;
		}
		return false;
	}
	
	/**
	 * @effects set len = array.length
	 */
	private void computeLen() {
		this.len = this.array.length;
	}
	
	/**
	 * @effects return this.array
	 */
	public int[] getArray() {
		return this.array;
	}
	
	/**
	 * @effects return this.len
	 */
	public int getLen() {
		return this.len;
	}
	
	/**
	 * @effects
	 * if array is valid
	 * 		return true
	 * else
	 * 		return false
	 */
	private boolean validateArray(int[] array) {
		if (array.length < 1)
			return false;
		return true;
	}
	
	/**
	 * @effects
	 * if this satisfies abstract properties
	 * 		return true
	 * else
	 * 		return false
	 */
	public boolean repOK() {
		return validateArray(this.array);
	}
	
	/**
	 * @effects
	 * return the sum of the array elements
	 * i.e. result = array[0] + ... + array[array.length - 1]
	 * 
	 * @requires this satisfies the rep invariant
	 */
	public int sum() {
		int sum = 0;
		for (int i=0; i< len; i++)
			sum += array[i];
		return sum;
	}
}
