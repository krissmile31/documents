package tut9;

import java.util.Vector;
import utils.DomainConstraint;
import utils.AttrRef;

/**
 * @overview SClass is student class, which is a group of students that studies
 *           together throughout a university degree.
 *
 * @attributes 
 * id          Integer       int 
 * name        String 
 * students    Student[]     Vector<Student>
 *
 * @object A typical SClass is <i,n,s>, where id(i), name(n), students(s). 
 * For example, <1,1c10,[]> is an SClass representing the student class
 *         whose id is 1, whose name is 1c10, and whose student list is empty.
 *
 * @abstract_properties 
 * mutable(id)=true        /\ optional(id)=false      /\ min(id)=1       /\
 * mutable(name)=true      /\ optional(name)=false    /\ length(name)=20 /\ 
 * mutable(students)=true  /\ optional(students)=false
 *
 */
public class SClass {
	@DomainConstraint(type = "Integer", mutable = true, optional = false, min = 1)
	private int id;
	@DomainConstraint(type = "String", mutable = true, optional = false, length = 20)
	private String name;
	@DomainConstraint(type = "Vector", mutable = true, optional = false)
	private Vector<Object> students;

	/**
	 * @effects 
	 * if id, name and students are valid 
	 *    initialise this as <id,name,students> 
	 * else 
	 *    print error message "Invalid input"
	 */
	private SClass() {
		
	}
	
	public SClass(@AttrRef("id") int id, @AttrRef("name") String name, @AttrRef("students") Vector students) {   
		if (!validateId(id)) {
			System.err.println("Invalid id=" + id);
			return;
		}
		if (!validateName(name)) {
			System.err.println("Invalid name=" + name);
			return;
		}
		this.id = id;
		this.name = name;
		students = new Vector<>();
		for(Object o : students)
			students.add(o);
		}
	public SClass(Vector<Object> stu) {
		if (!validateStudents(stu)) {
			System.err.println("Invalid students= " + stu);
			return;
		}
		students = new Vector<Object>();
		for (Object o: stu) {
			students.add(o);
	}
	}
	public SClass(Object[] stu) {
		students = new Vector<>();
		for (Object o: stu) 
			students.add(o);
	}
		
	public void add(Object o) {
		if (!this.students.contains(o))
			this.students.add(o);
	}

	/**
	 * @effects return id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @effects <pre>
	 *  if id is valid
	 *     set this.id = id
	 *     return true
	 *  else
	 *     return false
	 *  </pre>
	 */
	public boolean setId(int id) {
		if (validateId(id))	{
			this.id = id;
			return true;
		}
		return false;
	}

	/**
	 * @effects return name
	 */
	public String getName() {
		return name;
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
	public boolean setName(String name) {
		if (validateName(name))	{
			this.name = name;
			return true;
		}
		return false;
	}
	
	/**
	 * @effects <pre>
	 * if students is empty
	 *    return null
	 * else
	 *    return stu
	 */
	public Object[] getStudents() {
		if (students.size() == 0)
			return null;
		else {
			Object[] stu = new Object[students.size()];
			for (int i=0; i<students.size(); i++) 
				stu[i] = students.get(i);
			return stu;
			
		}
	}
	
	/**
	 * @effects <pre>
	 *  if students is valid
	 *     set students.add
	 *     return true
	 *  else
	 *     return false
	 *  </pre>
	 */ 
	public boolean setStudents(Object[] stu) {
		if (validateStudents(students))	{
			students = new Vector<Object>();
			for (Object o: stu) 
				students.add(o);
			return true;
		}
		
		return false;
	}
	
    // return string representation of SClass object
	@Override
	public String toString() {
		return "SClass:<" + id + "," + name + "," + students + ">";
	}
	
	/**
     * @effects <pre>
     *   if id is valid
     *      return true
     *   else
     *      return false
     */
    private boolean validateId(int id) {
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
    	if (name == null || name.isEmpty() || name.length() > 20)
    		return false;
    	return true;
    }
    
    /**
     * @effects <pre>
     *   if students is valid
     *      return true
     *   else
     *      return false
     */
    public boolean validateStudents(Vector<Object> students) {
		for (int i = 0; i < students.size(); i++) {
			for (int j = i + 1; j < students.size(); j++) {
				if (students.get(i) == students.get(j))
					return false;
			}
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
    	return validateId(this.id) && validateName(this.name) && validateStudents(this.students);
    }
}
