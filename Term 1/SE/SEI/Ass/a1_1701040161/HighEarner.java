package a1_1701040161;

import utils.*;

/**
 * @overview a person that have high incomes that buys goods or services from a store or business..
 * @attributes
 *  income Float
 *
 * @object
 *  A typical highEarner is <pre>HighEarner = <id,n,p,a,i></></pre> where
 *  <pre>id(id), name(n), phoneNumber(p), address(a) , income(i)</pre>
 * @abstract_properties
 *  mutable(id)=false /\ optional(id)=false /\ min(id) = 10^7 /\
 *  mutable(name)=true /\ optional(name)=false /\ length(name) = 50 /\
 *  mutable(phoneNumber)=true /\ optional(phoneNumber)=false /\ length(phoneNumber) = 10 /\
 *  mutable(address)=true /\ optional(address)=false /\ length(address) = 100 /\
 *  mutable(income)=true /\ optional(income)=false /\ min(income) = 10^7
 * @author hoang_an
 */

public class HighEarner extends Customer{

    private static final float MIN_INCOME = 10000000;
    private static final int MIN_ID = 1000000;

    @DomainConstraint(type = "Integer", mutable = false,optional = false, min = MIN_INCOME)
    private float income;

    /**
     * @effects <pre>
     *            if id, name, phoneNumber, address, income a are valid
     *              initialise this as Customer:<id, name, phoneNumber, address, income>
     *            else
     *              print error message
     *          </pre>
     */
    public HighEarner(@AttrRef("id") int id,
                    @AttrRef("name") String name,
                    @AttrRef("phoneNumber") String phoneNumber,
                    @AttrRef("address") String address,
                      @AttrRef("income") float income)
            throws NotPossibleException {
            super(id, name, phoneNumber, address);
            if(validateIncome(income))
                this.income=income;
            else
                throw new NotPossibleException("Customer<init>: invalid arguments");
        }
    /**
     * @effects return <tt>this.income</tt>
     */
    @DOpt(type= OptType.Observer) @AttrRef("income")
    public float getIncome() {
        return income;
    }

    /**
     * @effects <pre>
     *            if income is valid
     *              set this.income = income
     *            else
     *              throws NotPossibleException</pre>
     */
    @DOpt(type=OptType.Mutator) @AttrRef("income")
    public void setIncome(float income) throws NotPossibleException {
        if (validateIncome(income))
            this.income = income;
        else
            throw new NotPossibleException ("Customer.address: invalid address" + income);
    }

    /**
     * @effects <pre>
     *            if < id, name, phoneNumber, address, income > is a valid tuple
     *              return true
     *            else
     *              return false </pre>
     */
    protected boolean validate(int id, String name, String phoneNumber, String address, float income){
        return super.validate(id, name, phoneNumber, address) && validateIncome(income);
    }


    /**
     * @effects <pre>
     *            if income is valid
     *              return true
     *            else
     *              return false</pre>
     */
    protected boolean validateIncome(float income){
        if (income == 0 || income < MIN_INCOME){
            return false;
        }
        else return true;
    }

    /**
     * @effects <pre>
     *            if id is valid
     *              return true
     *            else
     *              return false</pre>
     */
    @Override
    protected boolean validateId(int id) {
        if (id == 0 || id < MIN_ID)
            return false;
        else
            return true;
    }

    /**
     * @effects <pre>
     *            if this satisfies rep invariant
     *              return true
     *            else
     *              return false</pre>
     */
    public boolean repOK() {
        return validate(getId(),getName(),getAddress(),getPhoneNumber(),income);
    }

    @Override
    public String toString() {
        return "HighEarner:<" + getId() + ", " + getName() + ", " + getPhoneNumber() + ", " + getAddress() + ", "+ income + ">";
    }

    @Override
    public boolean equals(Object o){
        if (o == null)
            return false;
        if (!(o instanceof HighEarner))
            return false;
        return this.getId() == ((Customer) o).getId() && this.getName() == ((Customer) o).getName() &&
                this.getPhoneNumber() == ((Customer) o).getPhoneNumber() &&
                this.getAddress() == ((Customer) o).getAddress() && this.getIncome() == ((HighEarner) o).getIncome();
    }
}
