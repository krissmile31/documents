/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.ModelDB.ReportDB;
import Model.ModelDB.UserDB;
import Model.Report;
import View.ViewEmployee;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Quan Trong Tu
 */
public class ControllerEmployeeViewReport {

    private ReportDB reportDB;
    private ViewEmployee ve;
    private DefaultTableModel report_table;
    private UserDB userDB;

    public ControllerEmployeeViewReport(ReportDB reportDB, ViewEmployee ve, UserDB userDb) {
        this.userDB = userDb;
        this.reportDB = reportDB;
        this.ve = ve;
        this.report_table = (DefaultTableModel) ve.getReport_table().getModel();
        viewAllReport();
        actionView();
    }

    private void actionView() {
        ve.getReport_table().setRowSelectionAllowed(false);
        ve.getReport_table().setColumnSelectionAllowed(false);

        ve.getReport_button_view().addActionListener(e -> viewSpecReport());
    }

    private void viewSpecReport() {
        try {
            int report_id = Integer.parseInt(ve.getReport_input_report_id().getText().trim());
            Report report = reportDB.getReport(report_id);
            ve.getReport_admin_id().setText(String.valueOf(report.getUser_id()));
            ve.getReport_title().setText(report.getReport_title());
            ve.getReport_description().setText(report.getReport_description());
            ve.getReport_content().setText(report.getReport_content());
            ve.getReport_date().setText(report.getReport_post_date());
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "ID must be a number");
        }
    }
    private void viewAllReport() {
        Object[] row = new Object[4];
        ArrayList<Report> reportList = reportDB.getAllReport();
        for (Report eachReport : reportList) {
            row[0] = eachReport.getReport_id();
            row[1] = userDB.getUserInfor(eachReport.getUser_id()).getUser_name();
            row[2] = eachReport.getReport_title();
            row[3] = eachReport.getReport_post_date();
            report_table.addRow(row);
        }
    }

}
