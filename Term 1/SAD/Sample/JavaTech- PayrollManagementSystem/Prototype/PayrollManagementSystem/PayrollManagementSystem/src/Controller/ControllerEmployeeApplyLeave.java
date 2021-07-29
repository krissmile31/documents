/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.LeaveOff;
import Model.ModelDB.LeaveOffDB;
import Model.ModelDB.UserDB;
import View.ViewEmployee;
import View.ViewEmployeeAddLeave;
import View.ViewLogin;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tuqua
 */
public class ControllerEmployeeApplyLeave {

    private LeaveOffDB leaveOffDB;
    private ViewEmployee viewEmployee;
    private DefaultTableModel table_leave;
    private ViewLogin viewLogin;
    private UserDB userDB;

    public ControllerEmployeeApplyLeave(LeaveOffDB leaveOffDB, ViewEmployee viewEmployee, ViewLogin viewLogin, UserDB userDB) {
        this.leaveOffDB = leaveOffDB;
        this.viewEmployee = viewEmployee;
        this.table_leave = (DefaultTableModel) viewEmployee.getTable_leave().getModel();
        this.viewLogin = viewLogin;
        this.userDB = userDB;
        actionView();//done
        actionDelete();//done
        actionAdd();//done
        actionClear();
        actionSearch();//done
    }

    private void actionSearch() {
        viewEmployee.getLeave_button_searchByLeaveID().addActionListener(e -> searchLeave());
    }

    private void actionView() {
        viewEmployee.getLeave_button_view().addActionListener(e -> viewAllLeave());
    }

    private void actionDelete() {
        viewEmployee.getLeave_button_delete().addActionListener(e -> deleteLeave());
    }

    private void actionAdd() {
        viewEmployee.getLeave_button_add().addActionListener(e -> createAddLeaveForm());
    }

    private void actionClear() {
        viewEmployee.getLeave_button_clear().addActionListener(e -> clear());
    }

    private void clear() {
        viewEmployee.getLeave_content().setText("");
        viewEmployee.getLeave_title().setText("");
        viewEmployee.getLeave_description().setText("");
        viewEmployee.getLeave_userId().setText("");
        viewEmployee.getLeave_leaveId().setText("");
        table_leave.setRowCount(0);
        viewEmployee.getLeave_searchLeaveId().setText("");
        viewEmployee.getLeave_status().setText("");
        viewEmployee.getLeave_post_date().setText("");
        viewEmployee.getLeave_process_date().setText("");
    }

    private void searchLeave() {
        boolean isIn = false;
        ArrayList<LeaveOff> list = leaveOffDB.getAllLeave();
        try {

            for (LeaveOff leaveOff : list) {
                if (leaveOff.getDocument_id() == Integer.parseInt(viewEmployee.getLeave_searchLeaveId().getText())) {
                    isIn = true;
                    break;
                }
            }

            if (isIn) {
                if (checkingTable()) {
                    Object[] row = new Object[8];
                    LeaveOff l = leaveOffDB.getLeave(Integer.parseInt(viewEmployee.getLeave_searchLeaveId().getText().trim()));
                    row[0] = l.getDocument_id();
                    row[1] = l.getUser_id();
                    row[2] = userDB.getUserInfor(l.getUser_id()).getUser_name();
                    row[3] = l.getDocument_title();
                    row[4] = l.getDocument_description();
                    row[5] = l.getDocument_status();
                    row[6] = l.getDocument_post_date();
                    row[7] = l.getDocument_process_date();
                    table_leave.addRow(row);
                    viewInfor(l);
                } else {
                    table_leave.setRowCount(0);
                    searchLeave();
                }

            } else {
                JOptionPane.showMessageDialog(null, "Not found");
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "ID must be a number");
        }
    }
    private void viewInfor(LeaveOff l) {
        viewEmployee.getLeave_userId().setText(String.valueOf(l.getUser_id()));
        viewEmployee.getLeave_leaveId().setText(String.valueOf(l.getDocument_id()));
        viewEmployee.getLeave_title().setText(l.getDocument_title());
        viewEmployee.getLeave_description().setText(l.getDocument_description());
        viewEmployee.getLeave_content().setText(l.getDocument_content());
        viewEmployee.getLeave_status().setText(l.getDocument_status());
        viewEmployee.getLeave_post_date().setText(l.getDocument_post_date());
        viewEmployee.getLeave_process_date().setText(l.getDocument_process_date());
    }

    private void deleteLeave() {
        if (viewEmployee.getLeave_searchLeaveId().getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Empty search");
        } else {
            boolean c = leaveOffDB.deleteLeave(Integer.parseInt(viewEmployee.getLeave_searchLeaveId().getText().trim()));
            if (c) {
                JOptionPane.showMessageDialog(null, "Success");
                clear();
                viewAllLeave();
            } else {
                JOptionPane.showMessageDialog(null, "Fail");
            }
        }
    }

    private void createAddLeaveForm() {
        ViewEmployeeAddLeave a = new ViewEmployeeAddLeave();
        a.setVisible(true);
        a.getButton_add().addActionListener(e -> addLeave(a));
    }

    private void addLeave(ViewEmployeeAddLeave a) {
        LeaveOff l = new LeaveOff(0, 0, "", "", "", "", "", "");
        int user_id = Integer.parseInt(viewEmployee.getAs_UserId().getText());
        String leave_title = a.getGetLeaveTitle().getText();
        String leave_description = a.getGetLeave_des().getText();
        String leave_content = a.getGetLeave_content().getText();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = a.getDate_chooser().getDate();
        String post_date = sdf.format(date);
        if (leave_title.equals("") || leave_description.equals("") || leave_content.equals("")) {
            JOptionPane.showMessageDialog(null, "Empty input");
        } else {
            l.setUser_id(user_id);
            l.setDocument_title(leave_title);
            l.setDocument_description(leave_description);
            l.setDocument_content(leave_content);
            l.setDocument_post_date(post_date);
            if (leaveOffDB.addLeave(l)) {
                JOptionPane.showMessageDialog(null, "Success");
                a.dispose();
                viewAllLeave();
            } else {
                JOptionPane.showMessageDialog(null, "Fail");
            }
        }

    }

    private void viewAllLeave() {
        if (checkingTable()) {
            Object[] row = new Object[8];
            int user_id = viewLogin.getUser_id();
            ArrayList<LeaveOff> elist = leaveOffDB.getByUser(user_id);
            for (int i = 0; i < elist.size(); i++) {
                row[0] = elist.get(i).getDocument_id();
                row[1] = elist.get(i).getUser_id();
                row[2] = userDB.getUserInfor(user_id).getUser_name();
                row[3] = elist.get(i).getDocument_title();
                row[4] = elist.get(i).getDocument_description();
                row[5] = elist.get(i).getDocument_status();
                row[6] = elist.get(i).getDocument_post_date();
                row[7] = elist.get(i).getDocument_process_date();
                table_leave.addRow(row);
            }
        } else {
            table_leave.setRowCount(0);
            viewAllLeave();
        }
    }

    private boolean checkingTable() {
        boolean result = false;
        int count = table_leave.getRowCount();
        result = count <= 0;
        return result;
    }
}
