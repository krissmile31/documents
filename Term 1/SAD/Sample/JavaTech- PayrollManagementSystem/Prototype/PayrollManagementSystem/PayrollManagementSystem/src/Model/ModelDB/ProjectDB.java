/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.ModelDB;

import Model.Project;
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
public class ProjectDB {

    Connection cn = DBconnection.getConnection();

    public boolean insertProjectInfor(Project project) {
        String sql = "insert into project(project_title, project_description, project_content, project_totalEarning, project_startDate, project_endDate) " + "values(?,?,?,?,?,?)";
        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, project.getProjectTitle());
            ps.setString(2, project.getProjectDescription());
            ps.setString(3, project.getProjectContent());
            ps.setLong(4, project.getProjectTotalEarning());
            ps.setString(5, project.getProject_startDate());
            ps.setString(6, project.getProject_endDate());
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(UserDB.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public ArrayList<Project> getAllProjectInfor() {
        String sql = "select * from project;";
        ArrayList<Project> projects = new ArrayList<>();
        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Project project = new Project(0, "", "", "", 0, "", "");
                project.setProjectId(rs.getInt("project_id"));
                project.setProjectTitle(rs.getString("project_title").trim());
                project.setProjectDescription((rs.getString("project_description").trim()));
                project.setProjectContent((rs.getString("project_content").trim()));
                project.setProjectTotalEarning(rs.getLong("project_totalEarning"));
                project.setProject_startDate(rs.getString("project_startDate"));
                project.setProject_endDate(rs.getString("project_endDate"));
                projects.add(project);
            }

        } catch (SQLException ex) {
            Logger.getLogger(UserDB.class.getName()).log(Level.SEVERE, null, ex);

        }
        return projects;
    }

    public Project getProjectInfor(int project_id) {
        String sql = "select * from project where project_id = " + project_id;
        Project project = new Project(0, "", "", "", 0, "", "");
        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                project.setProjectId(rs.getInt("project_id"));
                project.setProjectTitle(rs.getString("project_title").trim());
                project.setProjectDescription(rs.getString("project_description").trim());
                project.setProjectContent(rs.getString("project_content").trim());
                project.setProjectTotalEarning(rs.getLong("project_totalEarning"));
                project.setProject_startDate(rs.getString("project_startDate"));
                project.setProject_endDate(rs.getString("project_endDate"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProjectDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return project;
    }

    public boolean updateProjectInfor(Project project) {
        String sql = "Update project set " + "project_title = ?,"
                + "project_description = ?,"
                + "project_content = ?,"
                + "project_totalEarning = ?,"
                + "project_startDate = ?,"
                + "project_endDate = ?"
                + " where project_id = ? ;";
        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, project.getProjectTitle());
            ps.setString(2, project.getProjectDescription());
            ps.setString(3, project.getProjectContent());
            ps.setLong(4, project.getProjectTotalEarning());
            ps.setString(5, project.getProject_startDate());
            ps.setString(6, project.getProject_endDate());
            ps.setInt(7, project.getProjectId());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(UserDB.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean deleteProInfor(int project_id) {
        String sql = "delete from project where project_id = ? ";

        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setInt(1, project_id);
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(UserDB.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}
