/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.ControllerAdminView;
import Model.ModelDB.UserDB;
import View.ViewLogin;
import java.sql.Date;

/**
 *
 * @author tuqua
 */
public class User {

    private int user_id;
    private String user_password;
    private String user_name;
    private String user_type;
    private String user_gender;
    private String user_email;
    private String user_address;
    private String user_dob;
    private String user_phone;
    private String user_role;
    private String user_department;
    private long user_salary;

    public User(int user_id, String user_password, String user_name, String user_type, String user_gender, String user_email, String user_address, String user_dob, String user_phone, String user_role, String user_department, long user_salary) {
        this.user_id = user_id;
        this.user_password = user_password;
        this.user_name = user_name;
        this.user_type = user_type;
        this.user_gender = user_gender;
        this.user_email = user_email;
        this.user_address = user_address;
        this.user_dob = user_dob;
        this.user_phone = user_phone;
        this.user_role = user_role;
        this.user_department = user_department;
        this.user_salary = user_salary;
    }

    //-----------------------------getter------------------------------------------
    public int getUser_id() {
        return user_id;
    }

    public String getUser_password() {
        return user_password;
    }

    public String getUser_name() {
        return user_name;
    }

    public String getUser_type() {
        return user_type;
    }

    public String getUser_gender() {
        return user_gender;
    }

    public String getUser_email() {
        return user_email;
    }

    public String getUser_address() {
        return user_address;
    }

    public String getUser_dob() {
        return user_dob;
    }

    public String getUser_phone() {
        return user_phone;
    }

    public String getUser_role() {
        return user_role;
    }

    public String getUser_department() {
        return user_department;
    }

    public long getUser_salary() {
        return user_salary;
    }

//-----------------------------------setter--------------------------------------
    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public void setUser_password(String user_pasword) {
        this.user_password = user_pasword;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public void setUser_type(String user_type) {
        this.user_type = user_type;
    }

    public void setUser_gender(String user_gender) {
        this.user_gender = user_gender;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public void setUser_address(String user_address) {
        this.user_address = user_address;
    }

    public void setUser_dob(String user_dob) {
        this.user_dob = user_dob;
    }

    public void setUser_phone(String user_phone) {
        this.user_phone = user_phone;
    }

    public void setUser_role(String user_role) {
        this.user_role = user_role;
    }

    public void setUser_department(String user_department) {
        this.user_department = user_department;
    }

    public void setUser_salary(long user_salary) {
        this.user_salary = user_salary;
    }

    @Override
    public String toString() {
        String str = "----------------------IT: Company 1-C17----------------------\n"
                + "Report Information User\n"
                + "\n"
                + "\n"
                + "User Name: " + getUser_name() + "\n"
                + "User Email: " + getUser_email() + "\n"
                + "User Gender: " + getUser_gender() + "\n"
                + "User Phone: " + getUser_phone() + "\n"
                + "User Address: " + getUser_address() + "\n"
                + "User Dob: " + getUser_dob() + "\n"
                + "User Phone: " + getUser_phone() + "\n"
                + "User Type: " + getUser_type() + "\n"
                + "User Role: " + getUser_role() + "\n"
                + "User Department: " + getUser_department() + "\n"
                + "User Salary: " + getUser_salary() + "\n"
                + "\n"
                + "\n"
                + "---------------------------------------------------------------------";

        return str;
    }
}
