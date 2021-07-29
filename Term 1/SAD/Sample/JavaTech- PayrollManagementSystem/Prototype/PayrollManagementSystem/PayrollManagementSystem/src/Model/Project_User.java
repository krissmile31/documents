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
public class Project_User {
    private int project_id;
    private int user_id;
    private long salary;
    private int projectPercentSalary;

    public Project_User(int project_id, int user_id, long salary, int ps) {
        this.project_id = project_id;
        this.user_id = user_id;
        this.salary = salary;
        this.projectPercentSalary = ps;
    }

    public int getProjectPercentSalary() {
        return projectPercentSalary;
    }

    public void setProjectPercentSalary(int projectPercentSalary) {
        this.projectPercentSalary = projectPercentSalary;
    }
    
    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public int getProject_id() {
        return project_id;
    }

    public void setProject_id(int project_id) {
        this.project_id = project_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
}
