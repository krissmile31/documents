/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.ModelDB.DepartmentDB;
import Model.ModelDB.FeedBackDB;
import Model.ModelDB.LeaveOffDB;
import Model.ModelDB.ProjectDB;
import Model.ModelDB.Project_UserDB;
import Model.ModelDB.ReportDB;
import Model.ModelDB.RoleDB;
import Model.ModelDB.SalaryDB;
import Model.ModelDB.UserDB;
import Model.ModelDB.WorkingTimeDB;
import View.ViewAccountant;
import View.ViewLogin;

/**
 *
 * @author tuqua
 */
public class ControllerAccountantView {

    private ViewAccountant va;
    private ViewLogin viewLogin;
    private UserDB userDb;
    private FeedBackDB feedbackDB;
    private RoleDB roleDB;
    private DepartmentDB departmentDB;
    private LeaveOffDB leaveOffDB;
    private WorkingTimeDB workingTimeDB;
    private ProjectDB projectDB;
    private Project_UserDB project_UserDB;
    private ReportDB reportDB;
    private SalaryDB salaryDB;

    public ControllerAccountantView(ViewLogin vl, UserDB userDB) {
        this.salaryDB = new SalaryDB();
        this.va = new ViewAccountant();
        this.viewLogin = vl;
        this.userDb = userDB;
        this.feedbackDB = new FeedBackDB();
        this.roleDB = new RoleDB();
        this.departmentDB = new DepartmentDB();
        this.leaveOffDB = new LeaveOffDB();
        this.workingTimeDB = new WorkingTimeDB();
        this.projectDB = new ProjectDB();
        this.project_UserDB = new Project_UserDB();
        this.reportDB = new ReportDB();
        LoginAs();
        actionLogout();
        profileAccountant();//done
        manageFeedback();
        manageSalary();
        viewReport();
    }

    private void LoginAs() {
        va.setVisible(true);
        String user_id = String.valueOf(viewLogin.getUser_id());
        va.getAs_UserId().setText(user_id);
        va.getAs_userName().setText(userDb.getUserInfor(viewLogin.getUser_id()).getUser_name());
    }

    private void actionLogout() {
        this.va.getLogout().addActionListener(e -> Logout());
    }

    private void Logout() {
        va.dispose();
        ControllerLogin c = new ControllerLogin();
    }

    private void manageFeedback() {
        ControllerAccountantManageFeedback camf = new ControllerAccountantManageFeedback(va, userDb, feedbackDB);
    }

    //methods
    private void profileAccountant() {
        ControllerAccountantProfile cap = new ControllerAccountantProfile(userDb, va, viewLogin);
    }

    private void manageSalary() {
        ControllerAccountantManageSalary cams = new ControllerAccountantManageSalary(va, roleDB, departmentDB, leaveOffDB, workingTimeDB, userDb, projectDB, project_UserDB, salaryDB);
    }

    private void viewReport() {
        ControllerAccountantViewReport cavr = new ControllerAccountantViewReport(va, reportDB, userDb);
    }
}
