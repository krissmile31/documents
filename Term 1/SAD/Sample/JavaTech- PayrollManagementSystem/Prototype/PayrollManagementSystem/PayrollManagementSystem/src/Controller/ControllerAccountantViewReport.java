/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.ModelDB.ReportDB;
import Model.ModelDB.UserDB;
import Model.Report;
import View.ViewAccountant;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Quan Trong Tu
 */
public class ControllerAccountantViewReport {

    private ViewAccountant va;
    private ReportDB reportDB;
    private DefaultTableModel report_table;
    private UserDB userDB;

    public ControllerAccountantViewReport(ViewAccountant va, ReportDB reportDB, UserDB userDB) {
        this.userDB = userDB;
        this.va = va;
        this.reportDB = reportDB;
        this.report_table = (DefaultTableModel) va.getReport_table().getModel();
        viewAllReport();
        actionView();
    }

    private void actionView() {
        va.getReport_table().setRowSelectionAllowed(false);
        va.getReport_table().setColumnSelectionAllowed(false);
        va.getReport_button_view().addActionListener(e -> viewSpecReport());
    }

    private void viewSpecReport() {
        if (va.getReport_input_report_id().getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Empty search");
        } else {
            try {
                int report_id = Integer.parseInt(va.getReport_input_report_id().getText().trim());
                Report report = reportDB.getReport(report_id);
                va.getReport_admin_id().setText(String.valueOf(report.getUser_id()));
                va.getReport_title().setText(report.getReport_title());
                va.getReport_description().setText(report.getReport_description());
                va.getReport_content().setText(report.getReport_content());
                va.getReport_date().setText(report.getReport_post_date());
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "ID must be a number");
            }
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
