package A3;

import utils.AttrRef;
import utils.DomainConstraint;
import utils.DOpt;
import utils.OptType;

/**
 * @overview represents a personal computer.
 * 
 * @attributes
 * model           String
 * year            Integer        int
 * manufacturer    String
 * comps           Set
 * 
 * @object a typical PC object is c = <a, b, d, f> where model(a), year(b), manufacturer(d), comps(f)
 * 
 * @abstract_properties
 * mutable(model) = true          /\ optional(model) = false        /\ length(model) = 20
 * mutable(year) = false          /\ optional(year) = false         /\ min(year) = 1940
 * mutable(manufacturer) = false  /\ optional(manufacturer) = false /\ length(manufacturer) = 20
 * mutable(comps) = true          /\ optional(comps) = false)
 * 
 * @author NgocAnh
 */
public class PC {
	@DomainConstraint(type = "String", mutable = true, optional = false, length = 20)
	private String model;
	
	@DomainConstraint(type = "Integer", mutable = false, optional = false, min = 1940)
	private int year;
	
	@DomainConstraint(type = "String", mutable = false, optional = false, length = 20)
	private String manufacturer;
	
	@DomainConstraint(type = "Set", mutable = true, optional = false)
	private Set comps;
	
	
    public PC() {
    	// do nothing
    }
    
	/**
	 * @effects <pre>
	 * if model, year, manufacturer, comps are valid
	 *    initialise this as <model, year, manufacturer, comps>
	 * else
	 *    initialise this as <> and print error
	 * </pre>
	 */
	public PC(@AttrRef("model") String model, @AttrRef("year") int year, @AttrRef("manufacturer") String manufacturer, @AttrRef("comps") Set comps) {
		if (!validateModel(model)) {
			System.err.println("Invalid model: " + model);
			return;
		}
		if (!validateYear(year)) {
			System.err.println("Invalid year: " + year);
			return;
		}
		if (!validateManufacturer(manufacturer)) {
			System.err.println("Invalid manufacturer: " + manufacturer);
			return;
		}
		if (!validateComps(comps)) {
			System.err.println("Invalid comps: " + comps);
			return;
		}
		
		this.model = model;
		this.year = year;
		this.manufacturer = manufacturer;
		this.comps = comps;
	}
	
	/**
	 * @effects<pre>
	 * if model is valid
	 *    set this.model = model
	 *    return true
	 * else
	 *    return false
	 * </pre>
	 */
	@DOpt(type = OptType.Mutator) @AttrRef("model")
	public boolean setModel(String model) {
		if (validateModel(model)) {
			this.model = model;
			return true;
		}
		return false;
	}
	
	/**
	 * @effects <pre>
	 * if comps is valid
	 *    set this.comps = comps
	 *    return true
	 * else
	 *    return false
	 * </pre>
	 */
	@DOpt(type = OptType.Mutator) @AttrRef("comps")
	public boolean setComps(Set comps) {
		if (validateComps(comps)) {
			this.comps = comps;
			return true;
		}
		return false;
	}
	
	/**
	 * @effects return <tt>this.model</tt>
	 */
	@DOpt(type = OptType.Observer) @AttrRef("model")
	public String getModel() {
		return this.model;
	}
	
	/**
	 * @effects return <tt>this.year</tt>
	 */
	@DOpt(type = OptType.Observer) @AttrRef("year")
	public int getYear() {
		return this.year;
	}
	
	/**
	 * @effects return <tt>this.manufacturer</tt>
	 */
	@DOpt(type = OptType.Observer) @AttrRef("manufacturer")
	public String getManufacturer() {
		return this.manufacturer;
	}
	
	/**
	 * @effects return <tt>this.comps</tt>
	 */
	@DOpt(type = OptType.Observer) @AttrRef("comps")
	public Set getComps() {
		return this.comps;
	}
    
	// return string representation of PC object
	@DOpt(type = OptType.Default)
	@Override
	public String toString() {
		return "PC: <" + model + ", " + year + ", " + manufacturer + ", " +  comps + ">";	
	}
	
	/**
	 * @effects<pre>
	 * if model is valid
	 *    return true
	 * else
	 *    return false
	 * </pre>
	 */
	private boolean validateModel(String model) {
		if (model == null || model.isEmpty() || model.length() > 20)
			return false;
		return true;
	}
	
	/**
	 * @effects<pre>
	 * if year is valid
	 *    return true
	 * else
	 *    return false
	 * </pre>
	 */
	private boolean validateYear(int year) {
		if (year < 1940) 
			return false;
		return true;	
		}
	
	/**
	 * @effects<pre>
	 * if manufacturer is valid
	 *    return true
	 * else
	 *    return false
	 * </pre>
	 */
	private boolean validateManufacturer(String manufacturer) {
		if (manufacturer == null || manufacturer.isEmpty() || manufacturer.length() > 20)
			return false;
		return true;
	}
	
	/**
	 * @effects<pre>
	 * if comps is valid
	 *    return true
	 * else
	 *    return false
	 * </pre>
	 */
	private boolean validateComps(Set comps) {
		if (comps == null || comps.size() == 0)
			return false;
		else {
			Object[] objs = comps.getObjects();
			for (int i=0; i< comps.size(); i++) {
				if (!(objs[i] instanceof String))
					return false;
				else {
					if (((String) objs[i]).length() == 0)
						return false;
				}
			}
		}
		return comps.repOK();
	}
	
	/**
	 * @effects<pre>
	 * if this satisfies abstract properties
	 *    return true
	 * else
	 *    return false
	 * </pre>
	 */
	public boolean repOK() {
		return validateModel(this.model) && validateYear(this.year) && validateManufacturer(this.manufacturer) && validateComps(this.comps);
	}
}
