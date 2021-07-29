/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Quan Trong Tu
 */
public class Documents {
    private int document_id;
    private int user_id;
    private String document_title;
    private String document_description;
    private String document_content;
    private String document_status;
    private String document_post_date;
    private String document_process_date;

    public Documents(int document_id, int user_id, String document_title, String document_description, String document_content, String document_status, String document_post_date, String document_process_date) {
        this.document_id = document_id;
        this.user_id = user_id;
        this.document_title = document_title;
        this.document_description = document_description;
        this.document_content = document_content;
        this.document_status = document_status;
        this.document_post_date = document_post_date;
        this.document_process_date = document_process_date;
    }

    public int getDocument_id() {
        return document_id;
    }

    public void setDocument_id(int document_id) {
        this.document_id = document_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getDocument_title() {
        return document_title;
    }

    public void setDocument_title(String document_title) {
        this.document_title = document_title;
    }

    public String getDocument_description() {
        return document_description;
    }

    public void setDocument_description(String document_description) {
        this.document_description = document_description;
    }

    public String getDocument_content() {
        return document_content;
    }

    public void setDocument_content(String document_content) {
        this.document_content = document_content;
    }

    public String getDocument_status() {
        return document_status;
    }

    public void setDocument_status(String document_status) {
        this.document_status = document_status;
    }

    public String getDocument_post_date() {
        return document_post_date;
    }

    public void setDocument_post_date(String document_post_date) {
        this.document_post_date = document_post_date;
    }

    public String getDocument_process_date() {
        return document_process_date;
    }

    public void setDocument_process_date(String document_process_date) {
        this.document_process_date = document_process_date;
    }
    
   
}
