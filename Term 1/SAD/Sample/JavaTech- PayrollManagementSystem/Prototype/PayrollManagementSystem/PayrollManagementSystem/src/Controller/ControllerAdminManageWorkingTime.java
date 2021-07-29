/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.User;
import Model.ModelDB.UserDB;
import Model.WorkingTime;
import Model.ModelDB.WorkingTimeDB;
import View.ViewAdmin;
import View.ViewAdminManageUpdateWorkingTime;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tuqua
 */
public class ControllerAdminManageWorkingTime {

    private ViewAdmin viewAdmin;
    private WorkingTimeDB workingTimeDB;
    private DefaultTableModel time_table;
    private UserDB userDb;

    public ControllerAdminManageWorkingTime(ViewAdmin viewAdmin, WorkingTimeDB wdb, UserDB userDb) {
        this.viewAdmin = viewAdmin;
        this.workingTimeDB = wdb;
        this.time_table = (DefaultTableModel) viewAdmin.getTime_table().getModel();
        this.userDb = userDb;

        actionViewAll();//done
        actionSearchInforUser();//done
        actionAddTime();//done
        actionUpdate();//done

    }

    private void actionUpdate() {
        viewAdmin.getTime_button_update().addActionListener(e -> createUpdateWorkingTimeForm());
    }

    private void actionSearchInforUser() {
        viewAdmin.getTime_searchInf().addActionListener(e -> searchInforUser());
    }

    private void actionAddTime() {
        viewAdmin.getTime_submit().addActionListener(e -> addWorkingTime());
    }

    private void actionViewAll() {
        viewAdmin.getTime_viewAll().addActionListener(e -> viewAll());
    }
//-----------

    private void createUpdateWorkingTimeForm() {
        ViewAdminManageUpdateWorkingTime vauw = new ViewAdminManageUpdateWorkingTime();
        vauw.setVisible(true);
        vauw.getTime_button_assign().addActionListener(e -> updateWorkingTime(vauw));

    }

    private void updateWorkingTime(ViewAdminManageUpdateWorkingTime vauw) {

        String getUser_id = vauw.getTime_text_getUserId().getText();
        String getUserAbsence = vauw.getTime_text_userAbsence().getText();
        String getOverTime = vauw.getTime_text_userOverTime().getText();

        if (getOverTime.equals("") || getUserAbsence.equals("") || getOverTime.equals("")) {
            JOptionPane.showMessageDialog(null, "Empty input");
        } else {
            try {
                WorkingTime w = new WorkingTime(0, Integer.parseInt(getUser_id), Integer.parseInt(getUserAbsence), Integer.parseInt(getOverTime));
                boolean checking = workingTimeDB.updateWorkingTime(w);
                if (checking) {
                    JOptionPane.showMessageDialog(null, "Successfully");
                    viewAll();
                    vauw.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Unsuccess");
                }
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "UserID, Absence, Over must be numbers");
            }
        }
    }
    private void addWorkingTime() {
        if (viewAdmin.getTime_userId().getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Empty Search");
        } else {
            boolean contain = false;
            ArrayList<WorkingTime> timeList = workingTimeDB.getAllWorkTime();
            for (WorkingTime timeList1 : timeList) {
                if (Integer.parseInt(viewAdmin.getTime_userId().getText()) == timeList1.getUser_id()) {
                    contain = true;
                }
            }

            if (contain) {
                JOptionPane.showMessageDialog(null, "Has been created before");
            } else {
                if (viewAdmin.getTime_absence().getText().equals("") || viewAdmin.getTime_bonus().equals("")) {
                    JOptionPane.showMessageDialog(null, "Fill full information before adding");
                } else {
                    try {
                        WorkingTime w = new WorkingTime(0, Integer.parseInt(viewAdmin.getTime_userId().getText()), Integer.parseInt(viewAdmin.getTime_absence().getText()), Integer.parseInt(viewAdmin.getTime_bonus().getText()));
                        boolean checking = workingTimeDB.insertWorkingTime(w);
                        if (checking) {
                            JOptionPane.showMessageDialog(null, "Successfully");
                            viewAll();
                            clear();
                        } else {
                            JOptionPane.showMessageDialog(null, "Unsuccess");
                        }
                    }catch (Exception e){
                        JOptionPane.showMessageDialog(null, "Please check your UserID, bonus, over. They must be number");
                    }

                }
            }

        }
    }
    private void clear() {
        viewAdmin.getTime_userId().setText("");
        viewAdmin.getTime_userName().setText("");
        viewAdmin.getTime_userDob().setText("");
        viewAdmin.getTime_absence().setText("");
        viewAdmin.getTime_bonus().setText("");
        viewAdmin.getTime_email().setText("");
    }

    private void searchInforUser() {
        if (viewAdmin.getTime_userId().getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Empty Search");
        } else {
            boolean contain = false;
            try {
                for (int i = 0; i < userDb.getAllUserInfor().size(); i++) {


                    if (Integer.parseInt(viewAdmin.getTime_userId().getText()) == userDb.getAllUserInfor().get(i).getUser_id()) {
                        contain = true;
                    }

                    if (contain) {
                        User u = userDb.getUserInfor(Integer.parseInt(viewAdmin.getTime_userId().getText()));
                        WorkingTime wt = workingTimeDB.getWorkingTimeInf(u.getUser_id());
                        viewAdmin.getTime_userName().setText(u.getUser_name());
                        viewAdmin.getTime_userDob().setText(u.getUser_dob());
                        viewAdmin.getTime_email().setText(u.getUser_email());
                        if (wt == null) {
                            JOptionPane.showMessageDialog(null, "Not found Working Time");
                            viewAdmin.getTime_absence().setText("");
                            viewAdmin.getTime_bonus().setText("");
                        } else {
                            viewAdmin.getTime_absence().setText(String.valueOf(wt.getAbsence()));
                            viewAdmin.getTime_bonus().setText(String.valueOf(wt.getBonus()));
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Not found");

                    }
                }
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, "ID must be a number");
                viewAdmin.getTime_userId().setText("");
            }
        }
    }
    private boolean checkingTable() {
        boolean result = false;
        int count = time_table.getRowCount();
        result = count <= 0;
        return result;
    }

    private void viewAll() {
        int number = 1;
        if (checkingTable()) {
            Object[] row = new Object[6];
            ArrayList<WorkingTime> timeList = workingTimeDB.getAllWorkTime();
            for (int i = 0; i < timeList.size(); i++) {
                row[0] = number++;
                row[1] = timeList.get(i).getWorkingTimt_id();
                row[2] = userDb.getUserInfor(timeList.get(i).getUser_id()).getUser_name();
                row[3] = timeList.get(i).getUser_id();
                row[4] = timeList.get(i).getAbsence();
                row[5] = timeList.get(i).getBonus();
                time_table.addRow(row);
            }
        } else {
            time_table.setRowCount(0);
            viewAll();
        }
    }
}
