/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Model.ModelDB.UserDB;
import Model.User;
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
public class ControllerLogin {

    private UserDB userDB;
    private ViewLogin viewLogin;
    private boolean idChecking;

    public ControllerLogin() {
        this.userDB = new UserDB();
        this.viewLogin = new ViewLogin();
        this.idChecking = false;
        viewLogin.setVisible(true);
        CheckAcc();
    }

    private void CheckAcc() {
        this.viewLogin.getButton_loggin().addActionListener(e -> {
            try {
                checkPass();
            } catch (NoSuchAlgorithmException ex) {
                Logger.getLogger(ControllerLogin.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    private void checkPass() throws NoSuchAlgorithmException {
        String fromView_pass = viewLogin.getUser_passWord();
        int fromView_id = viewLogin.getUser_id();

        int fromdb_id = 0;
        String fromdb_pass = null;
        String fromdb_type = null;
        int size = userDB.getAllUserInfor().size();
        for (int i = 0; i < size; i++) {
            fromdb_id = userDB.getAllUserInfor().get(i).getUser_id();
            if (fromView_id == fromdb_id) {
                fromdb_pass = userDB.getUserInfor(viewLogin.getUser_id()).getUser_password();
                fromdb_type = userDB.getUserInfor(viewLogin.getUser_id()).getUser_type();

                MessageDigest md = MessageDigest.getInstance("SHA-256");
                byte[] encodeHash = md.digest(fromView_pass.getBytes(StandardCharsets.UTF_8));
                String encryptPass = encryptPass(encodeHash);
                if (encryptPass.equalsIgnoreCase(fromdb_pass)) {
                    idChecking = true;
                    break;
                }
            }
        }

        if (idChecking) {
            JOptionPane.showMessageDialog(null, "Login successfully ");
            viewLogin.dispose();
            if (fromdb_type.equalsIgnoreCase("administrator")) {
                viewLogin.dispose();
                ControllerAdminView controllerAdminView = new ControllerAdminView(viewLogin, userDB);
            } else if (fromdb_type.equalsIgnoreCase("employee")) {
                viewLogin.dispose();
                ControllerEmployeeView controllerEmployeeView = new ControllerEmployeeView(viewLogin, userDB);
            } else {
                viewLogin.dispose();
                ControllerAccountantView cav = new ControllerAccountantView(viewLogin, userDB);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Wrong");
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
}
