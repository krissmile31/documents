/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.FeedBack;
import Model.ModelDB.FeedBackDB;
import Model.ModelDB.UserDB;
import View.ViewAccountant;
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
public class ControllerAccountantManageFeedback {

    private ViewAccountant viewAccountant;
    private UserDB userDb;
    private FeedBackDB feedbackDB;
    private DefaultTableModel feedback_table;

    public ControllerAccountantManageFeedback(ViewAccountant viewAccountant, UserDB userDb, FeedBackDB feedbackDb) {
        this.viewAccountant = viewAccountant;
        this.userDb = userDb;
        this.feedbackDB = feedbackDb;
        this.feedback_table = (DefaultTableModel) viewAccountant.getF_feedbackTable().getModel();
        actionViewAll();//done
        searchByFeedBackId();//done
        searchByUserId();//done
        actionUpdate();//done
    }

    private void actionUpdate() {
        viewAccountant.getF_updateStatus().addActionListener(e -> updateFeedBack());
    }

    private void searchByUserId() {
        viewAccountant.getF_searchButtonbyUser().addActionListener(e -> searchUserId());
    }

    private void actionViewAll() {
        viewAccountant.getF_viewAll().addActionListener(e -> viewAllFeedBack());
    }

    private void searchByFeedBackId() {
        viewAccountant.getF_searchButton().addActionListener(e -> searchFeedBackId());
    }
//

    private void updateFeedBack() {
        if (viewAccountant.getF_searchFeedBackId().getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Empty Search");
        } else {
            FeedBack fb = feedbackDB.getFeedBack(Integer.parseInt(viewAccountant.getF_searchFeedBackId().getText()));
            fb.setDocument_status(viewAccountant.getF_feedbackStatus().getSelectedItem().toString());
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date date = viewAccountant.getF_dateChooser().getDate();
            String processDate = dateFormat.format(date);
            fb.setDocument_process_date(processDate);
            boolean checking = feedbackDB.updateStatus(fb);
            if (checking) {
                JOptionPane.showMessageDialog(null, "Successfully");
                viewAllFeedBack();
                clear();
            } else {
                JOptionPane.showMessageDialog(null, "Unsuccess");
                clear();
            }
        }
    }

    private void clear() {
        viewAccountant.getF_feedId().setText("");
        viewAccountant.getF_userID().setText("");
        viewAccountant.getF_feedtitle().setText("");
        viewAccountant.getF_feedbackDes().setText("");
        viewAccountant.getF_feedbackContent().setText("");
    }

    private void searchUserId() {
        if (viewAccountant.getF_searchUserId().getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Empty search");
        } else {
            boolean contain = false;
            try {
                int user_id = Integer.parseInt(viewAccountant.getF_searchUserId().getText());
                ArrayList<FeedBack> flist = feedbackDB.getByUserId(user_id);
                for (int i = 0; i < flist.size(); i++) {
                    if (user_id == flist.get(i).getUser_id()) {
                        contain = true;
                    }
                }
                if (contain) {
                    if (checkingTable()) {
                        Object[] row = new Object[6];
                        for (int i = 0; i < flist.size(); i++) {
                            row[0] = flist.get(i).getDocument_id();
                            row[1] = flist.get(i).getUser_id();
                            row[2] = flist.get(i).getDocument_title();
                            row[3] = flist.get(i).getDocument_status();
                            row[4] = flist.get(i).getDocument_post_date();
                            row[5] = flist.get(i).getDocument_process_date();
                            feedback_table.addRow(row);
                        }
                    } else {
                        feedback_table.setRowCount(0);
                        searchUserId();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Not found");
                }
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "ID must be a number");
            }
        }
    }
    private void searchFeedBackId() {
        if (viewAccountant.getF_searchFeedBackId().getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Empty search");
        } else {
            try {

                int feedback_id = Integer.parseInt(viewAccountant.getF_searchFeedBackId().getText());
                boolean contain = false;
                ArrayList<FeedBack> flist = feedbackDB.getAllFeedBack();
                for (int i = 0; i < flist.size(); i++) {
                    if (feedback_id == flist.get(i).getDocument_id()) {
                        contain = true;
                    }
                }
                if (contain) {
                    if (checkingTable()) {
                        Object[] row = new Object[6];
                        FeedBack fb = feedbackDB.getFeedBack(feedback_id);
                        row[0] = fb.getDocument_id();
                        row[1] = fb.getUser_id();
                        row[2] = fb.getDocument_title();
                        row[3] = fb.getDocument_status();
                        row[4] = fb.getDocument_post_date();
                        row[5] = fb.getDocument_process_date();
                        feedback_table.addRow(row);
                    } else {
                        feedback_table.setRowCount(0);
                        viewFeedBackInf(feedback_id);
                        searchFeedBackId();

                    }
                } else {
                   JOptionPane.showMessageDialog( null, "Not found");
                }
            }catch (Exception e){
                JOptionPane.showMessageDialog( null, "ID must be a number");
            }
        }
    }
    private void viewFeedBackInf(int feedback_id) {
        FeedBack f = feedbackDB.getFeedBack(feedback_id);
        viewAccountant.getF_userID().setText(String.valueOf(f.getUser_id()));
        viewAccountant.getF_feedId().setText(String.valueOf(f.getDocument_id()));
        viewAccountant.getF_feedtitle().setText(String.valueOf(f.getDocument_title()));
        viewAccountant.getF_feedbackDes().setText(String.valueOf(f.getDocument_description()));
        viewAccountant.getF_feedbackContent().setText(String.valueOf(f.getDocument_content()));
        viewAccountant.getF_feedbackStatus().setSelectedItem(f.getDocument_status());
        viewAccountant.getF_postDate().setText(f.getDocument_post_date());

    }

    private void viewAllFeedBack() {
        if (checkingTable()) {
            Object[] row = new Object[7];
            ArrayList<FeedBack> fblist = feedbackDB.getAllFeedBack();
            for (FeedBack fblist1 : fblist) {
                row[0] = fblist1.getDocument_id();
                row[1] = fblist1.getUser_id();
                row[2] = fblist1.getDocument_title();
                row[3] = fblist1.getDocument_status();
                row[4] = fblist1.getDocument_post_date();
                row[5] = fblist1.getDocument_process_date();
                feedback_table.addRow(row);
            }
        } else {
            feedback_table.setRowCount(0);
            viewAllFeedBack();
        }
    }

    private boolean checkingTable() {
        boolean result = false;
        int count = feedback_table.getRowCount();
        result = count <= 0;
        return result;
    }

}
