package tut8;

import utils.AttrRef;
import utils.DomainConstraint;
import utils.DOpt;
import utils.OptType;

/**
 * @overview represents the information of MobilePhone
 * @attributes
 * manName        String
 * model          String
 * color          Character        char
 * year           Integer          int
 * guaranteed     Boolean          boolean
 * 
 * @object a typical MobilePhone object is c = <m1, m2, c, y, g>, where manName(m1), model(m2), color(c), year(y), guaranteed(g)
 * @abstract_properties
 * mutable(manName) = false /\ optional(manName) = false /\ length(manName) = 50 /\
 * mutable(model) = false /\ optional(model) = false /\ length(model) = 50 /\
 * mutable(color) = true /\ optional(color) = false /\
 * mutble(year) = false /\ optional(year) = false /\ min(year) = 1940 /\
 * mutable(guaranteed) = true /\ optional = false
 * 
 * @author Rain
 *
 */
public class MobilePhone {
	@DomainConstraint(type = "String", mutable = false, optional = false, length = 50)
	private String manName;
	@DomainConstraint(type = "String", mutable = false, optional = false, length = 30)
	private String model;
	@DomainConstraint(type = "Character", mutable = true, optional = false)
	private char color;
	@DomainConstraint(type = "Integer", mutable = false, optional = false, min = 1940)
	private int year;
	@DomainConstraint(type = "Boolean", mutable = true, optional = true)
	private boolean guaranteed;
	
	// constructor of mandatory fields
	/**
	 * @effects <pre>
	 *    if manName, model, color, year, guaranteed are valid
	 *       initialise this as <manName, model, color, year>
	 *    else
	 *       initialise this as <> and print error
	 *  </pre>
	 */
	public MobilePhone(@AttrRef("manName")String manName, @AttrRef("model")String model, @AttrRef("color")char color, @AttrRef("year")int year) {
		if (!validateManName(manName)) {
			System.err.println("Invalid manName=" + manName);
			return;
		}
		if (!validateModel(model)) {
			System.err.println("Invalid model= "+model);
			return;
		}
		if (!validateYear(year)) {
			System.err.println("Invalid year=" + year);
			return;
		}
		  this.manName = manName;
	      this.model = model;
	      this.color = color;
	      this.year = year;
	    }
	
	
	/**
	 * @effects <pre>
	 *  if color is valid
	 *     set this.color = color
	 *     return true
	 *  else
	 *     return false
	 *  </pre>
	 */
	@DOpt(type = OptType.Mutator) @AttrRef("color")
	public boolean setColor(char color) {
		if (validateColor(color)) {
		   this.color = color;
		   return true;
		}
		return false;
		
	}
	
	/**
	 * @effects return this.manName
	 *     
	 */
	@DOpt(type = OptType.Observer) @AttrRef("manName")
	public String getManName() {
		return this.manName;	
	}
	
	/**
	 * @effects return this.model
	 *     
	 */
	@DOpt(type = OptType.Observer) @AttrRef("model")
	public String getModel() {
		return this.model;	
	}
	
	/**
	 * @effects return this.color
	 *     
	 */
	@DOpt(type = OptType.Observer) @AttrRef("color")
	public char getColor() {
		return this.color;	
	}
	
	/**
	 * @effects return this.year
	 *     
	 */
	@DOpt(type = OptType.Observer) @AttrRef("year")
	public int getYear() {
		return this.year;	
	}
	
	/**
	 * @effects return this.guaranteed
	 *     
	 */
	@DOpt(type = OptType.Observer) @AttrRef("guaranteed")
	public boolean getGuaranteed() {
		return checkGuaranteed(guaranteed);	
	}
	
	@DOpt(type = OptType.Default)
	@Override
	public String toString() {
		return "MobilePhone [\nmanName= " + manName + "\nmodel= " + model + "\ncolor= " + color + "\nyear= " + year
				+ "\nguaranteed= " + guaranteed + "]";
	}
	
	/**
     * @effects <pre>
     *   if manName is valid
     *      return true
     *   else
     *      return false
     *  </pre>
     */
    private boolean validateManName(String manName) {
    	if (manName == null || manName.isEmpty() || manName.length() > 50)
    		return false;
    	return true;
    }
    
    
    /**
     * @effects <pre>
     *   if mmodel is valid
     *      return true
     *   else
     *      return false
     *  </pre>
     */
    private boolean validateModel(String model) {
    	if (model == null || model.isEmpty() || model.length() > 50)
    		return false;
    	return true;
    }
    
    // attribute MobilePhone.color takes a character value that denotes a color of the phones. 
 	// 'R' (for red), 'O' (for orange), 'Y' (for yellow), 'B' (for blue), 'P' (for purple)
    /**
     * @effects <pre>
     *   if color is valid
     *      return true
     *   else
     *      return false
     *  </pre>
     */
    private boolean validateColor(char color) {
    	if (color == 'R' || color == 'O' || color == 'Y' || color == 'B' || color == 'P')
    		return true;
    	return false;
    }
    
    /**
     * @effects <pre>
     *   if year is valid
     *      return true
     *   else
     *      return false
     *  </pre>
     */
    private boolean validateYear(int year) {
    	if (year < 1940)
    		return false;
    	return true;
    }
	/**
	 * Check whether the mobile phone is guaranteed or not
	 * @effects Attribute MobilePhone.guaranteed 
	 *          if this phone has a guarantee 
	 *             return true 
	 *          else 
	 *             return false 
	 *             
	 */
	private boolean checkGuaranteed(boolean guaranteed) {
		if (!guaranteed)
			return false;
		return true;
		
	
	}
	public boolean repOK() {
		return validateManName(this.manName) && validateModel(this.model) && validateYear(this.year);
	}
	

}
