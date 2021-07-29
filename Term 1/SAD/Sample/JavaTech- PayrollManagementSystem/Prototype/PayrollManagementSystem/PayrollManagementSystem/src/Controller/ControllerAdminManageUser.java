/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.ModelDB.DepartmentDB;
import Model.ModelDB.RoleDB;
import Model.User;
import Model.ModelDB.UserDB;
import View.ViewAdmin;
import View.ViewAdminManageAddUser;
import View.ViewAdminManageUpdateUser;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tuqua
 */
public class ControllerAdminManageUser {

    private ViewAdmin viewAdmin;
    private UserDB userDB;
    private DefaultTableModel userTable;
    private RoleDB roleDB;
    private DepartmentDB departmentDB;

    public ControllerAdminManageUser(ViewAdmin viewAdmin, UserDB userDB, RoleDB roleDB, DepartmentDB departmentDB) {
        this.viewAdmin = viewAdmin;
        this.userDB = userDB;
        this.userTable = (DefaultTableModel) viewAdmin.getUser_table_showUsers().getModel();
        this.roleDB = roleDB;
        this.departmentDB = departmentDB;
        actionViewAll();
        actionSearch();
        actionDelete();
        actionUpdate();
        actionAdd();
    }

    //action
    private void actionAdd() {
        viewAdmin.getUser_button_addUsers().addActionListener(e -> createAddUserForm());
    }

    private void actionUpdate() {
        viewAdmin.getuser_button_updateUsers().addActionListener(e -> createUpdateUserForm());
    }

    private void actionDelete() {
        viewAdmin.getUser_button_DeleteUsers().addActionListener(e -> deleteUser());
    }

    private void actionViewAll() {
        viewAdmin.getUser_button_viewUsers().addActionListener(e -> viewAllUser());
    }

    private void actionSearch() {
        viewAdmin.getUser_button_searchByUserId().addActionListener(e -> searchSpecUserInf());
    }

    private void createAddUserForm() {
        ViewAdminManageAddUser viewAdminManageAddUser = new ViewAdminManageAddUser();
        viewAdminManageAddUser.setVisible(true);
        int sizeRole = roleDB.getAllRole().size();
        for (int i = 0; i < sizeRole; i++) {
            viewAdminManageAddUser.getUserRole().addItem(roleDB.getAllRole().get(i).getRole_name());
        }
        int sizeDe = departmentDB.getAllDepartments().size();
        for (int i = 0; i < sizeDe; i++) {
            viewAdminManageAddUser.getUserDepartment().addItem(departmentDB.getAllDepartments().get(i).getDepartment_name());
        }
        viewAdminManageAddUser.buttonAdd().addActionListener(e -> {
            try {
                addUser(viewAdminManageAddUser);
            } catch (NoSuchAlgorithmException ex) {
                Logger.getLogger(ControllerAdminManageUser.class.getName()).log(Level.SEVERE, null, ex);
            }
        });

    }

