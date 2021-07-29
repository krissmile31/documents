/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.ModelDB.DepartmentDB;
import Model.ModelDB.RoleDB;
import Model.ModelDB.SalaryDB;
import Model.ModelDB.UserDB;
import Model.Salary;
import View.ViewEmployee;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Quan Trong Tu
 */
public class ControllerEmployeeViewTotalSalary {

    private ViewEmployee viewEmployee;
    private SalaryDB salaryDB;
    private DefaultTableModel salary_table;
    private UserDB userDB;
    private RoleDB roleDB;
    private DepartmentDB departmentDB;

    public ControllerEmployeeViewTotalSalary(SalaryDB salaryDB, ViewEmployee viewEmployee, UserDB userDB, RoleDB roleDB, DepartmentDB departmentDB) {
        this.roleDB = roleDB;
        this.departmentDB = departmentDB;
        this.userDB = userDB;
        this.viewEmployee = viewEmployee;
        this.salaryDB = salaryDB;
        this.salary_table = (DefaultTableModel) viewEmployee.getSalary_total_table().getModel();
        actionViewAll();
    }

    private void actionViewAll() {
        viewEmployee.getSalary_total_btn_view().addActionListener(e -> viewAllSalaryInfor());
    }

    private void viewAllSalaryInfor() {

        if (salary_table.getRowCount() == 0) {
            ArrayList<Salary> list = salaryDB.getSalaryByUser(Integer.parseInt(viewEmployee.getAs_UserId().getText()));
            Object[] row = new Object[14];
            for (Salary salary : list) {
                String role = userDB.getUserInfor(salary.getUser_id()).getUser_role();
                String department = userDB.getUserInfor(salary.getUser_id()).getUser_department();
                row[0] = salary.getUser_id();
                row[1] = salary.getUser_name();
                row[2] = role;
                row[3] = department;
                row[4] = roleDB.getRole(role).getRole_basic_salary();
                row[5] = departmentDB.getDepartment(department).getDepartment_basic_salary();
                row[6] = salary.getProjectSalary();
                row[7] = salary.getAbsenceSalary();
                row[8] = salary.getOverTimeSalary();
                row[9] = salary.getBonusSalary();
                row[10] = salary.getMinusSalary();
                row[11] = salary.getTotalSalary();
                row[12] = salary.getSalary_month();
                row[13] = salary.getSalary_year();
                salary_table.addRow(row);
            }
        } else {
            salary_table.setRowCount(0);
            viewAllSalaryInfor();
        }
    }
}
