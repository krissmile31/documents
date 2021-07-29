/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.ModelDB;

import Model.LeaveOff;
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
public class LeaveOffDB {

    Connection cn = DBconnection.getConnection();

    public ArrayList<LeaveOff> getAllLeave() {
        String sql = "select * from leaveOff";
        ArrayList<LeaveOff> leaveBox = new ArrayList<>();
        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                LeaveOff l = new LeaveOff(0, 0, "", "", "", "", "", "");
                l.setDocument_id(rs.getInt("leave_id"));
                l.setUser_id(rs.getInt("user_id"));
                l.setDocument_title(rs.getString("leave_title"));
                l.setDocument_description(rs.getString("leave_description"));
                l.setDocument_content(rs.getString("leave_content"));
                l.setDocument_status(rs.getString("leave_status"));
                l.setDocument_post_date(rs.getString("leave_post_date"));
                l.setDocument_process_date(rs.getString("leave_process_date"));
                leaveBox.add(l);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return leaveBox;
    }

    public LeaveOff getLeave(int leave_id) {
        String sql = "select * from leaveoff where leave_id = " + leave_id;
        LeaveOff l = new LeaveOff(0, 0, "", "", "", "", "", "");
        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                l.setDocument_id(rs.getInt("leave_id"));
                l.setUser_id(rs.getInt("user_id"));
                l.setDocument_title(rs.getString("leave_title"));
                l.setDocument_description(rs.getString("leave_description"));
                l.setDocument_content(rs.getString("leave_content"));
                l.setDocument_status(rs.getString("leave_status"));
                l.setDocument_post_date(rs.getString("leave_post_date"));
                l.setDocument_process_date(rs.getString("leave_process_date"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProjectDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return l;
    }

    public boolean updateLeave(LeaveOff leaveoff) {
        String sql = "Update leaveoff set leave_status = ?, leave_process_date = ? " + "where leave_id = ? ";

        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, leaveoff.getDocument_status());
            ps.setString(2, leaveoff.getDocument_process_date());
            ps.setInt(3, leaveoff.getDocument_id());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(UserDB.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public ArrayList<LeaveOff> getByUser(int user_id) {
        String sql = "select * from leaveOff where user_id = " + user_id;
        ArrayList<LeaveOff> leaveBox = new ArrayList<>();
        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                LeaveOff l = new LeaveOff(0, 0, "", "", "", "", "", "");
                l.setDocument_id(rs.getInt("leave_id"));
                l.setUser_id(rs.getInt("user_id"));
                l.setDocument_title(rs.getString("leave_title"));
                l.setDocument_description(rs.getString("leave_description"));
                l.setDocument_content(rs.getString("leave_content"));
                l.setDocument_status(rs.getString("leave_status"));
                l.setDocument_post_date(rs.getString("leave_post_date"));
                l.setDocument_process_date(rs.getString("leave_process_date"));
                leaveBox.add(l);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return leaveBox;
    }

    public boolean addLeave(LeaveOff leave) {
        String sql = "insert into Leaveoff(user_id, leave_title, leave_description, leave_content, leave_status, leave_post_date, leave_process_date) " + " values(?,?,?,?,?,?,?);";
        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setInt(1, leave.getUser_id());
            ps.setString(2, leave.getDocument_title().trim());
            ps.setString(3, leave.getDocument_description().trim());
            ps.setString(4, leave.getDocument_content().trim());
            ps.setString(5, leave.getDocument_status().trim());
            ps.setString(6, leave.getDocument_post_date().trim());
            ps.setString(7, leave.getDocument_process_date().trim());
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(UserDB.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean deleteLeave(int leave_id) {
        String sql = "delete from leaveOff where leave_id = ? ";

        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setInt(1, leave_id);
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(UserDB.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }
}
