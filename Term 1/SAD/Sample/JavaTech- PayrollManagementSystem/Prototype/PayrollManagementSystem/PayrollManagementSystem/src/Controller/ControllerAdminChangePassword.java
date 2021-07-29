/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Model.User;
import Model.ModelDB.UserDB;
import View.ViewAdmin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author tuqua
 */
public class ControllerAdminChangePassword {

    private ViewAdmin viewAdmin;
    private UserDB userDb;

    public ControllerAdminChangePassword(ViewAdmin viewAdmin, UserDB userDb) {
        this.viewAdmin = viewAdmin;
        this.userDb = userDb;
        actionRecordPass();//done
        actionClear();

    }

    private void actionRecordPass() {
        viewAdmin.getPass_record().addActionListener(e -> {
            try {
                recordPass();
            } catch (NoSuchAlgorithmException ex) {
                Logger.getLogger(ControllerAdminChangePassword.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    private void actionClear() {
        viewAdmin.getPass_clear().addActionListener(e -> clearInput());
    }

    private void recordPass() throws NoSuchAlgorithmException {
        if (viewAdmin.getPass_userID().getText().trim().equals("")
                || viewAdmin.getPass_new().getText().trim().equals("")
                || viewAdmin.getPass_confirm().getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Empty Input");
        } else {
            try {
                int inputUserId = Integer.parseInt(viewAdmin.getPass_userID().getText().trim());
                User user = userDb.getUserInfor(inputUserId);
                boolean contain = false;
                ArrayList<User> ulist = userDb.getAllUserInfor();
                for (int i = 0; i < ulist.size(); i++) {
                    if (inputUserId == ulist.get(i).getUser_id()) {
                        contain = true;
                    }
                }

                if (contain) {
                    if (String.valueOf(viewAdmin.getPass_new().getPassword()).equals(String.valueOf(viewAdmin.getPass_confirm().getPassword()))) {
                        String passWord = String.valueOf(viewAdmin.getPass_new().getPassword());
                        MessageDigest md = MessageDigest.getInstance("SHA-256");
                        byte[] encodeHash = md.digest(passWord.getBytes(StandardCharsets.UTF_8));
                        String encryptPass = encryptPass(encodeHash);
                        user.setUser_password(encryptPass);
                        boolean checking = userDb.changePassUser(user);
                        if (checking) {
                            JOptionPane.showMessageDialog(null, "Success");
                            clearInput();
                        } else {
                            JOptionPane.showMessageDialog(null, "fail");
                            clearInput();
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Wrong confirm password");
                        clearInput();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Not Found");
                    clearInput();
                }
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "User ID must be a String");
                clearInput();
            }
        }
    }
    private void clearInput() {
        viewAdmin.getPass_confirm().setText("");
        viewAdmin.getPass_new().setText("");
        viewAdmin.getPass_userID().setText("");
    }

    private String encryptPass(byte[] hash) {
        StringBuffer hexString = new StringBuffer();
        for (byte b : hash) {
            String hex = Integer.toHexString(0xff & b);
            if (hex.length() == 1) {
                hexString.append("0");
            } else {
                hexString.append(hex);
            }
        }
        return hexString.toString().trim();
    }
}
