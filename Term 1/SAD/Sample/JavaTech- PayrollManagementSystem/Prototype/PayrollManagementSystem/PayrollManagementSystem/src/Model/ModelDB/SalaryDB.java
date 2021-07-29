/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.ModelDB;

import Model.Salary;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Quan Trong Tu
 */
public class SalaryDB {

    Connection cn = DBconnection.getConnection();

    public ArrayList<Salary> getAllSalary() {
        String sql = "select * from salary";
        ArrayList<Salary> salaryList = new ArrayList<>();
        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Salary salary = new Salary(0, "", 0, 0, 0, 0, 0, 0, 0, 0, "", "");
                salary.setUser_id(rs.getInt("user_id"));
                salary.setUser_name(rs.getString("user_name"));
                salary.setRole_salary(rs.getLong("role_salary"));
                salary.setDepartment_salary(rs.getLong("department_salary"));
                salary.setProjectSalary(rs.getLong("user_projectSalary"));
                salary.setAbsenceSalary(rs.getLong("user_absenceSalary"));
                salary.setOverTimeSalary(rs.getLong("user_overTimeSalary"));
                salary.setBonusSalary(rs.getLong("user_bonusSalary"));
                salary.setMinusSalary(rs.getLong("user_minusSalary"));
                salary.setTotalSalary(rs.getLong("user_totalSalary"));
                salary.setSalary_month(rs.getString("salary_month"));
                salary.setSalary_year(rs.getString("salary_year"));
                salaryList.add(salary);
            }

        } catch (SQLException ex) {
            Logger.getLogger(SalaryDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return salaryList;
    }

    public ArrayList<Salary> getSalaryByUser(int user_id) {
        String sql = "select * from salary where user_id = " + user_id;
        ArrayList<Salary> salaryList = new ArrayList<>();
        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Salary salary = new Salary(0, "", 0, 0, 0, 0, 0, 0, 0, 0, "", "");
                salary.setUser_id(rs.getInt("user_id"));
                salary.setUser_name(rs.getString("user_name"));
                salary.setRole_salary(rs.getLong("role_salary"));
                salary.setDepartment_salary(rs.getLong("department_salary"));
                salary.setProjectSalary(rs.getLong("user_projectSalary"));
                salary.setAbsenceSalary(rs.getLong("user_absenceSalary"));
                salary.setOverTimeSalary(rs.getLong("user_overTimeSalary"));
                salary.setBonusSalary(rs.getLong("user_bonusSalary"));
                salary.setMinusSalary(rs.getLong("user_minusSalary"));
                salary.setTotalSalary(rs.getLong("user_totalSalary"));
                salary.setSalary_month(rs.getString("salary_month"));
                salary.setSalary_year(rs.getString("salary_year"));
                salaryList.add(salary);
            }

        } catch (SQLException ex) {
            Logger.getLogger(SalaryDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return salaryList;
    }

    public ArrayList<Salary> getSalaryByMonth(String month) {
        String sql = "select * from salary where salary_month = " + month;
        ArrayList<Salary> salaryList = new ArrayList<>();
        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Salary salary = new Salary(0, "", 0, 0, 0, 0, 0, 0, 0, 0, "", "");
                salary.setUser_id(rs.getInt("user_id"));
                salary.setUser_name(rs.getString("user_name"));
                salary.setRole_salary(rs.getLong("role_salary"));
                salary.setDepartment_salary(rs.getLong("department_salary"));
                salary.setProjectSalary(rs.getLong("user_projectSalary"));
                salary.setAbsenceSalary(rs.getLong("user_absenceSalary"));
                salary.setOverTimeSalary(rs.getLong("user_overTimeSalary"));
                salary.setBonusSalary(rs.getLong("user_bonusSalary"));
                salary.setMinusSalary(rs.getLong("user_minusSalary"));
                salary.setTotalSalary(rs.getLong("user_totalSalary"));
                salary.setSalary_month(rs.getString("salary_month"));
                salary.setSalary_year(rs.getString("salary_year"));
                salaryList.add(salary);
            }

        } catch (SQLException ex) {
            Logger.getLogger(SalaryDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return salaryList;

    }

    public ArrayList<Salary> getSalaryByYear(String year) {
        String sql = "select * from salary where salary_year = " + year;
        ArrayList<Salary> salaryList = new ArrayList<>();
        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Salary salary = new Salary(0, "", 0, 0, 0, 0, 0, 0, 0, 0, "", "");
                salary.setUser_id(rs.getInt("user_id"));
                salary.setUser_name(rs.getString("user_name"));
                salary.setRole_salary(rs.getLong("role_salary"));
                salary.setDepartment_salary(rs.getLong("department_salary"));
                salary.setProjectSalary(rs.getLong("user_projectSalary"));
                salary.setAbsenceSalary(rs.getLong("user_absenceSalary"));
                salary.setOverTimeSalary(rs.getLong("user_overTimeSalary"));
                salary.setBonusSalary(rs.getLong("user_bonusSalary"));
                salary.setMinusSalary(rs.getLong("user_minusSalary"));
                salary.setTotalSalary(rs.getLong("user_totalSalary"));
                salary.setSalary_month(rs.getString("salary_month"));
                salary.setSalary_year(rs.getString("salary_year"));
                salaryList.add(salary);
            }

        } catch (SQLException ex) {
            Logger.getLogger(SalaryDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return salaryList;
    }

    public boolean addSalary(Salary salary) {
        String sql = "insert into salary values(?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setInt(1, salary.getUser_id());
            ps.setString(2, salary.getUser_name());
            ps.setLong(3, salary.getRole_salary());
            ps.setLong(4, salary.getDepartment_salary());
            ps.setLong(5, salary.getProjectSalary());
            ps.setLong(6, salary.getAbsenceSalary());
            ps.setLong(7, salary.getOverTimeSalary());
            ps.setLong(8, salary.getBonusSalary());
            ps.setLong(9, salary.getMinusSalary());
            ps.setLong(10, salary.getTotalSalary());
            ps.setString(11, salary.getSalary_month());
            ps.setString(12, salary.getSalary_year());
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(UserDB.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean updateSalary(Salary salary) {
        String sql = "update salary set user_id = ?, user_name = ?, role_salary = ?, department_salary = ?,user_projectSalary = ? , user_absenceSalary = ?, user_overTimeSalary = ?, user_bonusSalary = ?, user_minusSalary = ?, user_totalSalary = ? where user_id = ? and salary_month = ? and salary_year = ? ";
        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setInt(1, salary.getUser_id());
            ps.setString(2, salary.getUser_name());
            ps.setLong(3, salary.getRole_salary());
            ps.setLong(4, salary.getDepartment_salary());
            ps.setLong(5, salary.getProjectSalary());
            ps.setLong(6, salary.getAbsenceSalary());
            ps.setLong(7, salary.getOverTimeSalary());
            ps.setLong(8, salary.getBonusSalary());
            ps.setLong(9, salary.getMinusSalary());
            ps.setLong(10, salary.getTotalSalary());
            ps.setLong(11, salary.getUser_id());
            ps.setString(12, salary.getSalary_month());
            ps.setString(13, salary.getSalary_year());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(UserDB.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}
