/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.ModelDB.DepartmentDB;
import Model.ModelDB.FeedBackDB;
import Model.ModelDB.LeaveOffDB;
import Model.ModelDB.ReportDB;
import Model.ModelDB.RoleDB;
import Model.ModelDB.SalaryDB;

import Model.ModelDB.UserDB;
import View.ViewEmployee;
import View.ViewLogin;

public class ControllerEmployeeView {

    private UserDB userDB;
    private FeedBackDB feedBackDB;
    private ViewEmployee viewEmployee;
    private ViewLogin viewLogin;
    private LeaveOffDB leaveOffDB;
    private ReportDB reportDB;
    private SalaryDB salaryDB;
    private RoleDB roleDB;
    private DepartmentDB departmentDB;

    public ControllerEmployeeView(ViewLogin viewLogin, UserDB userDB) {
        this.departmentDB = new DepartmentDB();
        this.roleDB = new RoleDB();
        this.salaryDB = new SalaryDB();
        this.reportDB = new ReportDB();
        this.userDB = userDB;
        this.viewLogin = viewLogin;
        this.feedBackDB = new FeedBackDB();
        this.viewEmployee = new ViewEmployee();
        this.leaveOffDB = new LeaveOffDB();
        loginAs();
        actionLogout();
        manageLeave();
        employeetProfile();
        manageFeedBack();
        viewReport();
        viewTotalSalary();

    }

    private void viewTotalSalary() {
        ControllerEmployeeViewTotalSalary controllerEmployeeViewTotalSalary = new ControllerEmployeeViewTotalSalary(salaryDB, viewEmployee, userDB, roleDB, departmentDB);
    }

    private void viewReport() {
        ControllerEmployeeViewReport c = new ControllerEmployeeViewReport(reportDB, viewEmployee, userDB);
    }

    private void manageFeedBack() {
        ControllerEmployeeFeedback cef = new ControllerEmployeeFeedback(feedBackDB, viewEmployee, viewLogin, userDB);
    }

    private void employeetProfile() {
        ControllerEmployeeProfile cep = new ControllerEmployeeProfile(userDB, viewEmployee, viewLogin);
    }

    private void manageLeave() {
        ControllerEmployeeApplyLeave ceml = new ControllerEmployeeApplyLeave(leaveOffDB, viewEmployee, viewLogin, userDB);
    }

    private void actionLogout() {
        viewEmployee.getLogout().addActionListener(e -> logout());
    }

    private void logout() {
        viewEmployee.dispose();
        ControllerLogin c = new ControllerLogin();
    }

    private void loginAs() {
        viewEmployee.setVisible(true);
        String user_id = String.valueOf(viewLogin.getUser_id());
        viewEmployee.getAs_UserId().setText(user_id);
        viewEmployee.getAs_userName().setText(userDB.getUserInfor(viewLogin.getUser_id()).getUser_name());
    }
}
