/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Project;
import Model.ModelDB.ProjectDB;
import Model.Project_User;
import Model.ModelDB.Project_UserDB;
import Model.ModelDB.UserDB;
import View.ViewAdmin;
import View.ViewAdminManageAddProject;
import View.ViewAdminManageAssignProject;
import View.ViewAdminManageUpdateProject;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tuqua
 */
public class ControllerAdminManageProject {

    private Project_UserDB project_UserDB;
    private ViewAdmin viewAdmin;
    private UserDB userDB;
    private ProjectDB projectDB;
    private DefaultTableModel projectTable;
    private DefaultTableModel assignTable;

    public ControllerAdminManageProject(ViewAdmin viewAdmin, UserDB userDB, ProjectDB projectDB, Project_UserDB project_userDB) {
        this.projectDB = projectDB;
        this.viewAdmin = viewAdmin;
        this.userDB = userDB;
        this.project_UserDB = project_userDB;
        this.projectTable = (DefaultTableModel) viewAdmin.project_table().getModel();
        this.assignTable = (DefaultTableModel) viewAdmin.assign_table().getModel();

        actionAddProject();//done
        actionDelete();//done
        actionUpdatePro();//done
        actionSearch();//done
        actionViewAllPro();//done
        actionAssignPro();//done
        actionViewProUser();//done
        actionSearchAssign();//done
        actionDeleteProUser();//done
    }

    //actions
    private void actionDeleteProUser() {
        viewAdmin.getButton_DeleteAssign().addActionListener(e -> deleteAssign());
    }

    private void actionSearchAssign() {
        viewAdmin.buttonSearchAssign().addActionListener(e -> searchAssignProject());
    }

    private void actionViewProUser() {
        viewAdmin.viewAssign().addActionListener(e -> viewAllProUser());
    }

    private void actionAssignPro() {
        viewAdmin.assignProject().addActionListener(e -> createAssignForm());
    }

    private void actionUpdatePro() {
        viewAdmin.updateProject().addActionListener(e -> createUpdateForm());
    }

    private void actionViewAllPro() {
        viewAdmin.viewAllProject().addActionListener(e -> showAllProject());
    }

    private void actionSearch() {
        viewAdmin.searchSpecProject().addActionListener(e -> searchProjectInf());
    }

    private void actionDelete() {
        viewAdmin.deleteProject().addActionListener(e -> deleteProject());
    }

    private void actionAddProject() {
        viewAdmin.addProject().addActionListener(e -> createAddProjectForm());
    }
//    private void actionBack() {
//        viewAdminManageProject.getRecord().addActionListener(e -> insertProject());
//    }

