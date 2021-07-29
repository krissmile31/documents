package tut1_2.Vehicles;

import utils.AttrRef;
import utils.DomainConstraint;

/**
 * @overview Boat is a sub-class of Vehicle representing a boat, which known as means of transport on the water,
 * 				operated by human power, wind power, or attached to a small engine. 
 * 				Boats are used to carry people or goods or items. 
 * @abstract_properties
 * P_Vehicle /\
 * max(seatingCapacity) = 30 /\
 * max(registrationNumber) = 8
 * @author Rain
 *
 */
public class Boat extends Vehicle{
	
	private static final int MAX_SEATCAP = 30;
	private static final int MAX_REGISNUM = 8;
	
	/**
	 * @effects<pre>
	 * if n, d, h, l, w, c, r are valid
	 * 		initialise this as Boat: <n, d, h, l, w, c, r>
	 * else
	 * 		print error message
	 * </pre>
	 */
	public Boat(@AttrRef("name") String n, @AttrRef("width") double d, @AttrRef("height") double h, 
			@AttrRef("length") double l, @AttrRef("weight") double w, @AttrRef("seatingCapacity") int c, 
			@AttrRef("registrationNumber") String r) {
		super(n, d, h, l, w, c, r);
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName();
	}
	
	/**
	 * @effects<pre>
	 * if c is valid
	 * 		return true
	 * else
	 * 		return false
	 * </pre>
	 */
	@Override
	@DomainConstraint(type="Integer", max = MAX_SEATCAP, optional=false)
	protected boolean validateSeatingCapacity(int c) {
		if (!(super.validateSeatingCapacity(c)))
			return false;
		if (c > MAX_SEATCAP)
			return false;
		return true;
	}
	
	/**
	 * @effects<pre>
	 * if r is valid
	 * 		return true
	 * else
	 * 		return false
	 * </pre>
	 */
	@Override
	@DomainConstraint(type="String", max = MAX_REGISNUM, optional=false)
	protected boolean validateRegistrationNumber(String r) {
		if (!(super.validateRegistrationNumber(r)))
			return false;
		if (r.length() > MAX_REGISNUM)
			return false;
		return true;
	}

}
