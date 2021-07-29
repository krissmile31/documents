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
import Model.ModelDB.RoleDB;
import Model.ModelDB.SalaryDB;
import Model.ModelDB.UserDB;
import Model.ModelDB.WorkingTimeDB;
import Model.Project_User;
import Model.Salary;
import Model.User;
import View.ViewAccountant;
import View.ViewAccountantUpdateSalary;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tuqua
 */
public class ControllerAccountantManageSalary {

    private ViewAccountant viewAccountant;
    private RoleDB roleDB;
    private DepartmentDB departmentDB;
    private LeaveOffDB leaveOffDB;
    private WorkingTimeDB workingTimeDB;
    private UserDB userDB;
    private ProjectDB projectDB;
    private Project_UserDB project_UserDB;
    private DefaultTableModel salary_table;
    private SalaryDB salaryDB;

    public ControllerAccountantManageSalary(ViewAccountant viewAccountant, RoleDB roleDB, DepartmentDB departmentDB, LeaveOffDB leaveOffDB, WorkingTimeDB workingTimeDB, UserDB userDB, ProjectDB projectDB, Project_UserDB project_UserDBk, SalaryDB salaryDB) {
        this.salaryDB = salaryDB;
        this.viewAccountant = viewAccountant;
        this.roleDB = roleDB;
        this.departmentDB = departmentDB;
        this.leaveOffDB = leaveOffDB;
        this.workingTimeDB = workingTimeDB;
        this.userDB = userDB;
        this.projectDB = projectDB;
        this.project_UserDB = project_UserDBk;
        this.salary_table = (DefaultTableModel) viewAccountant.getSalary_table().getModel();
        actionUpdate();
        actionView();
        actionClear();
        actionSearchByUserId();
        actionSearchByMonth();
        actionSearchByYear();

    }

    private void actionSearchByMonth() {
        viewAccountant.getS_button_searchByMonth().addActionListener(e -> searchSalaryByMonth());
    }

    private void actionSearchByYear() {
        viewAccountant.getS_button_searchByYear().addActionListener(e -> searchSalaryByYear());
    }

    private void actionSearchByUserId() {
        viewAccountant.getS_button_searchByUserId().addActionListener(e -> searchSalaryByUserId());
    }

    private void actionClear() {
        viewAccountant.getS_button_clear().addActionListener(e -> clear());
    }

    private void actionView() {
        viewAccountant.getS_view().addActionListener(e -> viewAllSalary());
    }

    private void actionUpdate() {
        viewAccountant.getS_button_createUpdate().addActionListener(e -> createUpdate());
    }
//----------------------------------------------------------------------------------------------