    private void addUser(ViewAdminManageAddUser viewAdminManageAddUser) throws NoSuchAlgorithmException {
        User user = new User(0, "", "", "", "", "", "", "", "", "", "", 0);
        //encrypt password

        String userName = viewAdminManageAddUser.getUserName().getText();
        String userType = viewAdminManageAddUser.getUserType().getSelectedItem().toString();
        String userGender = viewAdminManageAddUser.getUserGender().getSelectedItem().toString().toString();
        String userEmail = viewAdminManageAddUser.getUserEmail().getText().trim();
        String userAddress = viewAdminManageAddUser.getUserAddress().getText().trim();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date date = viewAdminManageAddUser.getGet_userDob().getDate();
        String userDob = sdf.format(date);
        String userPhone = viewAdminManageAddUser.getUserPhone().getText().trim();
        String userRole = viewAdminManageAddUser.getUserRole().getSelectedItem().toString();
        String userDepartment = viewAdminManageAddUser.getUserDepartment().getSelectedItem().toString();
        String userSalary = viewAdminManageAddUser.getUserSalary().getText().trim();
        if (userName.equals("") || userGender.equals("") || userEmail.equals("") || userAddress.equals("") || userDob.equals("") || userPhone.equals("") || userSalary.equals("")) {
            JOptionPane.showMessageDialog(null, "Empty input");
        } else {
            String passWord = String.valueOf(viewAdminManageAddUser.getUserPass().getPassword());
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] encodeHash = md.digest(passWord.getBytes(StandardCharsets.UTF_8));
            String encryptPass = encryptPass(encodeHash);
            user.setUser_password(encryptPass);
            user.setUser_name(userName);
            user.setUser_type(userType);
            user.setUser_gender(userGender);
            user.setUser_email(userEmail);
            user.setUser_address(userAddress);
            user.setUser_dob(userDob);
            user.setUser_phone(userPhone);
            user.setUser_role(userRole);
            user.setUser_department(userDepartment);
            user.setUser_salary(Long.parseLong(userSalary));
            boolean a = userDB.insertUserInfor(user);
            if (a == true) {
                JOptionPane.showMessageDialog(null, "Record Successfully !!!!");
                viewAdminManageAddUser.dispose();
                viewAllUser();
            } else {
                JOptionPane.showMessageDialog(null, "Not Success !!!!");
            }
        }
    }

    private void createUpdateUserForm() {
        if (viewAdmin.getUser_text_searchByUserId().getText().equals("") || checkingTable()) {
            JOptionPane.showMessageDialog(null, "Empty Search");
        } else {
            if (userTable.getRowCount() == 1) {
                ViewAdminManageUpdateUser viewAdminManageUpdateUser = new ViewAdminManageUpdateUser();
                viewAdminManageUpdateUser.setVisible(true);
                User user = userDB.getUserInfor(Integer.parseInt(viewAdmin.getUser_text_searchByUserId().getText()));
                String currentRoleName = user.getUser_role();
                String currentDepName = user.getUser_department();

                viewAdminManageUpdateUser.getUserId().setText(String.valueOf(user.getUser_id()));
                viewAdminManageUpdateUser.getUserName().setText(user.getUser_name());
                viewAdminManageUpdateUser.getUserType().setSelectedItem(user.getUser_type());
                viewAdminManageUpdateUser.getUserGender().setSelectedItem(user.getUser_gender());
                viewAdminManageUpdateUser.getUserEmail().setText(user.getUser_email());
                viewAdminManageUpdateUser.getUserAddress().setText(user.getUser_address());
                viewAdminManageUpdateUser.getUserRole().addItem(currentRoleName);
                viewAdminManageUpdateUser.getUserPhone().setText(user.getUser_phone());
                viewAdminManageUpdateUser.getUserDepartment().addItem(currentDepName);
                viewAdminManageUpdateUser.getUserDob().setText(user.getUser_dob());
                viewAdminManageUpdateUser.getUserSalary().setText(String.valueOf(user.getUser_salary()));
                viewAdminManageUpdateUser.buttonUpdate().addActionListener(e -> updateUserInf(viewAdminManageUpdateUser, user));

                int sizeRole = roleDB.getAllRole().size();
                int sizeDepartment = departmentDB.getAllDepartments().size();
                for (int i = 0; i < sizeRole; i++) {
                    String name = roleDB.getAllRole().get(i).getRole_name();
                    if (currentRoleName.equalsIgnoreCase(name)) {
                    } else {
                        viewAdminManageUpdateUser.getUserRole().addItem(roleDB.getAllRole().get(i).getRole_name());
                    }
                }
                for (int i = 0; i < sizeDepartment; i++) {
                    String name = departmentDB.getAllDepartments().get(i).getDepartment_name();
                    if (currentDepName.equalsIgnoreCase(name)) {
                    } else {
                        viewAdminManageUpdateUser.getUserDepartment().addItem(departmentDB.getAllDepartments().get(i).getDepartment_name());
                    }
                }
            }
            else {
                JOptionPane.showMessageDialog(null, "Please Search For User ID first");
            }
        }

    }

    private void updateUserInf(ViewAdminManageUpdateUser viewAdminManageUpdateUser, User user) {
        String user_name = viewAdminManageUpdateUser.getUserName().getText();
        String user_type = viewAdminManageUpdateUser.getUserType().getSelectedItem().toString();
        String user_gender = viewAdminManageUpdateUser.getUserGender().getSelectedItem().toString();
        String user_email = viewAdminManageUpdateUser.getUserEmail().getText();
        String user_dob = viewAdminManageUpdateUser.getUserDob().getText();
        String user_address = viewAdminManageUpdateUser.getUserAddress().getText();
        String user_phone = viewAdminManageUpdateUser.getUserPhone().getText();
        String user_role = viewAdminManageUpdateUser.getUserRole().getSelectedItem().toString();
        String user_department = viewAdminManageUpdateUser.getUserDepartment().getSelectedItem().toString();
        String user_salary = viewAdminManageUpdateUser.getUserSalary().getText();
        if (user_name.equals("") || user_gender.equals("") || user_email.equals("") || user_dob.equals("") || user_address.equals("") || user_phone.equals("") || user_salary.equals("")) {
            JOptionPane.showMessageDialog(null, "Empty input");
        } else {
            user.setUser_name(user_name);
            user.setUser_type(user_type);
            user.setUser_gender(user_gender);
            user.setUser_email(user_email);
            user.setUser_dob(user_dob);
            user.setUser_address(user_address);
            user.setUser_phone(user_phone);
            user.setUser_role(user_role);
            user.setUser_department(user_department);
            user.setUser_salary(Long.parseLong(user_salary));
            boolean checking = userDB.updateUserInfor(user);
            if (checking == true) {
                JOptionPane.showMessageDialog(null, "Successfully");
                viewAdminManageUpdateUser.dispose();
                viewAllUser();
            } else {
                JOptionPane.showMessageDialog(null, "Unsuccess");
            }
        }
    }

    private boolean checkingTable() {
        boolean result = false;
        int count = userTable.getRowCount();
        if (count > 0) {
            result = false;
        } else {
            result = true;
        }
        return result;
    }

    private void viewAllUser() {
        int number = 1;
        if (checkingTable()) {
            Object[] row = new Object[12];
            ArrayList<User> u = userDB.getAllUserInfor();
            int sizeList = u.size();
            for (int i = 0; i < sizeList; i++) {
                row[0] = number++;
                row[1] = u.get(i).getUser_id();
                row[2] = u.get(i).getUser_name();
                row[3] = u.get(i).getUser_type();
                row[4] = u.get(i).getUser_gender();
                row[5] = u.get(i).getUser_email();
                row[6] = u.get(i).getUser_address();
                row[7] = u.get(i).getUser_dob();
                row[8] = u.get(i).getUser_phone();
                row[9] = u.get(i).getUser_role();
                row[10] = u.get(i).getUser_department();
                row[11] = u.get(i).getUser_salary();
                userTable.addRow(row);
            }
        } else {
            userTable.setRowCount(0);
            viewAllUser();
        }
    }

    private void searchSpecUserInf() {
        if (viewAdmin.getUser_text_searchByUserId().getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Empty Search");
        } else {
            try {
                int user_id = Integer.parseInt(viewAdmin.getUser_text_searchByUserId().getText().trim());
                int number = 1;
                boolean contain = false;
                ArrayList<User> userList = userDB.getAllUserInfor();
                for (int i = 0; i < userList.size(); i++) {
                    if (user_id == userList.get(i).getUser_id()) {
                        contain = true;
                    }
                }

                if (contain) {
                    if (checkingTable()) {
                        Object[] row = new Object[12];
                        User u = userDB.getUserInfor(user_id);
                        row[0] = number++;
                        row[1] = u.getUser_id();
                        row[2] = u.getUser_name();
                        row[3] = u.getUser_type();
                        row[4] = u.getUser_gender();
                        row[5] = u.getUser_email();
                        row[6] = u.getUser_address();
                        row[7] = u.getUser_dob();
                        row[8] = u.getUser_phone();
                        row[9] = u.getUser_role();
                        row[10] = u.getUser_department();
                        row[11] = u.getUser_salary();
                        userTable.addRow(row);
                    } else {
                        userTable.setRowCount(0);
                        searchSpecUserInf();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Not found");
                }
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "ID must be a number");
                viewAdmin.getUser_text_searchByUserId().setText("");
            }
        }
    }
    private void deleteUser() {
        if (viewAdmin.getUser_text_searchByUserId().getText().equals("") || checkingTable()) {
            JOptionPane.showMessageDialog(null, "Empty Search");
        } else {
            if (userTable.getRowCount() == 1) {
                int user_id = (Integer) userTable.getValueAt(1,1);
                boolean checking = userDB.deleteUserInfor(user_id);
                if (checking == true) {
                    JOptionPane.showMessageDialog(null, "Successfully !!!!");
                    viewAllUser();
                } else {
                    JOptionPane.showMessageDialog(null, "Not Success");
                    viewAllUser();
                }
            }
            else {
                JOptionPane.showMessageDialog(null, "Please search for a specific user ID first");
            }
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
