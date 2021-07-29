package tut9;

import utils.AttrRef;
import utils.DomainConstraint;
import utils.DOpt;
import utils.OptType; 

/**
 * @overview represents the owner of mobile phones
 * @attributes
 * id      Integer    int
 * name    String     
 * phone   MobilePhone
 * @object a typical Person object is c = < i, n, p >, where id(i), name(n), phone(p)
 * @abstract_properties
 * mutable(id) = false   /\ optional(id) = false   /\ min(id) = 1       /\
 * mutable(name) = true  /\ optional(name) = false /\ length(name) = 30 /\
 * mutable(phone) = true /\ optional(phone) = true
 * 
 * @author NgocAnh
 */

public class Person {
	private int id;
	@DomainConstraint(type = "Integer", mutable = false, optional = false, min = 1)
	private String name;
	@DomainConstraint(type = "String", mutable = true, optional = false, length = 30)
	private MobilePhone phone;
	@DomainConstraint(type = "MobilePhone", mutable = true, optional = true)
	
	
	/**
	 * @effects <pre>
	 *    if id, name are valid
	 *       initialise this as <id, name>
	 *    else
	 *       initialise this as <> and print error
	 *  </pre>
	 */
	public Person () {  // Constructor for objects of class Person
		// do nothing
	   }                   
	public Person(int id, String name){  
		if (!validateId(id)) {
			System.err.println("Invalid id=" + id);
			return;
		}
		this.id=id;
		
		if (!validateName(name)) {
			System.err.println("Invalid name=" + name);
			return;
		}
		this.name=name;
	}
	public Person(int id, String name, MobilePhone phone){ 
		if (!validateId(id)) {
			System.err.println("Invalid id=" + id);
			return;
		}
		if (!validateName(name)) {
			System.err.println("Invalid name=" + name);
			return;
		}
		if (!validatePhone(phone)) {
			System.err.println("Invalid phone=" + phone);
			return;
		}
		this.id = id;
		this.name = name;
		this.phone = phone;
		}
	

	/**
	 * @effects <pre>
	 *  if name is valid
	 *     set this.name = name
	 *     return true
	 *  else
	 *     return false
	 *  </pre>
	 */
	@DOpt(type = OptType.Mutator) @AttrRef("name") 
	public boolean setName(String name) {
		if (validateName(name))	{
			this.name = name;
			return true;
		}
		return false;
	}
	
	/**
	 * @effects <pre>
	 * if phone is valid
	 *    set this.phone = phone
	 *    return true
	 * else
	 *    return false
	 */
	@DOpt(type = OptType.Mutator) @AttrRef("phone")
	public boolean setMobilePhone(MobilePhone phone) {
		if (validatePhone(phone)) {
			this.phone = phone;
			return true;
		}
		return false;
		
			
	}
	/**
	 * @effects return this.id
	 *     
	 */
	@DOpt(type = OptType.Observer) @AttrRef("id")
	public int getId() {
		return this.id;
		
	}
	/**
	 * @effects return this.name
	 */
	@DOpt(type = OptType.Observer) @AttrRef("name")
	public String getName() {
		return this.name;
	}
	/**
	 * @effects return this.phone
	 */
	@DOpt(type = OptType.Observer) @AttrRef("phone")
	public MobilePhone getPhone() {
		return this.phone;
	}
    @DOpt(type = OptType.Default)
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", phone=" + phone + "]";
	}
    /**
     * @effects <pre>
     *   if id is valid
     *      return true
     *   else
     *      return false
     */
    private boolean validateId(int id) {
    	// validate min
    	if (id < 1)
    		return false;
    	return true;
    }
    
    /**
     * @effects <pre>
     *   if name is valid
     *      return true
     *   else
     *      return false
     *  </pre>
     */
    private boolean validateName(String name) {
    	if (name == null || name.isEmpty() || name.length() > 30)
    		return false;
    	return true;
    }
    
    /**
     * @effects <pre>
     *   if phone is valid
     *      return true
     *   else
     *      return false
     *  </pre>
     */
    private boolean validatePhone(MobilePhone phone) {
    	if (phone != null && !phone.repOK()) {
    		return false;
    	}
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
    	return validateId(this.id) && validateName(this.name) && validatePhone(this.phone);
    }
	
	
}
