/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.User;
import Model.ModelDB.UserDB;
import View.ViewAccountant;
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
public class ControllerAccountantProfile {

    private ViewAccountant viewAccountant;
    private UserDB userDb;
    private ViewLogin viewLogin;

    public ControllerAccountantProfile(UserDB userDb, ViewAccountant viewAccountant, ViewLogin viewlogin) {
        this.viewAccountant = viewAccountant;
        this.userDb = userDb;
        this.viewLogin = viewlogin;
        actionView();//done
        actionChangePassword();//done
    }

    private void actionChangePassword() {
        viewAccountant.getSubmit().addActionListener(e -> {
            try {
                updatePass();
            } catch (NoSuchAlgorithmException ex) {
                Logger.getLogger(ControllerAccountantProfile.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    private void actionView() {
        viewAccountant.getProfile_view().addActionListener(e -> view());
    }

    private void updatePass() throws NoSuchAlgorithmException {
        User user = userDb.getUserInfor(Integer.parseInt(viewAccountant.getAs_UserId().getText()));

        String getRecentPass = String.valueOf(viewAccountant.getPro_recentPass().getPassword());
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] encodeHash = md.digest(getRecentPass.getBytes(StandardCharsets.UTF_8));
        String encryptPassRecent = encryptPass(encodeHash);

        if (encryptPassRecent.equalsIgnoreCase(user.getUser_password())) {
            if (String.valueOf(viewAccountant.getPro_newPass().getPassword()).equals(String.valueOf(viewAccountant.getPro_confirmedPass().getPassword()))) {

                String getNewPass = String.valueOf(viewAccountant.getPro_confirmedPass().getPassword());
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

    private void view() {
        User user = userDb.getUserInfor(viewLogin.getUser_id());
        viewAccountant.getPro_userId().setText(String.valueOf(user.getUser_id()));
        viewAccountant.getPro_userName().setText(user.getUser_name());
        viewAccountant.getPro_userType().setText(user.getUser_type());
        viewAccountant.getPro_userGender().setText(user.getUser_gender());
        viewAccountant.getPro_userDob().setText(user.getUser_dob());
        viewAccountant.getPro_userPhone().setText(user.getUser_phone());
        viewAccountant.getPro_userAddress().setText(user.getUser_address());
        viewAccountant.getPro_userRole().setText(user.getUser_role());
        viewAccountant.getPro_userDepart().setText(user.getUser_department());
        viewAccountant.getPro_userEmail().setText(user.getUser_email());
        viewAccountant.getPro_userSalary().setText(String.valueOf(user.getUser_salary()));
    }

    private void clear() {
        viewAccountant.getPro_recentPass().setText("");
        viewAccountant.getPro_newPass().setText("");
        viewAccountant.getPro_confirmedPass().setText("");

    }
}
