package A2;

import utils.AttrRef;
import utils.DomainConstraint;
import utils.DOpt;
import utils.OptType;
/**
 * @overview represents university students
 * @attributes
 * id           Integer         int
 * firstName    String
 * givenName    String
 * lastName     String
 * email        String
 * address      String
 * phone        String
 * dob          String
 * gender       Gender
 * 
 * @object a typical Student object is c = <a, b, c, d, e, f, g, h, i>, where id(a), firstName(b), givenName(c), 
 *                                                         lastName(d), email(e), address(f), phone(g), dob(h), gender(i)
 * @abstract_properties
 * mutable(id) = false       /\ optional(id) = false        /\ min(id) = 1            /\
 * mutable(firstName) = true /\ optional(firstName) = false /\ length(firstName) = 50 /\
 * mutable(givenName) = true /\ optional(givenName) = false /\ length(givenName) = 50 /\
 * mutable(lastName) = true  /\ optional(lastName) = false  /\ length(lastNamee) = 30 /\
 * mutable(email) = true     /\ optional(email) = true      /\ length(email) = 255    /\
 * mutable(address) = true   /\ optional(address) = false   /\ length(address) = 2000 /\
 * mutable(phone) = true     /\ optional(phone) = false     /\ length(phone) = 20     /\
 * mutable(dob) = false      /\ optional(phone) = false     /\ length(phone) = 20     /\
 * mutable(gender) = false   /\ optional(gender) = false 
 * 
 * @author NgocAnh
 *
 */
public class Student {
	@DomainConstraint(type = "Integer", mutable = false, optional = false, min = 1)
	private int id;
	
	@DomainConstraint(type = "String", mutable = true, optional = false, length = 50)
	private String firstName;
	
	@DomainConstraint(type = "String", mutable = true, optional= false, length = 50)
	private String givenName;
	
	@DomainConstraint(type = "String", mutable = true, optional = false, length = 30)
	private String lastName;
	
	@DomainConstraint(type = "String", mutable = true, optional = true, length = 255)
	private String email;
	
	@DomainConstraint(type = "String", mutable = true, optional = false, length = 2000)
	private String address;
	
	@DomainConstraint(type = "String", mutable = true, optional = false, length = 20)
	private String phone;
	
	@DomainConstraint(type = "String", mutable = false, optional = false, length = 20)
	private String dob;
	
	@DomainConstraint(type = "Gender", mutable = false, optional = false)
	private Gender gender;
	
	
	
	// constructor of mandatory fields
	/**
	 * @effects <pre> 
	 * if id, firstName, givenName, lastName, address, phone, dob, gender are valid
	 *    initialise this as <id, firstName, givenName, lastName, address, phone, dob, gender>
	 * else 
	 *    initialise this as <> and print error
	 * </pre>
	 */
	public Student(@AttrRef("id") int id, @AttrRef("firstName") String firstName, @AttrRef("givenName") String givenName, 
			@AttrRef("lastName") String lastName, @AttrRef("address") String address, @AttrRef("phone") String phone, 
			@AttrRef("dob") String dob, @AttrRef("gender") Gender gender) {      // !optional, !collection
		if (!validateId(id)) {
			System.err.println("Student.init(): Invalid id = " + id);
			return;
		}
		if(!validateFirstName(firstName)) {
			System.err.println("Student.init(): Invalid firstName = " + firstName);
			return;
		}
		if (!validateGivenName(givenName)) {
			System.err.println("Student.init(): Invalid givenName = " + givenName);
			return;
		}
		if (!validateLastName(lastName)) {
			System.err.println("Student.init(): Invalid lastName = " + lastName);
			return;
		}
		if (!validateAddress(address)) {
			System.err.println("Student.init(): Invalid address = " + address);
			return;
		}
		if (!validatePhone(phone)) {
			System.err.println("Student.init(): Invalid phone = " + phone);
			return;
		}
		if (!validateDob(dob)) {
			System.err.println("Student.init(): Invalid dob (date of birth) = " + dob);
			return;
		}
		
		this.id = id;
		this.firstName = firstName;
		this.givenName = givenName;
		this.lastName = lastName;
		this.address = address;
		this.phone = phone;
		this.dob = dob;
		this.gender = gender;		
	}
	
