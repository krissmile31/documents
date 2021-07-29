package a1_1801040015;

import utils.AttrRef;
import utils.DOpt;
import utils.DomainConstraint;
import utils.NotPossibleException;
import utils.OptType;


/**
 * @overview Customers are of interest to the shop
 * 
 * @attributes
 * id 				int 			Integer
 * name				String
 * phoneNumber		String
 * address			String
 * 
 * @object A typical Customer is c = <i, n, p, a>, where id(i), name(n), phoneNumber(p), address(a).
 * 
 * @abstract_properties
 * mutable(id) = false		   /\ optional(id) = false		    /\ min(id) = 1   /\ max(id) = 10^9
 * mutable(name) = true		   /\ optional(name) = false		/\ length(name) = 50
 * mutable(phoneNumber) = true /\ optional(phoneNumber) = false /\ length(phoneNumber) = 10
 * mutable(address) = true     /\ optional(address) = false     /\ length(address) = 100
 * 
 * @author NgocAnh
 *
 */
public class Customer {
	private static final int MIN_ID = 1, MAX_ID = (int) Math.pow(10, 9);
	private static final int LEN_NAME = 50;
	private static final int LEN_PHONENUM = 10;
	private static final int LEN_ADDRESS = 100;
	
	@DomainConstraint(type="Integer", mutable=false, optional=false, min=1, max=MAX_ID)
	private int id;
	@DomainConstraint(type="String", mutable=true, optional=false, length=50)
	private String name;
	@DomainConstraint(type="String", mutable=true, optional=false, length=10)
	private String phoneNumber;
	@DomainConstraint(type="String", mutable=true, optional=false, length=100)
	private String address;
	
	/**
	 * @effects<pre>
	 * if id, n, p, a are valid
	 * 		initialise this as Customer: <id, name, phoneNumber, address>
	 * else
	 * 		print error message
	 * </pre>
	 */
	public Customer(@AttrRef("id") int id, @AttrRef("name") String name, @AttrRef("phoneNumber") String phoneNumber, @AttrRef("address") String address)
	throws NotPossibleException {
		if (validateId(id))
			this.id = id;
		else
			throw new NotPossibleException("Customer<init>: Invalid id!");
		
		if (validateName(name))
			this.name = name;
		else
			throw new NotPossibleException("Customer<init>: Invalid name!");
		
		if (validatePhoneNumber(phoneNumber))
			this.phoneNumber = phoneNumber;
		else
			throw new NotPossibleException("Customer<init>: Invalid phone number!");
		
		if (validateAddress(address))
			this.address = address;
		else
			 throw new NotPossibleException("Customer<init>: Invalid address!");
		
	}
	
	/**
	 * @effects return <tt> this.id </tt>
	 */
	@DOpt(type=OptType.Observer) @AttrRef("id")
	public int getId() {
		return this.id;
	}
	
	/**
	 * @effects return <tt> this.name </tt>
	 */
	@DOpt(type=OptType.Observer) @AttrRef("name")
	public String getName() {
		return this.name;
	}
	
	/**
	 * @effects return <tt> this.phoneNumber </tt>
	 */
	@DOpt(type = OptType.Observer) @AttrRef("phoneNumber")
	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	
	/**
	 * @effects return <tt> this.address </tt>
	 */
	@DOpt(type = OptType.Observer) @AttrRef("address")
	public String getAddress() {
		return this.address;
	}
	
	/**
	 * @effects <pre>
	 * if name is valid
	 * 		set this.name = name
	 * else
	 * 		print error message
	 * </pre>
	 */
	@DOpt(type=OptType.Mutator) @AttrRef("name")
	public void setName(String name) {
		if(validateName(name))
			this.name = name;
		System.err.println("Customer.setName: invalid name " + name);
	}
	
	/**
	 * @effects </pre>
	 * if phoneNumber is valid
	 * 		set this.phoneNumber=phoneNumber
	 * else
	 * 		print error message
	 * </pre>
	 */
	@DOpt(type = OptType.Mutator) @AttrRef("phoneNumber")
	public void setPhoneNumber(String phoneNumber) {
		if (validatePhoneNumber(phoneNumber))
			this.phoneNumber=phoneNumber;
		throw new NotPossibleException("Customer.setPhoneNumber: invalid number " + phoneNumber);
	}
	
	/**
	 * @effects <pre>
	 * if address is valid
	 * 		set this.address = address
	 * else
	 * 		print error message
	 * </pre>
	 */
	@DOpt(type=OptType.Mutator) @AttrRef("address")
	public void setAddress(String address) {
		if(validateAddress(address))
			this.address=address;
		throw new NotPossible("Customer.setAddress: invalid address " + address);
	}
	
	/**
	 * @effects <pre>
	 * if this satisfies rep invariant
	 * 		return true
	 * else
	 * 		return false
	 * </pre>
	 */
	public boolean repOK() {
		return validate(id, name, phoneNumber, address);
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", phoneNumber=" + phoneNumber + ", address=" + address + "]";
	}
	
	/**
	 * @effects <pre>
	 * if <id, name, phoneNumber, address> is a valid tuple
	 * 		return true
	 * else
	 * 		return false
	 * </pre> 
	 */
	private boolean validate(int id, String name, String phoneNumber, String address) {
		return validateId(id) && validateName(name) && validatePhoneNumber(phoneNumber) && validateAddress(address);
	}
	
	/**
	 * @effects <pre>
	 * if id is valid
	 * 		return true
	 * else
	 * 		return false
	 * </pre>
	 */
	private boolean validateId(int id) {
		if (id < MIN_ID || id > MAX_ID)
			return false;
		return true;
	}
	
	/**
	 * @effects<pre>
	 * if name is valid
	 * 		return true
	 * else
	 * 		return false
	 * </pre>
	 */
	private boolean validateName(String name) {
		if(name == null || name.isEmpty() || name.length() > LEN_NAME)
			return false;
		return true;
	}
	
	/**
	 * @effects<pre>
	 * if phoneNumber is valid
	 * 		return true
	 * else
	 * 		return false
	 * </pre>
	 */
	private boolean validatePhoneNumber(String phoneNumber) {
		if (phoneNumber == null || phoneNumber.isEmpty() || phoneNumber.length() > LEN_PHONENUM)
			return false;
		return true;
	}
	
	/**
	 * @effects<pre>
	 * if address is valid
	 * 		return true
	 * else
	 * 		return false
	 * </pre>
	 */
	private boolean validateAddress(String address) {
		if(address == null || address.isEmpty() || address.length() > LEN_ADDRESS)
			return false;
		return true;
	}

}
