package a3_1701040161.fsis;

import utils.AttrRef;
import utils.DOpt;
import utils.DomainConstraint;
import utils.NotPossibleException;
import utils.OptType;

/**
 * @overview
 * 
 *           <pre>
 *  A customer is a person or organization that are of interest to the
 * shop and buy goods or services from a store or business
 *           </pre>
 * 
 * @attributes
 * 
 *             <pre>
 *      id              Integer      Integer
 *      name            String       String
 *      phoneNumber     String       String
 *      address         String       String
 *             </pre>
 * 
 * @objects
 * 
 *          <pre>
 *      A typical customer object is c = <i,n,p,a>
 *          where id(i),name(n),phoneNumber(p),address(a)
 *          </pre>
 * 
 * @abstract_properties
 * 
 *                      <pre>
 *          mutable(id) = false /\ optional(id) = false /\ min(id) = 1 /\ max(id) = 1000000 /\
 *          mutable(name) = true /\ optional(name) = false /\ length(name) = 50 /\
 *          mutable(phoneNumber) = true /\ optional(phoneNumber) = false /\ length(phoneNumber) = 10 /\
 *          mutable(address) = true /\ optional(address) = false /\ length(address) = 100
 *                      </pre>
 * 
 * @author tungpd
 */
public class Customer implements Comparable<Customer>, Document {

	// const for max id
	private static final double MAX_ID = 1000000;

	@DomainConstraint(type = "Integer", mutable = false, optional = false, min = 1, max = MAX_ID)
	private int id;
	@DomainConstraint(type = "String", mutable = true, optional = false, length = 50)
	private String name;
	@DomainConstraint(type = "String", mutable = true, optional = false, length = 10)
	private String phoneNumber;
	@DomainConstraint(type = "String", mutable = true, optional = false, length = 100)
	private String address;

	/**
	 * @effects
	 * 
	 *          <pre>
	 *      if id, name, phoneNumber, address are valid
	 *          initialize <tt>this</tt> as <id,name,phoneNumber,address>
	 *      else
	 *          print errors
	 *          </pre>
	 *
	 */
	public Customer(@AttrRef("id") int id, @AttrRef("name") String name, @AttrRef("phoneNumber") String phoneNumber,
			@AttrRef("address") String address) {
		if (!validate(id, name, phoneNumber, address)) {
			System.out.println("Customer info mismatch");
		}
	}

	/**
	 * 
	 * @effects return <tt>this.id</tt>
	 * @return
	 * 
	 */
	@DOpt(type = OptType.Observer)
	@AttrRef("id")
	public int getId() {
		return this.id;
	}

	/**
	 * @effects return <tt>this.name</tt>
	 * @return
	 */
	@DOpt(type = OptType.Observer)
	@AttrRef("name")
	public String getName() {
		return this.name;
	}

	/**
	 * @effects return <tt>this.address</tt>
	 * @return
	 */
	@DOpt(type = OptType.Observer)
	@AttrRef("address")
	public String getAddress() {
		return this.address;
	}

	/**
	 * @effects return <tt>this.phoneNumber</tt>
	 * @return
	 */
	@DOpt(type = OptType.Observer)
	@AttrRef("phoneNumber")
	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	/**
	 * @param name
	 * @effects
	 * 
	 *          <pre>
	 *            if name is valid
	 *              set this.name = name
	 *            else
	 *              throws NotPossibleException
	 *          </pre>
	 */
	@DOpt(type = OptType.Mutator)
	@AttrRef("name")
	public void setName(String name) throws NotPossibleException {
		if (validateName(name))
			this.name = name;
		else
			throw new NotPossibleException("Customer.setName: invalid name: " + name);
	}

	/**
	 * @param address
	 * @effects
	 * 
	 *          <pre>
	*            if address is valid
	*              set this.address = address
	*            else
	*              throws NotPossibleException
	 *          </pre>
	 */
	@DOpt(type = OptType.Mutator)
	@AttrRef("address")
	public void setAddress(String address) throws NotPossibleException {
		if (validateAddress(address))
			this.address = address;
		else
			throw new NotPossibleException("Customer.setAddress: invalid address: " + address);
	}