	/**
	 * @effects <pre>
	 *  if firstName is valid
	 *     set this.firstName = firstName
	 *     return true
	 *  else
	 *     return false
	 * </pre>
	 */
	@DOpt(type = OptType.Mutator) @AttrRef("firstName")
	public boolean setFirstName(String firstName) {
		if (validateFirstName(firstName)) {
			this.firstName = firstName;
			return true;
		}
		return false;		
	}
	
	/**
	 * @effects <pre>
	 * if givenName is valid
	 *    set this.givenName = givenName
	 *    return true
	 * else
	 *    return false
	 * </pre>
	 */
	@DOpt(type = OptType.Mutator) @AttrRef("givenName")
	public boolean setGivenName(String givenName) {
		if (validateGivenName(givenName)) {
			this.givenName = givenName;
			return true; 
		}
		return false;			
	}
	
	/**
	 * @effects <pre>
	 * if lastName is valid
	 *    set this.lastName = lastName
	 *    return true
	 * else
	 *    return false
	 * </pre>
	 */
	@DOpt(type = OptType.Mutator) @AttrRef("lastName")
	public boolean setLastName(String lastName) {
		if (validateLastName(lastName)) {
			this.lastName = lastName;
			return true;
		}
		return false;		
	}
	
	/**
	 * @effects <pre>
	 *  if email is valid
	 *     set this.email = email
	 *     return true
	 *  else
	 *     return false
	 * </pre>
	 */
	@DOpt(type = OptType.Mutator) @AttrRef("email")
	public boolean setEmail(String email) {
		if (validateEmail(email)) {
			this.email = email;
			return true;
		}
		return false;		
	}
	
