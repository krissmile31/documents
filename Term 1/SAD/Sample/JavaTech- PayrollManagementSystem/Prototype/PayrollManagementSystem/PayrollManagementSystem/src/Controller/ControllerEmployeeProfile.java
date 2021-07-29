/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.ModelDB.UserDB;
import Model.User;
import View.ViewEmployee;
import View.ViewLogin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author tuqua
 */
public class ControllerEmployeeProfile {

    private ViewEmployee viewEmployee;
    private UserDB userDb;
    private ViewLogin viewLogin;

    public ControllerEmployeeProfile(UserDB userDb, ViewEmployee viewEmployee, ViewLogin viewlogin) {
        this.viewEmployee = viewEmployee;
        this.userDb = userDb;
        this.viewLogin = viewlogin;
        actionView();//done
        actionChangePassword();//done
    }

    private void actionChangePassword() {
        viewEmployee.getSubmit().addActionListener(e -> {
            try {
                changePass();
            } catch (NoSuchAlgorithmException ex) {
                Logger.getLogger(ControllerEmployeeProfile.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    private void actionView() {
        viewEmployee.getProfile_view().addActionListener(e -> viewProfile());
    }

    private void changePass() throws NoSuchAlgorithmException {
        User user = userDb.getUserInfor(Integer.parseInt(viewEmployee.getAs_UserId().getText()));

        String getRecentPass = String.valueOf(viewEmployee.getPro_recentPass().getPassword());
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] encodeHash = md.digest(getRecentPass.getBytes(StandardCharsets.UTF_8));
        String encryptPassRecent = encryptPass(encodeHash);

        if (encryptPassRecent.equalsIgnoreCase(user.getUser_password())) {
            if (String.valueOf(viewEmployee.getPro_newPass().getPassword()).equals(String.valueOf(viewEmployee.getPro_confirmedPass().getPassword()))) {

                String getNewPass = String.valueOf(viewEmployee.getPro_newPass().getPassword());
                byte[] encodeNewHash = md.digest(getNewPass.getBytes(StandardCharsets.UTF_8));
                String encryptPassNew = encryptPass(encodeNewHash);

                user.setUser_password(encryptPassNew);
                boolean checking = userDb.changePassUser(user);
                if (checking) {
                    JOptionPane.showMessageDialog(null, "Success");
                    clear();
                } else {
                    JOptionPane.showMessageDialog(null, "fail");
                    clear();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Wrong confirm password");
                clear();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Wrong recent password");
        }

        if (user.getUser_password().equals(String.valueOf(viewEmployee.getPro_recentPass().getPassword()))) {
            if (String.valueOf(viewEmployee.getPro_newPass().getPassword()).equals(String.valueOf(viewEmployee.getPro_confirmedPass().getPassword()))) {
                user.setUser_password(String.valueOf(viewEmployee.getPro_newPass().getPassword()));
                boolean checking = userDb.changePassUser(user);
                if (checking) {
                    JOptionPane.showMessageDialog(null, "Success");
                    clear();
                } else {
                    JOptionPane.showMessageDialog(null, "fail");
                    clear();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Wrong confirm password");
                clear();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Wrong recent password");
        }
    }

    private void viewProfile() {
        User user = userDb.getUserInfor(viewLogin.getUser_id());
        viewEmployee.getPro_userId().setText(String.valueOf(user.getUser_id()));
        viewEmployee.getPro_userName().setText(user.getUser_name());
        viewEmployee.getPro_userPass().setText(user.getUser_password());
        viewEmployee.getPro_userType().setText(user.getUser_type());
        viewEmployee.getPro_userGender().setText(user.getUser_gender());
        viewEmployee.getPro_userDob().setText(user.getUser_dob());
        viewEmployee.getPro_userPhone().setText(user.getUser_phone());
        viewEmployee.getPro_userAddress().setText(user.getUser_address());
        viewEmployee.getPro_userRole().setText(user.getUser_role());
        viewEmployee.getPro_userDepart().setText(user.getUser_department());
        viewEmployee.getPro_userEmail().setText(user.getUser_email());
        viewEmployee.getPro_userSalary().setText(String.valueOf(user.getUser_salary()));
    }

    private void clear() {
        viewEmployee.getPro_recentPass().setText("");
        viewEmployee.getPro_newPass().setText("");
        viewEmployee.getPro_confirmedPass().setText("");
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