	/**
	 * @param phoneNumber
	 * @effects
	 * 
	 *          <pre>
	*            if phoneNumber is valid
	*              set this.phoneNumber = phoneNumber
	*            else
	*              throws NotPossibleException
	 *          </pre>
	 */
	@DOpt(type = OptType.Mutator)
	@AttrRef("phoneNumber")
	public void setPhoneNumber(String phoneNumber) throws NotPossibleException {
		if (validatePhoneNumber(phoneNumber))
			this.phoneNumber = phoneNumber;
		else
			throw new NotPossibleException("Customer.setPhoneNumber: invalid phoneNumber: " + phoneNumber);
	}

	/**
	 * @effects
	 * 
	 *          <pre>
	*        if this satisfies rep invariant
	*            return true 
	*         else
	*            return false
	 *          </pre>
	 * 
	 * @return
	 */
	public boolean repOK() {
		return validate(id, name, phoneNumber, address);
	}

	@Override
	public String toString() {
		return "Customer <ID: " + id + " ,Name: " + name + " ,PhoneNumber: " + phoneNumber + " ,Address: " + address + ">";
	}

	/**
	 * @effects
	 * 
	 *          <pre>
	*         if <id,name,phoneNumber,address > is a valid
	*          return true
	*          else
	*            return false
	 *          </pre>
	 */
	private boolean validate(int id, String name, String phoneNumber, String address) {
		return validateId(id) && validateName(name) && validatePhoneNumber(phoneNumber) && validateAddress(address);
	}

	/**
	 * @param id
	 * @effects
	 * 
	 *          <pre>
	*         if id is valid 
	*            return true 
	*         else 
	*            return false
	 *          </pre>
	 * 
	 * @return
	 */
	protected boolean validateId(int id) {
		return (id > 0 && id <= MAX_ID);
	}

	/**
	 * @effects
	 * 
	 *          <pre>
	*       if name is valid 
	*         return true 
	*     else 
	*     return false
	 *          </pre>
	 */
	private boolean validateName(String n) {
		return n != null && n.length() > 0 && n.length() <= 50;
	}

	/**
	 * @effects
	 * 
	 *          <pre>
	*       if phoneNumber is valid 
	*           return true 
	*        else 
	*            return false
	 *          </pre>
	 */
	private boolean validatePhoneNumber(String phoneNumber) {
		return phoneNumber != null && phoneNumber.length() > 0 && phoneNumber.length() <= 10;
	}

	/**
	 * @effects
	 * 
	 *          <pre>
	*       if address is valid 
	*            return true 
	*         else 
	*            return false
	 *          </pre>
	 */
	private boolean validateAddress(String address) {
		return address != null && address.length() > 0 && address.length() <= 100;
	}

	/**
	 * @param c
	 * @effect
	 * 
	 *         <pre>
	 *    if c is null throws NullPointerException else if c is not
	*         instance of Customer throw ClassCastException else return
	*         this.name.compareTo(c.name)
	 *         </pre>
	 */
	@Override
	public int compareTo(Customer c) throws NullPointerException, ClassCastException {
		if (c == null) {
			throw new NullPointerException("Customer is null");
		} else if (!(c instanceof Customer)) {
			throw new ClassCastException("Not a Customer " + c);
		} else
			return this.name.compareTo(c.name);
	}

	/**
	 * @effect return this in String in HTML file
	 */
	@Override
	public String toHtmlDoc() {
		StringBuffer sb = new StringBuffer();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title>Customer: " + this.getId() + "-" + this.getName() + "</title>");
		sb.append("</head>");
		sb.append("<body>");
		sb.append(this.getId() + " " + this.getName() + " " + this.getPhoneNumber() + " " + this.getAddress());
		sb.append("</body></html>");
		return sb.toString();
	}

}
