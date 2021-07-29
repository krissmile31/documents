package tut1_2.Vehicles;

import utils.AttrRef;

import utils.DomainConstraint;

/**
 * @overview Car is a sub-class of Vehicle representing an automobile, motor
 *           car, or car is a wheeled motor vehicle used for transporting
 *           passengers, which also carries its own engine or motor.
 * @abstract_properties
 *    P_Vehicle /\ 
 *    min(weight)=1000 /\ max(weight)=2000 /\
 *    min(length)= 1.5 /\ max(length)=3.5 /\
 *    max(seatingCapacity)=7
 *    max(registratonNumber)=6
 * @author Rain
 */
public class Car extends Vehicle {

  private static final double MIN_WEIGHT = 1000, MAX_WEIGHT = 2000;
  private static final double MIN_LENGTH = 1.5, MAX_LENGTH = 3.5;
  private static final int MAX_SEATCAP = 7;
  private static final int MAX_REGISNUM=6;

  // constructor methods
  /**
   * @effects <pre>
   *            if n, d, h, l, w, c are valid
   *              initialise this as Car:<n,d,h,l,w,c,r>
   *            else
   *              print error message
   *          </pre>
   */
  public Car(@AttrRef("name") String n, 
      @AttrRef("width") double d, @AttrRef("height") double h, @AttrRef("length") double l, 
      @AttrRef("weight") double w, @AttrRef("seatingCapacity") int c, @AttrRef("registrationNumber") String r) {
    super(n, d, h, l, w, c, r);
  }

  @Override
  public String toString() {
    return this.getClass().getSimpleName();
  }

  /**
   * @effects <pre>
   *            if w is valid 
   *              return true 
   *            else 
   *              return false</pre>
   */
  @Override
  @DomainConstraint(type="Double",min=MIN_WEIGHT,max=MAX_WEIGHT,optional=false)
  protected boolean validateWeight(double w) {
    if (!(super.validateWeight(w)))
      return false;

    if (w < MIN_WEIGHT || w > MAX_WEIGHT)
      return false;
    else
      return true;
  }
  
  @Override
  @DomainConstraint(type ="Double", min = MIN_LENGTH, max= MAX_LENGTH, optional = false)
  protected boolean validateLength(double l) {
	  if (!(super.validateLength(l)))
		  return false;
	  if (l < MIN_LENGTH || l > MAX_LENGTH)
		  return false;
	  return true;
  }

  /**
   * @effects <pre>
   *            if c is valid 
   *              return true 
   *            else 
   *              return false</pre>
   */
  @Override
  @DomainConstraint(type="Integer",min=MAX_SEATCAP,optional=false)
  protected boolean validateSeatingCapacity(int c) {
    if (!(super.validateSeatingCapacity(c)))
      return false;

    if (c > MAX_SEATCAP)
      return false;
    else
      return true;
  }
  
  /**
   * @effects<pre>
   * if r is valid
   * 	return true
   * else
   * 	return false
   * </pre>
   */
  @Override
  @DomainConstraint(type="S", max=MAX_REGISNUM, optional=false)
  protected boolean validateRegistrationNumber(String r) {
	  if(!(super.validateRegistrationNumber(r)))
		  return false;
	  if (r.length() > MAX_REGISNUM)
		  return false;
	  return true;
  }
}
