/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.ModelDB;

import Model.WorkingTime;
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
public class WorkingTimeDB {

    Connection cn = DBconnection.getConnection();

    public ArrayList<WorkingTime> getAllWorkTime() {
        String sql = "select * from workingtime;";
        ArrayList<WorkingTime> wbox = new ArrayList<>();
        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                WorkingTime w = new WorkingTime(0, 0, 0, 0);
                w.setWorkingTimt_id(rs.getInt("workingTime_id"));
                w.setUser_id(rs.getInt("user_id"));
                w.setAbsence(rs.getInt("workingTime_absence"));
                w.setBonus(rs.getInt("workingTime_overdate"));
                wbox.add(w);
            }

        } catch (SQLException ex) {
            Logger.getLogger(WorkingTimeDB.class.getName()).log(Level.SEVERE, null, ex);

        }
        return wbox;
    }

    public WorkingTime getWorkingTimeInf(int user_id) {
        WorkingTime w = new WorkingTime(0, 0, 0, 0);
        String sql = "select * from workingTime where user_id = " + user_id;

        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                w.setWorkingTimt_id(rs.getInt("workingTime_id"));
                w.setUser_id(rs.getInt("user_id"));
                w.setAbsence(rs.getInt("workingTime_absence"));
                w.setBonus(rs.getInt("workingTime_overdate"));
            } else {
                return null;
            }
        } catch (SQLException e) {
            Logger.getLogger(WorkingTimeDB.class.getName()).log(Level.SEVERE, null, e);
        }

        return w;
    }

    public boolean insertWorkingTime(WorkingTime workingTime) {
        String sql = "insert into workingTime(user_id, workingTime_absence, workingTime_overdate) values (?,?,?)";
        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setInt(1, workingTime.getUser_id());
            ps.setInt(2, workingTime.getAbsence());
            ps.setInt(3, workingTime.getBonus());
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(UserDB.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean updateWorkingTime(WorkingTime workingTime) {
        String sql = "update workingtime set workingTime_absence = ?, workingTime_overdate = ? " + " where user_id = ? ";
        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setInt(1, workingTime.getAbsence());
            ps.setInt(2, workingTime.getBonus());
            ps.setInt(3, workingTime.getUser_id());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(WorkingTimeDB.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

}
