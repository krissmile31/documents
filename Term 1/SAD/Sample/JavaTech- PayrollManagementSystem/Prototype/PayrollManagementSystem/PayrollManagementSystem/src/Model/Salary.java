/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Quan Trong Tu
 */
public class Salary {

    private int user_id;
    private String user_name;
    private long role_salary;
    private long department_salary;
    private long projectSalary;
    private long absenceSalary;
    private long overTimeSalary;
    private long bonusSalary;
    private long minusSalary;
    private long totalSalary;
    private String salary_month;
    private String salary_year;

    public Salary(int user_id, String user_name, long role_salary, long department_salary, long projectSalary, long absenceSalary, long overTimeSalary, long bonusSalary, long minusSalary, long totalSalary, String salary_month, String salary_year) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.role_salary = role_salary;
        this.department_salary = department_salary;
        this.projectSalary = projectSalary;
        this.absenceSalary = absenceSalary;
        this.overTimeSalary = overTimeSalary;
        this.bonusSalary = bonusSalary;
        this.minusSalary = minusSalary;
        this.totalSalary = totalSalary;
        this.salary_month = salary_month;
        this.salary_year = salary_year;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public long getProjectSalary() {
        return projectSalary;
    }

    public void setProjectSalary(long projectSalary) {
        this.projectSalary = projectSalary;
    }

    public long getAbsenceSalary() {
        return absenceSalary;
    }

    public void setAbsenceSalary(long absenceSalary) {
        this.absenceSalary = absenceSalary;
    }

    public long getOverTimeSalary() {
        return overTimeSalary;
    }

    public void setOverTimeSalary(long overTimeSalary) {
        this.overTimeSalary = overTimeSalary;
    }

    public long getBonusSalary() {
        return bonusSalary;
    }

    public void setBonusSalary(long bonusSalary) {
        this.bonusSalary = bonusSalary;
    }

    public long getMinusSalary() {
        return minusSalary;
    }

    public void setMinusSalary(long minusSalary) {
        this.minusSalary = minusSalary;
    }

    public String getSalary_month() {
        return salary_month;
    }

    public void setSalary_month(String salary_month) {
        this.salary_month = salary_month;
    }

    public String getSalary_year() {
        return salary_year;
    }

    public void setSalary_year(String salary_year) {
        this.salary_year = salary_year;
    }

    public long getTotalSalary() {
        return totalSalary;
    }

    public void setTotalSalary(long totalSalary) {
        this.totalSalary = totalSalary;
    }

    public long getRole_salary() {
        return role_salary;
    }

    public void setRole_salary(long role_salary) {
        this.role_salary = role_salary;
    }

    public long getDepartment_salary() {
        return department_salary;
    }

    public void setDepartment_salary(long department_salary) {
        this.department_salary = department_salary;
    }
}
