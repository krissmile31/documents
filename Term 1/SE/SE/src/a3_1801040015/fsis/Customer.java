package a3_1801040015.fsis;

import utils.AttrRef;
import utils.DomainConstraint;
import utils.DOpt;
import utils.OptType;
import utils.NotPossibleException;

/**
 * @overview Customer who is of interest to the shop and purchases products or services
 * @attributes
 * id			Integer
 * name			String
 * phoneNumber	String
 * address		String
 * @object A typical Customer is c = <i, n, p, a> where id(i), name(n), phoneNumber(p), address(a)
 * @abstract_properties
 * mutable(id) = false         /\ optional(id) = false          /\ min(id) = 1    /\ max(id) = 10^9
 * mutable(name) = true        /\ optional(name) = false        /\ length(name) = 50
 * mutable(phoneNumber) = true /\ optional(phoneNumber) = false /\ length(phoneNumber) = 10
 * mutable(address) = true     /\ optional(address) = false     /\ length(address) = 100
 * 
 * @author NgocAnh
 */
public class Customer implements Comparable, Document {
	
	@DomainConstraint(type = "Integer", mutable = false, optional = false, min = 1, max = 10^9)
	private int id;
	
	@DomainConstraint(type = "String", mutable = true, optional = false, length = 50)
	private String name;
	
	@DomainConstraint(type = "String", mutable = true, optional = false, length = 10)
	private String phoneNumber;
	
	@DomainConstraint(type = "String", mutable = true, optional = false, length = 100)
	private String address;
	
	/**
	 * @effects <pre>
	 * if id, name, phoneNumber, address are valid
	 * 		initialise this as Customer: <id, name, phoneNumber, address>
	 * else
	 * 		throws NotPossibleException
	 * </pre>
	 */
	public Customer(@AttrRef("id") int id, @AttrRef("name") String name, @AttrRef("phoneNumber") String phoneNumber, @AttrRef("address") String address) 
			throws NotPossibleException {
		
		// check valid id
		if (!validateId(id)) 
			throw new NotPossibleException("Customer<init>: Invalid id!");
		
		// check valid name
		if (!validateName(name)) 
			throw new NotPossibleException("Customer<init>: Invalid name!");
		
		// check valid phoneNumber
		if (!validatePhoneNumber(phoneNumber)) 
			throw new NotPossibleException("Customer<init>: Invalid phone number!");
				
		// check valid address
		if (!validateAddress(address)) 
			throw new NotPossibleException("Customer<init>: Invalid address!");
					
		// validate(id, name, phoneNumber, address)
		this.id = id;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}
	
	/**
	 * @effects<pre>
	 * if name is valid
	 * 		set this.name = name
	 * else
	 * 		throws NotPossibleException
	 * </pre>
	 */
	@DOpt(type=OptType.Mutator) @AttrRef("name")
	public void setName(String name) throws NotPossibleException {
		if (validateName(name))
			this.name = name;
		// else: invalid name
		else
			throw new NotPossibleException("Customer.setName:\n invalid name: " + name);
	}
	
	/**
	 * @effects <pre>
	 * if phoneNumber is valid
	 * 		set this.phoneNumber = phoneNumber
	 * else
	 * 		throws NotPossibleException
	 * </pre>
	 */
	@DOpt(type=OptType.Mutator) @AttrRef("phoneNumber")
	public void setPhoneNumber(String phoneNumber) throws NotPossibleException {
		if (validatePhoneNumber(phoneNumber))
			this.phoneNumber = phoneNumber;
		// else: invalid phoneNumber
		else
			throw new NotPossibleException("Customer.setPhoneNumber:\n invalid phone number: " + phoneNumber);
	}
	
	/**
	 * @effects <pre>
	 * if address is valid
	 * 		set this.address = address
	 * else
	 * 		throws NotPossibleException
	 * </pre>
	 */
	@DOpt(type=OptType.Mutator) @AttrRef("address")
	public void setAddress(String address) throws NotPossibleException {
		if (validateAddress(address))
			this.address = address;
		// else: invalid address
		else
			throw new NotPossibleException("Customer.setAddress:\n invalid address: " + address);
	}
	
