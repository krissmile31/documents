package tut1_2.Vehicles;

import utils.AttrRef;

import utils.DomainConstraint;

/**
 * @overview Motorbike is a sub-class of Vehicle representing a motobike (also motorcycles or mopeds), 
 * 			with two wheels in the front-back direction and 
 * 			moving by the engine mounted on it. 
 * @abstract_properties
 * P_Vehicle /\
 * max(seatingCapacity) = 2
 * max(registrationNumber) = 5
 * @author Rain
 *
 */
public class Motorbike extends Vehicle {
	
	private static final int MAX_SEATCAP = 2;
	private static final int MAX_REGISNUM = 5;
	
	/**
	 * @effects<pre>
	 * if n, d, h, l, w, c, r are valid
	 * 		initialise this as Motobike: <n, d, h, l, w, c, r>
	 * else
	 * 		print error message
	 * </pre>
	 */
	public Motorbike(@AttrRef("name") String n, @AttrRef("width") double d,
			@AttrRef("height") double h, @AttrRef("length") double l, @AttrRef("weigh") double w, 
			@AttrRef("seatingCapacity") int c, @AttrRef("registrationNumber") String r) {
		super(n, d, h, l, w, c, r);
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() ;
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
	@DomainConstraint(type="String", max = MAX_REGISNUM, optional = false)
	protected boolean validateRegistrationNumber(String r) {
		if(!(super.validateRegistrationNumber(r)))
			return false;
		if (r.length() > MAX_REGISNUM)
			return false;
		return true;
	}
	

}
