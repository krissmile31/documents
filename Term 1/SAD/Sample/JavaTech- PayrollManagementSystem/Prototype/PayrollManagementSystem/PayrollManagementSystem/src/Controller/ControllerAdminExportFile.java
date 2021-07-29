/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Model.ModelDB.LeaveOffDB;
import Model.ModelDB.ProjectDB;
import Model.User;
import Model.ModelDB.UserDB;
import View.ViewAdmin;
import java.io.File;
import java.io.FileOutputStream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author tuqua
 */
public class ControllerAdminExportFile {

    private ViewAdmin viewAdmin;
    private UserDB userDB;
    private LeaveOffDB leaveOffDB;
    private ProjectDB projectDB;

    public ControllerAdminExportFile(ViewAdmin va, UserDB udb, LeaveOffDB leoff, ProjectDB pro) {
        this.viewAdmin = va;
        this.userDB = udb;
        this.leaveOffDB = leoff;
        this.projectDB = pro;
        actionExportUserInf();
    }

    private void actionExportUserInf() {
        viewAdmin.getEx_userInfor().addActionListener(e -> exportUser());
    }

    private void exportUser() {
        if (viewAdmin.getUser_text_searchByUserId().getText().equals("")) {
            JOptionPane.showMessageDialog(null, "No selected");
        } else {
            User user = userDB.getUserInfor(Integer.parseInt(viewAdmin.getUser_text_searchByUserId().getText()));
            JFileChooser fs = new JFileChooser();
            fs.setDialogTitle("Export User Information");
            int result = fs.showSaveDialog(null);
            if (result == JFileChooser.APPROVE_OPTION) {
                File file = fs.getSelectedFile();
                try {
                    FileOutputStream fileout = new FileOutputStream(file);
                    fileout.write(user.toString().getBytes());
                    fileout.close();
                    JOptionPane.showMessageDialog(null, "Successfully");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            }
        }
        
    }
}