	/**
	 * @effects return <tt>this.id</tt>
	 */
	@DOpt(type=OptType.Observer) @AttrRef("id")
	public int getId() {
		return this.id;
	}
	
	/**
	 * @effects return <tt>this.namee</tt>
	 */
	@DOpt(type=OptType.Observer) @AttrRef("name")
	public String getName() {
		return this.name;
	}
	
	/**
	 * @effects return <tt>this.phoneNumber</tt>
	 */
	@DOpt(type=OptType.Observer) @AttrRef("phoneNumber")
	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	
	/**
	 * @effects return <tt>this.address</tt>
	 */
	@DOpt(type=OptType.Observer) @AttrRef("address")
	public String getAddress() {
		return this.address;
	}
	
	/**
	 * @effects<pre>
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
	
	@Override
	public boolean equals(Object o) {
		// check if o is null
		if (o == null)
			return false;
		
		// check if o is a customer
		if (!(o instanceof Customer))
			return false;
		
		// check if o is the same Customer (same state/data)
		Customer other = (Customer) o;
		if (this.id == other.id)
			return true;
		else
			return false;
	}

	// validation
	/**
	 * @effects<pre>
	 * if <id, name, phoneNumber, address> is valid tuple
	 * 		return true
	 * else
	 * 		return false
	 * </pre> 
	 */
	protected boolean validate(int id, String name, String phoneNumber, String address) {
		return validateId(this.id) && validateName(this.name) && validatePhoneNumber(this.phoneNumber) && validateAddress(this.address);
	}
	
	/**
	 * @effects<pre>
	 * if id is valid
	 * 		return true
	 * else
	 * 		return false
	 * </pre>
	 */
	protected boolean validateId(int id) {
		if (id < 1 || id > Math.pow(10, 9))
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
	protected boolean validateName(String name) {
		if (name == null || name.isEmpty() || name.length() > 50)
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
	protected boolean validatePhoneNumber(String phoneNumber) {
		if (phoneNumber == null || phoneNumber.isEmpty() || phoneNumber.length() > 10)
			return false;
		return true;
	}
	
	/**
	 * @effects <pre>
	 * if address is valid
	 * 		return true
	 * else
	 * 		return false
	 * </pre>
	 */
	protected boolean validateAddress(String address) {
		if (address == null || address.isEmpty() || address.length() > 100)
			return false;
		return true;
	}
	
	// interface Comparable
	/**
	 * @effects <pre>
	 * if o is null
	 * 		throws NullPointerException
	 * else if o is not a Customer object
	 * 		throws ClassCastException
	 * else
	 * 		return this.name.compareTo(o.name)
	 * </pre>
	 */
	public int compareTo(Object o) {
		return compareByName(o);
	}
	
	protected int compareByName(Object o) throws NullPointerException, ClassCastException {
		if (o==null)
			throw new NullPointerException("Vehicle.compareByName");
		else if (!(o instanceof Customer))
			throw new ClassCastException("Vehicle.compareByName: not a Customer " + o);
		Customer c = (Customer) o;
		return this.name.compareTo(c.name);
	}
	
	/**
	 * @effects return <tt>this</tt> in a String containing the text of a simple HTML document 
	 */
	@Override
	public String toHtmlDoc() {
		StringBuffer file = new StringBuffer();
		file.append("<html>");
		file.append("<head>");
		file.append("<title>");
		file.append("Customer: " + this.getId() + "-" + this.getName());
		file.append("</title>");
		file.append("</head>");
		file.append("<body>");
		file.append(this.getId() + " " + this.getName() + " " + this.getPhoneNumber() + " " + this.getAddress());
		file.append("<body>");
		file.append("<html>");
		return file.toString();
	}

}
