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
public class Report {

    private int report_id;
    private int user_id;
    private String report_title;
    private String report_description;
    private String report_content;
    private String report_post_date;

    public Report(int report_id, int user_id, String report_title, String report_description, String report_content, String report_post_date) {
        this.report_id = report_id;
        this.user_id = user_id;
        this.report_title = report_title;
        this.report_description = report_description;
        this.report_content = report_content;
        this.report_post_date = report_post_date;
    }

    public int getReport_id() {
        return report_id;
    }

    public void setReport_id(int report_id) {
        this.report_id = report_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getReport_title() {
        return report_title;
    }

    public void setReport_title(String report_title) {
        this.report_title = report_title;
    }

    public String getReport_description() {
        return report_description;
    }

    public void setReport_description(String report_description) {
        this.report_description = report_description;
    }

    public String getReport_content() {
        return report_content;
    }

    public void setReport_content(String report_content) {
        this.report_content = report_content;
    }

    public String getReport_post_date() {
        return report_post_date;
    }

    public void setReport_post_date(String report_post_date) {
        this.report_post_date = report_post_date;
    }

    
}
