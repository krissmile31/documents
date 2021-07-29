/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.FeedBack;
import Model.ModelDB.FeedBackDB;
import Model.ModelDB.LeaveOffDB;
import Model.ModelDB.UserDB;
import View.ViewEmployee;
import View.ViewEmployeeAddFeedback;
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
public class ControllerEmployeeFeedback {

    private FeedBackDB feedBackDB;
    private ViewEmployee viewEmployee;
    private DefaultTableModel table_feedback;
    private ViewLogin viewLogin;
    private UserDB userDB;

    public ControllerEmployeeFeedback(FeedBackDB feedBackDB, ViewEmployee viewEmployee, ViewLogin viewLogin, UserDB userDB) {
        this.feedBackDB = feedBackDB;
        this.viewEmployee = viewEmployee;
        this.table_feedback = (DefaultTableModel) viewEmployee.getFb_table().getModel();
        this.viewLogin = viewLogin;
        this.userDB = userDB;
        actionView();//done
        actionDelete();//done
        actionAdd();//done
        actionClear();
        actionSearch();//done
    }

    private void actionSearch() {
        viewEmployee.getFb_search().addActionListener(e -> searchFeedback());
    }

    private void actionView() {
        viewEmployee.getFb_view().addActionListener(e -> viewAllOwnFeedBack());
    }

    private void actionDelete() {
        viewEmployee.getFb_delete().addActionListener(e -> deleteFeedback());
    }

    private void actionAdd() {
        viewEmployee.getFb_add().addActionListener(e -> createAddForm());
    }

    private void actionClear() {
        viewEmployee.getFb_clear().addActionListener(e -> clear());
    }

    private void clear() {
        viewEmployee.getFb_content().setText("");
        viewEmployee.getFb_title().setText("");
        viewEmployee.getFb_des().setText("");
        viewEmployee.getFb_userid().setText("");
        viewEmployee.getFb_FeedbackId().setText("");
        table_feedback.setRowCount(0);
        viewEmployee.getFb_searchByFeedBackId().setText("");
        viewEmployee.getFb_status().setText("");
        viewEmployee.getFb_process_date().setText("");
        viewEmployee.getFb_post_date().setText("");
    }

    private void searchFeedback() {
        if (viewEmployee.getFb_searchByFeedBackId().getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Empty search");
        } else {
            try {


                if (checkingTable()) {
                    Object[] row = new Object[8];
                    FeedBack f = feedBackDB.getFeedBack(Integer.parseInt(viewEmployee.getFb_searchByFeedBackId().getText().trim()));
                    row[0] = f.getDocument_id();
                    row[1] = f.getUser_id();
                    row[2] = userDB.getUserInfor(f.getUser_id()).getUser_name();
                    row[3] = f.getDocument_title();
                    row[4] = f.getDocument_description();
                    row[5] = f.getDocument_content();
                    row[6] = f.getDocument_post_date();
                    row[7] = f.getDocument_process_date();
                    table_feedback.addRow(row);
                    viewFeedBackInfor(f);
                } else {
                    table_feedback.setRowCount(0);
                    searchFeedback();
                }
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "ID must be a number");
            }

        }
    }
    private void viewFeedBackInfor(FeedBack l) {
        viewEmployee.getFb_userid().setText(String.valueOf(l.getUser_id()));
        viewEmployee.getFb_FeedbackId().setText(String.valueOf(l.getDocument_id()));
        viewEmployee.getFb_title().setText(l.getDocument_title());
        viewEmployee.getFb_des().setText(l.getDocument_description());
        viewEmployee.getFb_content().setText(l.getDocument_content());
        viewEmployee.getFb_status().setText(l.getDocument_status());
        viewEmployee.getFb_post_date().setText(l.getDocument_post_date());
        viewEmployee.getFb_process_date().setText(l.getDocument_process_date());
    }

    private void deleteFeedback() {
        if (viewEmployee.getFb_FeedbackId().getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Empty search");
        } else {
            boolean c = feedBackDB.deleteFeedBack(Integer.parseInt(viewEmployee.getFb_FeedbackId().getText().trim()));
            if (c) {
                JOptionPane.showMessageDialog(null, "Success");
                clear();
                viewAllOwnFeedBack();
            } else {
                JOptionPane.showMessageDialog(null, "Fail");
            }
        }

    }

    private void createAddForm() {
        ViewEmployeeAddFeedback a = new ViewEmployeeAddFeedback();
        a.setVisible(true);
        a.getButton_add().addActionListener(e -> addFeedback(a));

    }

    private void addFeedback(ViewEmployeeAddFeedback a) {
        FeedBack f = new FeedBack(0, 0, "", "", "", "", "", "");

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = a.getDate_chooser().getDate();
        String post_date = sdf.format(date);
        String title = a.getGetFBTitle().getText();
        String description = a.getGetFB_des().getText();
        String content = a.getGetFB_content().getText();

        if (title.equals("") || description.equals("") || content.equals("")) {
            JOptionPane.showMessageDialog(null, "Empty input");
        } else {
            f.setUser_id(Integer.parseInt(viewEmployee.getAs_UserId().getText()));
            f.setDocument_title(title);
            f.setDocument_description(description);
            f.setDocument_content(content);
            f.setDocument_post_date(post_date);
            if (feedBackDB.addFeedBack(f)) {
                JOptionPane.showMessageDialog(null, "Success");
                a.dispose();
                viewAllOwnFeedBack();
            } else {
                JOptionPane.showMessageDialog(null, "Fail");
            }
        }
    }

    private void viewAllOwnFeedBack() {
        if (checkingTable()) {
            Object[] row = new Object[8];
            int user_id = viewLogin.getUser_id();
            ArrayList<FeedBack> fblist = feedBackDB.getByUserId(user_id);
            for (int i = 0; i < fblist.size(); i++) {
                row[0] = fblist.get(i).getDocument_id();
                row[1] = fblist.get(i).getUser_id();
                row[2] = userDB.getAllUserInfor().get(i).getUser_name();
                row[3] = fblist.get(i).getDocument_title();
                row[4] = fblist.get(i).getDocument_description();
                row[5] = fblist.get(i).getDocument_status();
                row[6] = fblist.get(i).getDocument_post_date();
                row[7] = fblist.get(i).getDocument_process_date();
                table_feedback.addRow(row);
            }
        } else {
            table_feedback.setRowCount(0);
            viewAllOwnFeedBack();
        }
    }

    private boolean checkingTable() {
        boolean result = false;
        int count = table_feedback.getRowCount();
        result = count <= 0;
        return result;
    }

}
