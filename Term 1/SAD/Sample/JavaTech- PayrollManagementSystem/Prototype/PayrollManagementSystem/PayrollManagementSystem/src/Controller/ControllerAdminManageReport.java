
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Report;
import Model.ModelDB.ReportDB;
import Model.ModelDB.UserDB;
import View.ViewAdmin;
import View.ViewAdminManageAddReport;
import View.ViewAdminManageUpdateReport;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tuqua
 */
public class ControllerAdminManageReport {

    private ReportDB reportDB;
    private ViewAdmin viewAdmin;
    private DefaultTableModel table_report;
    private UserDB userDB;

    public ControllerAdminManageReport(ViewAdmin viewAdmin, ReportDB reportDB, UserDB userDB) {
        this.reportDB = reportDB;
        this.viewAdmin = viewAdmin;
        this.table_report = (DefaultTableModel) viewAdmin.table_report().getModel();
        this.userDB = userDB;
        actionView();//done
        actionSearch();//done
        actionUpdateReport();//done
        actionAdd();//done
        actionDelete();//done
        actionSearchByUserId();//done

    }

    private void actionSearchByUserId() {
        viewAdmin.getSearch_reportByUserId().addActionListener(e -> searchReportByUserId());
    }

    private void actionDelete() {
        viewAdmin.delete_report().addActionListener(e -> deleteReport());
    }

    private void actionAdd() {
        viewAdmin.add_report().addActionListener(e -> createAddForm());
    }

    private void actionUpdateReport() {
        viewAdmin.update_report().addActionListener(e -> createUpdateReport());
    }

    private void actionView() {
        viewAdmin.view_report().addActionListener(e -> viewAllReport());
    }

    private void actionSearch() {
        viewAdmin.getReport_button_searchByReportId().addActionListener(e -> searchReport());
    }
//

