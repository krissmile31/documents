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
 *      HighEarner, which is a sub class of Customer, represents wealthy
 *     customers whose income are above a given threshold.
 *           </pre>
 *
 * @attribute
 * 
 *            <pre>
 *      income      Float     float
 *            </pre>
 *
 * @abstract_properties
 * 
 *                      <pre>
 *      P_Customer.id /\ min(id) = 10000000
 *      mutable(income) = true /\ optional(income) = false /\ min(income) = 10000000
 *                      </pre>
 * 
 * @author tungpd
 */
public class HighEarner extends Customer implements Document {
  // const for min id
  private static final float MIN_ID = 10000000;
  // const for min income
  private static final float MIN_INCOME = 10000000;

  @DomainConstraint(type = "Float", mutable = true, optional = false, min = MIN_INCOME)
  private float income;

  /**
   * @param id
   * @param name
   * @param phoneNumber
   * @param address
   * @param income
   * @effects
   * 
   *          <pre>
   *      if id, name, phoneNumber, address, income are valid
   *          initialize <tt>this</tt> as <id,name,phoneNumber,address,income>
   *      else
   *          throws NotPossibleException
   *          </pre>
   *
   */
  public HighEarner(@AttrRef("id") int id, @AttrRef("name") String name, @AttrRef("phoneNumber") String phoneNumber,
      @AttrRef("address") String address, @AttrRef("income") float income) throws NotPossibleException {
    super(id, name, phoneNumber, address);
    if (validateIncome(income))
      this.income = income;
    else
      throw new NotPossibleException("Invalid income" + income);
  }

  /**
   * @effects return <tt>this.income</tt>
   * @return
   */
  @DOpt(type = OptType.Observer)
  @AttrRef("income")
  public float getIncome() {
    return this.income;
  }

  /**
   * @effect
   * 
   *         <pre>
   *          if income is valid
   *              this.income = income
   *          else
   *              throws NotPossibleException
   *         </pre>
   * 
   * @requires nothing special, just income is ok
   */
  @DOpt(type = OptType.Mutator)
  @AttrRef("income")
  public void setIncome(float income) throws NotPossibleException {
    if (validateIncome(income)) {
      this.income = income;
    } else {
      throw new NotPossibleException("Invalid income" + income);
    }
  }

  /**
   * @effect
   * 
   *         <pre>
   *              if income is valid
   *                  return true
   *              else
   *                  return false
   *         </pre>
   */
  private boolean validateIncome(float income) {
    return (income >= MIN_INCOME);
  }

  /**
   * @effects
   * 
   *          <pre>
   *            if id is valid
   *              return true
   *            else
   *              return false
   *          </pre>
   * 
   * @return
   */
  @DomainConstraint(type = "Integer", mutable = false, optional = false, min = MIN_ID)
  @Override
  protected boolean validateId(int id) {
    return id >= MIN_ID;
  }

  @Override
  public String toString() {
    return "HighEarner:<" + super.getId() + ", " + super.getName() + ", " + super.getPhoneNumber() + ", "
        + super.getAddress() + ", " + income + ">";
  }

  @Override
  public boolean repOK() {
    return (super.repOK() && validateIncome(income));
  }

  /**
   * @effect
   * 
   *         <pre>
   *          return convert String to a html document
   * 					as string as well
   *         </pre>
   */
  @Override
  public String toHtmlDoc() {
    StringBuffer sb = new StringBuffer();
    sb.append("<html>");
    sb.append("<head>");
    sb.append("<title>HighEarner: " + super.getId() + "-" + super.getName() + "</title>");
    sb.append("</head>");
    sb.append("<body>");
    sb.append(super.getId() + " " + super.getName() + " " + super.getPhoneNumber() + " " + super.getAddress() + " "
        + this.getIncome());
    sb.append("</body></html>");
    return sb.toString();
  }

}
