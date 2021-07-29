/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author tuqua
 */
public class Project {

    private int projectId;
    private String projectTitle;
    private String projectDescription;
    private String projectContent;
    private long projectTotalEarning;
    private String project_startDate;
    private String project_endDate;

    public Project(int projectId, String projectTitle, String projectDescription, String projectContent, long projectTotalEarning, String project_startDate, String project_endDate) {
        this.projectId = projectId;
        this.projectTitle = projectTitle;
        this.projectDescription = projectDescription;
        this.projectContent = projectContent;
        this.projectTotalEarning = projectTotalEarning;
        this.project_startDate = project_startDate;
        this.project_endDate = project_endDate;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getProjectTitle() {
        return projectTitle;
    }

    public void setProjectTitle(String projectTitle) {
        this.projectTitle = projectTitle;
    }

    public String getProjectDescription() {
        return projectDescription;
    }

    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }

    public String getProjectContent() {
        return projectContent;
    }

    public void setProjectContent(String projectContent) {
        this.projectContent = projectContent;
    }

    public long getProjectTotalEarning() {
        return projectTotalEarning;
    }

    public void setProjectTotalEarning(long projectTotalEarning) {
        this.projectTotalEarning = projectTotalEarning;
    }

    public String getProject_startDate() {
        return project_startDate;
    }

    public void setProject_startDate(String project_startDate) {
        this.project_startDate = project_startDate;
    }

    public String getProject_endDate() {
        return project_endDate;
    }

    public void setProject_endDate(String project_endDate) {
        this.project_endDate = project_endDate;
    }

}
