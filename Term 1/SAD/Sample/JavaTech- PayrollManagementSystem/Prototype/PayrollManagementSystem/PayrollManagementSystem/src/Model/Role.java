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
public class Role {
    private String role_name;
    private long role_basic_salary;

    public Role(String role_name, long role_basic_salary) {
        this.role_name = role_name;
        this.role_basic_salary = role_basic_salary;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    public long getRole_basic_salary() {
        return role_basic_salary;
    }

    public void setRole_basic_salary(long role_basic_salary) {
        this.role_basic_salary = role_basic_salary;
    }
    
    
}
