/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.LeaveOff;
import Model.ModelDB.LeaveOffDB;
import Model.ModelDB.UserDB;
import View.ViewAdmin;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tuqua
 */
public class ControllerAdminARleave {

    private LeaveOffDB leaveOffDB;
    private ViewAdmin viewAdmin;
    private DefaultTableModel leave_table;
    private UserDB userDB;

    public ControllerAdminARleave(LeaveOffDB leaveOffDB, ViewAdmin viewAdmin, UserDB userDB) {
        this.leaveOffDB = leaveOffDB;
        this.userDB = userDB;
        this.viewAdmin = viewAdmin;
        this.leave_table = (DefaultTableModel) viewAdmin.getLeave_table().getModel();
        actionSearch();//done
        actionViewAll();//done
        actionUpdate();//done
        actionSearchByUser();//done
    }

    private void actionSearchByUser() {
        viewAdmin.getSearch_leave_userId().addActionListener(e -> searchLeaveByUser());
    }

    private void actionUpdate() {
        viewAdmin.getUpdateStatus().addActionListener(e -> updateLeave());
    }

    private void actionSearch() {
        viewAdmin.getSearch_leave().addActionListener(e -> searchLeave());
    }

    private void actionViewAll() {
        viewAdmin.getViewleave().addActionListener(e -> viewAllLeave());
    }
//

    private void searchLeaveByUser() {
        if (viewAdmin.getLeave_inputByUserID().getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Empty search");
        } else {
            int number = 1;
            boolean contain = false;
            ArrayList<LeaveOff> leoff = leaveOffDB.getAllLeave();
            try {

                int user_id = Integer.parseInt(viewAdmin.getLeave_inputByUserID().getText());
                for (int i = 0; i < leoff.size(); i++) {
                    if (user_id == leoff.get(i).getUser_id()) {
                        contain = true;
                    }
                }
                if (contain) {
                    if (checkingTable()) {
                        Object[] row = new Object[8];
                        ArrayList<LeaveOff> leave = leaveOffDB.getByUser(user_id);
                        for (int i = 0; i < leave.size(); i++) {
                            row[0] = number++;
                            row[1] = leave.get(i).getDocument_id();
                            row[2] = leave.get(i).getUser_id();
                            row[3] = userDB.getUserInfor(leave.get(i).getUser_id()).getUser_name();
                            row[4] = leave.get(i).getDocument_title();
                            row[5] = leave.get(i).getDocument_status();
                            row[6] = leave.get(i).getDocument_post_date();
                            row[7] = leave.get(i).getDocument_process_date();
                            row[8] = leaveOffDB.getByUser(user_id);

                            leave_table.addRow(row);
                        }
                    } else {
                        leave_table.setRowCount(0);
                        searchLeaveByUser();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Not found");
                }
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "ID must be string");
            }
        }
    }
    private void viewAllLeave() {
        int number = 1;
        if (checkingTable()) {
            Object[] row = new Object[8];
            ArrayList<LeaveOff> leaveList = leaveOffDB.getAllLeave();
            for (LeaveOff leaveList1 : leaveList) {
                row[0] = number++;
                row[1] = leaveList1.getDocument_id();
                row[2] = leaveList1.getUser_id();
                row[3] = userDB.getUserInfor(leaveList1.getUser_id()).getUser_name();
                row[4] = leaveList1.getDocument_title();
                row[5] = leaveList1.getDocument_status();
                row[6] = leaveList1.getDocument_post_date();
                row[7] = leaveList1.getDocument_process_date();
                leave_table.addRow(row);
            }
        } else {
            leave_table.setRowCount(0);
            viewAllLeave();
        }
    }

    private boolean checkingTable() {
        boolean result = false;
        int count = leave_table.getRowCount();
        result = count <= 0;
        return result;
    }

    private void searchLeave() {
        if (viewAdmin.getLeave_Id_input().getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Empty search");
        } else {
            try {
                int leave_id = Integer.parseInt(viewAdmin.getLeave_Id_input().getText());
                int number = 1;
                boolean contain = false;
                ArrayList<LeaveOff> l = leaveOffDB.getAllLeave();
                for (int i = 0; i < l.size(); i++) {
                    if (leave_id == l.get(i).getDocument_id()) {
                        contain = true;
                    }
                }

                if (contain) {
                    if (checkingTable()) {
                        Object[] row = new Object[8];
                        LeaveOff leave = leaveOffDB.getLeave(leave_id);
                        row[0] = number++;
                        row[1] = leave.getDocument_id();
                        row[2] = leave.getUser_id();
                        row[3] = userDB.getUserInfor(leave.getUser_id()).getUser_name();
                        row[4] = leave.getDocument_title();
                        row[5] = leave.getDocument_status();
                        row[6] = leave.getDocument_post_date();
                        row[7] = leave.getDocument_process_date();
                        leave_table.addRow(row);
                        leaveInfor(leave_id);
                    } else {
                        leave_table.setRowCount(0);
                        searchLeave();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Not found");
                }
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "ID must be a number");
            }
        }
    }
    private void updateLeave() {
        if (viewAdmin.getLeave_Id_input().getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Empty Search");
        } else {
            LeaveOff leaveOff = leaveOffDB.getLeave(Integer.parseInt(viewAdmin.getLeave_Id_input().getText()));

            leaveOff.setDocument_status(viewAdmin.getLeave_status().getSelectedItem().toString());
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date processDate = viewAdmin.getLeave_process_date().getDate();
            String procDate = dateFormat.format(processDate);
            leaveOff.setDocument_process_date(procDate);

            boolean checking = leaveOffDB.updateLeave(leaveOff);
            if (checking) {
                JOptionPane.showMessageDialog(null, "Successfully");
                viewAllLeave();
                clear();
            } else {
                JOptionPane.showMessageDialog(null, "Unsuccess");
            }
        }
    }

    private void leaveInfor(int leave_id) {
        LeaveOff leave = leaveOffDB.getLeave(leave_id);
        viewAdmin.getLeave_id().setText(String.valueOf(leave.getDocument_id()));
        viewAdmin.getLeave_userID().setText(String.valueOf(leave.getUser_id()));
        viewAdmin.getLeave_title().setText(leave.getDocument_title());
        viewAdmin.getLeave_description().setText(leave.getDocument_description());
        viewAdmin.getLeave_content().setText(leave.getDocument_content());
        viewAdmin.getLeave_status().setSelectedItem(leave.getDocument_status());
        viewAdmin.getLeave_post_date().setText(leave.getDocument_post_date());

    }

    private void clear() {
        viewAdmin.getLeave_userID().setText("");
        viewAdmin.getLeave_id().setText("");
        viewAdmin.getLeave_title().setText("");
        viewAdmin.getLeave_description().setText("");
        viewAdmin.getLeave_content().setText("");
        viewAdmin.getLeave_post_date().setText("");
    }
}
