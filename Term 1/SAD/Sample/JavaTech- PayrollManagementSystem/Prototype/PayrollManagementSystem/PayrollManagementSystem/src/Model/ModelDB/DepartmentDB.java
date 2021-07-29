/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.ModelDB;

import Model.Department;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tuqua
 */
public class DepartmentDB {

    Connection cn = DBconnection.getConnection();

    public ArrayList<Department> getAllDepartments() {
        String sql = "select * from department";
        ArrayList<Department> deplist = new ArrayList<>();
        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Department department = new Department(null, 0);
                department.setDepartment_name(rs.getString("department_name"));
                department.setDepartment_basic_salary(rs.getLong("department_basic_salary"));
                deplist.add(department);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return deplist;
    }

    public Department getDepartment(String de_name) {
        String sql = "select * from department where department_name = " + "'" + de_name +"'";
        Department department = new Department(null, 0);
        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                department.setDepartment_name(rs.getString("department_name"));
                department.setDepartment_basic_salary(rs.getLong("department_basic_salary"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProjectDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return department;
    }

    public boolean updateDepartment(Department department, String previous_name) {
        String sql = "Update department set " + "department_name = ?,"
                + "department_basic_salary = ?" + " where department_name = ? ";
        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, department.getDepartment_name());
            ps.setLong(2, department.getDepartment_basic_salary());
            ps.setString(3, previous_name);
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(UserDB.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean addDeparment(Department department) {
        String sql = "insert into department(department_name, department_basic_salary) " + " values(?,?)";
        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, department.getDepartment_name());
            ps.setLong(2, department.getDepartment_basic_salary());
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(UserDB.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean deleteDepartment(String de_name) {
        String sql = "delete from department where department_name = ? ";

        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, de_name);
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(UserDB.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}
