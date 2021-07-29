/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.ModelDB;

import Model.User;
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
public class UserDB {

    Connection cn = DBconnection.getConnection();

    public ArrayList<User> getAllUserInfor() {
        String sql = "select * from user;";
        ArrayList<User> users = new ArrayList<>();
        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                User user = new User(0, "", "", "", "", "", "", "", "", "", "", 0);
                user.setUser_id(rs.getInt("user_id"));
                user.setUser_name(rs.getString("user_name").trim());
                user.setUser_password(rs.getString("user_password").trim());
                user.setUser_type(rs.getString("user_type").trim());
                user.setUser_gender(rs.getString("user_gender").trim());
                user.setUser_email(rs.getString("user_email").trim());
                user.setUser_name(rs.getString("user_name").trim());
                user.setUser_address(rs.getString("user_address").trim());
                user.setUser_dob(rs.getString("user_dob").trim());
                user.setUser_phone(rs.getString("user_phone").trim());
                user.setUser_role(rs.getString("user_role").trim());
                user.setUser_department(rs.getString("user_department").trim());
                user.setUser_salary(rs.getLong("user_salary"));
                users.add(user);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return users;
    }

    public User getUserInfor(int user_id) {
        User userInfor = new User(0, "", "", "", "", "", "", "", "", "", "", 0);
        String sql = "select * from user where user_id=" + user_id;
        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                userInfor.setUser_id(rs.getInt("user_id"));
                userInfor.setUser_name(rs.getString("user_name"));
                userInfor.setUser_password(rs.getString("user_password"));
                userInfor.setUser_type(rs.getString("user_type"));
                userInfor.setUser_gender(rs.getString("user_gender"));
                userInfor.setUser_email(rs.getString("user_email"));
                userInfor.setUser_address(rs.getString("user_address"));
                userInfor.setUser_dob(rs.getString("user_dob"));
                userInfor.setUser_phone(rs.getString("user_phone"));
                userInfor.setUser_role(rs.getString("user_role"));
                userInfor.setUser_department(rs.getString("user_department"));
                userInfor.setUser_salary(rs.getLong("user_salary"));
            } else {
                return null;
            }
        } catch (SQLException e) {
            Logger.getLogger(UserDB.class.getName()).log(Level.SEVERE, null, e);
        }

        return userInfor;
    }

    public boolean insertUserInfor(User user) {
        String sql = "insert into user(user_password, user_name, user_type, user_gender, user_email, user_address, user_dob, user_phone, user_role, user_department, user_salary) " + " values(?,?,?,?,?,?,?,?,?,?,?);";
        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, user.getUser_password());
            ps.setString(2, user.getUser_name().trim());
            ps.setString(3, user.getUser_type().trim());
            ps.setString(4, user.getUser_gender().trim());
            ps.setString(5, user.getUser_email().trim());
            ps.setString(6, user.getUser_address().trim());
            ps.setString(7, user.getUser_dob().trim());
            ps.setString(8, user.getUser_phone().trim());
            ps.setString(9, user.getUser_role().trim());
            ps.setString(10, user.getUser_department().trim());
            ps.setLong(11, user.getUser_salary());
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(UserDB.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean deleteUserInfor(int user_id) {
        String sql = "delete from user where user_id = ? ";

        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setInt(1, user_id);
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(UserDB.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean updateUserInfor(User user) {
        String sql = "Update user set " + "user_name = ?,"
                + "user_type = ?,"
                + "user_gender = ?,"
                + "user_email = ?,"
                + "user_address = ?,"
                + "user_dob = ?,"
                + "user_phone = ?,"
                + "user_role = ?,"
                + "user_department = ?,"
                + "user_salary = ? " + " where user_id = ? ;";
        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, user.getUser_name());
            ps.setString(2, user.getUser_type());
            ps.setString(3, user.getUser_gender());
            ps.setString(4, user.getUser_email());
            ps.setString(5, user.getUser_address());
            ps.setString(6, user.getUser_dob());
            ps.setString(7, user.getUser_phone());
            ps.setString(8, user.getUser_role());
            ps.setString(9, user.getUser_department());
            ps.setLong(10, user.getUser_salary());
            ps.setInt(11, user.getUser_id());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(UserDB.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean changePassUser(User user) {
        String sql = "Update user set user_password = ? where user_id = ?";
        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, user.getUser_password());
            ps.setInt(2, user.getUser_id());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(UserDB.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean updateSalary(int user_id, long user_salary) {
        String sql = "Update user set user_salary = ? where user_id = ?";
        PreparedStatement ps;
        try {
            ps = cn.prepareStatement(sql);
            ps.setLong(1, user_salary);
            ps.setInt(2, user_id);
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(UserDB.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

    public ArrayList<User> getUserByRoles(String user_role) {
        String sql = "select * from user where user_role = " + user_role;

        ArrayList<User> users = new ArrayList<>();
        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                User user = new User(0, "", "", "", "", "", "", "", "", "", "", 0);
                user.setUser_id(rs.getInt("user_id"));
                user.setUser_name(rs.getString("user_name").trim());
                user.setUser_password(rs.getString("user_password").trim());
                user.setUser_type(rs.getString("user_type").trim());
                user.setUser_gender(rs.getString("user_gender").trim());
                user.setUser_email(rs.getString("user_email").trim());
                user.setUser_name(rs.getString("user_name").trim());
                user.setUser_address(rs.getString("user_address").trim());
                user.setUser_dob(rs.getString("user_dob").trim());
                user.setUser_phone(rs.getString("user_phone").trim());
                user.setUser_role(rs.getString("user_role").trim());
                user.setUser_department(rs.getString("user_department").trim());
                user.setUser_salary(rs.getLong("user_salary"));
                users.add(user);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return users;
    }

    public ArrayList<User> getUserByDepartment(String user_department) {
        String sql = "select * from user where user_role = " + user_department;

        ArrayList<User> users = new ArrayList<>();
        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                User user = new User(0, "", "", "", "", "", "", "", "", "", "", 0);
                user.setUser_id(rs.getInt("user_id"));
                user.setUser_name(rs.getString("user_name").trim());
                user.setUser_password(rs.getString("user_password").trim());
                user.setUser_type(rs.getString("user_type").trim());
                user.setUser_gender(rs.getString("user_gender").trim());
                user.setUser_email(rs.getString("user_email").trim());
                user.setUser_name(rs.getString("user_name").trim());
                user.setUser_address(rs.getString("user_address").trim());
                user.setUser_dob(rs.getString("user_dob").trim());
                user.setUser_phone(rs.getString("user_phone").trim());
                user.setUser_role(rs.getString("user_role").trim());
                user.setUser_department(rs.getString("user_department").trim());
                user.setUser_salary(rs.getLong("user_salary"));
                users.add(user);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return users;
    }
}
