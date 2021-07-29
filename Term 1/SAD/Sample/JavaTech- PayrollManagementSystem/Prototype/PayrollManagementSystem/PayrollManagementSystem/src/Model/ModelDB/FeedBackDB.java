/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.ModelDB;

import Model.FeedBack;
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
public class FeedBackDB {

    Connection cn = DBconnection.getConnection();

    public ArrayList<FeedBack> getAllFeedBack() {
        String sql = "select * from feedback";
        ArrayList<FeedBack> feedBackBox = new ArrayList<>();
        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                FeedBack feedBack = new FeedBack(0, 0, "", "", "", "", "", "");
                feedBack.setDocument_id(rs.getInt("feedback_id"));
                feedBack.setUser_id(rs.getInt("user_id"));
                feedBack.setDocument_title(rs.getString("feedback_title"));
                feedBack.setDocument_description(rs.getString("feedback_description"));
                feedBack.setDocument_content(rs.getString("feedback_content"));
                feedBack.setDocument_status(rs.getString("feedback_status"));
                feedBack.setDocument_post_date(rs.getString("feedback_post_date"));
                feedBack.setDocument_process_date(rs.getString("feedback_process_date"));
                feedBackBox.add(feedBack);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return feedBackBox;
    }

    public FeedBack getFeedBack(int feedback_id) {
        String sql = "select * from feedback where feedback_id = " + feedback_id;
        FeedBack feedBack = new FeedBack(0, 0, "", "", "", "", "", "");
        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                feedBack.setDocument_id(rs.getInt("feedback_id"));
                feedBack.setUser_id(rs.getInt("user_id"));
                feedBack.setDocument_title(rs.getString("feedback_title"));
                feedBack.setDocument_description(rs.getString("feedback_description"));
                feedBack.setDocument_content(rs.getString("feedback_content"));
                feedBack.setDocument_status(rs.getString("feedback_status"));
                feedBack.setDocument_post_date(rs.getString("feedback_post_date"));
                feedBack.setDocument_process_date(rs.getString("feedback_process_date"));
            } else {
                return null;
            }
        } catch (SQLException ex) {
            Logger.getLogger(FeedBackDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return feedBack;
    }

    public ArrayList<FeedBack> getByUserId(int user_id) {
        String sql = "select * from feedback where user_id = " + user_id;
        ArrayList<FeedBack> feedBackBox = new ArrayList<>();
        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                FeedBack feedBack = new FeedBack(0, 0, "", "", "", "", "", "");
                feedBack.setDocument_id(rs.getInt("feedback_id"));
                feedBack.setUser_id(rs.getInt("user_id"));
                feedBack.setDocument_title(rs.getString("feedback_title"));
                feedBack.setDocument_description(rs.getString("feedback_description"));
                feedBack.setDocument_content(rs.getString("feedback_content"));
                feedBack.setDocument_status(rs.getString("feedback_status"));
                feedBack.setDocument_post_date(rs.getString("feedback_post_date"));
                feedBack.setDocument_process_date(rs.getString("feedback_process_date"));
                feedBackBox.add(feedBack);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return feedBackBox;
    }

    public boolean updateStatus(FeedBack fb) {
        String sql = "Update feedback set feedback_status = ?, feedback_process_date = ? " + "where feedback_id = ? ";

        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, fb.getDocument_status());
            ps.setString(2, fb.getDocument_process_date());
            ps.setInt(3, fb.getDocument_id());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(UserDB.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean deleteFeedBack(int feedback_id) {
        String sql = "delete from feedback where feedback_id = ? ";

        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setInt(1, feedback_id);
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(UserDB.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

    public boolean addFeedBack(FeedBack feedBack) {
        String sql = "insert into feedback(user_id, feedback_title, feedback_description, feedback_content, feedback_status, feedback_post_date, feedback_process_date) " + " values(?,?,?,?,?,?,?);";
        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setInt(1, feedBack.getUser_id());
            ps.setString(2, feedBack.getDocument_title().trim());
            ps.setString(3, feedBack.getDocument_description().trim());
            ps.setString(4, feedBack.getDocument_content().trim());
            ps.setString(5, feedBack.getDocument_status().trim());
            ps.setString(6, feedBack.getDocument_post_date().trim());
            ps.setString(7, feedBack.getDocument_process_date().trim());
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(UserDB.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}
