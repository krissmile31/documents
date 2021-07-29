package a3_1801040015.fsis;

import utils.AttrRef;
import utils.DomainConstraint;
import utils.DOpt;
import utils.OptType;
import utils.NotPossibleException;

/**
 * @overview HighEarner represents wealthy customers whose income are above a given threshold
 * @attributes
 * income		Float
 * @object A typical HigheEarner is h = <i, n, p, a, s> where id(i), name(n), phoneNumber(p), address(a), income(s)
 * @abstract_properties
 * mutable(id) = false 	       /\ optional(id) = false          /\ min(id) = 10^7
 * mutable(name) = true        /\ optional(name) = false        /\ length(name) = 50
 * mutable(phoneNumber) = true /\ optional(phoneNumber) = false /\ length(phoneNumber) = 10
 * mutable(address) = true     /\ optional(address) = false     /\ length(address) = 100
 * mutable(income) = true      /\ optional(income) = false      /\ min(income) = 10^7
 * 
 * @author NgocAnh
 */
public class HighEarner extends Customer {
	
	// extra attribute
	@DomainConstraint(type="Float", mutable = true, optional = false, min = 10^7)
	private float income;
	
	/**
	 * @effects<pre>
	 * if id, name, phoneNumber, address, income are valid
	 * 		initialise this as HighEarner: <id, name, phoneNumber, address, income>
	 * else
	 * 		throws NotPossibleException
	 * </pre>
	 */
	public HighEarner(@AttrRef("id") int id, @AttrRef("name")String name, @AttrRef("phoneNumber") String phoneNumber, @AttrRef("address") String address, @AttrRef("income") float income)
			throws NotPossibleException {
		// inherited attributes from superclass
		super(id, name, phoneNumber, address);
		
		// check valid income
		if (!validateIncome(income))
			throw new NotPossibleException("HighEarner<init>: Invalid income!");
		
		// valid income
		this.income = income;
	}
	
	/**
	 * @effects<pre>
	 * if income is valid
	 * 		set this.income = income
	 * else
	 * 		throws NotPossibleException
	 * </pre>
	 */
	@DOpt(type=OptType.Mutator) @AttrRef("id")
	public void setIncome(float income) {
		if (validateIncome(income))
			this.income = income;
		else
			throw new NotPossibleException("HighEarner.setIncome:\n invalid income: " + income);
	}
	
	/**
	 * @effects return <tt>this.income</tt>
	 */
	@DOpt(type=OptType.Observer) @AttrRef("income")
	public float getIncome() {
		return this.income;
	}
	
	@Override
	public boolean repOK() {
		// validate other attributes first
		if (super.repOK())
			// validate income
			return validateIncome(income);
		// invalid
		return false;
	}
	
	

	@Override
	public String toString() {
		return "HighEarner [" + super.toString() + "income=" + income + "]";
	}

	/**
	 * @effects<pre>
	 * if id is valid
	 * 		return true
	 * else
	 * 		return false
	 * </pre>
	 */
	@Override
	@DomainConstraint(type = "Integer",min = 10^7, optional = false)
	protected boolean validateId(int id) {
		if (id < Math.pow(10, 7))
			return false;
		// valid
		return true;
	}
	
	/**
	 * @effects<pre>
	 * if income is valid
	 * 		return true
	 * else
	 * 		return false
	 * </pre>
	 */
	protected boolean validateIncome(float income) {
		if (income < Math.pow(10, 7))
			return false;
		// valid
		return true;
	}	
	
	/**
	 * @effects <pre>
	 * return String to a HTML document
	 * </pre>
	 */
	@Override
	public String toHtmlDoc() {
		StringBuffer file = new StringBuffer();
		file.append("<html>");
		file.append("<head>");
		file.append("<title>");
		file.append("HighEarner: " + super.getId() + "-" + super.getName());
		file.append("</title>");
		file.append("</head>");
		file.append("<body>");
		file.append(super.getId() + " " + super.getName() + " " + super.getPhoneNumber() + " " + super.getAddress() + " " + this.getIncome());
		return file.toString();
	}
}
