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
public class LeaveOff extends Documents {

    public LeaveOff(int document_id, int user_id, String document_title, String document_description, String document_content, String document_status, String document_post_date, String document_process_date) {
        super(document_id, user_id, document_title, document_description, document_content, document_status, document_post_date, document_process_date);
    }

}
