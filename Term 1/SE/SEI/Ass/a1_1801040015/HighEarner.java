package a1_1801040015;

import utils.AttrRef;
import utils.DomainConstraint;
import utils.NotPossibleException;
import utils.DOpt;
import utils.OptType;

/**
 * @overview Wealthy customers whose income are above a given threshold
 * 
 * @attributes
 * id				int 		Integer
 * name				String
 * phoneNumber		String
 * address			String
 * income			float		Float	
 * 
 * @object A typical High Earner is c = <i, n, p, a, in>, where id(i), name(n), phoneNumber(p), address(a), income(in)
 * 
 * @abstract_properties
 * mutable(id) = false         /\ optional(id) = false          /\ min(id) = 10^7
 * mutable(name) = true        /\ optional(name) = false        /\ length(name) = 50
 * mutable(phoneNumber) = true /\ optional(phoneNumber) = false /\ length(phoneNumber) = 10
 * mutable(address) = true     /\ optional(address) = false     /\ length(address) = 100
 * mutable(income) = true      /\ optional(income) = false      /\ min(income) = 10^7
 * 
 * @author NgocAnh
 *
 */
public class HighEarner extends Customer {
	private static final int MIN_ID = (int) Math.pow(10, 7);
	private static final int MIN_INCOME = (int) Math.pow(10, 7);
	
	@DomainConstraint(type="Float", mutable=true, optional=false, min=10^7)
	private float income;
	
	/**
	 * @effects <pre>
	 * if id, n, p, a, in are valid
	 * 		initialise this as HighEarner: <id, name, phoneNumber, address, income>
	 * else
	 * 		print error message
	 * </pre>
	 */
	public HighEarner(@AttrRef("id") int id, @AttrRef("name") String name, @AttrRef("phoneNumber") String phoneNumber, @AttrRef("address") String address, @AttrRef("income") float income) throws NotPossibleException {
		super(id, name, phoneNumber, address);
		
		if(validateIncome(income))
			this.income = income;
		else
			throw new NotPossibleException("HigheEarner<init>: Invalid income!");
	}
	
	/**
	 * @effects return <tt> this.income </tt>
	 */
	@DOpt(type=OptType.Observer) @AttrRef("income")
	public float getIncome() {
		return this.income;
	}
	
	/**
	 * @effects <pre>
	 * if income is valid
	 * 		set this.income = income
	 * else
	 * 		print error message
	 * </pre>
	 */
	@DOpt(type=OptType.Mutator) @AttrRef("income")
	public void setIncome(float income) {
		if(validateIncome(income))
			this.income=income;
		throw new NotPossibleException("HighEarner.setIncome: invalid income " + income);
	}
	
	@Override
	public boolean repOK() {
		if(super.repOK())
			return validateIncome(income);
		return false;
	}
	
	
	
	@Override
	public String toString() {
		return "HighEarner [income=" + income + "]";
	}

	/**
	 * @effects <pre>
	 * if in is valid
	 * 		return true
	 * else
	 * 		return false
	 * </pre>
	 */
	private boolean validateIncome(float in) {
		if (income < MIN_INCOME)
			return false;
		return true;
	}

}