	/**
	 * @effects <pre>
	 * if address is valid
	 *    set this.address = address
	 *    return true
	 * else
	 *    return false
	 * </pre>
	 */
	@DOpt(type = OptType.Mutator) @AttrRef("address")
	public boolean setAddress(String address) {
		if (validateAddress(address)) {
			this.address = address;
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
	 * </pre>
	 */
	@DOpt(type = OptType.Mutator) @AttrRef("phone")
	public boolean setPhone(String phone) {
		if (validatePhone(phone)) {
			this.phone = phone;
			return true;
		}
		return false;		
	}
	
	/**
	 * @effects return <tt>this.id</tt>
	 */
	@DOpt(type = OptType.Observer) @AttrRef("id")
	public int getId() {
		return this.id;		
	}
	
	/**
	 * @effects return <tt>this.firstName</tt>
	 */
	@DOpt(type = OptType.Observer) @AttrRef("firstName")
	public String getFirstName() {
		return this.firstName;
	}
	
	/**
	 * @effects return <tt>this.givenName</tt>
	 */
	@DOpt(type = OptType.Observer) @AttrRef("givenName")
	public String getGivenName() {
		return this.givenName;
	}
	
	/**
	 * @effects return <tt>this.lastName</tt>
	 */
	@DOpt(type = OptType.Observer) @AttrRef("lastName")
	public String getLastName() {
		return this.lastName;
	}
	
	/**
	 * @effects return <tt>this.email</tt>
	 */
	@DOpt(type = OptType.Observer) @AttrRef("email")
	public String getEmail() {
		return this.email;
	}
	
	/**
	 * @effects return <tt>this.address</tt>
	 */
	@DOpt(type = OptType.Observer) @AttrRef("address")
	public String getAddress() {
		return this.address;
	}
	
	/**
	 * @effects return <tt>this.phone</tt>
	 */
	@DOpt(type = OptType.Observer) @AttrRef("phone")
	public String getPhone() {
		return this.phone;
	}
	
	/**
	 * @effects return <tt>this.dob</tt>
	 */
	@DOpt(type = OptType.Observer) @AttrRef("dob")
	public String getDob() {
		return this.dob;
	}
	
	/**
	 * @effects return <tt>this.gender</tt>
	 */
	@DOpt(type = OptType.Observer) @AttrRef("gender")
	public Gender getGender() {
		return this.gender;
	}
	
	 // return string representation of Student object
	@DOpt(type = OptType.Default)
	@Override
	public String toString() {
		return "Student\n: id = " + id + "\nfirstName = " + firstName + "\ngivenName = " + givenName + "\nlastName = " + lastName
				+ "\nemail = " + email + "\naddress = " + address + "\nphone = " + phone + "\ndob = " + dob + "\ngender = "
				+ gender + "]";
	}
	
	@Override
	public boolean equals(Object o) {
		// check if o is null
		if (o == null)
			return false;
		
		// check if o is a Student
	    if (!(o instanceof Student))
	      return false;
	    
	    // check if o is the same Student (same state/ data)
	    Student other = (Student) o;
	    if (this.id == other.id)
	    	return true;
	    else
	    	return false;
	    	
	  }
	
	/**
	 * @effects <pre>
	 * if id is validate
	 *    return true
	 * else
	 *    return false
	 * </pre>
	 */
	private boolean validateId(int id) {
		// validate min
		if (id <= 0) 
			return false;
		return true;
	}
	
	/**
	 * @effects <pre>
	 * if firstName is validate
	 *    return true
	 * else
	 *    return false
	 * </pre>
	 */
	private boolean validateFirstName(String firstName) {  
		// validate optionality
		if (firstName == null || firstName.isEmpty())   // null, empty
			return false;
		
		// validate length
		if (firstName.length() > 50)   // false length
			return false;
		return true;				
	}
	/**
	 * @effects<pre>
	 * if givenName is validate
	 *    return true
	 * else
	 *    return false
	 *</pre>
	 */
	private boolean validateGivenName(String givenName) {
		// validate optionality
		if (givenName == null || givenName.isEmpty())
			return false;
		
		// validate length
		if (givenName.length() > 50)
			return false;
		return true;				
	}
	
	/**
	 * @effects <pre>
	 * if lastName is validate
	 *    return true
	 * else
	 *    return false
	 * </pre>
	 */
	private boolean validateLastName(String lastName) {
		// validate optionality
		if (lastName == null || lastName.isEmpty())
			return false;
		
		// validate length
		if (lastName.length() > 30)
			return false;
		return true;
	}
	
	/**
	 * @effects <pre>
	 * if email is validate
	 *    return true
	 * else
	 *    return false
	 * </pre>
	 */
	private boolean validateEmail(String email) {
		// optional(email) = true
		if (email != null && email.length() > 255) {        // !empty and false length
			System.err.println("Invalid email (length>255)");
			return false;
			}
		return true;	// null or !empty & length = 255			
	}
	
	/**
	 * @effects <pre>
	 * if address is validate
	 *    return true
	 * else
	 *    return false
	 * </pre>
	 */
	private boolean validateAddress(String address) {
		// validate optionality
		if (address == null || address.isEmpty())
			return false;
		
		// validate length
		if (address.length() > 2000)
			return false;
		return true;				
	}
	
	/**
	 * @effects <pre>
	 * if phone is validate
	 *    return true
	 * else
	 *    return false
	 * </pre>
	 */
	private boolean validatePhone(String phone) {
		// validate optionality
		if (phone == null || phone.isEmpty())
			return false;
		
		// validate length
		if (phone.length() > 20)
			return false;
		return true;
	}
	
	/**
	 * @effects <pre>
	 *  if dob is validate
	 *     return true
	 *  else
	 *     return false
	 * </pre>
	 */
	private boolean validateDob(String dob) {
		// validate optionality
		if (dob == null || dob.isEmpty())
			return false;
		
		// validate length
		if (dob.length() > 20)
			return false;
		return true;
	}
	
	/**
	 * @effects <pre>
	 *  if this satisfies abstract properties
	 *     return true
	 *  else
	 *     return false
	 * </pre>
	 */
	public boolean repOK() {
		return validateId(this.id) && validateFirstName(this.firstName) && validateGivenName(this.givenName)
			   && validateLastName(this.lastName) && validateEmail(this.email) && validateAddress(this.address)
			   && validatePhone(this.phone) && validateDob(this.dob);   //  used to test the implementation
	}

}