    private void searchSalaryByYear() {
        if (viewAccountant.getS_getYear().getText().equals(" ")) {
            JOptionPane.showMessageDialog(null, "Empty Search");
        } else {
            boolean isIn = false;
            ArrayList<Salary> salaryList = salaryDB.getAllSalary();
            for (Salary salary : salaryList) {
                if (salary.getSalary_year().equals(viewAccountant.getS_getYear().getText())) {
                    isIn = true;
                }
            }

            if (isIn) {
                if (salary_table.getRowCount() == 0) {
                    String year = viewAccountant.getS_getYear().getText();
                       Object[] row = new Object[14];
                    ArrayList<Salary> getByYear = salaryDB.getSalaryByYear(year);
                    for (Salary salary : getByYear) {
                        String role = userDB.getUserInfor(salary.getUser_id()).getUser_role();
                        String department = userDB.getUserInfor(salary.getUser_id()).getUser_department();
                        row[0] = salary.getUser_id();
                        row[1] = salary.getUser_name();
                        row[2] = roleDB.getRole(role).getRole_name();
                        row[3] = departmentDB.getDepartment(department).getDepartment_name();
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
                    searchSalaryByYear();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Not found");
            }
        }
    }

    private void searchSalaryByMonth() {
        if (viewAccountant.getS_getMonth().getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Empty Search");
        } else {
            boolean isIn = false;
            ArrayList<Salary> salaryList = salaryDB.getAllSalary();
            for (Salary salary : salaryList) {
                if (salary.getSalary_month().equals(viewAccountant.getS_getMonth().getText())) {
                    isIn = true;
                }
            }

            if (isIn) {
                if (salary_table.getRowCount() == 0) {
                    String month = viewAccountant.getS_getMonth().getText();
                    Object[] row = new Object[14];
                    ArrayList<Salary> getByMonth = salaryDB.getSalaryByMonth(month);
                    for (Salary salary : getByMonth) {
                        String role = userDB.getUserInfor(salary.getUser_id()).getUser_role();
                        String department = userDB.getUserInfor(salary.getUser_id()).getUser_department();
                        row[0] = salary.getUser_id();
                        row[1] = salary.getUser_name();
                        row[2] = roleDB.getRole(role).getRole_name();
                        row[3] = departmentDB.getDepartment(department).getDepartment_name();
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
                    searchSalaryByMonth();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Not found");
            }
        }
    }

    private void searchSalaryByUserId() {
        if (viewAccountant.getS_getUserId().getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Empty Search");
        } else {
            boolean isIn = false;
            ArrayList<Salary> salaryList = salaryDB.getAllSalary();
            try {
                for (Salary salary : salaryList) {
                    if (salary.getUser_id() == Integer.parseInt(viewAccountant.getS_getUserId().getText())) {
                        isIn = true;
                    }
                }

                if (isIn) {
                    if (salary_table.getRowCount() == 0) {
                        int user_id = Integer.parseInt(viewAccountant.getS_getUserId().getText());
                        Object[] row = new Object[14];
                        ArrayList<Salary> getbyUserIdList = salaryDB.getSalaryByUser(user_id);
                        for (Salary salary : getbyUserIdList) {
                            String role = userDB.getUserInfor(salary.getUser_id()).getUser_role();
                            String department = userDB.getUserInfor(salary.getUser_id()).getUser_department();
                            row[0] = salary.getUser_id();
                            row[1] = salary.getUser_name();
                            row[2] = roleDB.getRole(role).getRole_name();
                            row[3] = departmentDB.getDepartment(department).getDepartment_name();
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
                        searchSalaryByUserId();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Not found");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "ID must be a number");
            }
        }
    }

    private void createUpdate() {
        ViewAccountantUpdateSalary viewUpdate = new ViewAccountantUpdateSalary();
        viewUpdate.setVisible(true);
        viewUpdate.getS_project_updateDate().setText(String.valueOf(LocalDate.now()));
        viewUpdate.getS_button_search().addActionListener(e -> {
            try {
                searchInformation(viewUpdate);
            } catch (ParseException ex) {
                Logger.getLogger(ControllerAccountantManageSalary.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        viewUpdate.getS_button_calculate().addActionListener(e -> calculate(viewUpdate));
    }

    private void clear() {
        viewAccountant.getS_getMonth().setText("");
        viewAccountant.getS_getYear().setText("");
        viewAccountant.getS_getUserId().setText("");
        salary_table.setRowCount(0);
    }

    private void calculate(ViewAccountantUpdateSalary viewUpdate) {

        if (viewUpdate.getS_projectSalary().getText().equals("") || viewUpdate.getS_absenceMinusSalary().getText().equals("") || viewUpdate.getS_overTimeSalary().getText().equals("") || viewUpdate.getS_bonus().getText().equals("") || viewUpdate.getS_deduction().getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Empty input");
        } else {
            long roleSalary = Long.parseLong(viewUpdate.getS_roleSalary().getText());
            long departmentSalary = Long.parseLong(viewUpdate.getS_departmentSalary().getText());
            long projectSalary = Long.parseLong(viewUpdate.getS_projectSalary().getText());
            long absenceSalary = Long.parseLong(viewUpdate.getS_absenceMinusSalary().getText());
            long overDateSalary = Long.parseLong(viewUpdate.getS_overTimeSalary().getText());
            long bonus = Long.parseLong(viewUpdate.getS_bonus().getText());
            long deduction = Long.parseLong(viewUpdate.getS_deduction().getText());

            long totalSalary = methodToCalculateSalary(roleSalary, departmentSalary, projectSalary, absenceSalary, overDateSalary, bonus, deduction);

            viewUpdate.getS_totalSalary().setText(String.valueOf(totalSalary));

            viewUpdate.getS_submitUpdate().addActionListener(e -> updateSalary(viewUpdate, totalSalary));
        }
    }

    private void updateSalary(ViewAccountantUpdateSalary viewUpdate, long totalSalary) {
        if (userDB.updateSalary(Integer.parseInt(viewUpdate.getS_userId_search().getText()), totalSalary)) {
            String nowDate = viewUpdate.getS_project_updateDate().getText();
            changeTableSalary(viewUpdate, nowDate);
            JOptionPane.showMessageDialog(null, "Success");
            viewUpdate.dispose();
            viewAllSalary();
        } else {
            JOptionPane.showMessageDialog(null, "Fail");
        }
    }

    private long methodToCalculateSalary(long roleSalary, long departmentSalary, long projectSalary, long absenceSalary, long overDateSalary, long bonus, long deduction) {
        long totalSalary = roleSalary + departmentSalary + projectSalary - absenceSalary + overDateSalary + bonus - deduction;
        return totalSalary;
    }

    private void searchInformation(ViewAccountantUpdateSalary viewUpdate) throws ParseException {
        try {
            ArrayList<User> userList = userDB.getAllUserInfor();
            boolean checked = false;
            int user_id = Integer.parseInt(viewUpdate.getS_userId_search().getText());
            for (User userList1 : userList) {
                if (userList1.getUser_id() == user_id) {
                    checked = true;
                    break;
                }
            }

            if (checked) {
                User user = userDB.getUserInfor(user_id);
                viewUpdate.getS_show_userName().setText(user.getUser_name());
                viewUpdate.getS_show_userDob().setText(user.getUser_dob());

                //check role department empty
                if (user.getUser_role() == null && user.getUser_department() == null) {
                    viewUpdate.getS_roleSalary().setText("0");
                    viewUpdate.getS_departmentSalary().setText("0");
                } else {
                    viewUpdate.getS_roleSalary().setText(String.valueOf(roleDB.getRole(user.getUser_role()).getRole_basic_salary()));
                    viewUpdate.getS_departmentSalary().setText(String.valueOf(departmentDB.getDepartment(user.getUser_department()).getDepartment_basic_salary()));
                }

                //check working 
                if (workingTimeDB.getWorkingTimeInf(user_id) != null) {
                    viewUpdate.getS_amountAbsence().setText(String.valueOf(workingTimeDB.getWorkingTimeInf(user_id).getAbsence()));
                    viewUpdate.getS_amountOver().setText(String.valueOf(workingTimeDB.getWorkingTimeInf(user_id).getBonus()));
                } else {
                    viewUpdate.getS_amountAbsence().setText("0");
                    viewUpdate.getS_amountOver().setText("0");
                }

                //check Project
                String nowDate = viewUpdate.getS_project_updateDate().getText();
                if (!project_UserDB.getByUserID(user_id).isEmpty()) {
                    long projectSalary = 0;
                    ArrayList<Project_User> proUList = project_UserDB.getByUserID(user_id);
                    for (int i = 0; i < proUList.size(); i++) {
                        String projectdate = projectDB.getProjectInfor(proUList.get(i).getProject_id()).getProject_endDate();
                        if (compareDate(projectdate, nowDate) == 0 || compareDate(projectdate, nowDate) < 0) {
                            projectSalary += proUList.get(i).getSalary();
                        }
                    }
                    viewUpdate.getS_projectSalary().setText(String.valueOf(projectSalary));
                }

            } else {
                JOptionPane.showMessageDialog(null, "Not Found");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Id must be number");
        }  
    }

    private void changeTableSalary(ViewAccountantUpdateSalary viewUpdate, String nowDate) {

        java.sql.Date date = java.sql.Date.valueOf(nowDate);
        LocalDate getNowDate = date.toLocalDate();
        String year = String.valueOf(getNowDate.getYear());
        String month = String.valueOf(getNowDate.getMonthValue());

        Salary salary = new Salary(0, "", 0, 0, 0, 0, 0, 0, 0, 0, "", "");
        ArrayList<Salary> list = salaryDB.getSalaryByUser(Integer.parseInt(viewUpdate.getS_userId_search().getText()));
        boolean isIn = false;
        for (int i = 0; i < list.size(); i++) {
            if (year.equals(list.get(i).getSalary_year()) && month.equals(list.get(i).getSalary_month())) {
                isIn = true;
                break;
            } else {
                isIn = false;
            }
        }

        int user_id = Integer.parseInt(viewUpdate.getS_userId_search().getText());
        String user_name = userDB.getUserInfor(user_id).getUser_name();
        long role_salary = Long.parseLong(viewUpdate.getS_roleSalary().getText());
        long department_salary = Long.parseLong(viewUpdate.getS_roleSalary().getText());
        long ptojectSalary = Long.parseLong(viewUpdate.getS_projectSalary().getText());
        long absenceSalary = Long.parseLong(viewUpdate.getS_absenceMinusSalary().getText());
        long overTimeSalary = Long.parseLong(viewUpdate.getS_overTimeSalary().getText());
        long bonusSalary = Long.parseLong(viewUpdate.getS_bonus().getText());
        long minusSalary = Long.parseLong(viewUpdate.getS_deduction().getText());
        long totalSalary = Long.parseLong(viewUpdate.getS_totalSalary().getText());

        salary.setUser_id(user_id);
        salary.setUser_name(user_name);
        salary.setProjectSalary(ptojectSalary);
        salary.setOverTimeSalary(overTimeSalary);
        salary.setAbsenceSalary(absenceSalary);
        salary.setBonusSalary(bonusSalary);
        salary.setMinusSalary(minusSalary);
        salary.setTotalSalary(totalSalary);
        salary.setSalary_month(month);
        salary.setSalary_year(year);
        salary.setRole_salary(role_salary);
        salary.setDepartment_salary(department_salary);
        if (isIn) {
            if (salaryDB.updateSalary(salary)) {
                JOptionPane.showMessageDialog(null, "Success Update Table");
            } else {
                JOptionPane.showMessageDialog(null, "Fail");
            }
        } else {
            if (salaryDB.addSalary(salary)) {
                JOptionPane.showMessageDialog(null, "Success Add Table");
            } else {
                JOptionPane.showMessageDialog(null, "Fail");
            }
        }

    }

    private int compareDate(String Firstate, String SecondDate) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = sdf.parse(Firstate);
        Date date2 = sdf.parse(SecondDate);
        if (date1.compareTo(date2) == 0) {
            return 0;
        } else if (date1.compareTo(date2) < 0) {
            return -1;
        } else {
            return 1;
        }
    }

    private void viewAllSalary() {
        if (salary_table.getRowCount() == 0) {
            ArrayList<Salary> salaryList = salaryDB.getAllSalary();
            Object[] row = new Object[14];
            for (Salary salary : salaryList) {
                String role = userDB.getUserInfor(salary.getUser_id()).getUser_role();
                String department = userDB.getUserInfor(salary.getUser_id()).getUser_department();
                row[0] = salary.getUser_id();
                row[1] = salary.getUser_name();
                row[2] = roleDB.getRole(role).getRole_name();
                row[3] = departmentDB.getDepartment(department).getDepartment_name();
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
            viewAllSalary();
        }

    }
}
