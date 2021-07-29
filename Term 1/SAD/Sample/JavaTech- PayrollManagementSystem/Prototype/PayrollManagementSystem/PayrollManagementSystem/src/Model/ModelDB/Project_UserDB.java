  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.ModelDB;

import Model.Project_User;
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
public class Project_UserDB {

    Connection cn = DBconnection.getConnection();

    public boolean insertPersonInProject(int user_id, int project_id, long project_salary, int project_persentSalary) {
        String sql = "insert into project_user(project_id, user_id, project_salary , project_percentSalary) values (?,?,?,?)";
        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setInt(1, project_id);
            ps.setInt(2, user_id);
            ps.setLong(3, project_salary);
            ps.setInt(4, project_persentSalary);
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Project_UserDB.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public ArrayList<Project_User> getByProjectID(int project_id) {
        String sql = "select * from  project_user where project_id = " + project_id;
        ArrayList<Project_User> box = new ArrayList<>();
        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Project_User project_user = new Project_User(0, 0, 0, 0);
                project_user.setProject_id(rs.getInt("project_id"));
                project_user.setUser_id(rs.getInt("user_id"));
                project_user.setSalary(rs.getLong("project_salary"));
                project_user.setProjectPercentSalary(rs.getInt("project_percentSalary"));
                box.add(project_user);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return box;

    }

    public Project_User getProject_User(int project_id, int user_id) {
        Project_User pu = new Project_User(0, 0, 0, 0);
        String sql = "select * from project_user where project_id=" + project_id + " and " + "user_id=" + user_id;

        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                pu.setProject_id(rs.getInt("project_id"));
                pu.setUser_id(rs.getInt("project_id"));
                pu.setSalary(rs.getLong("project_salary"));
                pu.setProjectPercentSalary(rs.getInt("project_percentSalary"));
            } else {
                return null;
            }
        } catch (SQLException e) {
            Logger.getLogger(UserDB.class.getName()).log(Level.SEVERE, null, e);
        }

        return pu;
    }

    public ArrayList<Project_User> getAllProjects() {
        String sql = "select * from project_user;";
        ArrayList<Project_User> box = new ArrayList<>();
        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Project_User project_user = new Project_User(0, 0, 0, 0);
                project_user.setProject_id(rs.getInt("project_id"));
                project_user.setUser_id(rs.getInt("user_id"));
                project_user.setSalary(rs.getLong("project_salary"));
                project_user.setProjectPercentSalary(rs.getInt("project_percentSalary"));
                box.add(project_user);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDB.class.getName()).log(Level.SEVERE, null, ex);

        }
        return box;
    }

    public boolean updateProjectUserSalary(Project_User pu) {
        String sql = "Update project_user set project_salary = ? "
                + "where project_id = ? and user_id = ? ";
        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setLong(1, pu.getSalary());
            ps.setInt(2, pu.getProject_id());
            ps.setInt(3, pu.getUser_id());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(UserDB.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public ArrayList<Project_User> getByUserID(int user_id) {
        String sql = "select * from  project_user where user_id = " + user_id;
        ArrayList<Project_User> box = new ArrayList<>();
        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Project_User project_user = new Project_User(0, 0, 0, 0);
                project_user.setProject_id(rs.getInt("project_id"));
                project_user.setUser_id(rs.getInt("user_id"));
                project_user.setSalary(rs.getLong("project_salary"));
                project_user.setProjectPercentSalary(rs.getInt("project_percentSalary"));
                box.add(project_user);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return box;

    }
    
    public boolean deleteProUser(int project_id, int user_id){
        String sql = "delete from project_user where user_id = ? and project_id = ?";
        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setInt(1, user_id);
            ps.setInt(2, project_id);
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Project_UserDB.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}
