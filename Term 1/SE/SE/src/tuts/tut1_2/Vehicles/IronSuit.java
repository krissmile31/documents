package tut1_2.Vehicles;

import utils.AttrRef;



/**
 * @overview  IronSuit which models the iron suit that is worn by Mr. Stark in the movie named Iron Man
 * @attributes
 * 
 * @abstract_properties
 * P_Vehicle /\		
 * 
 * @author Rain
 */
public class IronSuit extends Vehicle implements Flyable{

	/**
	 * @effects <pre>
	 * if n, d, h, l, w, c, r are valid
	 * 		initialise this as IronSuit: <n, d, h, l, w, c, r>
	 * else
	 * 		print error message
	 * </pre>
	 */
	public IronSuit(@AttrRef("name") String n, @AttrRef("width") double d, @AttrRef("height") double h,
			@AttrRef("length") double l, @AttrRef("weight") double w, @AttrRef("seatingCapacity") int c,
			@AttrRef("registrationNumber") String r) {
		super(n, d, h, l, w, c, r);	
	}
	
	/**
	 * @effects carry the person wearing the suit from a point A to 
	 * another point B in the air.
	 */
	public void fly() {
		
	}
	
	
	

}
