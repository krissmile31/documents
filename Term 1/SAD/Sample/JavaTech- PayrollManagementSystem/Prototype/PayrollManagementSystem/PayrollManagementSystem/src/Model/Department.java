/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author tuqua
 */
public class Department {
    private String department_name;
    private long department_basic_salary;

    public Department(String department_name, long department_basic_salary) {
        this.department_name = department_name;
        this.department_basic_salary = department_basic_salary;
    }

    public String getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }

    public long getDepartment_basic_salary() {
        return department_basic_salary;
    }

    public void setDepartment_basic_salary(long department_basic_salary) {
        this.department_basic_salary = department_basic_salary;
    }
    
    
}
