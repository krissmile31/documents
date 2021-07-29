/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.ModelDB.DepartmentDB;
import Model.ModelDB.LeaveOffDB;
import Model.ModelDB.ProjectDB;
import Model.ModelDB.Project_UserDB;
import Model.ModelDB.ReportDB;
import Model.ModelDB.RoleDB;
import Model.ModelDB.UserDB;
import Model.ModelDB.WorkingTimeDB;
import View.ViewAdmin;
import View.ViewLogin;

/**
 *
 * @author tuqua
 */
public class ControllerAdminView {

    private UserDB userDB;
    private ViewLogin viewLogin;
    private ViewAdmin viewAdmin;
    private ProjectDB projectDB;
    private Project_UserDB project_UserDB;
    private ReportDB reportDB;
    private LeaveOffDB leaveOffDB;
    private WorkingTimeDB wdb;
    private RoleDB roleDB;
    private DepartmentDB departmentDB;

    public ControllerAdminView(ViewLogin vl, UserDB userDB) {
        this.userDB = userDB;
        this.viewLogin = vl;
        this.viewAdmin = new ViewAdmin();
        this.projectDB = new ProjectDB();
        this.project_UserDB = new Project_UserDB();
        this.reportDB = new ReportDB();
        this.leaveOffDB = new LeaveOffDB();
        this.wdb = new WorkingTimeDB();
        this.roleDB = new RoleDB();
        this.departmentDB = new DepartmentDB();
        viewAdmin.setVisible(true);
        LoginAs();
        actionLogout();
        manageUser();
        manageProject();
        manageReport();
        approveRejectLeave();
        changePassword();
        manageWorkingTime();
        exportFile();
        manageRole();
        manageDepartment();
    }

    private void LoginAs() {
        viewAdmin.setVisible(true);
        String user_id = String.valueOf(viewLogin.getUser_id());
        viewAdmin.getUserId().setText(user_id);
        viewAdmin.getUserName().setText(userDB.getUserInfor(viewLogin.getUser_id()).getUser_name());
        viewAdmin.getLoginas_user_type().setText(userDB.getUserInfor(viewLogin.getUser_id()).getUser_type());
    }
    private void actionLogout() {
        this.viewAdmin.logout().addActionListener(e -> Logout());
    }
    private void Logout() {
        viewAdmin.dispose();
        ControllerLogin c = new ControllerLogin();
    }
    
    //Controller
    private void exportFile(){
        ControllerAdminExportFile caf = new ControllerAdminExportFile(viewAdmin, userDB, leaveOffDB, projectDB);
    }
    private void manageWorkingTime(){
        ControllerAdminManageWorkingTime conTime = new ControllerAdminManageWorkingTime(viewAdmin, wdb, userDB);
    }
    
    private void manageUser() {
        ControllerAdminManageUser controllerAdminManageUser = new ControllerAdminManageUser( viewAdmin, userDB, roleDB, departmentDB);
    }
    private void manageProject(){
        ControllerAdminManageProject controllerAdminManageProject = new ControllerAdminManageProject(viewAdmin, userDB, projectDB, project_UserDB);
    }
    private void manageReport(){
        ControllerAdminManageReport controllerAdminManageReport = new ControllerAdminManageReport(viewAdmin, reportDB, userDB);
    }
    private void approveRejectLeave(){
        ControllerAdminARleave controllerAdminARleave = new ControllerAdminARleave(leaveOffDB, viewAdmin, userDB);
    }
    private void changePassword(){
        ControllerAdminChangePassword controllerAdminChangePassword = new ControllerAdminChangePassword(viewAdmin, userDB);
    }    
    private void manageRole(){
        ControllerAdminManageRole controllerAdminManageRole = new ControllerAdminManageRole(viewAdmin, roleDB,userDB);
    }
    private void manageDepartment(){
        ControllerAdminManageDepartment controlerAdminManageDepartment = new ControllerAdminManageDepartment(viewAdmin, departmentDB ,userDB);
    }
//    //methods
}
