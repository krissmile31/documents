/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.ModelDB;

import Model.Report;
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
public class ReportDB {

    Connection cn = DBconnection.getConnection();

    public ArrayList<Report> getAllReport() {
        String sql = "select * from report";
        ArrayList<Report> reportList = new ArrayList<>();
        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Report report = new Report(0, 0, "", "", "", "");
                report.setReport_id(rs.getInt("report_id"));
                report.setUser_id(rs.getInt("user_id"));
                report.setReport_title(rs.getString("report_title"));
                report.setReport_description(rs.getString("report_description"));
                report.setReport_content(rs.getString("report_content"));
                report.setReport_post_date(rs.getString("report_post_date"));
                reportList.add(report);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDB.class.getName()).log(Level.SEVERE, null, ex);

        }
        return reportList;
    }

    public Report getReport(int report_id) {
        String sql = "select * from report where report_id = " + report_id;
        Report report = new Report(0, 0, "", "", "", "");
        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                report.setReport_id(rs.getInt("report_id"));
                report.setUser_id(rs.getInt("user_id"));
                report.setReport_title(rs.getString("report_title").trim());
                report.setReport_description(rs.getString("report_description").trim());
                report.setReport_content(rs.getString("report_content"));
                report.setReport_post_date(rs.getString("report_post_date"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProjectDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return report;
    }

    public boolean updateReport(Report report) {
        String sql = "Update report set " + "user_id = ?,"
                + "report_title = ?,"
                + "report_description = ?,"
                + "report_content = ?,"
                + "report_post_date = ?"
                + "where report_id = ? ;";
        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setInt(1, report.getUser_id());
            ps.setString(2, report.getReport_title());
            ps.setString(3, report.getReport_description());
            ps.setString(4, report.getReport_content());
            ps.setInt(6, report.getReport_id());
            ps.setString(5, report.getReport_post_date());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(UserDB.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean addReport(Report report) {
        String sql = "insert into report(user_id, report_title, report_description, report_content, report_post_date) " + " values(?,?,?,?,?);";
        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setInt(1, report.getUser_id());
            ps.setString(2, report.getReport_title().trim());
            ps.setString(3, report.getReport_description().trim());
            ps.setString(4, report.getReport_content().trim());
            ps.setString(5, report.getReport_post_date().trim());
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(UserDB.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean deleteReport(int report_id) {
        String sql = "delete from report where report_id = ? ";

        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setInt(1, report_id);
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(UserDB.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public ArrayList<Report> getReportByUserId(int user_id) {
        String sql = "select * from report where user_id = " + user_id;
        ArrayList<Report> reportList = new ArrayList<>();
        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Report report = new Report(0, 0, "", "", "", " ");
                report.setReport_id(rs.getInt("report_id"));
                report.setUser_id(rs.getInt("user_id"));
                report.setReport_title(rs.getString("report_title"));
                report.setReport_description(rs.getString("report_description"));
                report.setReport_content(rs.getString("report_content"));
                report.setReport_post_date(rs.getString("report_post_date"));
                reportList.add(report);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDB.class.getName()).log(Level.SEVERE, null, ex);

        }
        return reportList;
    }
}
