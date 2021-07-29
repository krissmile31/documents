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
public class WorkingTime {
    private int workingTimt_id;
    private int user_id;
    private int absence;
    private int bonus;

    public WorkingTime(int workingTimt_id, int user_id, int absence, int bonus) {
        this.workingTimt_id = workingTimt_id;
        this.user_id = user_id;
        this.absence = absence;
        this.bonus = bonus;
    }

    public int getWorkingTimt_id() {
        return workingTimt_id;
    }

    public void setWorkingTimt_id(int workingTimt_id) {
        this.workingTimt_id = workingTimt_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getAbsence() {
        return absence;
    }

    public void setAbsence(int absence) {
        this.absence = absence;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
    
    
}