    //methods
    private void deleteAssign() {
        if (viewAdmin.getProU_delete_getUserId().getText().equals("") || viewAdmin.getProU_delete_getProjectId().getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Empty input");
        } else {
            try {
                int user_id = Integer.parseInt(viewAdmin.getProU_delete_getUserId().getText());
                int project_id = Integer.parseInt(viewAdmin.getProU_delete_getProjectId().getText());

                if (project_UserDB.deleteProUser(project_id, user_id)) {
                    JOptionPane.showMessageDialog(null, "Success");
                    viewAdmin.getProU_delete_getProjectId().setText("");
                    viewAdmin.getProU_delete_getUserId().setText("");
                    viewAllProUser();
                } else {
                    JOptionPane.showMessageDialog(null, "fail");
                }
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "ID must be a number");
            }
        }
    }
    private void searchAssignProject() {
        try {
            int project_user_id = Integer.parseInt(viewAdmin.searchAssignInput().getText());
            int number = 1;
            boolean contain = false;
            ArrayList<Project_User> pulist = project_UserDB.getAllProjects();
            for (int i = 0; i < pulist.size(); i++) {
                if (project_user_id == pulist.get(i).getProject_id()) {
                    contain = true;
                }
            }
            // bugg here
            if (contain) {
                if (checkingTable2()) {
                    ArrayList<Project_User> pr = project_UserDB.getByProjectID(project_user_id);
                    Object[] row = new Object[7];
                    for (int i = 0; i < pr.size(); i++) {
                        row[0] = number++;
                        row[1] = pulist.get(i).getProject_id();
                        row[2] = projectDB.getProjectInfor(pulist.get(i).getProject_id()).getProjectTitle();
                        row[3] = pulist.get(i).getUser_id();
                        row[4] = userDB.getUserInfor(pulist.get(i).getUser_id()).getUser_name();
                        row[5] = pulist.get(i).getSalary();
                        row[6] = pulist.get(i).getProjectPercentSalary() + " percent ";
                        assignTable.addRow(row);
                    }
                } else {
                    assignTable.setRowCount(0);
                    searchAssignProject();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Not found");
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "ID must be a number");
        }
    }
    private void viewAllProUser() {
        int number2 = 1;
        if (checkingTable2()) {
            Object[] row = new Object[7];
            ArrayList<Project_User> pulist = project_UserDB.getAllProjects();
            for (int i = 0; i < pulist.size(); i++) {
                row[0] = number2++;
                row[1] = pulist.get(i).getProject_id();
                row[2] = projectDB.getProjectInfor(pulist.get(i).getProject_id()).getProjectTitle();
                row[3] = pulist.get(i).getUser_id();
                row[4] = userDB.getUserInfor(pulist.get(i).getUser_id()).getUser_name();
                row[5] = pulist.get(i).getSalary();
                row[6] = pulist.get(i).getProjectPercentSalary() + " percent ";
                assignTable.addRow(row);
            }
        } else {
            assignTable.setRowCount(0);
            viewAllProUser();
        }
    }

    private void createAssignForm() {
        ViewAdminManageAssignProject vap = new ViewAdminManageAssignProject();
        vap.setVisible(true);
        vap.getSubmit().addActionListener(e -> assignProject(vap));
    }

    private void assignProject(ViewAdminManageAssignProject vap) {
        Project_User pu = new Project_User(0, 0, 0, 0);

        String getUser_id = vap.getUserId().getText();
        String getProject_id = vap.getProjectId().getText();
        String getProject_percent = vap.getAssign_proPercenSalary().getText();

        if (getUser_id.equals("") || getProject_id.equals("") || getProject_percent.equals("")) {
            JOptionPane.showMessageDialog(null, "Empty input");
        } else {
            int project_percent = Integer.parseInt(getProject_percent);
            int u_id = Integer.parseInt(getUser_id);
            int p_id = Integer.parseInt(getProject_id);

            pu.setUser_id(u_id);
            pu.setProject_id(p_id);
            pu.setProjectPercentSalary(project_percent);
            long userGet = calculateSalary(p_id, project_percent);
            pu.setSalary(userGet);
            boolean checking = project_UserDB.insertPersonInProject(pu.getUser_id(), pu.getProject_id(), pu.getSalary(), pu.getProjectPercentSalary());
            if (checking == true) {
                JOptionPane.showMessageDialog(null, "Success");
                vap.dispose();
                viewAllProUser();
            } else {
                JOptionPane.showMessageDialog(null, "fail");
            }
        }
    }

    private long calculateSalary(int project_id, int project_percent) {
        Project project = projectDB.getProjectInfor(project_id);
        long project_totalEarning = project.getProjectTotalEarning();
        double projectSalary = (double) project_totalEarning * ((double) project_percent / 100.0);
        return (long) projectSalary;
    }

    private void createAddProjectForm() {
        ViewAdminManageAddProject viewAdminManageAddProject = new ViewAdminManageAddProject();
        viewAdminManageAddProject.setVisible(true);
        viewAdminManageAddProject.submit().addActionListener(e -> insertProject(viewAdminManageAddProject));
    }

    private void insertProject(ViewAdminManageAddProject viewAdminManageAddProject) {
        Project project = new Project(0, "", "", "", 0, "", "");
        String project_title = viewAdminManageAddProject.getProTitle().getText();
        String project_des = viewAdminManageAddProject.getProDescription().getText();
        String project_content = viewAdminManageAddProject.getProContent().getText();
        String project_salary = viewAdminManageAddProject.getTotal().getText();

        if (project_title.equals("") || project_des.equals("") || project_content.equals("") || project_salary.equals("")) {
            JOptionPane.showMessageDialog(null, "Empty input");
        } else {
            project.setProjectTitle(project_title);
            project.setProjectDescription(project_des);
            project.setProjectContent(project_content);
            project.setProjectTotalEarning(Long.parseLong(project_salary));
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date start_date = viewAdminManageAddProject.getStart_date().getDate();
            Date end_date = viewAdminManageAddProject.getEnd_date().getDate();
            String strDate = dateFormat.format(start_date);
            String endDate = dateFormat.format(end_date);
            project.setProject_startDate(strDate);
            project.setProject_endDate(endDate);

            boolean check = projectDB.insertProjectInfor(project);
            if (check) {
                JOptionPane.showMessageDialog(null, "Success");
                viewAdminManageAddProject.dispose();
                showAllProject();
            } else {
                JOptionPane.showMessageDialog(null, "Fail");
            }
        }
    }

    private void deleteProject() {
        if (viewAdmin.searchProject().getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Empty Search");
        } else {
            int project_id = Integer.parseInt(viewAdmin.searchProject().getText().trim());
            boolean checking = projectDB.deleteProInfor(project_id);
            if (checking == true) {
                JOptionPane.showMessageDialog(null, "Successfully !!!!");
                showAllProject();
            } else {
                JOptionPane.showMessageDialog(null, "Not Success");
            }
        }
    }

    private void searchProjectInf() {
        if (viewAdmin.searchProject().getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Empty Search");
        } else {
            try {
                int project_id = Integer.parseInt(viewAdmin.searchProject().getText().trim());
                int number = 1;
                boolean contain = false;
                ArrayList<Project> projectList = projectDB.getAllProjectInfor();
                for (int i = 0; i < projectList.size(); i++) {
                    if (project_id == projectList.get(i).getProjectId()) {
                        contain = true;
                    }
                }

                if (contain) {
                    if (checkingTable1()) {
                        Object[] row = new Object[8];
                        Project p = projectDB.getProjectInfor(project_id);
                        row[0] = number++;
                        row[1] = p.getProjectId();
                        row[2] = p.getProjectTitle();
                        row[3] = p.getProjectDescription();
                        row[4] = p.getProjectContent();
                        row[5] = p.getProjectTotalEarning();
                        row[6] = p.getProject_startDate();
                        row[7] = p.getProject_endDate();

                        projectTable.addRow(row);
                    } else {
                        projectTable.setRowCount(0);
                        searchProjectInf();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Not found");
                }
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "ID must be a number");
            }
        }
    }
    private boolean checkingTable1() {
        boolean result = false;
        int count = projectTable.getRowCount();
        if (count > 0) {
            result = false;
        } else {
            result = true;
        }
        return result;
    }

    private boolean checkingTable2() {
        boolean result = false;
        int count = assignTable.getRowCount();
        if (count > 0) {
            result = false;
        } else {
            result = true;
        }
        return result;
    }

    private void showAllProject() {
        //table1
        int number = 1;
        if (checkingTable1()) {
            Object[] row = new Object[8];
            ArrayList<Project> projectList = projectDB.getAllProjectInfor();
            for (Project projectList1 : projectList) {
                row[0] = number++;
                row[1] = projectList1.getProjectId();
                row[2] = projectList1.getProjectTitle();
                row[3] = projectList1.getProjectDescription();
                row[4] = projectList1.getProjectContent();
                row[5] = projectList1.getProjectTotalEarning();
                row[6] = projectList1.getProject_startDate();
                row[7] = projectList1.getProject_endDate();
                projectTable.addRow(row);
            }
        } else {
            projectTable.setRowCount(0);
            showAllProject();
        }
    }

    private void createUpdateForm() {
        if (viewAdmin.searchProject().getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Empty Search");
        } else {
            ViewAdminManageUpdateProject viewAdminManageUpdateProject = new ViewAdminManageUpdateProject();
            viewAdminManageUpdateProject.setVisible(true);
            Project project = projectDB.getProjectInfor(Integer.parseInt(viewAdmin.searchProject().getText()));

            viewAdminManageUpdateProject.getUpdate_projectId().setText(viewAdmin.searchProject().getText());
            viewAdminManageUpdateProject.getUpdate_title().setText(project.getProjectTitle());
            viewAdminManageUpdateProject.getUpdate_des().setText(project.getProjectDescription());
            viewAdminManageUpdateProject.getUpdate_con().setText(project.getProjectContent());
            viewAdminManageUpdateProject.getUpdate_total().setText(String.valueOf(project.getProjectTotalEarning()));

            java.sql.Date startDate = java.sql.Date.valueOf(project.getProject_startDate());
            java.sql.Date endDate = java.sql.Date.valueOf(project.getProject_endDate());
            viewAdminManageUpdateProject.getUpdate_start_date().setDate(startDate);
            viewAdminManageUpdateProject.getUpdate_end_date().setDate(endDate);

            viewAdminManageUpdateProject.getButton_update().addActionListener(e -> updateProject(viewAdminManageUpdateProject, project));
        }

    }

    private void updateProject(ViewAdminManageUpdateProject viewAdminManageUpdateProject, Project project) {
        String project_title = viewAdminManageUpdateProject.getUpdate_title().getText();
        String project_description = viewAdminManageUpdateProject.getUpdate_des().getText();
        String project_content = viewAdminManageUpdateProject.getUpdate_con().getText();
        String project_totalEarning = viewAdminManageUpdateProject.getUpdate_total().getText();
        if (project_title.equals("") || project_description.equals("") || project_content.equals("") || project_totalEarning.equals("")) {
            JOptionPane.showMessageDialog(null, "Empty input");
        } else {
            project.setProjectTitle(project_title);
            project.setProjectDescription(project_description);
            project.setProjectContent(project_content);
            project.setProjectTotalEarning(Long.parseLong(project_totalEarning));

            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date sDate = viewAdminManageUpdateProject.getUpdate_start_date().getDate();
            Date eDate = viewAdminManageUpdateProject.getUpdate_end_date().getDate();

            String startDate = dateFormat.format(sDate);
            String endDate = dateFormat.format(eDate);
            project.setProject_startDate(startDate);
            project.setProject_endDate(endDate);

            boolean checking = projectDB.updateProjectInfor(project);
            if (checking == true) {
                JOptionPane.showMessageDialog(null, "Successfully");
                viewAdminManageUpdateProject.dispose();
                ArrayList<Project_User> a = project_UserDB.getByProjectID(project.getProjectId());
                for (int i = 0; i < a.size(); i++) {
                    Project_User pu = new Project_User(project.getProjectId(), 0, 0, 0);
                    pu.setProject_id(a.get(i).getProject_id());
                    pu.setUser_id(a.get(i).getUser_id());
                    pu.setProjectPercentSalary(a.get(i).getProjectPercentSalary());
                    pu.setSalary(calculateSalary(pu.getProject_id(), pu.getProjectPercentSalary()));
                    project_UserDB.updateProjectUserSalary(pu);
                }
                showAllProject();
                viewAllProUser();
                System.out.println("có chạy vào đây không");
            } else {
                JOptionPane.showMessageDialog(null, "Unsuccess");
            }
        }
    }
}
