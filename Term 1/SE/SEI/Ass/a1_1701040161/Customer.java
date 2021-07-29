package a1_1701040161;

import utils.*;

/**
 * @overview a person or organization that buys goods or services from a store or business.
 * @attributes
 *  id Integer
 *  name String
 *  phoneNumber String
 *  address String
 * @object
 *  A typical customer is <pre>customer = <id,n,p,a></></pre> where
 *  <pre>id(id), name(n), phoneNumber(p), address(a) </pre>
 * @abstract_properties
 *  mutable(id)=false /\ optional(id)=false /\ min(id) = 1 /\ max(id) = 10^9 /\
 *  mutable(name)=true /\ optional(name)=false /\ length(name) = 50 /\
 *  mutable(phoneNumber)=true /\ optional(phoneNumber)=false /\ length(phoneNumber) = 10 /\
 *  mutable(address)=true /\ optional(address)=false /\ length(address) = 100
 * @author hoang_an
 */
    public class Customer implements Comparable {

    private static final int MIN_ID = 1;
    private static final int MAX_ID = 1000000000;
    private static final int LEN_NAME = 50;
    private static final int LEN_PHONE_NUMBER = 10;
    private static final int LEN_ADDRESS = 100;

    @DomainConstraint(type = "Integer", mutable = false,optional = false, min = MIN_ID, max = MAX_ID)
    private int id;
    @DomainConstraint(type = "String", mutable = true,optional = false, length = LEN_NAME)
    private String name;
    @DomainConstraint(type = "String", mutable = true,optional = false, length = LEN_PHONE_NUMBER)
    private String phoneNumber;
    @DomainConstraint(type = "String", mutable = true,optional = false, length = LEN_ADDRESS)
    private String address;


    public Customer(){
    }
    /**
     * @effects <pre>
     *            if id, name, phoneNumber, address a are valid
     *              initialise this as Customer:<id, name, phoneNumber, address>
     *            else
     *              print error message
     *          </pre>
     */
    public Customer(@AttrRef("id") int id,
                   @AttrRef("name") String name,
                   @AttrRef("phoneNumber") String phoneNumber,
                   @AttrRef("address") String address)
    throws NotPossibleException {
        if (validate(id, name, phoneNumber, address)) {
            this.id = id;
            this.name = name;
            this.phoneNumber = phoneNumber;
            this.address = address;
        } else {
            throw new NotPossibleException("Customer<init>: invalid arguments");
        }
    }

    /**
     * @effects return <tt>this.id</tt>
     */
    @DOpt(type=OptType.Observer) @AttrRef("id")
    public int getId() {
        return id;
    }

    /**
     * @effects <pre>
     *            if name is valid
     *              set this.name = name
     *            else
     *              throws NotPossibleException</pre>
     */
    @DOpt(type=OptType.Mutator) @AttrRef("name")
    public void setName(String name) throws NotPossibleException {
        if (validateName(name))
            this.name = name;
        else
            throw new NotPossibleException("Customer.setName: invalid name" + name);
    }

    /**
     * @effects return <tt>this.name</tt>
     */
    @DOpt(type=OptType.Observer) @AttrRef("name")
    public String getName() {
        return name;
    }

    /**
     * @effects <pre>
     *            if address is valid
     *              set this.address = address
     *            else
     *              throws NotPossibleException</pre>
     */
    @DOpt(type=OptType.Mutator) @AttrRef("address")
    public void setAddress(String address)throws NotPossibleException {
        if (validateName(address))
            this.address = address;
        else
            throw new NotPossibleException("Customer.address: invalid address" + address);
    }

    /**
     * @effects return <tt>this.address</tt>
     */
    @DOpt(type=OptType.Observer) @AttrRef("address")
    public String getAddress() {
        return address;
    }

    /**
     * @effects <pre>
     *            if phoneNumber is valid
     *              set this.phoneNumber = phoneNumber
     *            else
     *              throws NotPossibleException</pre>
     */
    @DOpt(type=OptType.Mutator) @AttrRef("phoneNumber")
    public void setPhoneNumber(String phoneNumber)throws NotPossibleException {
        if (validatePhoneNumber(phoneNumber))
            this.phoneNumber = phoneNumber;
        else
            throw new NotPossibleException("Customer.setPhoneNumber: invalid phoneNumber" + phoneNumber);
    }

    /**
     * @effects return <tt>this.phoneNumber</tt>
     */
    @DOpt(type=OptType.Observer) @AttrRef("phoneNumber")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @effects <pre>
     *            if id is valid
     *              return true
     *            else
     *              return false</pre>
     */
    protected boolean validateId(int id){
        if (id == 0 || id < MIN_ID || id > MAX_ID)
            return false;
        else
            return true;
    }

    /**
     * @effects <pre>
     *            if name is valid
     *              return true
     *            else
     *              return false</pre>
     */
    protected boolean validateName(String name){
        if ( name == null || name.length() == 0 || name.length() > LEN_NAME)
            return false;
        else
            return true;
    }

    /**
     * @effects <pre>
     *            if phoneNumber is valid
     *              return true
     *            else
     *              return false</pre>
     */
    protected boolean validatePhoneNumber(String phoneNumber){
        if (phoneNumber == null || phoneNumber.length() == 0 || phoneNumber.length() > LEN_PHONE_NUMBER)
            return false;
        else
            return true;
    }

    /**
     * @effects <pre>
     *            if address is valid
     *              return true
     *            else
     *              return false</pre>
     */
    protected boolean validateAddress(String address){
            if (address == null || address.length() == 0 || address.length() > LEN_ADDRESS)
                return false;
            else
                return true;
        }

    /**
     * @effects <pre>
     *            if < id, name, phoneNumber, address > is a valid tuple
     *              return true
     *            else
     *              return false </pre>
     */
    protected boolean validate(int id, String name, String phoneNumber, String address){
        return validateName(name) &&
                validatePhoneNumber(phoneNumber) && validateAddress(address) && validateId(id);
    }

    /**
     * @effects <pre>
     *            if this satisfies rep invariant
     *              return true
     *            else
     *              return false</pre>
     */
    public boolean repOK() {
        return validate(id, phoneNumber, name, address);
    }

    @Override
    public boolean equals(Object o){
        if (o == null)
            return false;
        if (!(o instanceof Customer))
            return false;
        return this.getId() == ((Customer) o).getId() && this.getName() == ((Customer) o).getName() &&
                this.getPhoneNumber() == ((Customer) o).getPhoneNumber() &&
                 this.getAddress() == ((Customer) o).getAddress();
    }
    @Override
    public String toString() {
            return "Customer:<" + id + ", " + name + ", " + phoneNumber +	", " + address + ">";
    }


    /**
     * @effects <pre>
     *          if o is null throws NullPointerException
     *          else if os does not have type Customer throws ClassCastException
     *          return Comparable.compareTo method
     *      </pre>
     */
    public int compareTo(Object o)
            throws NullPointerException, ClassCastException {
        // compare two customer objects by name
        if (o == null)
            throw new NullPointerException("Customer.compareByName");
        else if (!(o instanceof Customer))
            throw new ClassCastException("Customer.compareByName: not a Customer " + o);
        Customer c = (Customer) o;
        return this.getName().compareTo(c.getName());
    }

    }


