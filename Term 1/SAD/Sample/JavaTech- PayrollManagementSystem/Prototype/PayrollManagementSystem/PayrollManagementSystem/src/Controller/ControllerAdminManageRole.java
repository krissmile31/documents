/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.ModelDB.RoleDB;
import Model.ModelDB.UserDB;
import Model.Role;
import Model.User;
import View.ViewAdmin;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tuqua
 */
public class ControllerAdminManageRole {

    private ViewAdmin viewAdmin;
    private RoleDB roleDb;
    private DefaultTableModel table_role;
    private UserDB userDB;

    public ControllerAdminManageRole(ViewAdmin v, RoleDB r, UserDB userDB) {
        this.userDB = userDB;
        this.viewAdmin = v;
        this.roleDb = r;
        this.table_role = (DefaultTableModel) viewAdmin.getRole_table().getModel();
        actionViewAll();//done
        actionAddRole();//done
        actionSearch();//done
        viewSearch();//
        actionUpdate();//done
        actionDelete();//done
    }

    private void actionDelete() {
        viewAdmin.getRole_button_delete().addActionListener(e -> deleteRole());
    }

    private void actionUpdate() {
        viewAdmin.getRole_button_update().addActionListener(e -> updateRole());
    }

    private void deleteRole() {
        String getSelectedRole = viewAdmin.getRole_boxlist().getSelectedItem().toString();
        boolean checking = false;
        ArrayList<User> userList = userDB.getAllUserInfor();
        for (User user : userList) {
            if (user.getUser_role().equalsIgnoreCase(getSelectedRole)) {
                checking = true;
            }
        }

        if (checking) {
            JOptionPane.showMessageDialog(null, "Role in use");
        } else {
            if (roleDb.deleteRole(getSelectedRole)) {
                JOptionPane.showMessageDialog(null, "Success");
                viewAdmin.getRole_boxlist().removeAllItems();
                viewRole();
                viewSearch();
                clear();
            } else {
                JOptionPane.showMessageDialog(null, "Fail");
            }
        }
    }

    private void viewSearch() {
        int size = roleDb.getAllRole().size();
        for (int i = 0; i < size; i++) {
            viewAdmin.getRole_boxlist().addItem(roleDb.getAllRole().get(i).getRole_name());
        }
    }

    private void actionSearch() {
        viewAdmin.getRole_button_search().addActionListener(e -> searchRole());
    }

    private void actionViewAll() {
        viewAdmin.getRole_button_view().addActionListener(e -> viewRole());
    }

    private void searchRole() {
        String roleName = viewAdmin.getRole_boxlist().getSelectedItem().toString();
        Role r = roleDb.getRole(roleName);
        viewAdmin.getRole_up_de_roleName().setText(r.getRole_name());
        viewAdmin.getRole_up_de_roleSalary().setText(String.valueOf(r.getRole_basic_salary()));
    }

    private void updateRole() {
        if (viewAdmin.getRole_up_de_roleName().getText().equals("") || viewAdmin.getRole_up_de_roleSalary().getText().equals("")) {
            JOptionPane.showMessageDialog(null, " Empty Input");
        } else {
            Role r = new Role(null, 0);
            r.setRole_name(viewAdmin.getRole_up_de_roleName().getText().trim());
            r.setRole_basic_salary(Long.parseLong(viewAdmin.getRole_up_de_roleSalary().getText().trim()));
            boolean c = roleDb.updateRole(r, viewAdmin.getRole_boxlist().getSelectedItem().toString());
            if (c) {
                JOptionPane.showMessageDialog(null, "Success");
                viewAdmin.getRole_boxlist().removeAllItems();
                viewRole();
                viewSearch();
                clear();
            } else {
                JOptionPane.showMessageDialog(null, "fail");
            }
        }
    }

    private boolean checkingTable() {
        boolean result = false;
        int count = table_role.getRowCount();
        result = count <= 0;
        return result;
    }

    private void viewRole() {
        if (checkingTable()) {
            Object[] row = new Object[2];
            int size = roleDb.getAllRole().size();
            for (int i = 0; i < size; i++) {
                row[0] = roleDb.getAllRole().get(i).getRole_name();
                row[1] = roleDb.getAllRole().get(i).getRole_basic_salary();
                table_role.addRow(row);
            }
        } else {
            table_role.setRowCount(0);
            viewRole();
        }
    }

    private void actionAddRole() {
        viewAdmin.getRole_button_add().addActionListener(e -> addRole());
    }

    private void addRole() {
        if (viewAdmin.getRole_add_roleName().getText().equals("") || viewAdmin.getRole_add_roleSalary().getText().equals("")) {
            JOptionPane.showMessageDialog(null, " Empty Input");
        } else {
            try {
                Role r = new Role(viewAdmin.getRole_add_roleName().getText().trim(), Long.parseLong(viewAdmin.getRole_add_roleSalary().getText()));
                boolean checking = roleDb.addRole(r);
                if (checking) {
                    JOptionPane.showMessageDialog(null, "Success");
                    viewAdmin.getRole_boxlist().removeAllItems();
                    viewRole();
                    viewSearch();
                    clear();
                } else {
                    JOptionPane.showMessageDialog(null, "Fail");
                }
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Salary must be a number");
                viewAdmin.getRole_add_roleSalary().setText("");
            }
        }
    }
    private void clear() {
        viewAdmin.getRole_up_de_roleName().setText("");
        viewAdmin.getRole_up_de_roleSalary().setText("");
    }
}
