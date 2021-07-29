/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.ModelDB;


import Model.Role;
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
public class RoleDB {
    Connection cn = DBconnection.getConnection();

    public ArrayList<Role> getAllRole() {
        String sql = "select * from role";
        ArrayList<Role> roleList = new ArrayList<>();
        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Role role = new Role(null, 0);
                role.setRole_name(rs.getString("role_name"));
                role.setRole_basic_salary(rs.getLong("role_basic_salary"));
                roleList.add(role);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return roleList;
    }

    public Role getRole(String role_name) {
        String sql = "select * from role where role_name = " + "'" + role_name +"'";
        Role role = new Role(null, 0);
        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                role.setRole_name(rs.getString("role_name"));
                role.setRole_basic_salary(rs.getLong("role_basic_salary"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProjectDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return role;
    }

    public boolean updateRole(Role role, String previous_name) {
        String sql = "Update role set " + "role_name = ?,"
                + "role_basic_salary = ?" + " where role_name = ? ";
        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, role.getRole_name());
            ps.setLong(2, role.getRole_basic_salary());
            ps.setString(3, previous_name);
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(UserDB.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public boolean addRole(Role role){
        String sql = "insert into role(role_name, role_basic_salary) " + " values(?,?)";
        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, role.getRole_name());
            ps.setLong(2, role.getRole_basic_salary());
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(UserDB.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public boolean deleteRole(String role_name){
        String sql = "delete from role where role_name = ? ";

        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, role_name);
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(UserDB.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
}
