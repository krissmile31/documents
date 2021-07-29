package tut9;

import utils.AttrRef;
import utils.DOpt;
import utils.DomainConstraint;
import utils.OptType;

/**
 * @overview represents the information of MobilePhone
 * @attributes
 * manName        String
 * model          String
 * color          Character        char
 * year           String
 * guaranteed     Boolean          boolean
 * 
 * @object a typical MobilePhone object is c = <m1, m2, c, y, g>, where manName(m1), model(m2), color(c), year(y), guaranteed(g)
 * @abstract_properties
 * mutable(manName) = false    /\ optional(manName) = false /\ length(manName) = 50 /\
 * mutable(model) = true       /\ optional(model) = false   /\ length(model) = 30   /\
 * mutable(color) = false      /\ optional(color) = false   /\ length(color) = 1    /\
 * mutable(year) = false       /\ optional(year) = false    /\ length(year) = 4     /\
 * mutable(guaranteed) = false /\ optional = false
 * 
 * @author NgocAnh
 *
 */
public class MobilePhone {
	@DomainConstraint(type = "String", mutable = false, optional = false, length = 50)
	private String manName;
	@DomainConstraint(type = "String", mutable = true, optional = false, length = 50)
	private String model;
	@DomainConstraint(type = "Character", mutable = false, optional = false, length = 1)
	private char color;
	@DomainConstraint(type = "Integer", mutable = false, optional = false, min = 1940)
	private int year;
	@DomainConstraint(type = "Boolean", mutable = false, optional = true)
	private boolean guaranteed;
	
	// constructor of mandatory fields
	/**
	 * @effects <pre>
	 *    if manName, model, color are valid
	 *       initialise this as <id, name>
	 *    else
	 *       initialise this as <> and print error
	 *  </pre>
	 */
	public MobilePhone(){
		// do nothing
	}
	public MobilePhone (String manName, String model) {
		if (!validateManName(manName)) {
			System.err.println("Invalid manName=" + manName);
			return;
		}
		this.manName=manName;
		if (!validateModel(model)) {
			System.err.println("Invalid model= "+model);
			return;
		}
		this.model=model;
	}	
	public MobilePhone(char color) {
		this.color = color;
	}
	public MobilePhone(String manName, String model, char color, int year, boolean guaranteed) {
	      this.manName = manName;
	      this.model = model;
	      this.color = color;
	      this.year = year;
	      this.guaranteed = guaranteed;
	    }
	
	
	// attribute MobilePhone.color takes a character value that denotes a color of the phones. 
	enum color {
		R, O, Y, P, B;
	// 'R' (for red), 'O' (for orange), 'Y' (for yellow), 'B' (for blue), 'P' (for purple)
	}
	
	
	/**
	 * @effects <pre>
	 * if model is valid
	 *    set this.model = model
	 *    return true
	 * else
	 *    return false
	 */
	@DOpt(type = OptType.Mutator) @AttrRef("phone")
	public boolean setModel(String model) {
		if (validateModel(model)) {
			this.model = model;
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
	 */
	@DOpt(type = OptType.Observer) @AttrRef("model")
	public String getModel() {
		return this.model;
	}
	/**
	 * @effects return this.color
	 */
	@DOpt(type = OptType.Observer) @AttrRef("color")
	public char getColor() {
		return this.color;
	}
	@DOpt(type = OptType.Observer) @AttrRef("year")
	public int getYear() {
		return this.year;
	}
	/**
	 * @effects return this.guaranteed
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
    	if (manName == null || manName.isEmpty() || manName.length() > 30)
    		return false;
    	return true;
    }
    
    /**
     * @effects
     * if model is valid
     *    return true
     * else
     *    return false
     */
    private boolean validateModel(String model) {
    	if (model == null || model.isEmpty() || model.length() > 30)
    		return false;
    	return true;
    }
    
	/**
	 * @effects 
	 * if year is valid
	 *    return true
	 * else
	 *    return false
	 */
    private boolean validateYear(int year) {
    	if(year < 1940)
    		return false;
    	return true;
    }
    /** Check whether the mobile phone is guaranteed or not
	 * @effects Attribute MobilePhone.guaranteed 
	 * if this phone has a guarantee 
	 *    return true 
	 * else 
	 *    return false 
	 *             
	 */
    private boolean checkGuaranteed(boolean guaranteed) {
    	if(!guaranteed)
    		return false;
    	else
    		return true;
    }
    /** 
	 * @effects <pre>
	 *   if this satisfies abstract properties
	 *      return true
	 *   else
	 *      return false
	 * </pre>
	 */
    public boolean repOK() {
    	return validateManName(this.manName) && validateModel(this.model) && validateYear(this.year);
    }

}