    private void searchReportByUserId() {
        if (viewAdmin.getInput_searchByUserID().getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Empty search");
        } else {
            boolean contain = false;
            try {
                int user_id = Integer.parseInt(viewAdmin.getInput_searchByUserID().getText());
                ArrayList<Report> r = reportDB.getReportByUserId(user_id);
                for (Report r1 : r) {
                    if (user_id == r1.getUser_id()) {
                        contain = true;
                    }
                }
                if (contain) {
                    if (checkingTable()) {
                        Object[] row = new Object[7];
                        ArrayList<Report> reportList = reportDB.getReportByUserId(user_id);
                        for (int i = 0; i < r.size(); i++) {
                            row[0] = reportList.get(i).getReport_id();
                            row[1] = reportList.get(i).getUser_id();
                            row[2] = userDB.getUserInfor(user_id).getUser_name();
                            row[3] = reportList.get(i).getReport_title();
                            row[4] = reportList.get(i).getReport_description();
                            row[5] = reportList.get(i).getReport_content();
                            row[6] = reportList.get(i).getReport_post_date();

                            table_report.addRow(row);
                        }
                    } else {
                        table_report.setRowCount(0);
                        searchReportByUserId();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Not found");
                }
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Oops! Seems likes your input is wrong format! Remember, ID must be a number");
                viewAdmin.getInput_searchByUserID().setText("");
            }
        }
    }
    private void deleteReport() {
        if (viewAdmin.getReport_text_searchByReportId().getText().equals("") || checkingTable()) {
            JOptionPane.showMessageDialog(null, "Empty Search or Not Found");
        } else {
            if (table_report.getRowCount() == 1) {
                Report report = reportDB.getReport((Integer) table_report.getValueAt(0, 0));
                boolean checking = reportDB.deleteReport(report.getReport_id());
                if (checking) {
                    JOptionPane.showMessageDialog(null, "Successfully");
                    viewAllReport();
                } else {
                    JOptionPane.showMessageDialog(null, "Unsuccess");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Please search for report id first");
            }
        }
    }

    private void createAddForm() {
        ViewAdminManageAddReport vamar = new ViewAdminManageAddReport();
        vamar.setVisible(true);
        vamar.getRuser_id().setText(viewAdmin.getUserId().getText());
        vamar.getR_button_submit().addActionListener(e -> addReport(vamar));
    }

    private void addReport(ViewAdminManageAddReport vamar) {
        String title = vamar.getRtitle().getText();
        String description = vamar.getRDescription().getText();
        String content = vamar.getRContent().getText();
        if (title.equals("") || description.equals("") || content.equals("")) {
            JOptionPane.showMessageDialog(null, "Empty input");
        } else {

            Report report = new Report(0, 0, null, null, null, null);
            report.setUser_id(Integer.parseInt(vamar.getRuser_id().getText().trim()));
            report.setReport_title(vamar.getRtitle().getText());
            report.setReport_description(vamar.getRDescription().getText());
            report.setReport_content(vamar.getRContent().getText());

            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date getPostDate = vamar.getRpostDate().getDate();
            String postDate = dateFormat.format(getPostDate);
            report.setReport_post_date(postDate);

            boolean checking = reportDB.addReport(report);
            if (checking) {
                JOptionPane.showMessageDialog(null, "Successfully");
                viewAllReport();
                vamar.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Unsuccess");
            }
        }
    }

    private void createUpdateReport() {

        if (viewAdmin.getReport_text_searchByReportId().getText().equals("") || checkingTable()) {
            JOptionPane.showMessageDialog(null, "Empty Search or Not Found");
        } else {
            if (table_report.getRowCount() == 1) {
                ViewAdminManageUpdateReport vamur = new ViewAdminManageUpdateReport();
                vamur.setVisible(true);
                Report report = reportDB.getReport((Integer) table_report.getValueAt(0, 0));
                vamur.getRuser_id().setText(String.valueOf(report.getUser_id()));
                vamur.getRtitle().setText(report.getReport_title());
                vamur.getRDescription().setText(report.getReport_description());
                vamur.getRContent().setText(report.getReport_content());
                java.sql.Date getPostDate = java.sql.Date.valueOf(report.getReport_post_date());
                vamur.getRpostDate().setDate(getPostDate);
                vamur.getR_button_update().addActionListener(e -> updateReport(vamur));
            } else {
                JOptionPane.showMessageDialog(null, "Please search for report id first");
            }
        }
    }

    private void updateReport(ViewAdminManageUpdateReport vamur) {
        String title = vamur.getRtitle().getText();
        String description = vamur.getRDescription().getText();
        String content = vamur.getRContent().getText();

        if (title.equals("") || description.equals("") || content.equals("")) {
            JOptionPane.showMessageDialog(null, "Empty input");
        } else {
            Report report = new Report(0, 0, null, null, null, null);
            report.setUser_id(Integer.parseInt(vamur.getRuser_id().getText()));
            report.setReport_id(Integer.parseInt(viewAdmin.getReport_text_searchByReportId().getText()));
            report.setReport_title(title);
            report.setReport_description(description);
            report.setReport_content(content);

            DateFormat dateFormat = new SimpleDateFormat();
            Date date = vamur.getRpostDate().getDate();
            String postDate = dateFormat.format(date);
            report.setReport_post_date(postDate);
            boolean checking = reportDB.updateReport(report);
            if (checking) {
                JOptionPane.showMessageDialog(null, "Successfully");
                viewAllReport();
                vamur.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Unsuccess");
            }
        }
    }

    private void viewAllReport() {
        viewAdmin.getReport_text_searchByReportId().setText("");
        viewAdmin.getInput_searchByUserID().setText("");
        if (checkingTable()) {
            Object[] row = new Object[7];
            ArrayList<Report> r = reportDB.getAllReport();
            for (int i = 0; i < r.size(); i++) {
                row[0] = r.get(i).getReport_id();
                row[1] = r.get(i).getUser_id();
                row[2] = userDB.getUserInfor(r.get(i).getUser_id()).getUser_name();
                row[3] = r.get(i).getReport_title();
                row[4] = r.get(i).getReport_description();
                row[5] = r.get(i).getReport_content();
                row[6] = r.get(i).getReport_post_date();
                table_report.addRow(row);
            }
        } else {
            table_report.setRowCount(0);
            viewAllReport();
        }
    }

    private boolean checkingTable() {
        boolean result = false;
        int count = table_report.getRowCount();
        result = count <= 0;
        return result;
    }

    private void searchReport() {
        if (viewAdmin.getReport_text_searchByReportId().getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Empty search");
        } else {
            try {
                int report_id = Integer.parseInt(viewAdmin.getReport_text_searchByReportId().getText().trim());
                boolean contain = false;
                ArrayList<Report> r = reportDB.getAllReport();
                for (int i = 0; i < r.size(); i++) {
                    if (report_id == r.get(i).getReport_id()) {
                        contain = true;
                    }
                }

                if (contain) {
                    if (checkingTable()) {
                        Object[] row = new Object[7];
                        Report report = reportDB.getReport(report_id);
                        row[0] = report.getReport_id();
                        row[1] = report.getUser_id();
                        row[2] = userDB.getUserInfor(reportDB.getReport(report_id).getUser_id()).getUser_name();
                        row[3] = report.getReport_title();
                        row[4] = report.getReport_description();
                        row[5] = report.getReport_content();
                        row[6] = report.getReport_post_date();

                        table_report.addRow(row);
                    } else {
                        table_report.setRowCount(0);
                        searchReport();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Not found");

                }
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Oops! Seems likes your input is wrong format! Remember, ID must be a number");
                viewAdmin.getReport_text_searchByReportId().setText("");
            }
        }
    }
}
