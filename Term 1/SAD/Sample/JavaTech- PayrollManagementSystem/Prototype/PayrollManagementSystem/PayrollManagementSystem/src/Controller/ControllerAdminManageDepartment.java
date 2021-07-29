    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Department;
import Model.ModelDB.DepartmentDB;
import Model.ModelDB.UserDB;
import Model.User;
import View.ViewAdmin;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tuqua
 */
public class ControllerAdminManageDepartment {

    private ViewAdmin viewAdmin;
    private DepartmentDB departmentDb;
    private DefaultTableModel table_department;
    private UserDB userDB;

    public ControllerAdminManageDepartment(ViewAdmin v, DepartmentDB d, UserDB userDb) {
        this.userDB = userDb;
        this.viewAdmin = v;
        this.departmentDb = d;
        this.table_department = (DefaultTableModel) viewAdmin.getDepartment_table().getModel();
        actionViewAll();//done
        actionAdd();//done
        actionSearch();//done
        viewSelectionDepartment();
        actionUpdate();//done
        actionDelete();//done
    }

    private void actionDelete() {
        viewAdmin.getDepartment_button_delete().addActionListener(e -> deleteDepartment());
    }

    private void actionUpdate() {
        viewAdmin.getDepartment_button_update().addActionListener(e -> updateDepartment());
    }

    private void deleteDepartment() {
        String getSelectedDepartment = viewAdmin.getDepartment_boxlist().getSelectedItem().toString();
        boolean checking = false;
        ArrayList<User> userList = userDB.getAllUserInfor();
        for (User user : userList) {
            if (user.getUser_department().equals(getSelectedDepartment)) {
                checking = true;
            }
        }

        if (checking) {
            JOptionPane.showMessageDialog(null, "Department in use");
        } else if (departmentDb.deleteDepartment(viewAdmin.getDepartment_boxlist().getSelectedItem().toString())) {
            JOptionPane.showMessageDialog(null, "Success");
            viewAdmin.getDepartment_boxlist().removeAllItems();
            viewAllDepartment();
            viewSelectionDepartment();
            clear();
        } else {
            JOptionPane.showMessageDialog(null, "Success");
        }
    }

    private void viewSelectionDepartment() {
        int size = departmentDb.getAllDepartments().size();
        for (int i = 0; i < size; i++) {
            viewAdmin.getDepartment_boxlist().addItem(departmentDb.getAllDepartments().get(i).getDepartment_name());
        }
    }

    private void actionSearch() {
        viewAdmin.getDepartment_button_search().addActionListener(e -> searchDepartment());
    }

    private void actionViewAll() {
        viewAdmin.getDepartment_button_view().addActionListener(e -> viewAllDepartment());
    }

    private void searchDepartment() {
        String deName = viewAdmin.getDepartment_boxlist().getSelectedItem().toString();
        Department d = departmentDb.getDepartment(deName);
        viewAdmin.getDepartment_up_de_deName().setText(d.getDepartment_name());
        viewAdmin.getDepartment_up_de_deSalary().setText(String.valueOf(d.getDepartment_basic_salary()));
    }

    private void updateDepartment() {
        if (viewAdmin.getDepartment_up_de_deName().getText().equals("") || viewAdmin.getDepartment_up_de_deSalary().getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Empty input");
        } else {
            Department d = new Department(null, 0);
            d.setDepartment_name(viewAdmin.getDepartment_up_de_deName().getText().trim());
            d.setDepartment_basic_salary(Long.parseLong(viewAdmin.getDepartment_up_de_deSalary().getText().trim()));
            String preName = viewAdmin.getDepartment_boxlist().getSelectedItem().toString();
            if (departmentDb.updateDepartment(d, preName)) {
                JOptionPane.showMessageDialog(null, "Success");
                viewAdmin.getDepartment_boxlist().removeAllItems();
                viewAllDepartment();
                viewSelectionDepartment();
                clear();
            } else {
                JOptionPane.showMessageDialog(null, "fail");
            }
        }
    }

    private boolean checkingTable() {
        boolean result = false;
        int count = table_department.getRowCount();
        result = count <= 0;
        return result;
    }

    private void viewAllDepartment() {
        if (checkingTable()) {
            Object[] row = new Object[2];
            ArrayList<Department> a = departmentDb.getAllDepartments();
            for (int i = 0; i < a.size(); i++) {
                row[0] = a.get(i).getDepartment_name();
                row[1] = a.get(i).getDepartment_basic_salary();
                table_department.addRow(row);
            }
        } else {
            table_department.setRowCount(0);
            viewAllDepartment();
        }
    }

    private void actionAdd() {
        viewAdmin.getDepartment_button_add().addActionListener(e -> addDepartment());
    }

    private void addDepartment() {
        if (viewAdmin.getDepartment_add_deName().getText().equals("") || viewAdmin.getDepartment_add_deSalary().getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Empty input");
        } else {
            try {
                Department d = new Department(viewAdmin.getDepartment_add_deName().getText().trim(), Long.parseLong(viewAdmin.getDepartment_add_deSalary().getText()));
                boolean checking = departmentDb.addDeparment(d);
                if (checking) {
                    JOptionPane.showMessageDialog(null, "Success");
                    viewAdmin.getDepartment_boxlist().removeAllItems();
                    viewAllDepartment();
                    viewSelectionDepartment();
                    clear();
                } else {
                    JOptionPane.showMessageDialog(null, "Fail");
                }
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Salary must be a number");
                viewAdmin.getDepartment_add_deSalary().setText("");
            }
        }
    }
    private void clear() {
        viewAdmin.getDepartment_up_de_deName().setText("");
        viewAdmin.getDepartment_up_de_deSalary().setText("");
    }
}
